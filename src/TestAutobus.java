
public class TestAutobus {
	public static void main (String[]args)
	{
		Autobus bus1=new Autobus();
		bus1.construirse();
		bus1.ocupadas();
		bus1.plazaLibre();
		bus1.asientoPersona();
		bus1.bajarPersona(0);
		Persona persona1=new Persona();
		
		bus1.subirPersona(persona1);
;		}
}
