
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
public class Azul extends Thread{

    Carros carro2 = new Carros();
    public boolean mover=true;
    
    Ventana puntero;
    public Azul(Ventana p){
        puntero=p;
    }
    
    
    @Override
    public void run() {
        super.run(); 
        while(mover == true){
            try {
                if(puntero.carretera.s1){
                    puntero.carretera.moverAzul();
                    puntero.carretera.repaint();
                }
                sleep(150);
            } catch (InterruptedException ex) {
                Logger.getLogger(Azul.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
