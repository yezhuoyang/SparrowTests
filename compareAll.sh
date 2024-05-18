#!/bin/bash

# Define the folder containing test cases
TESTCASE_FOLDER="hw3/"

# Loop through all .java files in the test case folder
for TESTCASE in "$TESTCASE_FOLDER"/*.java; do
    # Get the base name of the test case file (e.g., T21 from T21.java)
    BASENAME=$(basename "$TESTCASE" .java)

    echo "Running test case: $BASENAME"

    # Run your compiler and store the output
    gradle run -q < "$TESTCASE" > out.sparrow
    java -jar misc/sparrow.jar s < out.sparrow > myoutput.txt

    # Compile and run with javac, then store the output
    javac -d . "$TESTCASE"
    java Main > javaoutput.txt

    # Clean up compiled classes
    rm -f *.class

    # Perform the diff and store the result
    diff_output=$(diff myoutput.txt javaoutput.txt)

    # Check if diff_output is empty
    if [ -z "$diff_output" ]; then
        # No differences, print "Pass" in green with the test case name
        echo -e "\033[0;32m$BASENAME: Pass\033[0m"
    else
        # Differences found, print "Fail" in red with the test case name and the output of diff
        echo -e "\033[0;31m$BASENAME: Fail\033[0m"
        echo -e "\033[0;31m$diff_output\033[0m"
    fi

    # Clean up output files
    rm -f myoutput.txt javaoutput.txt out.sparrow
done