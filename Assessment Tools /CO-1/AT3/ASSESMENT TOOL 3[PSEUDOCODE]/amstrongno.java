START
Input Number
Temp = Number
Sum = 0
WHILE Number > 0
      Digit = Number % 10
      Sum = Sum + (Digit × Digit × Digit)
      Number = Number / 10
END WHILE
IF Sum = Temp
      Display "Armstrong Number"
ELSE
      Display "Not an Armstrong Number"
END IF
STOP
