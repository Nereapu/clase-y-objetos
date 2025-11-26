// ejercicio 1
//a)  4.5f+b+15b/b-3.2+2f  ---> double
//b)  i+ lg + b* 1= long
//ejercico 2
//int a=5;
//int b=3
//int c=-12
//a+b==8||!(a-b==6)
//primer paso (a-b==6)
//5+3==8||!(5-3==6)
//5+3==8||!false
//true||true
//true


//a>3 && b>=3&&c<-3
//5>3 && 3>=3&&-12<-3
//true

//lenguajes interpretados
//culaes son las carateristicas orientada a objetos
abstracion,encasulacion,jerarquia
//una intruccion condicional con la palabra reservada case
//switch()


//programe un metodo llamado number, no es necesrio crear la clase , in troduce un numwero hasta que el usuario metada un 0, escribir en pantalla la media de los positivos por un lado  y media de los negativos ;cuantos positivos hay y negativos hay
public    numbers()
{
   Scanner sc=new Scanner(System.in);
   
   do
   {
       int numero,positivos,negativos, contadorPositivos,contadoNegativos=0;
      System.out.println("dame un numero");
      numero=sc.next.int;
      if(nuemro>0)
      {
        positivo=positivo+nuemro;
        contadorPositivo++;
      }
      if(nuemro<0)
      {
          negostivos=negativos+nuemro;
          contadorNegativos++;
      }
      }
      
    }
    while(numero!=0);
    system.out.printl("totalpositivo="+contadorPositivos);
    system.out.printl("total negativos="+contadorNegativos);
   if(contadorPositivo>0)
   ssystem.out("media="+ positivos/contadorPositivos);
   if(contadorNegativos>0)
   System.out.print("media ="+ negativos/contadorNegativos);
   
   
  // ejercicio 6)
  //programe las siguiente clases donde hay dos clases involucradas
  
  //clase tarjeta
  //punhtos 0,5
  impor java.import.Scanner;
  public class Tarjeta
  {
   
   private String nombreUsario;
   private int largo=0;
   private int ancho=0;
   //array bidimensional
   //solo declarado no esta el array
   private int[][]tarjeta;
   
  
   //codifique el nombre que devuelve a la tarjeta no escribe nada en pantalla
   public String getnombre()
   {
   return this.nombreusuario;
   }
   //hacer un metodo rellenarlos atributos tarjeta y recibe dos parametros largo y ancho
   //solicita un nombre al usuarios ,genera una array y devuelve el numero de casillas que tiene la tarjeta 
   public int rellenarTarjeta(int largo,int ancho)
   {
      //relelnar los atributos con lo que te dan
      this.largo=largo
      this.ancho=ancho
      //pedi un nombre al usuario
      Scanner sc=new Scanner(System.in);
      System.out.print("Dime tu nombre");
      //recoger el nombre
      this.nombreUsuario=sc.next();
      //generar una array con new
      tarjeta=new int[largo][ancho];
      
      //regorer el array
      for(int i=0;i<tarjeta.lenght;i++)
      {
          for(int e =0;e<tarjeta[i];e++)
          {
          System.out.println("diga un numero")
          //regoger los numeros
            tarjeta[i][j]=sc.next.Int();
            
          }
          
          
      } 
      //devuelve largo por ancho
      return largo*ancho;
    }
  }
  
  
  //codifica la clase test tarjeta
  
  public class Test tarjeta
  {
    public static void main (String[]args)
    {
    Trajeta t1=nextTarjeta();
    Trajeta t2=nexTarjeta();
    Tarjeta t3=nexTarjeta();
    //rellenar tarjetas
    t1.rellenarTarjeta(2,3);
    t2.rellenarTarjeta(6,2)
    [][][][][][]
    [][][][][][]
  int casillas=  t3.rellenarTarjeta(7,5);
    //se muestre en pantalla el nombre asociado a la segunda de las tarjeta que hemos creado
    Sytem.out.println(t2.getnombre());
    Sytem.out.println(casillas);
    
    }
  }
  
    
  

