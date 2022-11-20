package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class ControlEstablecer implements ActionListener{
private VentanaEstablecer vista2;
private Modelo modelito;
    public ControlEstablecer(VentanaEstablecer v) {
    vista2=v;
    modelito=vista2.getModelito();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       JButton boton = (JButton)e.getSource();
       if(boton==vista2.getBtnaceptar()){
           modelito.establecerdimenciones(vista2.getSpinafilas().getValue().toString(),vista2.getSpinacolumnas().getValue().toString(),vista2.getSpinbfilas().getValue().toString(),vista2.getSpinbcolumnas().getValue().toString());
           vista2.dispose();
       }
       else if(boton==vista2.getBtncancelar()){
      vista2.dispose();
       }
    }
    
}
