# OOPs Concepts in Java

![Java OOPs](https://media.istockphoto.com/id/1334767642/vector/flat-design-with-people-oop-object-oriented-programming-acronym.jpg?s=612x612&w=0&k=20&c=PB1rS9AnL-7OUbSxrLxQHMiLJEAjXt8d5B5H7bIe5Bg=)

## Overview

This repository contains a comprehensive guide and examples on Object-Oriented Programming (OOPs) concepts in Java. The topics covered range from basic to advanced, providing a solid foundation for understanding and implementing OOP principles in Java.

## Table of Contents

- [Demo](#demo)
- [Methods](#methods)
- [Recursion](#recursion)
- [Class and Object](#class-and-object)
- [OOPs Pillars](#oops-pillars)
  - [Inheritance](#inheritance)
  - [Polymorphism](#polymorphism)
  - [Encapsulation](#encapsulation)
  - [Abstraction](#abstraction)
- [Exception Handling](#exception-handling)
- [Constructor](#constructor)
- [Abstract Class and Abstract Method](#abstract-class-and-abstract-method)
- [Special Keys](#special-keys)
- [Interface](#interface)
- [File Handling](#file-handling)
- [Tools Used](#tools-used)

## Demo
Explore a [Java Program Demo](Demo.java) that illustrates the key concepts of OOP in Java. This includes how to define classes, create objects, and call methods.

## Methods in Java
A **method** in Java is a block of code that performs a specific task. It can be invoked to execute the code it contains.
 - **Method with Return Type**
      A method that returns a value after execution. The return type is specified before the method name (e.g., `int`, `String`).
      Explore the [Method with Return Type Program](Methods/Methods.java)
 - **Method without Return Type**
   Type: A method that does not return any value. It uses the void keyword.
   Explore the [Method without Return Type Program](Methods/Methods.java)

## Recursion
Recursion in Java is demonstrated through a Factorial Program that computes the factorial of a number using recursive calls. Explore a [Program](Recusion.java)

## Class and Object
Understand the basics of Class and Object in Java, including how to instantiate objects and use their methods and attributes. Explore a [Program](ClassAndObject.java)
#### Syntax for Class Creation
```java
access_modifier class ClassName {
    // Fields (attributes)

    // Constructor

    // Methods
}
```
#### Syntax for Object Creation
```java
ClassName objectName = new ClassName(arguments);
```

## OOPs Pillars
The pillars of OOP (Object-Oriented Programming) are foundational concepts that define how to design and structure programs in an object-oriented way:

### 1. **Inheritance**
Inheritance is a mechanism where a new class inherits properties and behaviors from an existing class, promoting code reuse and hierarchical classification.

- **Single Inheritance:**  
  A class inherits from one single superclass. This is the simplest form of inheritance.  
  [See the Program](OOPsPillers/Inheritance/SingleInheritance.java)

- **Multiple Inheritance:**  
  A class inherits from more than one superclass. Java does not support multiple inheritance directly to avoid the "diamond problem," but similar behavior can be achieved using interfaces.  
  [See the Program](OOPsPillers/Inheritance/MultipleInheritanceUsingInterface.java)

- **Multilevel Inheritance:**  
  A class is derived from another class, which in turn is derived from another class, forming a chain of inheritance.  
  [See the Program](OOPsPillers/Inheritance/MultilevelInheritance.java)

- **Hybrid Inheritance:**  
  A combination of two or more types of inheritance. Java supports hybrid inheritance using interfaces since multiple inheritance is not allowed directly.  
  [See the Program](OOPsPillers/Inheritance/HybridInheritance.java)

- **Hierarchical Inheritance:**  
  Multiple classes inherit from a single superclass, creating a tree-like structure with one parent and multiple child classes.  
  [See the Program](OOPsPillers/Inheritance/HierarchicalInheritance.java)

### 2. **Polymorphism**
Polymorphism allows objects to be treated as instances of their parent class, enabling one action to be performed in different ways. In Java, it can be achieved through:

- **Method Overloading:**  
  Multiple methods have the same name but different parameters within the same class.
  [See the Program](OOPsPillers/Polymorphism/MethodOverLoading.java)

- **Method Overriding:**  
  A subclass provides a specific implementation of a method that is already defined in its superclass.
  [See the Program](OOPsPillers/Polymorphism/MethodOverRidding.java)

### 3. **Encapsulation**
Encapsulation is the process of wrapping code and data together into a single unit, typically using private fields and public getter and setter methods to control access.

- **Encapsulation Example:**  
  Learn how encapsulation is achieved in Java through getter and setter methods.  
  [See the Program](OOPsPillers/Encapsulation/EncapsulationExample.java)

### 4. **Abstraction**
Abstraction involves hiding the complex implementation details and showing only the essential features of the object. It can be achieved using abstract classes and interfaces.

- **Abstraction Example:**  
  Explore abstraction in Java through abstract classes and methods.

## Exception Handling
Exception handling in Java is a powerful mechanism that handles runtime errors, ensuring the normal flow of the application is maintained. Java provides several keywords to handle exceptions such as `try`, `catch`, `throw`, `throws`, and `finally`.

### 1. **ArithmeticException**
This exception occurs when an arithmetic operation, such as division by zero, is attempted. Java automatically handles such exceptions, but you can also catch and handle them manually.

- **ArithmeticException Example:**  
  [See the Program](ExceptionalHandling/ArithmaticException.java)

### 2. **Finally**
The `finally` block is used to execute important code such as closing resources, regardless of whether an exception is handled or not. It is executed after the `try` and `catch` blocks.

- **Finally Example:**  
  [See the Program](ExceptionalHandling/Finally.java)

### 3. **Throw**
The `throw` keyword is used to explicitly throw an exception, either a predefined exception or a custom exception. It is used within a method or a block of code.

- **Throw Example:**  
  [See the Program](ExceptionalHandling/Throw.java)

### 4. **User-Defined Exception**
Java allows you to create your own exception classes. These user-defined exceptions can be thrown and caught like built-in exceptions.

- **User-Defined Exception Example:**  
  [See the Program](ExceptionalHandling/UserDefinedException.java)

## Constructors
A constructor in Java is a special method used to initialize objects. It is called when an object of a class is created. Constructors have the same name as the class and do not have a return type. There are two types of constructors in Java: default constructors and parameterized constructors.

### 1. **Default Constructor**
A default constructor is a constructor that takes no arguments. If no constructor is explicitly defined in a class, Java provides a default constructor automatically.

- **Default Constructor Example:**  
  [See the Program](Constructor/DefaultConstructor.java)

 
## Programming Language and Tools
#### Programming Language
  <img width="90" height="90" src="https://seeklogo.com/images/J/java-logo-7833D1D21A-seeklogo.com.png"/>

#### Tools Used for Compiling
  <img width="90" height="90" src="https://img.icons8.com/fluency/48/visual-studio-code-2019.png" alt="visual-studio-code-2019"/>

  
