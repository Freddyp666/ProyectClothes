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
public class Manager {
    
    private String nombre;
    private int id;

    public Manager(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

}
