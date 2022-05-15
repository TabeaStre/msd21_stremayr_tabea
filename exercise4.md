##Testing

**Add()-testing**\
There are two tests in which the add()-method is tested. At first there is a test,\
where I have a given result for a calculation, and I check\
if the same calculation made with the calculator-method has the expected result.\
In the second test, there is a calculation made directly in the test-method and the result is saved in "expected".\
Then the result from the calculator-method with the same parameters is saved in "actual".\
So with Assertions.assert() these two results are compared if they are the same.
Because of the datatype double, there is no over- or underflow.\
So there are no edge cases I need to test, and I chose random numbers.

**Minus()-testing**\
There are two tests in which the minus()-method is tested. At first there is a test,\
where I have a given result for a calculation, and I check\
if the same calculation made with the calculator-method has the expected result.\
In the second test, there is a calculation made directly in the test-method and the result is saved in "expected".\
Then the result from the calculator-method with the same parameters is saved in "actual".\
So with Assertions.assert() these two results are compared if they are the same.
Because of the datatype double, there is no over- or underflow.\
So there are no edge cases I need to test, and I chose random numbers.

**Division()-testing**\
There are two tests in which the divide()-method is tested. At first there is a test,\
where I have a given result for a calculation, and I check\
if the same calculation made with the calculator-method has the expected result.\
In the second test, there is a calculation made directly in the test-method and the result is saved in "expected".\
Then the result from the calculator-method with the same parameters is saved in "actual".\
So with Assertions.assert() these two results are compared if they are the same.
Because of the datatype double, there is no over- or underflow.\
A division by zero should result in infinity. This calculation is tested.

**Multiplication()-testing**\
There are two tests in which the multiply()-method is tested. At first there is a test,\
where I have a given result for a calculation, and I check\
if the same calculation made with the calculator-method has the expected result.\
In the second test, there is a calculation made directly in the test-method and the result is saved in "expected".\
Then the result from the calculator-method with the same parameters is saved in "actual".\
So with Assertions.assert() these two results are compared if they are the same.
Because of the datatype double, there is no over- or underflow. It results in infinity.\
So there are no edge cases I need to test, and I chose random numbers.

**Faculty()-testing**\
There are five tests in which the faculty()-method is tested. Tests 1 and 3 are tests to see\
if the method is implemented correctly. They are testing in two different ways, one time with a given result\
and Test3 with a calculated result.\
Tests number 2, 4 and 5 are implemented for testing the edge cases like the faculty of 0 and the faculty of a negative number.\
In the fifth test I check if there was an overflow and therefore an exception was thrown.