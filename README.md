# Generics

**Objective**

In this project we will learn a feature that allows the creation of classes, interfaces, and methods that can work with different types.


**Concepts**


| Concept   |      Resources      |
|----------|:-------------:|
|What is a generics| [Generics Concept](https://dev.java/learn/generics/intro/) |
|Generics tutorial|[Generics (Tutorial)](https://www.youtube.com/watch?v=plFSwAUVvWw)|


**Problem**

Create a method that can print an array of any type by using generic concept.

**Implementation**

Create a `printArray` method that takes an array of type T as a parameter and prints its elements..

```Java

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        ArrayUtils.printArray(numbers);

        String[] names = {"John", "Jane", "Alice"};
        ArrayUtils.printArray(names);
    }
}

```

