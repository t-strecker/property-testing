package org.example;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assumptions.assumeThat;

@RunWith(JUnitQuickcheck.class)
public class FizzBuzzPropertyTest {

  FizzBuzz fizzBuzz = new FizzBuzz();

  @Property
  public void shouldReturnFizz(int n) {
    assumeThat(n % 3).isEqualTo(0);
    assumeThat(n % 5).isNotEqualTo(0);
    assertThat(fizzBuzz.writeValue(n)).isEqualTo("Fizz");
  }

  @Property
  public void shouldReturnBuzz(int n) {
    assumeThat(n % 5).isEqualTo(0);
    assumeThat(n % 3).isNotEqualTo(0);
    assertThat(fizzBuzz.writeValue(n)).isEqualTo("Buzz");
  }

  @Property
  public void shouldReturnFizzBuzz(int n) {
    assumeThat(n % 15).isEqualTo(0);
    assertThat(fizzBuzz.writeValue(n)).isEqualTo("FizzBuzz");
  }
}
