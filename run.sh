#!/usr/bin/env bash

set -Eexuo pipefail

rm -rf ./classes

# shellcheck disable=SC2046
javac --source-path "src" -d classes -classpath ./lib/junit-4.13.2.jar:./lib/hamcrest-core-1.3.jar $(find src -name '*.java')
java -classpath ./lib/junit-4.13.2.jar:./lib/hamcrest-core-1.3.jar:./classes org.junit.runner.JUnitCore com.acme.arithmetic.AdditionTest com.acme.arithmetic.SubtractionTest
