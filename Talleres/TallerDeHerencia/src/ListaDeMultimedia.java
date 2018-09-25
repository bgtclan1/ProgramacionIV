/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrés Felipe
 */
public class ListaDeMultimedia {

    protected Multimedia Objetos [];
    protected int Contador = 0;

    public ListaDeMultimedia(int Tamaño){
        Objetos = new Multimedia[Tamaño];
    }
    public int size(){
        return Objetos.length;
    }
    public boolean add(Multimedia Mult){
        if (Contador < Objetos.length){
            Objetos[Contador] = Mult;
            Contador += 1;
            return true;
        }
        else{
            return false;
    }
    }
    Multimedia get(int Pos){
        return Objetos[Pos];
    }

    public String toString(ListaDeMultimedia Lista){
        StringBuilder List = new StringBuilder();
        for(int W = 0; W < Lista.size(); W++){
            List = List.append(Lista.get(W));
        }
        return List.toString();
    }

 
    


}
