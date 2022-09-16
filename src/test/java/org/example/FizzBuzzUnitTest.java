package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzUnitTest {

  FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  void shouldPrint1() {
    assertThat(fizzBuzz.print(1)).isEqualTo("1");
  }

  @Test
  void shouldPrint1_2() {
    assertThat(fizzBuzz.print(2)).isEqualTo("1 2");
  }

  @Test
  void shouldPrint1_2_Fizz() {
    assertThat(fizzBuzz.print(3)).isEqualTo("1 2 Fizz");
  }

  @Test
  void shouldPrintFizzAndBuzz() {
    assertThat(fizzBuzz.print(5)).isEqualTo("1 2 Fizz 4 Buzz");
  }

  @Test
  void shouldPrintFizzAndBuzzAndFizzBuzz() {
    assertThat(fizzBuzz.print(15)).isEqualTo("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz");
  }
}