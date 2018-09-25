/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrés Felipe
 */
   public class Disco extends Multimedia{
    public String Genero;
    public Disco(String TituloE, String AutorE, String FormatoE, double DuracionE) {
        super(TituloE, AutorE, FormatoE, DuracionE);
    }
    public void AgregarGenero(String GeneroE){
        Genero = GeneroE;
    }
    @Override
    public String toString(){
        
        String message = "\n\nTitulo: "+ Titulo + "\nAutor: "+ Autor + "\nFormato: "+ Formato + "\nDuracion: "+ Duracion
                      + "\nGenero: "+ Genero + "\n";
        return message;
    } 
}
