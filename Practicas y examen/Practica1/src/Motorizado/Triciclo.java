package Motorizado;

public class Triciclo extends Ruedas{

	public Triciclo(int radio) {
		super(radio);
		mover();
		calcular();
	}
	
	final int num=3;

	@Override
	public void mover() {
		System.out.println("Me muevo sobre 3 ruedas");
	}

	@Override
	public void calcular() {
		
		System.out.println("El area es: " + PI*radio*radio*num);
		
		// TODO Auto-generated method stub
		
	}

}

