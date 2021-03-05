/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consesionario;
import java.util.AbstractList;
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TestConcesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //new Car("KIA",2021);
        Manager m1 = new Manager("Lola Mora",8);
        
        Salesperson s1 = new Salesperson("Juan Erazo",1200);
        Salesperson s2 = new Salesperson("Ana Aguirre",450);
        
        Dealership c1 =new Dealership();
        c1.setNombre("Mi primer consecionario");
        
        //agregar el gerente y los empleados al concesionario
        c1.setGerente(m1);
        
        c1.agregarVendedor(s1);
        c1.agregarVendedor(s2);
        
        s1.setSueldo(480);
        
        c1.getVendedores().get(1).setSueldo(500);
        //composicion ----objetos anonimos --son accedidos unicamente con su todo
        
        c1.agregarAuto(new Car("KIA",2020));
        c1.agregarAuto(new Car("TOYOTA",2021));
        
      
        System.out.println(c1.toString());
    }
    
}
