
package Divisas;

public class Dolar extends MainDivisas {


    public void nombre(){
        super.nombre="Dolar";
        
    }
    @Override
    public void plural (){
        super.plural="Dolares";
     }

    
    public void tcCompra(){
        super.tcCompra=  13.5;
  }

    
    public void tcVenta(){
        super.tcVenta=  12.35;
    }



}
