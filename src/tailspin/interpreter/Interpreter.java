package tailspin.interpreter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParserBaseListener;

class Interpreter extends TailspinParserBaseListener {
    private final InputStream input;
    private final OutputStream output;

    private Object currentValue;
    private String pendingIdentifier;

    private Map<String, Object> definitions = new HashMap<>();

    public Interpreter(InputStream input, OutputStream output) {
        this.input = input;
        this.output = output;
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        try {
            switch (node.getSymbol().getType()) {
                case TailspinParser.STRING_TEXT: // stringLiteral
                    String string = node.getSymbol().getText();
                    currentValue += string.replace("''", "'").replace("$$", "$");
                    break;
                case TailspinParser.StringInterpolate: // stringLiteral
                {
                    String identifier = node.getSymbol().getText().replaceAll("[$;]", "");
                    currentValue += definitions.get(identifier).toString();
                }
                break;
                case TailspinParser.Stdout: // sink
                    output.write(definitions.get("it").toString().getBytes(StandardCharsets.UTF_8));
                    break;
                case TailspinParser.IDENTIFIER:
                    pendingIdentifier = node.getSymbol().getText();
                    break;
                case TailspinParser.Dereference:
                    String identifier = node.getSymbol().getText().substring(1);
                    currentValue = definitions.get(identifier);
                    break;
                case TailspinParser.To:
                    definitions.put("it", currentValue);
                    currentValue = null;
                    break;
            }
        } catch (IOException e) {
            // Ignore
        }
    }

    @Override
    public void enterStringLiteral(TailspinParser.StringLiteralContext ctx) {
        currentValue = "";
    }

    @Override
    public void exitStatement(TailspinParser.StatementContext ctx) {
        currentValue = null;
    }

    @Override
    public void exitDefinition(TailspinParser.DefinitionContext ctx) {
        definitions.put(pendingIdentifier, currentValue);
        pendingIdentifier = null;
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }
}
