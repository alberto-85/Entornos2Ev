package ejemploIvan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestCalculadora extends Calculadora {
	
	
	Calculadora miCalculadora = new Calculadora();
	
	
	@Test
	
	void testMain() {
		System.out.println(" metodo testMain no esta implementado");
	}

	@Test
	void testCalculadora() {
		System.out.println(" Metodo testCalculadora no esta implementado");
	}

	@Test
	@ParameterizedTest
	@DisplayName("caja Blanca - Calculadora - Suma")
	@CsvSource({"1,30"})
	void testSuma() {
//		suma = miCalculadora.suma(20,10);
//		assertEquals(30, suma);
		assertEquals(30, miCalculadora.suma(20, 10));
		
	}

	@Test
	@ParameterizedTest
	@DisplayName("caja Blanca - Calculadora - Resta")
	@CsvSource({"1,10"})
	void testResta() {
//		resta = miCalculadora.resta(20, 10);
//		assertEquals(10, resta);
		assertEquals(10, miCalculadora.resta(20, 10));
	}

	@Test
	@ParameterizedTest
	@CsvSource({"1,200"})
	@DisplayName("caja Blanca - Calculadora - Multiplicación")
	void testMultipica() {
//		multi = miCalculadora.multipica(num1, num2);
//		assertEquals(200, multi);
		assertEquals(200,miCalculadora.multipica(20, 10));
	}
	

	@Test
	@ParameterizedTest
	@CsvSource({"1,2"})
	@DisplayName("caja Blanca - Calculadora - División")
	void testDivide() {
//		divi = miCalculadora.divide(20, 10);
//		assertEquals(2, divi);
		assertEquals(2, miCalculadora.divide(20, 10));
	}

}
