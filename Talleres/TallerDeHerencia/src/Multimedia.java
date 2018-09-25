/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrés Felipe
 */
public class Multimedia {
    protected String Titulo;
    protected String Autor;
    protected String Formato;
    protected double Duracion;


    public Multimedia(String TituloE, String AutorE, String FormatoE, double DuracionE){
        Titulo = TituloE;
        Autor = AutorE;
        Formato = FormatoE;
        Duracion = DuracionE;
    }
    public void datos(){
        System.out.println("Atributos: titulo, autor, formato, duracion.");
    }
    @Override
    public String toString(){
        String message = "\n\nTitulo: "+ Titulo + "\nAutor: "+ Autor + "\nFormato: " + Formato + "\nDuracion: " + Duracion;
        return message;
    }
    public boolean equals(String _Titulo, String _Autor){
        return Titulo.equals(Autor);
    }
}
