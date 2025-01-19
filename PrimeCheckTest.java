import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    assertEquals("Test 17", true, PrimeCheck.isPrime(17));
    assertEquals("Test 19", true, PrimeCheck.isPrime(19));
    assertEquals("Test 23", true, PrimeCheck.isPrime(23));
    assertEquals("Test 37", true, PrimeCheck.isPrime(37));
    assertEquals("Test 83", true, PrimeCheck.isPrime(83));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    assertEquals("Test 6", false, PrimeCheck.isPrime(6));
    assertEquals("Test 8", false, PrimeCheck.isPrime(8));
    assertEquals("Test 15", false, PrimeCheck.isPrime(15));
    assertEquals("Test 56", false, PrimeCheck.isPrime(56));
    assertEquals("Test 88", false, PrimeCheck.isPrime(88));
  }
}
