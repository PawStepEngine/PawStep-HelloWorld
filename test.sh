#!/bin/sh

PROJNAME=pawstep-helloworld-0.0.1-SNAPSHOT

cd target
unzip "$PROJNAME-release.zip"
cd $PROJNAME
./run.sh
