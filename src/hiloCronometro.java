
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class hiloCronometro extends Thread{
   
    protected JLabel tiempo;
    protected boolean avanzar;

    public hiloCronometro(JLabel tiempo, boolean avanzar) {
        this.tiempo = tiempo;
        this.avanzar = avanzar;
    }

    

    public JLabel getTiempo() {
        return tiempo;
    }

    public void setTiempo(JLabel tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    

    @Override
    public String toString() {
        return "hiloCronometro{" + "tiempo=" + tiempo + '}';
    }

    @Override
    public void run() {
        
        while (avanzar) {            
            String crono = "00:00";
            
        }
        
        
        
        
        
    }
    
    
}
