CPATH='.:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar'

rm -rf student-submission
rm -rf grading-area

mkdir grading-area

git clone $1 student-submission
echo 'Finished cloning'


# Draw a picture/take notes on the directory structure that's set up after
# getting to this point

# Then, add here code to compile and run, and do any post-processing of the
# tests


#Step 2: Check that the student code contains the ListExamples.java file.
if [[ -f student-submission/ListExamples.java ]]
then
    echo "ListExamples.java file found."
else
    echo "ListExamples.java file not found."
    echo "Grade: 0"
    exit
fi

#Step 3: Put all relevant files into the grading-area directory.
# TestListExamples.java ListExamples.java, lib directory
cp TestListExamples.java student-submission/ListExamples.java grading-area
cp -r lib grading-area

#Step 4: Compile all the java files and check that they compiled successfully.
cd grading-area
javac -cp $CPATH *.java
if [[ $? -ne 0 ]]
then
    echo "Compile error"
    exit

fi

echo "The exit code for the compile step is $?."

#Step 5: Run the tests and report the grade based on the test results.
java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore TestListExamples

