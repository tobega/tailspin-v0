#!/bin/bash
exec java \
        -XX:+UnlockExperimentalVMOptions \
        -XX:+EnableJVMCI \
        -XX:+UseJVMCICompiler \
 "$@"
