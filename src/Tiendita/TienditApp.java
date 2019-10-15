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
public class TienditApp {
    
    public static void main(String[] args) {
        Producto[] productitos = new Producto[5];
        
        productitos[0] = new Producto("Genérico", 22.5);
        productitos[1] = new NoPerecedero("Acumuladores", "Baterias AA", 99);
        productitos[2] = new Perecedero(5, "Queso de Bola", 210);
        productitos[3] = new Producto("Simi Gel", 15);
        productitos[4] = new NoPerecedero("Llanta", "Firestone 205/60/R15", 1550);
        
        
        
        System.out.println( productitos[0].calcular(5));
        System.out.println(productitos[1].calcular(5));
        System.out.println(productitos[2].calcular(5));
        System.out.println(productitos[3].calcular(5));
        System.out.println(productitos[4].calcular(5));
    
    }
}
