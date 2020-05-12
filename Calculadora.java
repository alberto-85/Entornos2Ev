package ejemploIvan;

public class Calculadora {
	

	
	public Calculadora() {}
	
	    private int num1 = 20;
	    private int num2 = 10;

	    public Calculadora(int num1, int num2) {
	        
	    }

	    public int suma(int num1,int num2) {
	        int resul = num1 + num2;
	        return resul;
	    }

	    public int resta(int num1,int num2) {
	        int resul = num1 - num2;
	        return resul;
	    }

	    public int multipica(int num1,int num2) {
	        int resul = num1 * num2;
	        return resul;
	    }

	    public int divide(int num1,int num2) {
	        int resul = num1 / num2;
	        return resul;
	    }
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
}

}
