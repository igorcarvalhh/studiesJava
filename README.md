# Java

## 1. Java Syntax

- Every line of code thas runs in Java must be inside a `class`
- A class should be always start with uppercase first letter
- The name of .java file must match the class name

```java
public class Main {
    public static void main(String[] args) {
        Systm.out.println("Hello World!");
    }
}
```

### The main method

The `main()` method is required and is the first method will be executed.

If there isn't the main an error will be occurred

> ```java
> public static void main(String[] args)
> ```

### System.out.println()

Inside the `main()` method, we can use the `println()` method to print a line of text to the screen

> ```java 
> System.out.println("Hello World!")
> ```

## 2. Java Comments 

### Single-line Comments

Single-line comments start with `//`. Any text between `//` and the end of the line is ignored

> ```java
> // this is a comment
> System.out.println("Hello World!");
> ```

### Multi-line Comments

Multi-line comments start with `/*` and ends with `*/`. Any text between `/*` and `*/` will be ignored  

> ```java
> /*  The code below will print the words Hello World
> to the screen, and it is amazing */
> ```

## 3. Java Variables

- `byte` - 8 bits
- `short` - 16 bits
- `int` - 32 bits
- `long` - 64 bits
- `float` - 32 bits
- `double` - 64 bits
- `char` - 16 bits
- `boolean` = 1 bits

```java
byte maxByte = 127;
byte minByte = -128;
char c = 'A';
short maxShort = 32767;
short minShort = -32768;
int maxInt = 2147483647;
int minInt = -2147483648;
long maxLong = 9223372036854775807L;
long minLong = -9223372036854775808l;
float f = 65f;
double d = 65.55d;
boolean bool = true;
```

### Final Variables

If you don't wnat to overwrite the values of an existing vabiable, you can add the access modifier `final`

> ```java
> final int myNum = 15;
> myNum 20; // will generate an error 
> ```

## 4. Java Type Casting

Type casting is when you assign a value of one primitive data type to another type.

### Widening Casting (Automatically)

Widening casting is done automatically when passing a smaller size type to a larger size type

> ```java
> int myInt = 25;
> double myDouble = myInt;
> System.out.println(myDouble);
> ```

### Narrowing Casting

Narrowing casting must be done manually by placing the type in parentheses in front of the value

> ```java
> float myFloat = 66.55f;
> // int myInt = myFloat; ERROR
> int myInt = (int) myFloat;
> System.out.println(myFloat);
> ```

## 5. Java Strings

In Java strings are class and come with your only methods

### String Length

The length of a string can be found with the `length()` method.

> ```java
> String texto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
> int tamanhoTexto = texto.length();
> System.out.println(tamanhoTexto); // Outputs 26
> ```

### String Upper and Lower Case

> ```java
> String txt = "Hello World";
> String maiusculo = txt.toUpperCase(); // Outputs HELLO WORLD
> String minusculo = txt.toLowerCase(); // Outputs hello world
> ```

### Finding a text in a String

The `indexOf()` method returns the index of the first occurrence of a specified text in a string

> ```java
> String txt = "tres pratos de trigo para tres tigres tristes";
> System.out.println(txt.indexOf("ra")); // Outputs 60
> ```

## 6. Java Math

### Math.max(x,y)

```java
Math.max(5,10);
```

### Math.min(x,y)

```java
Math.min(5,10);
```

### Math.sqrt(x)

```java
Math.sqrt(9);
```

### Math.abs(x)

```java
Math.abs(-4.6);
```

### Math.random()

The `random()` method returns a random number between 0.0 (inclusive) and 1.0 (exclusive)

```java
System.out.println(Math.random());
```

or

```java
int randomNum = (int) (Math.random() * 100); // 0 to 99
```

## Java If...Else

```java
if (condition1) {
    // code
} else if (condition2) {
    // code
} else {
    // code
}
```

### *Ternary Operator!!!*

There is also a short-hand if else, which is known as ternary operator

> `variable = (condition) ? expressionTrue : expressionFalse;`

```java
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening";
System.out.println(result);
```
## Java Switch

```java
switch(variable) {
    case x: 
        // code
        break;
    case y:
        // code
        break;
    case z: 
        // code
        break;
    default:
        // code
}
```

## Java While Loop

```java
while(condition) {
    // code
}
```

### *The Do/While Loop!!!*

Is a variat of while loop. This loop check if the condition is true after execute the code block

```java
do {
    // code block
} while(condition);
```

Exemple

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

## Java For Loop

```java
for (variable; condition; increase) {
    // code block
}
```

Exemple

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### *For-Each Loop!!!*

Is used exclusively to loop through elements in an **array**

```java
for (type variableName : arrayName) {
    // code block
}
```

Exemple

```java
String[] frutas = {"Banana", "Maca", "Uva", "Laranja"};

for (int i : frutas) {
    System.out.println(i);
}
```

is the same

```java
String[] frutas = {"Banana", "Maca", "Uva", "Laranja"};

for (int i = 0; i < frutas.length; i++) {
    System.out.println(frutas[i]);
}
```

## Java Continue

The `continue` statement breaks one  iteration (in the loop), if a specified condition occurs, and continues  with the next iteration in the loop.

```java
for (int i = 0; i < 7; i++) {
    if (i == 4) {
        continue;
    }
    System.out.println(i);
}
/*Outputs
0
1
2
3
5
6
*/
```

## *Java Overloading!!!*

Many methods can have the same name as long as the number or types of parameters are different.

```java
static int plusMethodInt(int x, int y) {
    return x + y;
}
static double plusMethodDouble(double x, double y) {
    return x + y;
}
public static void main(String[] args) {
    int myNum1 = plusMethodInt(8,5);
    double myNum2 = plusMethodDouble(4.3,6.26);
    System.out.println(myNum1);
    System.out.println(myNum2);
}
```

```java
static int plusMethod(int x, int y) {
    return x + y;
}
static double plusMethod(double x, double y) {
    return x + y;
}
public static void main(String[] args) {
    int myNum1 = plusMethod(8,5);
    double myNum2 = plusMethod(4.3,6.26);
    System.out.println(myNum1);
    System.out.println(myNum2);
}
```
## Java Class Methods

### Static vs Non-Static Methods

`static` methods can be accessed without creating an object of the class

```java
public class Main {
    public static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myNonStaticMethod() {
        System.out.println("Non Static method must be called creating objects");
    }

    public static void main(String[] args) {
        Main.myStaticMethod();
        Main myObj = new Main();
        // Main.myNonStaticMethod(); ERROR
        myObj.myNonStaticMethod();
    }
}
```

## Java Contructors

The constructor name must be the same of class name

```java
public class Main {
    int x;

    public Main(int y) {
        this.x = y;
    }

    public static void main(String[] args) {
        Main myObj = new Main(24);
        System.out.println(myObj.x); // Outputs 24
    }
}

```
 


























