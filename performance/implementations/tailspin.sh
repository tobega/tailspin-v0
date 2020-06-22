#!/bin/bash
pwd
exec java \
        -XX:+UnlockExperimentalVMOptions \
        -XX:+EnableJVMCI \
        -XX:+UseJVMCICompiler \
    -cp ../../../out/production/tailspin-v0:../../../lib/antlr-runtime-4.7.2.jar tailspin.Tailspin "$@"
