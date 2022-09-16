package org.example;

/*
    FizzBuzz

You need to write a program that prints the numbers from 1 to n such that:

  * If the number is a multiple of 3, you need to print "Fizz" instead of that number.
  * If the number is a multiple of 5, you need to print "Buzz" instead of that number.
  * If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.

 */

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

  public String print(int i) {
    return IntStream.range(1, i + 1)
          .mapToObj(this::writeValue)
          .collect(Collectors.joining(" "));
  }

  String writeValue(int n) {
    if (n % 15 == 0) {
      return "FizzBuzz";
    }
    if (n % 3 == 0) {
      return "Fizz";
    }
    if (n % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(n);
  }
}
