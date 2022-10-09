**Exception Handling in java**

```text

the exception handling in java is one of the powerful mechanism to handle the runtime errors so that
the normal flow of the application can be maintained

in the tutorial, we will learn about the java exceptions, it's types and the differences between checked and unchecked 
exceptions

```

**what is exception in java ?**

```text

Dictionary Meaning: Exception is an abnormal condition

in java, an exception is an event that disrupts the normal flow of the program. it is an object which is thrown at runtime.

```


**what is Exception Handling ?**

```text

Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException,SQLException. etc

```

```text

Advantage of Exception Handling

the core advantage of exception handling is to maintain the normal flow of the application. an exception normally

disrupts the normal flow of the application; that is why we need to handle exceptions. let's consider a scenario;

statement 1;  
statement 2;  
statement 3;  
statement 4;  
statement 5;//exception occurs  
statement 6;  
statement 7;  
statement 8;  
statement 9;  
statement 10;  

```

Suppose there are 10 statements in java program and an exception occurs at statements 5; the rest of the code will

not be executed, i.e: statements 6 to 10 will not be executed, However, when we perform exception handling, the rest of

the statements will be executed that is why we use exception handling in java.


```text

do you know ?

- what is the difference between checked and unchecked exceptions ?
- what happens behind the code int data=50/0?
- why use multiple catch block ?
- is there any possibility when the finally block is not executed ?
- what is exception propagation ?
- what is the difference between the throw and throws keyword ?
- what are the 4 rules for using exception handling with method overriding ?

```
