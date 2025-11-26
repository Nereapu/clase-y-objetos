import java.util.Scanner;
public class CuentaBancaria
{
	private String titular;
//	private  String [] autorizadas;
	private double saldo;
	
	String[] autorizadas=new String[3];
	public CuentaBancaria()
	{
	  
	}
	
	public CuentaBancaria(String titular)
	{
	  this.titular=titular;
	}
	
		public CuentaBancaria(double saldo,String titular)
	{
	  this.saldo=saldo;
	  this.titular=titular;
	}
	
	public void ingresar(double cantidad)
	
	{
      cantidad=this.saldo+= cantidad;   
	}
	
	public boolean sacar(double cantidad)
	{
	    boolean hePodidoSacar=false;
	    
	    if(this.saldo>= cantidad && hePodidoSacar==false)
	    {
	      cantidad-= saldo;
	      hePodidoSacar=true;
	      
	    
	        
	    }
	    else
	    {
		 
	      hePodidoSacar=false;
	      
	    }
	     return hePodidoSacar;
	  }
	  
	  public String personasAutorizadas(double persona)
	  {
	  
	  for(int i=0;i<this.autorizada.lenght;i++)
	  {
	    if(
	  }
	  
	 
	  

	
	public String getTitular()
	{
	  return this.titular;
	 } 
	
 public double getSaldo()
 {
    return this.saldo;
 }


	
	
	/*public boolean retirar(int cantidad){
    boolean retiro = cantidad<=this.saldo;
    ithis.saldo+= cantidad;f(retiro){
          this.saldo -= cantidad;
    }
    return retiro;
	}
	*/
	}
	
	
	
