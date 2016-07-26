package animales;

public class Animal {
    public String nombre,taxonomia,boca;
    public int extremidades,ojos;

   public  void emitirSonido(){
        System.out.println("Hola mi nombre es: " + nombre + " y soy un: " + taxonomia );
    }
   public void morir(){
        System.out.println("NOOOOOOOOOOOO me muero!!!!!!!");
    }
   public void boca(){
       System.out.println( "soy un perro y si " + boca);
   }
   public void extremidades(){
       System.out.println("Mis " + extremidades +" extremidades me ayudan a hacer muchas cosas");
   }
   public void ojos(){
       System.out.println("Mis " + ojos + " Ojos Me sirven para ver");
   }
   public void arrastrar(){
       System.out.println("");
   }
}

