
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
    
    @Override
    public void run() {
        super.run(); 
        while(mover == true){
            try {
                carro2.moverAzul();
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Azul.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
