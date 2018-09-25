/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrés Felipe
 */
public class Pelicula extends Multimedia{
   
    protected String Actor;
    protected String Actriz;

    public Pelicula(String TituloE, String AutorE, String FormatoE, double DuracionE) {
        super(TituloE, AutorE, FormatoE, DuracionE);
    }
    public void Actores(String ActorE, String ActrizE){
        if(ActorE.equals("") && ActrizE.equals("")){
            System.out.println("Añada un Actor y/o Actriz");
        }
        Actor = ActorE;
        Actriz = ActrizE;
    }
    @Override
    public String toString(){
        String message = "\n\nTitulo: "+ Titulo + "\nAutor: "+ Autor + "\nFormato: " + Formato + "\nDuracion: " + Duracion 
                + "\nActor: " + Actor + "\nActriz: " + Actriz + "\n";
        return message;
    }
}