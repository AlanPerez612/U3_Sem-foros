
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
public class Verde extends Thread{
    Carros carro4 = new Carros();
    public boolean mover=true;
    
    Ventana puntero;
    public Verde(Ventana p){
        puntero=p;
    }

    @Override
    public void run() {
        super.run();
        while(mover == true){
            try {
                if(!puntero.carretera.s1){
                    puntero.carretera.moverVerde();
                    puntero.carretera.repaint();
                }
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Azul.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
