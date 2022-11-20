package logica;

import javax.swing.JOptionPane;
import presentacion.Modelo;


public class Condiciones {
private String matriz;
private Modelo modelito;

    public Condiciones() {
    
    }

   
    public boolean condiciones(int fia,int ca,int fib,int cb,String fun){
        boolean condicion=false;
        
        if("reduccion".equals(fun)){
        if(ca!=fia+1){
           JOptionPane.showMessageDialog(null,"LA MATRIZ TIENE QUE SER CUADRADA PAR REDUCIRLA"); 
           condicion=true;
       }
     }else if(("suma".equals(fun))||("resta".equals(fun))){
         if((fia!=fib)||(ca!=cb)){
         JOptionPane.showMessageDialog(null,"LAS MATRICES TIENEN QUE SER DE LAS MISMAS DIMENSIONES"); 
         condicion=true;
         }
     }else if("multiplicacion".equals(fun)){
         if(ca!=fib){
             JOptionPane.showMessageDialog(null,"LAS COLUMNAS DE A TIENE QUE SER IGUAL A LAS FILAS DE B"); 
         condicion=true;
         }
     }else if("inversa".equals(fun)||"transpuesta".equals(fun)){
     if(fia!=ca){
      JOptionPane.showMessageDialog(null,"LA MATRIZ TIENE QUE SER CUADRADA PARA HACER LA OPERACION"); 
         condicion=true;
     }}
        
    return condicion;
    }
   
     
   
}
