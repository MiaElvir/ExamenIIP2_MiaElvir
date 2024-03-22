
import javax.swing.JProgressBar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class adminBarras extends Thread{
    
    protected JProgressBar juga1; 
    protected JProgressBar juga2; 
    int vel1; 
    int vel2;
    protected boolean avanzar;
    protected boolean vive;

    public adminBarras(JProgressBar juga1, JProgressBar juga2, int vel1, int vel2, boolean avanzar) {
        this.juga1 = juga1;
        this.juga2 = juga2;
        this.vel1 = vel1;
        this.vel2 = vel2;
        this.avanzar = avanzar;
    }


    public JProgressBar getJuga1() {
        return juga1;
    }

    public void setJuga1(JProgressBar juga1) {
        this.juga1 = juga1;
    }

    public JProgressBar getJuga2() {
        return juga2;
    }

    public void setJuga2(JProgressBar juga2) {
        this.juga2 = juga2;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (avanzar) {            
            juga1.setValue(juga1.getValue() + vel1);
            juga2.setValue(juga2.getValue() + vel2);
            if (juga1.getValue() == 500 || juga2.getValue() == 500) {
                avanzar = false;
            }
            try {
                    Thread.sleep(0);
            } catch (InterruptedException ex) {
                
            }
            
        }
                
    }
      
    
}
