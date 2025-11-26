import java.util.Scanner;

public class Persona{
  private String nombre;
  private String apellido;
  private String telefono;
  private String dni;
  private String direccion;
  private String añoNacimiento;
//donde pedimos los datos por pantalla teclado
 /* public Persona(){
    String[] datos={"nombre","apellido","telefono","dni","direccion"};
    Scanner teclado= newScanner(System.in);
    //para que salga en pantalla nombre: y al poner en pantalla se cambia el nombre a "pepe" 
    for(int i=0;i<datos.lenght;i++)
    {
			System.out.print(datod
          Scanner sc = new Scanner(System.in);
          System.out.print("Nombre: ");
          this.nombre=sc.neipublic Persona()s[i]+": ");
			datos[i]=sc.next();
		}
      //termina el for termina los datos guardados de array
		teclado.close();
     //se rellena los atributos con lo guardado en la array
		this.nombre=datos[0];
    this.apellido=datos[1];
		this.telefono=datos[2];
		this.dni=datos[3];
		this.direccion=datos[4];
  }
    */ 

      
      public Persona()
        {
          
          Scanner sc = new Scanner(System.in);
          System.out.print("Nombre: ");
          this.nombre=sc.next();
          System.out.print("Apellidos: ");
          this.apellido=sc.next();
          System.out.print("Telefono: ");
          this.telefono=sc.next();
          System.out.print("Dni: ");
          this.dni=sc.next();
          System.out.print("Dirección: ");
          this.direccion=sc.next();
          sc.close();

		
	        }
      
     
     

  
   public Persona(String nom,String dni)
    {
          this.nombre=nom;
          this.telefono="";
          this.apellido="";
          this.dni=dni;
          this.direccion="";
    
    }
  
  
  //pedimos los datos por parametros
  public Persona(String nom, String apell,String tel,String dni,String direc,String añoNac){
     this.nombre=nom;
    this.apellido=apell;
    this.telefono=tel;
    this.dni=dni;
    this.direccion=direc;
  }

  public String getNombre()
	{
		return this.nombre;
	}

	public void setNombre(String nuevoNombre)
	{
		this.nombre = nuevoNombre;
	}
		
		
	
}
