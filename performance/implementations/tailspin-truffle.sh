#!/bin/bash
exec java \
        -XX:+UnlockExperimentalVMOptions \
        -XX:+EnableJVMCI \
        -XX:+UseJVMCICompiler \
-cp ../../../../tailspin-truffle/target/tailspin-truffle-runner.jar tailspin.Tailspin "$@"
