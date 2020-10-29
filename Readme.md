# F20-17323-HW2: ShapeClassifier
This is the repository for *HW2: Testing*. The complete instructions for the assignment are available in Canvas.

# Overview 
In this homework, you will test a program using both black‐box and white‐box testing techniques. You will then evaluate the test suites to assess their efficiency and effectiveness.

# Learning Goals:
* Gain experience with both blackbox and whitebox test case design techniques.
* Gain an appreciation of the strengths and weaknesses of black and white box testing
* Use coverage measures to assess the adequacy of a given test suite.
* Evaluate the efficiency of the test suites employed.

# Automated Building

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

