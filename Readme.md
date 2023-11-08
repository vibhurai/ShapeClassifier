# ShapeClassifier
This is the repository to experiment with testing. 

# Blackbox Testing

For this task will create test cases from the ShapeClassifier specification (below). You should
refrain from looking at the code as a source for test cases. You will test this program by identifying
equivalence classes for inputs, encoding these partitions as an ACTS test specification (conditions
and constraints), and using ACTS to generate test inputs accordingly. For this question, your steps
are roughly as follows:

1. Identify equivalence classes and constraints for the ShapeClassifier inputs
2. Translate the equivalence classes generated in step A to test cases using weak equivalence class testings
3. Construct and execute JUnit test cases for each test case.

# Whitebox Testing

Derive test cases from the source code of the `evaluateGuess` method using whitebox testing. Using branch coverage as a guide, generate
test cases that achieve the highest possible coverage numbers. 

1. Study the code and create a JUnit testcase to traverse a branch.
2. Execute that testcase under a code coverage tool and observe the branch coverage.
3. Repeat this process selecting a different branch to exercise until you run out of time.

# Building with Maven

`mvn test`

# Building with Gradle

When you submit this assignment GitHub classroom will automatically build and
run tests using the command `gradle test`. There is an example test defined in
this repo. When this test is executed by running `gradle test` on the command
line you should see the following ouput:

    $  gradle test

    > Task :test FAILED

    ShapeClassifierTest > example() FAILED
        org.opentest4j.AssertionFailedError at ShapeClassifierTest.java:15

    1 test completed, 1 failed

    FAILURE: Build failed with an exception.

    * What went wrong:
    Execution failed for task ':test'.
    > There were failing tests. See the report at: file:// [PATH TO REPORT]

