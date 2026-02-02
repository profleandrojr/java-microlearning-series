# Practice — String Immutability (Java)

## Goal

Reinforce the concept of **String immutability** by observing how Java handles
String operations and reference reassignment.

This exercise should take **5–10 minutes**.

---

## Requirements
- Java 21+ (or any modern Java version)

---

## Step 1 — Run the code

Go to the `code/` folder and run the program:

```bash
javac Main.java
java Main
``` 
TASK: Observe the output carefully.

## Step 2 — Observe

Answer the questions below before changing the code:

1. How many different values are printed?

2. Did the original String object change?

3. What exactly changed: the object or the reference?

Write down your answer mentally or in a few lines of text.

## Step 3 — Modify

Now, update the code by adding the following lines without reassigning the result:

```java
greeting.concat("!!!");
System.out.println(greeting);
```

Run the program again.

## Step 4 — Analyze

Answer the questions:

1. Why does the output remain the same?

2. What does the concat() method return?

3. What happens to the returned value if it is not assigned to a variable?

## Step 5 — Explain (short answer)

In your own words, explain:

1. Why Java says that Strings are immutable,
even though variables can reference new String values.

A short explanation (3–5 lines) is enough.

## Key reminder

- String objects never change

- methods like concat() return new String objects

- variables can be reassigned to reference new objects

Strings do not change.
References do.

## Next step

After completing this exercise, proceed to the quiz linked in the explanation
to validate your understanding.

