#!/bin/bash
pwd
exec java \
        -XX:+UnlockExperimentalVMOptions \
        -XX:+EnableJVMCI \
        -XX:+UseJVMCICompiler \
    -cp ../../../tailspin.jar:../../../lib/antlr-runtime-4.8.jar tailspin.Tailspin "$@"
