gradle run -q < testcases/hw3/T5.java > out.sparrow 
java -jar misc/sparrow.jar s < out.sparrow > myoutput.txt
javac -d . testcases/hw3/T5.java
java Main > javaoutput.txt

rm *.class

# Perform the diff and store the result
diff_output=$(diff myoutput.txt javaoutput.txt)

# Check if diff_output is empty
if [ -z "$diff_output" ]; then
    # No differences, print "Pass" in green
    echo -e "\033[0;32mPass\033[0m"
else
    # Differences found, print the output of diff in red
    echo -e "\033[0;31m$diff_output\033[0m"
fi




