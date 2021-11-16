
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trix
 */

public class Carros extends Canvas{
   /*Carro rojo */int x1=142,x2=150,x3=175,x4=160, x5=180,x6=150, x7=143;
    
    public void moverCarroRojo(){
        if(x1<-100)x1=800;
        if(x2<-100)x2=800;
        if(x3<-100)x3=800;
        if(x4<-100)x4=800;
        if(x5<-100)x5=800;
        if(x6<-100)x6=800;
        if(x7<-100)x7=800;
        x1-=5;
        x2-=5;
        x3-=5;
        x4-=5;
        x5-=5;
        x6-=5;
        x7-=5;
        System.out.println("Cambio Rojo: "+x1);
        repaint();
    }
    //--------------------------------------------------------------------------
    
    //--------------------------------------------------------------------------
    int a1=310,a2=335,a3=320,a4=337,a5=303;
    public void moverAzul(){
        a1-=5;
        a2-=5;
        a3-=5;
        a4-=5;
        a5-=5;
        repaint();
        System.out.println("Cambio azul: "+a1);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        this.setBackground(Color.gray);
        
        //PRIMER CARRO AZUL
        Color customColor = new Color(101, 184, 201);
        g.setColor(customColor);        
        g.fillRect(330, 300, 35, 55);
        
        g.setColor(Color.black);//llantas
        g.fillRect(327, a1, 3, 8); 
        g.fillRect(327, a2, 3, 8);
        g.fillRect(365, a1, 3, 8);
        g.fillRect(365, a2, 3, 8);
        
        Color customColor1 = new Color(124, 215, 233);//techo
        g.setColor(customColor1);
        g.fillRect(335, a3, 25, 15);
        
        g.setColor(Color.WHITE);//paneles blanco
        g.fillRect(335, a1, 25, 7);
        g.fillRect(335, a4, 25, 7);
        
        g.setColor(Color.WHITE);//farloes
        g.fillOval(337, a5, 5,5);
        g.fillOval(352, a5, 5,5);
        //----------------------------------------------------------------------
        
        
        //85 de cambio
        //SEGUNDO CARRO MORADO
        Color customColor2 = new Color(177, 77, 214);
        g.setColor(customColor2);        
        g.fillRect(245, 300, 35, 55);
        
        g.setColor(Color.black);//llantas
        g.fillRect(242, 310, 3, 8); 
        g.fillRect(242, 335, 3, 8);
        g.fillRect(280, 310, 3, 8);
        g.fillRect(280, 335, 3, 8);
        
        Color customColor3 = new Color(123, 54, 149);//techo
        g.setColor(customColor3);
        g.fillRect(250, 320, 25, 15);
        
        g.setColor(Color.WHITE);//paneles blanco
        g.fillRect(250, 310, 25, 7);
        g.fillRect(250, 337, 25, 7);
        
        g.setColor(Color.WHITE);//luces
        g.fillOval(252, 345, 5,5);
        g.fillOval(267, 345, 5,5);
        
        //----------------------------------------------------------------------
        //100 - 160
        //TERCER CARRO VERDE
        g.setColor(Color.GREEN);        
        g.fillRect(142, 140, 55, 35);
        
        g.setColor(Color.black);//llantas
        g.fillRect(150, 137, 8, 3); 
        g.fillRect(150, 175, 8, 3);
        g.fillRect(175, 137, 8, 3);
        g.fillRect(175, 175, 8, 3);
        
        Color customColor4 = new Color(74, 141, 52 );//techo
        g.setColor(customColor4);
        g.fillRect(160, 145, 15, 25);
        
        g.setColor(Color.WHITE);//paneles blanco
        g.fillRect(180, 145, 7, 25);
        g.fillRect(150, 145, 7, 25);
        
        g.setColor(Color.WHITE);//luces
        g.fillOval(188, 147, 6,6);
        g.fillOval(188, 163, 6,6);
        //----------------------------------------------------------------------
        //CUARTO CARRO ROJO
        g.setColor(Color.RED);
        g.fillRect(x1, 210, 55, 35);  
        g.setColor(Color.black);//llantas
 
        g.fillRect(x2, 207, 8, 3); 
        g.fillRect(x2, 245, 8, 3);
        g.fillRect(x3, 207, 8, 3);
        g.fillRect(x3, 245, 8, 3);
        
        Color customColor5 = new Color(131, 44, 39);//techo
        g.setColor(customColor5);
        
        g.fillRect(x4, 215, 15, 25);
        
        g.setColor(Color.WHITE);//paneles blanco
        
        g.fillRect(x5, 215, 7, 25);
        g.fillRect(x6, 215, 7, 25);
        
        g.setColor(Color.WHITE);//luces
        
        g.fillOval(x7, 217, 5,5);
        g.fillOval(x7, 233, 5,5);
        
        //----------------------------------------------------------------------
        //CARRETERA
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 225,130);        
        g.fillRect(385, 0, 225,130);
        g.fillRect(0, 260, 225, 140);        
        g.fillRect(385, 260, 245,140);
        
        g.setColor(Color.WHITE);
        ///////////////////////////////izquierda a derecha 1
        g.fillRect(0,  190,  15, 8);
        g.fillRect(30,  190, 15, 8);
        g.fillRect(60,  190, 15, 8);
        g.fillRect(90,  190, 15, 8);
        g.fillRect(120, 190, 15, 8);
        g.fillRect(150, 190, 15, 8);
        g.fillRect(180, 190, 15, 8);
        g.fillRect(210, 190, 15, 8);
        ///////////////////////////////izquierda a derecha 2
        g.fillRect(390, 190, 15, 8);
        g.fillRect(420, 190, 15, 8);
        g.fillRect(450, 190, 15, 8);
        g.fillRect(480, 190, 15, 8);
        g.fillRect(510, 190, 15, 8);
        g.fillRect(540, 190, 15, 8);
        g.fillRect(570, 190, 15, 8);
        ///////////////////////////////arriba a abajo 1
        g.fillRect(300, 0, 8, 15);
        g.fillRect(300, 30, 8, 15);
        g.fillRect(300, 60, 8, 15);
        g.fillRect(300, 90, 8, 15);
        g.fillRect(300, 120, 8, 15);
        //////////////////////////////arriba a abajo2
        g.fillRect(300, 270, 8, 15);
        g.fillRect(300, 300, 8, 15);
        g.fillRect(300, 330, 8, 15);
        g.fillRect(300, 360, 8, 15);
        g.fillRect(300, 390, 8, 15);
        g.fillRect(300, 420, 8, 15);
        
        //----------------------------------------------------------------------
        //SEMÁFORO 1
        g.setColor(Color.BLACK);
        g.fillRect(140, 15, 50, 100);
        g.setColor(Color.RED);
        g.fillOval(150, 20, 30, 30);
        g.setColor(Color.orange);
        g.fillOval(150, 50, 30, 30);
        g.setColor(Color.GREEN);
        g.fillOval(150, 80, 30, 30);
        //----------------------------------------------------------------------
        //SEMÁFORO 2 //290 - 255
        g.setColor(Color.BLACK);
        g.fillRect(430,270, 50, 100);
        g.setColor(Color.RED);
        g.fillOval(440, 275, 30, 30);
        g.setColor(Color.orange);
        g.fillOval(440, 305, 30, 30);
        g.setColor(Color.GREEN);
        g.fillOval(440, 335, 30, 30);
            
        //moverCarroRojo();
    }
    
}
