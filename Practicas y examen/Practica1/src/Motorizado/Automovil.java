package Motorizado;

public class Automovil extends Ruedas{

	public Automovil(int radio) {
		super(radio);
		mover();
		calcular();
	}
	
	final int num=4;

	@Override
	public void mover() {
		System.out.println("Me muevo sobre 4 ruedas y me conducen");
	}

	@Override
	public void calcular() {
		
		System.out.println("El area es: " + PI*radio*radio*num);
		
		// TODO Auto-generated method stub
		
	}

}
