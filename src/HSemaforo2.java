
import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trix
 */
public class HSemaforo2 extends Thread{

    Color rojo=new Color(120, 57, 38 ), verde=new Color(54, 120, 38 ), am=new Color (157, 158, 55 );
    Ventana puntero;
    public HSemaforo2(Ventana p){
        puntero=p;
        
    }
    
    
    @Override
    public void run() {
        super.run(); 
        while(true){  
            try {
                puntero.carretera.sem2.setRojo(Color.red);
                puntero.carretera.repaint();
                sleep(2000);
                puntero.carretera.sem2.setVerde(Color.GREEN);
                puntero.carretera.sem2.setRojo(rojo);
                puntero.carretera.repaint();
                sleep(2000);
                puntero.carretera.sem2.setAm(Color.YELLOW);
                puntero.carretera.sem2.setVerde(verde);
                puntero.carretera.repaint();
                sleep(2000);
                puntero.carretera.sem2.setAm(am);
                puntero.carretera.repaint();
            } catch (InterruptedException ex) {
                Logger.getLogger(HSemaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
