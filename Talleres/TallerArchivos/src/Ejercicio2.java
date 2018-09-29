/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Andrés Felipe
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            File ArchivoEjercicio2 = new File("ArchivoEjercicio2.txt");
            FileReader FR = new FileReader(ArchivoEjercicio2);
            BufferedReader BR = new BufferedReader(FR);
            String Cad;            
            int SumaElementos = 0, TotalElementos = 0, N;
            double Result;
            while((Cad = BR.readLine()) != null){                
                N = Integer.parseInt(Cad);
                SumaElementos += N;
                TotalElementos++;
            }
            Result = SumaElementos / TotalElementos;
            System.out.println("\nEl promedio de los números dentro del archivo es: " + Result);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
