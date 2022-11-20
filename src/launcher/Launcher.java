
package launcher;

import presentacion.Modelo;

public class Launcher {
    private final Modelo modelito;

   public Launcher() {
      modelito=new Modelo();
      modelito.iniciar();
    }

    
    public static void main(String[] args) {
        Launcher launcher = new Launcher();
    }
    
}
