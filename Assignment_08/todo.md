# Changes to be made

1. Change the message of the `ArithmeticException` to read as shown below, with the added message “Oops, can’t do that.”
2. Add a finally block that prints out the current value of the numerator and denominator.

    *Hint: in order for these variables to be visible in the finally block they need to be declared outside of the try block.*

# Sample output

Please enter an integer numerator: 100

Please enter an integer denominator: 0

 

Exception: java.lang.ArithmeticException: / by zero

Oops, can't do that.

Zero is an invalid denominator. Please try again.

 

Numerator is 100

Denominator is 0

 

Please enter an integer numerator: 100

Please enter an integer denominator: 7

 

Result: 100 / 7 = 14

 

Numerator is 100

Denominator is 7