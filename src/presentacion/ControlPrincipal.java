package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JMenuItem;


public class ControlPrincipal implements ActionListener {

private final VentanaPrincipal vistaPrincipal;
private final Modelo modelito;

    public ControlPrincipal(VentanaPrincipal v) {
        vistaPrincipal=v;
        modelito=vistaPrincipal.getModelito();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() instanceof JMenuItem){     
         JMenuItem menu=(JMenuItem) e.getSource();
            if(menu==vistaPrincipal.getMniEstablecer()){
                modelito.abrirventana2();
            }
            if(menu==vistaPrincipal.getMniDespejarA()){
                modelito.despejar("a");
            }
            if(menu==vistaPrincipal.getMniDespejarB()){
            modelito.despejar("b");
            }
            if(menu==vistaPrincipal.getMniIdentidadA()){
            modelito.identidad("a");}
            if(menu==vistaPrincipal.getMniIdentidadB()){
            modelito.identidad("b");}
            if(menu==vistaPrincipal.getMniSalir()){
            System.exit(0);
            }
       }
       else if (e.getSource() instanceof JButton){
            JButton boton=(JButton) e.getSource();
           if(boton==vistaPrincipal.getBtnseleccion()){
           int ac=vistaPrincipal.getCbxoperaciones().getSelectedIndex();
           if(ac==0){
               modelito.reducir("a");  
           }else if(ac==1){
               modelito.reducir("b");
           }else if (ac==2){
             modelito.inversa("a");
           }
           else if(ac==3){
               modelito.inversa("b");
           
           }else if(ac==4){
             modelito.tranponer("a");
           }else if(ac==5){
            modelito.tranponer("b");
           }else if(ac==6){
             modelito.determinante("a"); 
           }else if(ac==7){
               modelito.determinante("b");
           }
           else if(ac==8){
           modelito.suma();
           }
           else if(ac==9){
            modelito.resta();
           }
           else if(ac==10){
            modelito.multiplicacion();   
          }
     
       }
    
    }
       
}
}
