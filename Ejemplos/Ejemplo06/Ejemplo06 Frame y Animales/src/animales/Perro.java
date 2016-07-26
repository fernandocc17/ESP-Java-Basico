package animales;

public class Perro extends Vertebrados {

        @Override
   public  void emitirSonido(){
        super.emitirSonido();
        System.out.println("Guau Guau!!!");
    }
    @Override
    public void boca(){
        super.boca();
        System.out.println("me sirve para comer");

    }
    
    @Override
    public void extremidades(){
        super.extremidades();
        System.out.println("" );
    }
    
    @Override
    public void ojos(){
        super.ojos();
        System.out.println("");
    }
}
