
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
    
    Semaforos sem1 = new Semaforos(140,15);
    Semaforos sem2 = new Semaforos(430,270);
    
    boolean s1=true,s2=true;
    
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
    }
    //--------------------------------------------------------------------------
    
    //--------------------------------------------------------------------------
    int a1=310,a2=335,a3=320,a4=337,a5=303,a6=300;
    public void moverAzul(){
        if(a1<-100)a1=400;
        if(a2<-100)a2=400;
        if(a3<-100)a3=400;
        if(a4<-100)a4=400;
        if(a5<-100)a5=400;
        if(a6<-100)a6=400;
        a1-=5;
        a2-=5;
        a3-=5;
        a4-=5;
        a5-=5;
        a6-=5;
        //System.out.println("Cambio azul: "+a1);
    }
    int m1=300,m2=310,m3=335, m4=320,m5=337,m6=345;
    public void moverMorado(){
        if(m1>600)m1=-50;
        if(m2>600)m2=-50;
        if(m3>600)m3=-50;
        if(m4>600)m4=-50;
        if(m5>600)m5=-50;
        if(m6>600)m6=-50;
        
        m1+=5;
        m2+=5;
        m3+=5;
        m4+=5;
        m5+=5;
        m6+=5;
    }
    int v1=142, v2=150,v3=175, v4=160, v5=180, v6=188;
    public void moverVerde(){
        if(v1>650)v1=-50;
        if(v2>650)v2=-50;
        if(v3>650)v3=-50;
        if(v4>650)v4=-50;
        if(v5>650)v5=-50;
        if(v6>650)v6=-50;
        
        v1+=5;
        v2+=5;
        v3+=5;
        v4+=5;
        v5+=5;
        v6+=5;
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        this.setBackground(Color.gray);
        
        //PRIMER CARRO AZUL
        Color customColor = new Color(101, 184, 201);
        g.setColor(customColor);        
        g.fillRect(330, a6, 35, 55);
        
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
        g.fillRect(245, m1, 35, 55);
        
        g.setColor(Color.black);//llantas int m1=300,m2=310,m3=335, m4=320,m5=337,m6=345;
        g.fillRect(242, m2, 3, 8); 
        g.fillRect(242, m3, 3, 8);
        g.fillRect(280, m2, 3, 8);
        g.fillRect(280, m3, 3, 8);
        
        Color customColor3 = new Color(123, 54, 149);//techo
        g.setColor(customColor3);
        g.fillRect(250, m4, 25, 15);
        
        g.setColor(Color.WHITE);//paneles blanco
        g.fillRect(250, m2, 25, 7);
        g.fillRect(250, m5, 25, 7);
        
        g.setColor(Color.WHITE);//luces
        g.fillOval(252, m6, 5,5);
        g.fillOval(267, m6, 5,5);
        
        //----------------------------------------------------------------------
        //100 - 160
        //TERCER CARRO VERDE
        g.setColor(Color.GREEN);        
        g.fillRect(v1, 140, 55, 35);
        
        g.setColor(Color.black);//llantas int v1=142, v2=150,v3=175, v4=160, v5=180, v6=188
        g.fillRect(v2, 137, 8, 3); 
        g.fillRect(v2, 175, 8, 3);
        g.fillRect(v3, 137, 8, 3);
        g.fillRect(v3, 175, 8, 3);
        
        Color customColor4 = new Color(74, 141, 52 );//techo
        g.setColor(customColor4);
        g.fillRect(v4, 145, 15, 25);
        
        g.setColor(Color.WHITE);//paneles blanco
        g.fillRect(v5, 145, 7, 25);
        g.fillRect(v2, 145, 7, 25);
        
        g.setColor(Color.WHITE);//luces
        g.fillOval(v6, 147, 6,6);
        g.fillOval(v6, 163, 6,6);
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
        sem1.dibujar(g2);
        //----------------------------------------------------------------------
        //SEMÁFORO 2 //290 - 255
        sem2.dibujar(g2);
    }
    
}
