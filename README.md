# COS 201 — Computer Programming I

Java practical work for COS 201. Each week's programs are in their own folder.

| | |
|---|---|
| **Name** | Akhigbe Emmanuel |
| **Matriculation Number** | 25/16429 |
| **Programme** | Computer Science |
| **Course** | COS 201 — Computer Programming I |
| **Language** | Java |

## Repository structure

```
cos-201/
├── README.md
├── .gitignore
├── .gitattributes
├── week01/
│   └── FirstProgram.java
├── week02/
│   ├── HelloWorld.java
│   ├── PrintExample.java
│   ├── CommentExample.java
│   └── ErrorExample.java
└── week03/
    ├── SimpleCalculator.java
    ├── AverageCalculator.java
    └── ItemCost.java
```

## Tools used

- Java Development Kit (JDK) 8 or later. The programs were tested with OpenJDK 21.
- Visual Studio Code
- Git and GitHub Desktop
- GitHub

## How to compile and run

Open a terminal in the folder for the week, compile the `.java` file with `javac`, then run the class with `java` (without `.java`):

```bash
cd week03
javac SimpleCalculator.java
java SimpleCalculator
```

The same two steps work for every program here. `javac` creates a `.class` file. Compiled `.class` files are listed in `.gitignore`, so only the source code is kept in the repository.

---

## Week 1: Introduction to Programming and Problem-Solving

### Practical exercise

I created and ran my first Java program, `week01/FirstProgram.java`. It prints my details, three reasons for learning programming and my goal for the course.

```bash
cd week01
javac FirstProgram.java
java FirstProgram
```

```
Name: Akhigbe Emmanuel
Matric Number: 25/16429
Course: COS 201 - Computer Programming I
Programme: Computer Science
Reason 1: Programming helps solve computational problems.
Reason 2: Programming supports automation.
Reason 3: Programming enables software development.
My goal: I want to develop simple working applications.
```

### Skills practised

- Java class and `main` method
- Output statements
- Compilation and execution
- GitHub version control

---

## Week 2: Development Environment and First Java Program

### Objective

To configure the Java development environment, write a simple Java program, compile it, execute it and submit the source code through GitHub.

### Files

| Program | What it does |
|---|---|
| `HelloWorld.java` | Prints my course details. Running it confirms that the JDK is installed and working. |
| `PrintExample.java` | Shows the difference between `print()` and `println()`, the escape sequences `\t`, `\n`, `\"` and `\\`, and joining text with `+`. |
| `CommentExample.java` | Shows the three kinds of Java comments: `//` single-line, `/* */` multi-line and `/** */` documentation (Javadoc). |
| `ErrorExample.java` | The corrected version of a program I wrote with four deliberate errors. The comments record each compiler error and how I fixed it. |

### How to run

```bash
cd week02
javac HelloWorld.java
java HelloWorld
```

Use the same commands with `PrintExample`, `CommentExample` and `ErrorExample`.

### Sample output

`java HelloWorld`

```
NAME: Akhigbe Emmanuel
MATRIC NUMBER: 25/16429
COURSE: COS 201
COURSE TITLE: Computer Programming I
PROGRAMME: Computer Science
WEEK: 2
TOPIC: Development Environment and Java
GOAL: To learn how to write Java programs.
```

`java PrintExample`

```
WEEK 2: Printing Output
println() ends the line here.
This text is on the next line.
COURSE:	COS 201
LINE ONE
LINE TWO
She said "Java is fun".
FOLDER: C:\cos-201\week02
NAME: Akhigbe Emmanuel (Computer Science)
10 + 5 = 105
10 + 5 = 15
```

The last two lines show that once `+` meets text, it joins instead of adding, so `10` and `5` are joined into `105`. Brackets make Java add first.

`java CommentExample`

```
Single-line comments start with //
Multi-line comments go between /* and */
Javadoc comments start with /**
Comments are ignored by the compiler.
```

The commented-out line in the program does not print, because the compiler ignores comments.

### Errors found and fixed (`ErrorExample.java`)

| Compile | Line | Compiler message | Fix |
|---|---|---|---|
| 1st | 3 | `error: ';' expected` | Added the missing semicolon. |
| 1st | 5 | `error: unclosed string literal` | Added the closing double quote. |
| 2nd | 4 | `error: cannot find symbol` (method `printn`) | Corrected the spelling to `println`. |
| 2nd | 6 | `error: incompatible types: String cannot be converted to int` | Removed the quotes around `75`, because a number is not text. |

The last two errors only appeared after the first two were fixed. `javac` checks punctuation first, then spelling and types, so it is best to fix the errors, compile again and repeat.

### Learning outcome

I practised creating, compiling and running Java programs, reading compiler error messages, and submitting source code through GitHub.

---

## Week 3: Variables, Data Types, Expressions and Input/Output

### Objectives

- Declare and initialize Java variables.
- Use appropriate primitive and reference data types.
- Perform arithmetic calculations.
- Read keyboard input using `Scanner`.
- Display formatted output.
- Compile, test and submit Java programs using GitHub.

### Programs

| Program | What it does |
|---|---|
| `SimpleCalculator.java` | Reads two numbers and displays their sum, difference, product, quotient and remainder. Checks for a zero divisor before dividing. |
| `AverageCalculator.java` | Reads a student's name and three course scores, then displays the total and average. **Extension:** rejects any score below 0 or above 100. |
| `ItemCost.java` | Reads an item name, quantity and unit price, then prints a purchase summary with the total cost in Naira. Rejects a quantity below 1 and a negative price. |

### How to run

```bash
cd week03
javac SimpleCalculator.java AverageCalculator.java ItemCost.java
java SimpleCalculator
java AverageCalculator
java ItemCost
```

### Concepts used

- **Data types:** `int` for whole numbers (quantity), `double` for numbers with decimals (scores, prices), `String` for text (names).
- **Constants:** `final` values in `AverageCalculator` (`NUMBER_OF_COURSES`, `MIN_SCORE`, `MAX_SCORE`).
- **Expressions:** the arithmetic operators `+`, `-`, `*`, `/` and `%`. In `ItemCost`, `int * double` gives a `double`, so the kobo part is kept.
- **Input:** `Scanner` with `nextLine()`, `nextInt()` and `nextDouble()`. `hasNextInt()` and `hasNextDouble()` check the input before reading it, so typing text where a number is expected shows a message instead of crashing the program.
- **Output:** `println()` and `printf()`. `%.2f` shows 2 decimal places, and `%,.2f` also adds commas (4,200.00).

### Sample runs

`java SimpleCalculator`

```
--- SIMPLE CALCULATOR ---
Enter the first number: 20
Enter the second number: 6

--- RESULTS ---
Sum: 26.00
Difference: 14.00
Product: 120.00
Quotient: 3.33
Remainder: 2.00
```

`java SimpleCalculator` with a zero divisor

```
--- SIMPLE CALCULATOR ---
Enter the first number: 15
Enter the second number: 0

--- RESULTS ---
Sum: 15.00
Difference: 15.00
Product: 0.00
Quotient: Division is undefined for a zero divisor.
Remainder: Division is undefined for a zero divisor.
```

`java AverageCalculator`

```
--- AVERAGE CALCULATOR ---
Enter student name: Akhigbe Emmanuel
Enter score for Course 1: 70
Enter score for Course 2: 85
Enter score for Course 3: 90

--- STUDENT RESULT ---
Student: Akhigbe Emmanuel
Course 1: 70.00
Course 2: 85.00
Course 3: 90.00
Total: 245.00
Average: 81.67
```

`java AverageCalculator` with a score out of range

```
--- AVERAGE CALCULATOR ---
Enter student name: Akhigbe Emmanuel
Enter score for Course 1: 65
Enter score for Course 2: 105
Invalid score for Course 2. Scores must be between 0 and 100.
```

`java ItemCost`

```
--- ITEM COST ---
Enter item name: Exercise Book
Enter quantity: 12
Enter unit price (NGN): 350

--- PURCHASE SUMMARY ---
Item: Exercise Book
Quantity: 12
Unit price: NGN 350.00
Total cost: NGN 4,200.00
```

`java ItemCost` with an invalid quantity

```
--- ITEM COST ---
Enter item name: Exercise Book
Enter quantity: 0
Invalid quantity. Quantity must be at least 1.
```

### Testing

I tested each program with normal, boundary and invalid inputs. All 21 tests passed.

| Program | Test type | Input | Expected result | Result |
|---|---|---|---|---|
| SimpleCalculator | Normal | 20, 6 | Sum 26.00, Difference 14.00, Product 120.00, Quotient 3.33, Remainder 2.00 | Pass |
| SimpleCalculator | Boundary | 15, 0 | Sum, difference and product shown; "Division is undefined for a zero divisor." | Pass |
| SimpleCalculator | Normal | −8, 3 | Sum −5.00, Difference −11.00, Product −24.00, Quotient −2.67, Remainder −2.00 | Pass |
| SimpleCalculator | Normal | 7.5, 2.5 | Quotient 3.00, Remainder 0.00 | Pass |
| SimpleCalculator | Invalid | abc | "Invalid input. Please enter a number." | Pass |
| AverageCalculator | Normal | 70, 85, 90 | Total 245.00, Average 81.67 | Pass |
| AverageCalculator | Boundary | 0, 0, 0 | Average 0.00 | Pass |
| AverageCalculator | Boundary | 100, 100, 100 | Average 100.00 | Pass |
| AverageCalculator | Invalid | 65, 105 | "Invalid score for Course 2." | Pass |
| AverageCalculator | Invalid | −1 | "Invalid score for Course 1." | Pass |
| AverageCalculator | Invalid | seventy | "Invalid input. Please enter a number." | Pass |
| AverageCalculator | Invalid | Empty name | "Student name cannot be empty." | Pass |
| ItemCost | Normal | Exercise Book, 12, 350 | Total cost NGN 4,200.00 | Pass |
| ItemCost | Normal | Rice, 3, 1250.50 | Total cost NGN 3,751.50 | Pass |
| ItemCost | Boundary | Biro, 1, 0 | Total cost NGN 0.00 | Pass |
| ItemCost | Invalid | Quantity 0 | "Quantity must be at least 1." | Pass |
| ItemCost | Invalid | Quantity −4 | "Quantity must be at least 1." | Pass |
| ItemCost | Invalid | Quantity 2.5 | "Quantity must be a whole number." | Pass |
| ItemCost | Invalid | Price −50 | "Unit price cannot be negative." | Pass |
| ItemCost | Invalid | Price abc | "Unit price must be a number." | Pass |
| ItemCost | Invalid | Empty item name | "Item name cannot be empty." | Pass |
