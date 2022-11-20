
package logica;

import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Operaciones {
    private VentanaResultados ventanare;
    private JLabel impresion[][]=new JLabel[5][5];

    public VentanaResultados getVentanare() {
        if(ventanare==null){
        ventanare= new VentanaResultados();
        }
        return ventanare;
    }
    
    public Operaciones() {
   this.impresion[0][0]=getVentanare().getLbl1_1();
   this.impresion[0][1]=getVentanare().getLbl1_2();
   this.impresion[0][2]=getVentanare().getLbl1_3();
   this.impresion[0][3]=getVentanare().getLbl1_4();
   this.impresion[0][4]=getVentanare().getLbl1_5();
   this.impresion[1][0]=getVentanare().getLbl2_1();
   this.impresion[1][1]=getVentanare().getLbl2_2();
   this.impresion[1][2]=getVentanare().getLbl2_3();
   this.impresion[1][3]=getVentanare().getLbl2_4();
   this.impresion[1][4]=getVentanare().getLbl2_5();
   this.impresion[2][0]=getVentanare().getLbl3_1();
   this.impresion[2][1]=getVentanare().getLbl3_2();
   this.impresion[2][2]=getVentanare().getLbl3_3();
   this.impresion[2][3]=getVentanare().getLbl3_4();
   this.impresion[2][4]=getVentanare().getLbl3_5();
   this.impresion[3][0]=getVentanare().getLbl4_1();
   this.impresion[3][1]=getVentanare().getLbl4_2();
   this.impresion[3][2]=getVentanare().getLbl4_3();
   this.impresion[3][3]=getVentanare().getLbl4_4();
   this.impresion[3][4]=getVentanare().getLbl4_5();
   this.impresion[4][0]=getVentanare().getLbl5_1();
   this.impresion[4][1]=getVentanare().getLbl5_2();
   this.impresion[4][2]=getVentanare().getLbl5_3();
   this.impresion[4][3]=getVentanare().getLbl5_4();
   this.impresion[4][4]=getVentanare().getLbl5_5();
   
    }
    

    public void sumaryrestar(int fi , int co,float matriza[][],float matrizb[][],String op){
   espaciovacio();
    getVentanare().setSize(53*co, 53*fi);
    for (int i = 0; i < fi; i++) {
            for (int j = 0; j < co; j++) {
               if("+".equals(op)){
                   impresion[i][j].setText(""+(matriza[i][j]+matrizb[i][j]));
                   
               }else{
                  impresion[i][j].setText(""+(matriza[i][j]-matrizb[i][j]));
               }
                
            }
        }
    getVentanare().setVisible(true);
    }
     
    
    public void reducir(int fi , int co,float matriz[][]){
        espaciovacio();
    float div,multiplicador;
    float aux[]=new float[co];
    boolean condicio=true;
    
        for (int i = 0; i < fi; i++) {    
            if(condicio){
            div=matriz[i][i];
            if(div==0){
                 JOptionPane.showMessageDialog(null,"LA MATRIZ PRESENTA INFINITAS SOLUCIONES"); 
                 condicio=false;
                }
            for (int j = 0; j < fi+1; j++) {
               matriz[i][j]=matriz[i][j]/div;      
                
            }
            
            for (int j = 0; j < fi; j++) {
                if(i!=j){
                aux[j]=(0-1)*matriz[j][i];
                
            }}int j = 0;
            while( j<fi){
               if(i!=j){
                for (int k = 0; k < co; k++) {
                   matriz[j][k]=matriz[j][k]+(aux[j]*matriz[i][k]); 
                }}
                 j++;
            }
      
        }
        }
        if(condicio){
        for (int i = 0; i < fi; i++) {
            for (int j = 0; j < fi+1; j++) {
                impresion[i][j].setText(""+matriz[i][j]);
            }
            
        }
       getVentanare().setSize(30+40*co,50+40*fi);
       getVentanare().setVisible(true);
        }
 }
    
    public void trasponer(int fi, int co, float[][] matriz) {
        espaciovacio();
        getVentanare().setSize(53*fi, 38*co+50);
         for (int i = 0; i < fi; i++) {
            for (int j = 0; j < co; j++) {
                impresion[j][i].setText(""+matriz[i][j]);
            }
         }
         getVentanare().setVisible(true);
    }
    public void espaciovacio(){
    for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
            impresion[j][i].setText("");
            }}
    
    }

    public void multiplicacion(int afi, int aci, int bfi, int bci, float[][] matriza, float[][] matrizb) {
       espaciovacio();
       float con[][]=new float[afi+1][bci+1];           
      for (int k = 0; k <afi; k++) {
         for (int i = 0; i <bci; i++) {   
                     float aux=0,a=0;
                     for (int l = 0; l < aci; l++) {
                         a = matriza[k][l]*matrizb[l][i];
                         aux=aux+a;
                     }
             con[i][k]=aux;
             }
        }
        
        for (int i = 0; i < afi+1; i++) {
            for (int j = 0; j < bci-1; j++) {
            impresion[j][i].setText(""+ con[i][j]);
            }}
        getVentanare().setVisible(true);
    }

    public void inversa(int afi, int aci, float[][] matriza) {
          espaciovacio();
        float matriz[][]=new float[afi][2*aci];
        for (int i = 0; i < afi; i++) {
            for (int j = 0; j < aci; j++) {
            matriz[i][j]=matriza[i][j];
            }}
         for (int j = 0; j <afi; j++) {
         for (int i = afi; i <afi*2 ; i++) {
                    if(i==j+afi){
                        matriz[j][i]=1;
                    }else{
                        matriz[j][i]=0;
                    }
                }
            }
         
        
    float div,multiplicador;
    float aux[]=new float[afi];
    boolean condicio=true;
    
        for (int i = 0; i < afi; i++) {    
            if(condicio){
            div=matriz[i][i];
            if(div==0){
                 JOptionPane.showMessageDialog(null,"LA MATRIZ PRESENTA INFINITAS SOLUCIONES"); 
                 condicio=false;
                }
            for (int j = 0; j < 2*afi; j++) {
               matriz[i][j]=matriz[i][j]/div;      
                
            }
            
            for (int j = 0; j < afi; j++) {
                if(i!=j){
                aux[j]=(0-1)*matriz[j][i];
                
            }}int j = 0;
            while( j<afi){
               if(i!=j){
                for (int k = 0; k <2*afi; k++) {
                   matriz[j][k]=matriz[j][k]+(aux[j]*matriz[i][k]); 
                }}
                 j++;
            }
      
        }
        }
        if(condicio){
          for (int i = 0; i< afi; i++) {
            for (int j = 0; j < afi; j++) {
                impresion[i][j].setText(""+matriz[i][j+afi]);
             }
         }
           getVentanare().setVisible(true);
      }
    }

    @SuppressWarnings("empty-statement")
    public void determinante(int bfi, float[][] matrizb) {
        if(bfi==2){
           JOptionPane.showMessageDialog(null,"EL DETERMINANTE ES "+((matrizb[0][0]*matrizb[1][1])-(matrizb[0][1]*matrizb[1][0])));
        }   
        if(bfi==3){
            float posi,nega;
            posi=(matrizb[0][0]*matrizb[1][1]*matrizb[2][2]+matrizb[0][1]*matrizb[1][2]*matrizb[2][0]+matrizb[0][2]*matrizb[1][0]*matrizb[2][1]);
            nega=(matrizb[2][0]*matrizb[1][1]*matrizb[0][2]+matrizb[2][1]*matrizb[1][2]*matrizb[0][0]+matrizb[2][2]*matrizb[1][0]*matrizb[0][1]);
        JOptionPane.showMessageDialog(null,"EL DETERMINANTE ES "+(posi-nega));
        }if(bfi==4){
            float res1,res2,res3,res4;
            res1=matrizb[1][1]*matrizb[2][2]*matrizb[3][3]+matrizb[1][2]*matrizb[2][3]*matrizb[1][3]+matrizb[1][3]*matrizb[1][2]*matrizb[3][3]-(matrizb[3][1]*matrizb[2][2]*matrizb[1][3]+matrizb[3][2]*matrizb[2][3]*matrizb[1][1]+matrizb[3][3]*matrizb[1][2]*matrizb[2][1]);
            res2=matrizb[1][0]*matrizb[2][2]*matrizb[3][3]+matrizb[1][2]*matrizb[2][3]*matrizb[3][0]+matrizb[1][3]*matrizb[2][0]*matrizb[3][2]-(matrizb[3][0]*matrizb[2][2]*matrizb[1][3]+matrizb[3][2]*matrizb[2][3]*matrizb[1][0]+matrizb[3][3]*matrizb[2][0]*matrizb[1][2]);
            res3=matrizb[1][0]*matrizb[2][1]*matrizb[3][3]+matrizb[1][1]*matrizb[2][3]*matrizb[3][0]+matrizb[1][3]*matrizb[2][0]*matrizb[3][1]-(matrizb[3][0]*matrizb[2][1]*matrizb[1][3]+matrizb[3][1]*matrizb[2][3]*matrizb[1][0]+matrizb[3][3]*matrizb[2][0]*matrizb[1][1]);
            res4=matrizb[1][0]*matrizb[2][1]*matrizb[3][2]+matrizb[1][1]*matrizb[2][2]*matrizb[3][0]+matrizb[1][2]*matrizb[2][0]*matrizb[3][1]-(matrizb[3][0]*matrizb[2][1]*matrizb[1][2]+matrizb[3][2]*matrizb[2][2]*matrizb[1][0]+matrizb[3][2]*matrizb[2][0]*matrizb[1][1]);

        JOptionPane.showMessageDialog(null,"EL DETERMINANTE ES "+(res1*matrizb[0][0]-res2*matrizb[0][1]+res3*matrizb[0][2]-res4*matrizb[0][3]));
        }
        
    }
    
}