/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrés Felipe
 */
public class Aplicacion {
     public static void main(String[] args){
        
        ListaDeMultimedia ListaA = new ListaDeMultimedia(10);
        
        Pelicula PeliculaA = new Pelicula("LaMonja", "Corin", "dvd", 102.3);
        PeliculaA.Actores("Taissa", "Bonnie");

        Pelicula PeliculaB = new Pelicula("WallFlower", "Stephen", "dvd", 114.20);
        PeliculaB.Actores("Logan", "Emma");

        Pelicula PeliculaC = new Pelicula("500Summer", "Marc", "dvd", 60.25);
        PeliculaC.Actores("Joseph", "zooey");

        ListaA.add(PeliculaA);
        ListaA.add(PeliculaB);
        ListaA.add(PeliculaC);

        System.out.println(ListaA.toString(ListaA));


        ListaDeMultimedia ListaB = new ListaDeMultimedia(20);
        Disco DiscoA = new Disco("Ambiente", "JBalvin", "mp3", 4.3);
        DiscoA.AgregarGenero("Urbano");

        Disco DiscoB = new Disco("Espejo", "CDN", "mp3", 3.5);
        DiscoB.AgregarGenero("Rock");

        Disco DiscoC = new Disco("Adios", "Christian", "mp3", 2.6);
        DiscoC.AgregarGenero("Ranchera");

        ListaB.add(DiscoA);
        ListaB.add(DiscoB);
        ListaB.add(DiscoC);

        System.out.println(ListaB.toString(ListaB));
        
        String Title = ListaB.get(2).Titulo;
        String Author = ListaB.get(2).Autor;
        Disco DiscoE1 = new Disco(Title, Author, "mp3", 3.0);
        System.out.println("\nDiscoE1: " + DiscoE1.toString());
        
    }
}
