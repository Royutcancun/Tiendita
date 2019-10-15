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
public class NoPerecedero extends Producto{
    String categoria;

    public NoPerecedero(String tipo, String nombre, double precio) {
        super(nombre, precio);
        this.categoria = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String tipo) {
        this.categoria = tipo;
    }

    @Override
    public String toString() {
        return "Este producto no perecedero pertenece a la categoria de: ";
    }
    
    public double calcular (int cantidad){
        return super.calcular(cantidad);
    }
    
    
}
