import java.util.Scanner;

     
  public class Tarjeta
  {
   
   private String nombreUsuario;
   private int largo=0;
   private int ancho=0;
   //array bidimensional
   //solo declarado no esta el array
   private int[][]tarjeta;
  
   //codifique el nombre que devuelve a la tarjeta no escribe nada en pantalla
   public String getnombre()
   {
   return this.nombreUsuario;
   }
   
   
   //hacer un metodo rellenarlos atributos tarjeta y recibe dos parametros largo y ancho
   //solicita un nombre al usuarios ,genera una array y devuelve el numero de casillas que tiene la tarjeta 
   public int rellenarTarjeta(int largo,int ancho)
   {
      //relelnar los atributos con lo que te dan
      this.largo=largo;
      this.ancho=ancho;
      //pedi un nombre al usuario
      Scanner sc=new Scanner(System.in);
      System.out.print("Dime tu nombre");
      //recoger el nombre
      this.nombreUsuario=sc.next();
      //generar una array con new
      tarjeta=new int[largo][ancho];
      
      //regorer el array
      for(int i=0;i<tarjeta.length;i++)
      {
          for(int e=0;e<tarjeta[i];e++)
          {
          System.out.println("diga un numero");
          //regoger los numeros
            tarjeta[i][e]=sc.next.Int();
            
          }
          
          
      } 
      //devuelve largo por ancho
      return largo*ancho;
    }
  }
}
  
