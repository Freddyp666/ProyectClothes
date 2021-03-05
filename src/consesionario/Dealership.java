package consesionario;

import java.util.ArrayList;

public class Dealership {

    private String nombre;

//Implementacion de la relacion 1 a 1 de agregacion
    private Manager gerente;

//Implementacion de la relacion 1 a * de agragacion
//Arralist <tipo dato>
    ArrayList<Salesperson> vendedores = new ArrayList<>();//declaro y creo una lista

//implementacion de la relaciomm de 1 a * de composicion
    ArrayList<Car> autos = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Manager getGerente() {
        return gerente;
    }

    public void setGerente(Manager gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Salesperson> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Salesperson> vendedores) {
        this.vendedores = vendedores;
    }

    public ArrayList<Car> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Car> autos) {
        this.autos = autos;
    }

    public void agregarVendedor(Salesperson s) {
        this.vendedores.add(s);
    }
    
    public void agregarAuto(Car c){
        this.autos.add(c);
    }

    @Override
    public String toString() {
        return "Dealership{" + "nombre=" +nombre + ", gerente="+gerente + ", vendedores=" + vendedores + ", autos=" + autos + '}';
    }
    
    

}
