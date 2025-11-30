import java.util.Scanner;
public class Autobus {
	private Persona[] personas;
	Scanner teclado=new Scanner(System.in);
	public Autobus()
	{
	}

	public int construirse()
	{
		
		
		System.out.println("dime la capacidad que quieres dar");
		int capacidad=teclado.nextInt();
		personas=new Persona[capacidad];
		System.out.println("su capacidad del bus es: " + capacidad);
		
		return capacidad;
	}
	
	public void ocupadas()
	{
	int ocupadas=0;
		
		 for(int i=0;i<personas.length;i++)
		 {
			 if(personas[i]!=null)
			 {
				ocupadas++; 
				 System.out.println(personas[i]+""+ "/t");
			 }
			 }
		 System.out.println("El numero de plazas ocupadas son: "+ ocupadas);
		 //System.out.println("El numero de plazas libres son: "+ plazasLibres);
		/*if(ocupada<this.capacidad)
		{
			System.out.println("El numero de plazas ocupadas son "+ ocupadas);
		}*/
	}
	
	public void plazaLibre()
	{
		int plazasLibres=0;
		for(int i=0;i<personas.length;i++)
		{
			if(personas[i]==null)
			{
				plazasLibres++;
			}
			
		}
		System.out.println("El numero de plazas libres son: "+ plazasLibres);
	}
	
	public Persona asientoPersona()
	{
		
		System.out.println("¿Que asiento quieres ver?");
	
		int asiento=teclado.nextInt();
		System.out.println("el asiento elegido es" +personas);
		return personas[asiento];		
	}
	
	public boolean subirPersona(Persona subirPersonas)
	{
		boolean subir=false;
		for(int i=0;i<personas.length && subir==false;i++)
		{
			if(personas[i]==null)
			{
				personas[i]=subirPersonas;
				System.out.println("la persona subida es: "+ personas[i]+"");
				subir=true;
			}
			else
			{
				subir=false;
			}
			
		}
		
		return subir;
	}
	
	public Persona bajarPersona(int bajarPersona)
	{
			if(personas[bajarPersona]==null||personas.length<0||personas.length>0)
			{
				personas[bajarPersona]=null;
				System.out.println("bajar la persona del bus es :"+ personas[bajarPersona]);
				return null;	
			}
			
			System.out.println("bajar la persona del bus es:"+ personas[bajarPersona]);
			return personas[bajarPersona];
	}
	


}
