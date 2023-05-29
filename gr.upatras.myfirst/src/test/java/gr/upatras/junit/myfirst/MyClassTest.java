package gr.upatras.junit.myfirst;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class MyClassTest {
 
@Test
 void testExceptionIsThrown() {
 MyClass tester = new MyClass();
 }
 @Test
 void testSubtraction() {
 MyClass tester = new MyClass();
 assertEquals("POSITIVE", tester.subtraction(10, 5), "10 - 5 must be POSITIVE");
 assertEquals("NEGATIVE", tester.subtraction(5, 10), "5 - 10 must be NEGATIVE");
 assertEquals("NEGATIVE", tester.subtraction(2, 3), "2 - 3 must be NEGATIVE");
 assertEquals("ZERO", tester.subtraction(6, 6), "6 - 6 must be ZERO");
 assertEquals("POSITIVE", tester.subtraction(16, 4), "16 - 4 must be POSITIVE");
 }
}
