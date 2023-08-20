#!/usr/bin/env bash
java -jar -Dserver.port=80 /webapps/hello-world-0.0.1-SNAPSHOT.jar > /dev/null 2> /dev/null < /dev/null &