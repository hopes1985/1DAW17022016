package prueba;

public class CalculadoraTest {
public Calculadora calculadora;
	public static void setUpBeforeClass() throws Exception {
	}

	public static void tearDownAfterClass() throws Exception {
	}

	public void setUp() throws Exception {
		this.calculadora = new Calculadora();
	}

	public void tearDown() throws Exception {
		this.calculadora = null;
	}

	public void testSumar() {
		int op1 = 2;
	     int op2 = 1;
	     int resultadoEsperado = op1 + op2;
	     int resultadoObtenido = this.calculadora.sumar(op1, op2);
		
		
	}

}
