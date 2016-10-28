import javax.swing.JOptionPane;

public class Calculator {
	public double add(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber; 
	}
	public double subtract(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber; 
	}
	public double multiply(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber; 
	}

	public double devide(double firstNumber, double secondNumber) {
		double result = firstNumber / secondNumber; 
		if(Double.isFinite(result)) {
			JOptionPane.showMessageDialog(null, "division by zero", "Error message", JOptionPane.ERROR_MESSAGE);
			return -1111.1111; 
		}
		return result; 
	}
}
