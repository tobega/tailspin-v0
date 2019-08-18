#!/bin/bash
exec java \
        -XX:+UnlockExperimentalVMOptions \
        -XX:+EnableJVMCI \
-cp ../../../../tailspin-truffle/target/tailspin-truffle-runner.jar tailspin.Tailspin "$@"
