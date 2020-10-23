/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ARCHIVO_S {

    public ARCHIVO_S() {
    }
    
    private Integer prueba;

    public ARCHIVO_S(Integer prueba) {
        this.prueba = prueba;
        

    }

    float datos[] = new float[35];

    public void leerTxt(String direccion, double prueba) { //direccion del archivo

        try {
            File archivo = new File(direccion);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            for (int i = 0; i <= 35; i++) {
                datos[i] = Float.parseFloat(br.readLine());
            }

            fr.close();

        } catch (Exception e) {
            System.err.println("");
        }

        //return matrix;
        final double confianza = (prueba);
        double alfa = 1 - confianza;

        ArrayList<Integer> bits = new ArrayList<>();
        int i, corridas, dato;
        double media, varianza, z;
        //Revisa si cada dato actual es menor al dato anterior. 
        //Si es así, se guarda un 0, de lo contrario, se guarda un 1
        for (i = 1; i < datos.length; i++) {
            if (datos[i] <= datos[i - 1]) {
                bits.add(0);
            } else {
                bits.add(1);
            }
        }

        //Contamos las corridas. 
        corridas = 1;
        //Comenzamos observando el primer dígito
        dato = bits.get(0);
        //Comparamos cada dígito con el observado, cuando cambia es 
        //una nueva corrida
        for (i = 1; i < bits.size(); i++) {
            if (bits.get(i) != dato) {
                corridas++;
                dato = bits.get(i);
            }
        }

        String corrd = String.valueOf(corridas);
        double numero=2;
media = (18980.0) / (10);
        double n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
          n1=(050-media);
          n2=(5-media);
          n3=(0245-media);
          n4=(34-media);
          n5=(456-media);
          n6=(7890-media);
          n7=(32-media);
          n8=(23-media);
          n9=(4567-media);
          n10=(5678-media);
         
        
        double vari= (Math.pow(n1,2)+(Math.pow(n2, 2)+(Math.pow(n3, 2)+(Math.pow(n4, 2))+(Math.pow(n5, 2))+(Math.pow(n6, 2))+(Math.pow(n7, 2))+(Math.pow(n8, 2))+(Math.pow(n9, 2))+(Math.pow(n10, 2)))));
        varianza=vari/10;
        z = Math.abs((corridas - media) / Math.sqrt(varianza));
        double zn = (1 - (alfa / 2));
        String mdia = String.valueOf(media);
        String varian = String.valueOf(varianza);

        //Comparamos: si es mayor mi valor Z al de la tabla, no pasa
        String respuesta;
        if(z < zn){
            respuesta = "No se puede rechazar la hipotesis de independencia. ";

        }else{
            respuesta = "No Pasa la prueba de corridas";

        }
        //return corridas;

        JOptionPane.showMessageDialog(null, "Corridas Obtenidas: " + bits + " \n Total Corridas: " + corridas + "\n Media: " + media + "\nVarianza = " + varianza + "\nConclusion: " + respuesta);

        
    }
    
}
