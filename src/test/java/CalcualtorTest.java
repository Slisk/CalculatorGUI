import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalcualtorTest {
	public static final Logger LOG = Logger.getLogger(Calculator.class.getName()); 
	Random rnd = new Random(); 
	Calculator C = new Calculator(); 
	@Test
	public void testAdd() {
		double firstNumber = 0.0; 
		double secondNumber = 0.0; 
		double result = 0.0; 
		for (int i = 0; i < 10; i++) {
			firstNumber = rnd.nextDouble()*100; 
			secondNumber = rnd.nextDouble()*100;
			result = firstNumber + secondNumber;
			LOG.info("Testing the add method with the values " + firstNumber + "and" + secondNumber);
			assertEquals("The result should be: " + result, C.add(firstNumber, secondNumber), result, 0.111);
		}
	}

	@Test
	public void testSubtract() {
		double firstNumber = 0.0; 
		double secondNumber = 0.0; 
		double result = 0.0; 
		for (int i = 0; i < 10; i++) {
			firstNumber = rnd.nextDouble()*100; 
			secondNumber = rnd.nextDouble()*100;
			result = firstNumber - secondNumber;
			LOG.info("Testing the sub method with the values " + firstNumber + "and" + secondNumber);
			assertEquals("The result should be: " + result, C.subtract(firstNumber, secondNumber), result, 0.111);
		}
	}

	@Test
	public void testMultiply() {
		double firstNumber = 0.0; 
		double secondNumber = 0.0; 
		double result = 0.0; 
		for (int i = 0; i < 10; i++) {
			firstNumber = rnd.nextDouble()*100; 
			secondNumber = rnd.nextDouble()*100;
			result = firstNumber * secondNumber;
			LOG.info("Testing the multiply method with the values " + firstNumber + "and" + secondNumber);
			assertEquals("The result should be: " + result, C.multiply(firstNumber, secondNumber), result, 0.111);
		}
	}
 
	@Test
	public void testDevide() {
		double firstNumber = 0.0; 
		double secondNumber = 0.0; 
		double result = 0.0; 
		for (int i = 0; i < 10; i++) {
			firstNumber = rnd.nextDouble()*100; 
			secondNumber = rnd.nextDouble()*100;
			result = firstNumber / secondNumber;
			LOG.info("Testing the devide method with the values " + firstNumber + "and" + secondNumber);
			assertEquals("The result should be: " + result, C.devide(firstNumber, secondNumber), result, 0.111);
		}
	}

}
