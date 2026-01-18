# Linear Search in Java

This project demonstrates a simple implementation of the **Linear Search (Sequential Search)** algorithm in Java.

## Description
Linear Search is a basic searching algorithm that checks each element of an array one by one until the target value is found or the end of the array is reached.

In this example:
- An array of integers is searched
- If the element is found, its index is returned
- If the element is not found, `-1` is returned

## Technologies
- Java
- JDK 8+

## How the Program Works

1. An integer array is defined
2. The `linearSearch` method is called
3. The method iterates through the array using a `for` loop
4. If the target element is found, its index is returned
5. If the element is not found, `-1` is returned

## Code Example

```java
int[] array = {2, 3, 4, 6, 1, 7, 5, 9, 8};
int index = linearSearch(array, 4);
