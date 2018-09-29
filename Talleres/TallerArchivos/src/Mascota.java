/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrés Felipe
 */
class Mascota {
    public int Edad;
    public String Nombre;
    public String Raza;    
    public String Nombre_Dueño;

    public Mascota(int Edad, String Nombre, String Raza, String Nombre_Dueño) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Nombre_Dueño = Nombre_Dueño;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre_Dueño() {
        return Nombre_Dueño;
    }

    public void setNombre_Dueño(String Nombre_Dueño) {
        this.Nombre_Dueño = Nombre_Dueño;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return "\nDatos Mascota\n" + "Edad: " + Edad + "\nNombre: " + Nombre + "\nRaza: " + Raza + "\nNombre_Dueño: " + Nombre_Dueño;
    }
      
}
