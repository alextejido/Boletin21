
package boletin21;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class boletin21 {

    
    public static void añadir (String nomFich,ArrayList<String> lista){
        PrintWriter añado = null;
        FileWriter fich;
        try{
           añado= new PrintWriter(new FileWriter(nomFich,true));
           for(int i = 0 ; i<lista.size();i++){
              añado.print(lista.get(i)+" "); 
           }
           añado.println("\n");
        }catch(IOException ex){
            System.out.println("Error: "+ex.getMessage());
        }finally{
            añado.close();
        }
        
    }
    
    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
        System.out.println("Esto aparecera en el fichero:");
       String cadea = sc.nextLine();
        System.out.println(cadea);
        String cadeas[] = cadea.split(" ");
        for(int i =0; i<cadeas.length;i++){
            listaNombres.add(cadeas[i]);
        }
        Collections.sort(listaNombres);
        añadir("fichero.txt",listaNombres);
    }
    
}