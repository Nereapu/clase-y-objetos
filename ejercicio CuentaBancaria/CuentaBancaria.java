public class CuentaBancaria
{
	private Persona titular;
	private double saldo;

    //icluir otra persona autorizada persona 1 y persona 2
    private Persona[] autrizadas =new Persona[2];
	//...resto de atributos

	public CuentaBancaria()
	{
		this.titular = new Persona();
		this.saldo = 0.0;
		System.out.println("Creada cuenta a nombre de:" +this.titular.getNombre());	
	}
//debuelve el valor del atributo---optener informacion-----
	public Persona getTitular()
	 {
		return this.titular;
	}

    public void ingresa(double cantidad)
    {
        this.saldo=this.saldo+cantidad;

    }
    //sacar no devuelve nada
    public void sacar(double cantidad)
    {
        //si el saldo es mayor que la cantidad haz:
        if(this.saldo >= cantidad)
        {
           // descuenta el saldo la cantidad
            this.saldo=this.saldo-cantidad;
        }
        else
		
        {
            System.out.println("No tienes salo suficiente");
        }
    }

    //optener el saldo
    public double getSaldo()
    {
        return this.saldo;

    }

    //metodo para añadir las persona autizadas si es una o 2 
    public boolean añadirAutorizado()
    {
        boolean hePodido=false;
        //si i es menor que dos el array y es falso entro
        //cuando termina el if hacer otra vez el for
        // y como he podido se combiertio en true ya no se puede ir al for
        for(int i=0;i<autrizadas.length && hePodido==false;i++)
        {
            //saver si la posicion esta vacia
            //si el array es 0 entonces haz 
            //solo una vez
            if(autrizadas[i]==null)
            {
                autrizadas[i]=new Persona();
                //con esto si si a entrado una persona
               //despues se combierte en true 
                hePodido=true;

            }
            

        }
        return hePodido;

    }
		
}