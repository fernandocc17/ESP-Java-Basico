package Motorizado;

public class Moto extends Ruedas {
	
	public Moto(int radio) {
		super(radio);
		mover();
		calcular();
	}
	
	final int num=2;

	@Override
	public void mover() {
		System.out.println("Me muevo sobre dos ruedas");
	}

	@Override
	public void calcular() {
		
		System.out.println("El area es: " + PI*radio*radio*num);
		
		// TODO Auto-generated method stub
		
	}

}
