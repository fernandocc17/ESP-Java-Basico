package Motorizado;

import movedor.Movedor;

public abstract class Ruedas implements Movedor {

	public int radio;
	public int numeroRuedas;
	public String asientos;
	public final double PI=3.1416;
	
	public Ruedas(int radio) {
     
		this.radio=radio;
		
	}
	
	abstract public void mover();

	abstract public void calcular();
	
	public void arrancar()
	{}
		
}
