# String Immutability — Technical Explanation

## Objective

Understand what **String immutability** really means in Java and why “changing a String” actually means **changing a reference**, not the object itself.

---

## What does immutability mean?

In Java, `String` objects are **immutable**.

This means:

- once a `String` object is created,
- its internal value **cannot be modified**.

There is no method in the Java API that alters the content of an existing `String` object.

---

## A common misconception

Many beginners believe that this code _changes_ a String:

```java
greeting = greeting.substring(0, n) + "... Duke!";
```

It does not.

What actually happens is reference reassignment.

## What really happens (step by step)

```java
String greeting = "Hello, World";
```

At this point:

a String object with the value "Hello, World" is created in memory

the variable greeting references this object

Now consider:

```java
int n = greeting.indexOf(",");

greeting = greeting.substring(0, n) + "... Duke, the Decepticon!!!";
```

### Execution flow:

1. substring(0, n) creates a new String object

2. The concatenation (+) creates another new String object

3. The variable greeting is reassigned to reference this new object

4. The original "Hello, World" object remains unchanged in memory

The object does not change.
The reference changes.

### Key mental model

- Variables hold references

- Objects live independently in memory

- Immutability protects the object, not the variable

Reference change ≠ Object change

## Why Java Strings are immutable

String immutability provides important guarantees:

- **Predictability**
  A String value cannot change unexpectedly.

- **Thread-safety**
  Immutable objects can be safely shared between threads.

- **No hidden side effects**
  Methods never alter existing String instances.

Immutability is not a limitation — it is a design contract.

### Garbage Collection note

After a reference change, if no variable points to the original String object:

- the object becomes unreachable

- it becomes eligible for garbage collection

This process is automatic and handled by the JVM.

### Java version note

This lesson includes two code variants:

**Java 25** — simplified main method (used in video demonstrations)

**Classic Java** — traditional class and public static void main

The behavior of String immutability is identical in both versions.
Only the syntax changes — the concept does not.

### Takeaway

Java does not mutate Strings.
Java replaces references.

Understanding this distinction is fundamental to mastering Java.

### Test your knowledge

## 📝 Knowledge Check (Classroom Quiz)

To reinforce the concepts from this lesson, complete the short quiz below:

👉 https://docs.google.com/forms/d/1fx0nGVprsno8f1bZmZapBttnizD5U1oSZ30QxwBrEAY/viewform

The quiz focuses on:

- String immutability
- reference reassignment
- common misconceptions when working with Strings

This assessment is designed to validate understanding, not memorization.


<div align="center">
  <i>"Non satis est sapiens esse; audendum est."</i>
  <br><br>
  <b>CODA EST POESIS</b>
</div>
