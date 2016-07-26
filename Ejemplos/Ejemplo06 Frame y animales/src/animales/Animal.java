package animales;

public class Animal {

   public String nombre,taxonomia;
   public int extremidades,ojos;
    public String boca;
    public int patas;


    public void emitirSonido(){
        System.out.println("Hola mi nombre es: "+ nombre + " y soy un" + taxonomia);
    }

    public void morir(){
        System.out.println("NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO me muero!!!!!!!!");
    }
}
