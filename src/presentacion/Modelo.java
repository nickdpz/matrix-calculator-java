package presentacion;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import logica.Condiciones;
import logica.Operaciones;

public class Modelo {
private VentanaPrincipal vista;
private VentanaEstablecer vista2;
private Condiciones condicion;
private Operaciones operacion;
private float[][] matriza;
private float[][] matrizb;
private boolean sentecia=false;
private JTextField texfa[][]=new JTextField[5][5];
private JTextField texfb[][]=new JTextField[5][5];
private int afi=5,aci=5,bfi=5,bci=5;

    public Modelo() {
        this.texfa[0][0]=getVista().getTxta1_1();
        this.texfa[0][1]=getVista().getTxta1_2();
        this.texfa[0][2]=getVista().getTxta1_3();
        this.texfa[0][3]=getVista().getTxta1_4();
        this.texfa[0][4]=getVista().getTxta1_5();
        this.texfa[1][0]=getVista().getTxta2_1();
        this.texfa[1][1]=getVista().getTxta2_2();
        this.texfa[1][2]=getVista().getTxta2_3();
        this.texfa[1][3]=getVista().getTxta2_4();
        this.texfa[1][4]=getVista().getTxta2_5();
        this.texfa[2][0]=getVista().getTxta3_1();
        this.texfa[2][1]=getVista().getTxta3_2();
        this.texfa[2][2]=getVista().getTxta3_3();
        this.texfa[2][3]=getVista().getTxta3_4();
        this.texfa[2][4]=getVista().getTxta3_5();
        this.texfa[3][0]=getVista().getTxta4_1();
        this.texfa[3][1]=getVista().getTxta4_2();
        this.texfa[3][2]=getVista().getTxta4_3();
        this.texfa[3][3]=getVista().getTxta4_4();
        this.texfa[3][4]=getVista().getTxta4_5();
        this.texfa[4][0]=getVista().getTxta5_1();
        this.texfa[4][1]=getVista().getTxta5_2();
        this.texfa[4][2]=getVista().getTxta5_3();
        this.texfa[4][3]=getVista().getTxta5_4();
        this.texfa[4][4]=getVista().getTxta5_5();
        this.texfb[0][0]=getVista().getTxtb1_1();
        this.texfb[0][1]=getVista().getTxtb1_2();
        this.texfb[0][2]=getVista().getTxtb1_3();
        this.texfb[0][3]=getVista().getTxtb1_4();
        this.texfb[0][4]=getVista().getTxtb1_5();
        this.texfb[1][0]=getVista().getTxtb2_1();
        this.texfb[1][1]=getVista().getTxtb2_2();
        this.texfb[1][2]=getVista().getTxtb2_3();
        this.texfb[1][3]=getVista().getTxtb2_4();
        this.texfb[1][4]=getVista().getTxtb2_5();
        this.texfb[2][0]=getVista().getTxtb3_1();
        this.texfb[2][1]=getVista().getTxtb3_2();
        this.texfb[2][2]=getVista().getTxtb3_3();
        this.texfb[2][3]=getVista().getTxtb3_4();
        this.texfb[2][4]=getVista().getTxtb3_5();
        this.texfb[3][0]=getVista().getTxtb4_1();
        this.texfb[3][1]=getVista().getTxtb4_2();
        this.texfb[3][2]=getVista().getTxtb4_3();
        this.texfb[3][3]=getVista().getTxtb4_4();
        this.texfb[3][4]=getVista().getTxtb4_5();
        this.texfb[4][0]=getVista().getTxtb5_1();
        this.texfb[4][1]=getVista().getTxtb5_2();
        this.texfb[4][2]=getVista().getTxtb5_3();
        this.texfb[4][3]=getVista().getTxtb5_4();
        this.texfb[4][4]=getVista().getTxtb5_5();
       
    }
    public void iniciar() {
        establecerdimenciones("3", "4", "3", "4");
        getVista().setVisible(true);
        
    }
    public VentanaPrincipal getVista() {
        if(vista==null){
        vista=new VentanaPrincipal(this);
        }
        return vista;
    }

    public VentanaEstablecer getVista2() {
         if(vista2==null){
        vista2=new VentanaEstablecer(this);
        }
        return vista2;
    }

    public Condiciones getCondicion() {
        if(condicion==null){
        condicion=new Condiciones();
        }
        return condicion;
    }

    public Operaciones getOperacion() {
        if(operacion==null){
        operacion=new Operaciones();
        }
        return operacion;
    }

    public JTextField[][] getTexfa() {
        return texfa;
    }

    public JTextField[][] getTexfb() {
        return texfb;
    }
    
    public void abrirventana2() {
     getVista2().setVisible(true);
     getVista2().setLocation(40,100);
    }

    public void establecerdimenciones(String af,String ac,String bf,String bc) {
        int maf=5-Integer.parseInt(af);
        int mac=5-Integer.parseInt(ac);
        int mbf=5-Integer.parseInt(bf);
        int mbc=5-Integer.parseInt(bc);
        
         if(Integer.parseInt(af)<afi){
         for (int i = 0; i<maf; i++){
             for (int j = 0; j <5; j++) {
                 texfa[4-i][4-j].setVisible(false);
             }
           getVista().setSize(getVista().getWidth(),getVista().getHeight()-2);
           }
         }else if(Integer.parseInt(af)>afi){
         for (int i=2; i<Integer.parseInt(af); i++){
             for (int j = 0; j <Integer.parseInt(ac); j++) {
                 texfa[i][j].setVisible(true);
             }
           getVista().setSize(getVista().getWidth(),getVista().getHeight()+2);}
         }
         if(Integer.parseInt(ac)<aci){
         for (int i = 0; i<mac; i++){
             for (int j = 0; j <5; j++) {
                 texfa[4-j][4-i].setVisible(false);
             }
            
           getVista().setSize(getVista().getWidth()-10,getVista().getHeight());}
         }else if(Integer.parseInt(ac)>aci){
         for (int i = 2; i<Integer.parseInt(ac); i++){
             for (int j = 0; j <Integer.parseInt(af); j++) {
                 texfa[j][i].setVisible(true);
             }
               
           getVista().setSize(getVista().getWidth()+15,getVista().getHeight());}
         }
         if(Integer.parseInt(bf)<bfi){
         for (int i = 0; i<mbf; i++){
             for (int j = 0; j <5; j++) {
                 texfb[4-i][4-j].setVisible(false);
             }
           getVista().setSize(getVista().getWidth(),getVista().getHeight()-2);
         }
         }else if(Integer.parseInt(bf)>bfi){
         for (int i=2; i<Integer.parseInt(bf); i++){
             for (int j = 0; j <Integer.parseInt(bc); j++) {
                 texfb[i][j].setVisible(true);
             }
           getVista().setSize(getVista().getWidth(),getVista().getHeight()+2);}
         }
         if(Integer.parseInt(bc)<bci){
         for (int i = 0; i<mbc; i++){
             for (int j = 0; j <5; j++) {
                 texfb[4-j][4-i].setVisible(false);
             }
           getVista().setSize(getVista().getWidth()-10,getVista().getHeight());}
         }else if(Integer.parseInt(bc)>bci){
         for (int i = 2; i<Integer.parseInt(bc); i++){
             for (int j = 0; j <Integer.parseInt(bf); j++) {
                 texfb[j][i].setVisible(true);
             }
           getVista().setSize(getVista().getWidth()+15,getVista().getHeight());}
         }
        afi=Integer.parseInt(af);
        aci=Integer.parseInt(ac);
        bfi=Integer.parseInt(bf);
        bci=Integer.parseInt(bc);
    }

    public void identidad(String a) {
        if("a".equals(a)){
            for (int i = 0; i < afi; i++) {
                for (int j = 0; j <aci; j++) {
                    if(i==j){texfa[i][j].setText("1");
                    }else{texfa[i][j].setText("0");}
                }
            }
          }else{
            for (int i = 0; i < bfi; i++) {
                for (int j = 0; j <bci; j++) {
                    if(i==j){texfb[i][j].setText("1");
                    }else{texfb[i][j].setText("0");}
                }
            }
          }
       } 

    public void despejar(String a) {
        if("a".equals(a)){
            for (int i = 0; i < afi; i++) {
                for (int j = 0; j <aci; j++) {
                    texfa[i][j].setText("");
                }
             }
        }else{
            for (int i = 0; i < bfi; i++) {
                for (int j = 0; j <bci; j++) {
                   texfb[i][j].setText("");
                }
          }
        }
    }
    public void reducir(String matriz){
     if(matriz=="a"){
     obtenerdatos("a","reduccion");
     if(!sentecia){
      getOperacion().reducir(afi, aci, matriza);}
     }else{
     obtenerdatos("b","reduccion");    
     if(!sentecia){
     getOperacion().reducir(bfi, bci, matrizb);}
     }   
 
    }
    public void suma(){
    obtenerdatos("a","suma");
    obtenerdatos("b","suma");   
    if(!sentecia){
    getOperacion().sumaryrestar(afi, aci, matriza, matrizb,"+");
    }}
    public void resta(){
    obtenerdatos("a","resta");
    obtenerdatos("b","resta"); 
    if(!sentecia){
    getOperacion().sumaryrestar(afi, aci, matriza, matrizb,"-");
    }
    }
    public void tranponer(String ma){
        obtenerdatos(ma,"transponer");
        if(!sentecia){
        if("a".equals(ma)){getOperacion().trasponer(afi,aci,matriza);}
        else{getOperacion().trasponer(bfi,bci,matrizb);}
        }
    }
     public void multiplicacion() {
   obtenerdatos("a","multiplicacion");
    obtenerdatos("b","multiplicacion"); 
    if(!sentecia){
    getOperacion().multiplicacion(afi,aci,bfi,bci,matriza,matrizb);
    }
    }
     
    public void inversa(String a) {
         if(a=="a"){
     obtenerdatos("a","inversa");
     if(!sentecia){
      getOperacion().inversa(afi, aci, matriza);}
     }else{
     obtenerdatos("b","inversa");    
     if(!sentecia){
     getOperacion().inversa(bfi, bci, matrizb);}
     }
    }
    
    public void determinante(String a) {
        if("a".equals(a)){
     obtenerdatos("a","determinante");
        if(!sentecia){
      getOperacion().determinante(afi, matriza);}
        }else{
            if(!sentecia){
      getOperacion().determinante(bfi, matrizb);}
        obtenerdatos("b","determinante");}
        
    }
    
   public void obtenerdatos(String a,String fun){
        int auxf=bfi,auxc=bci;
       if("a".equals(a)){
        matriza=new float[afi][aci];
       sentecia=getCondicion().condiciones(afi, aci,auxf,auxc,fun);
       for (int i = 0; i < afi; i++) {
           if(sentecia==true){
           break;
           }
            for (int j = 0; j < aci; j++) {
                try {
                   Float.valueOf(texfa[i][j].getText());
                   } catch (Exception e) {
                       JOptionPane.showMessageDialog(null,"ERROR EN LA MATRIZ A COORDENADA : "+(i+1)+" , "+(j+1));
                       sentecia=true;
                       break;
                  }
                 matriza[i][j]=Float.valueOf(texfa[i][j].getText());
                }
            }
      
    }
       else{
            matrizb=new float[bfi][bci];
            if(fun!="multiplicacion"){
            sentecia=getCondicion().condiciones(bfi, bci,auxf,auxc,fun);}
           for (int i = 0; i < bfi; i++) {
           if(sentecia==true){
           break;
           }
            for (int j = 0; j < bci; j++) {
                try {
                   Float.valueOf(texfb[i][j].getText());
                   } catch (Exception e) {
                       JOptionPane.showMessageDialog(null,"ERROR EN LA MATRIZ B COORDENADA : "+(i+1)+" , "+(j+1));
                       sentecia=true;
                       break;
                  }
                 matrizb[i][j]=Float.valueOf(texfb[i][j].getText());
                }
            }
           
       }
   
    }

    
}
