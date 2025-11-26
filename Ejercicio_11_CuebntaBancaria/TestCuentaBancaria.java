public class TestCuentaBancaria
{
	public static void main(String[] args)
	{
    
    CuentaBancaria cuenta1 =new CuentaBancaria();
		CuentaBancaria cuenta2 =new CuentaBancaria("lucia");
		CuentaBancaria cuenta3 =new CuentaBancaria(30,"nerea");
		
		System.out.println(cuenta1.getSaldo());
		//cuenta1.sacar();
	  //cuenta1.ingresar(34);
	    boolean a=cuenta1.sacar(32);
	  System.out.println("se saca "+a);
	  
	}
}
