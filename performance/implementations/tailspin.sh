#!/bin/bash
pwd
exec java \
    -cp ../../../tailspin.jar:../../../lib/antlr-runtime-4.8.jar tailspin.Tailspin "$@"
