/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package consesionario;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Car {
    
    private String marca;
    private int anio;

    public Car( String marca,int anio) {
        this.marca = marca;
        this.anio = anio;
        
    }
    
    

    public int getAño() {
        return anio;
    }

    public void setAño(int año) {
        this.anio = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

}
