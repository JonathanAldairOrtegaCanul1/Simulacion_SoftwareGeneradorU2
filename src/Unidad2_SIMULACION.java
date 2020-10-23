/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;


public class Unidad2_SIMULACION {

 public static void main(String[] args) {
        // TODO code application logic here
        
       Tabla ventana= new Tabla();
      ventana.setVisible(true);
     ARCHIVO_S prueba = new ARCHIVO_S();
      ARCHIVO_S COD = new ARCHIVO_S();
      
      double entero;
      
      entero = Double.parseDouble(JOptionPane.showInputDialog("Digite la prueba que desea en decimal ya sea .90, .95, o .99"));
      prueba.leerTxt("C:/Users/Jonathan Ortega/Desktop/Simulacion_SoftwareU2/tabla.txt", entero);
      
}
}
