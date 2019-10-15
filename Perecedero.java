/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tiendita;

/**
 *
 * @author RoyOh
 */
public class Perecedero extends Producto{
    int caducara;

    public Perecedero(int caducara, String nombre, double precio) {
        super(nombre, precio);
        this.caducara = caducara;
    }

    public int getCaducara() {
        return caducara;
    }

    public void setCaducara(int caducara) {
        this.caducara = caducara;
    }

    @Override
    public String toString() {
        return "Este producto caducará en: " + caducara + " días.";
    }
    
     public double calcular(int cantidad){
        double precioTotal;
        precioTotal= super.calcular(cantidad);
        if(getCaducara()==1){
            return precioTotal /= 4;
        }else if(getCaducara()==2){
            return precioTotal /= 3;
        }else if(getCaducara()==3){
            return precioTotal /=2;
        }else{
            return precioTotal;
        }
    }
}
