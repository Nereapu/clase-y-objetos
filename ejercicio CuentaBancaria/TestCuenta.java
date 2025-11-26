public class TestCuenta
{
	public static void main(String[] args)
	{
		CuentaBancaria c = new CuentaBancaria();
		//nombramos a la persona como una 
		Persona una = c.getTitular();

		System.out.println(una.getNombre());
		una.setNombre("Max");
//hacemos un objeto donde nombramos a la persona como otra
		Persona otra = c.getTitular();
		System.out.println(otra.getNombre());
		//si el get es double hay que poner double al inicio 
		//segundo es el nombre que le queramos poner = se optiene de la cuenta bancaria 
		double dinero= c.getSaldo();

	}
}