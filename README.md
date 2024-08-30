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

## OOPs Pilers
The pillars of OOPs (Object-Oriented Programming) are:
- **Inheritance:**
   Mechanism where a new class inherits properties and behavior from an existing class, promoting code reuse.
  - **Single Inheritance**
    A class inherits from one single superclass. This is the simplest form of inheritance.
      [See the Program](OOPsPillers/Inheritance/SingleInheritance.java)
  - **Multiple Inheritance:**
    A class inherits from more than one superclass. Java does not support multiple inheritance directly to avoid the "diamond problem" but can achieve similar behavior using interfaces.
     [See the Program](MultipleInheritanceUsingInterface.java)
  - **Multilevel Inheritance:**
    A class is derived from a class which is also derived from another class. This forms a chain of inheritance.
    [See the Program](OOPsPillers/Inheritance/MultilevelInheritance.java)
  - **Hybrid Inheritance:**
    A combination of two or more types of inheritance. Java supports hybrid inheritance using interfaces since multiple inheritance is not allowed directly.
    [See the Program](OOPsPillers/Inheritance/HybridInheritance.java)
  - **Hierarchical Inheritance:**
     Multiple classes inherit from a single superclass. This creates a tree-like structure with one parent and multiple child classes.
    [See the Program](OOPsPillers/Inheritance/HierarchicalInheritance.java)
- **Polymorphism**
  Polymorphism allows one to perform a single action in different ways. In Java, it can be achieved through method overloading and method overriding.

 
## Programming Language and Tools
#### Programming Language
  <img width="90" height="90" src="https://seeklogo.com/images/J/java-logo-7833D1D21A-seeklogo.com.png"/>

#### Tools Used for Compiling
  <img width="90" height="90" src="https://img.icons8.com/fluency/48/visual-studio-code-2019.png" alt="visual-studio-code-2019"/>

  
