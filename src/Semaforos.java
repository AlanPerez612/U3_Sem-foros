
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trix
 */
public class Semaforos extends Canvas{
    int x,y;
    Color rojo=new Color(120, 57, 38 ), verde=new Color(54, 120, 38 ), am=new Color (157, 158, 55 );
    
    public void dibujar(Graphics2D a){
        a.setColor(Color.BLACK);
        a.fillRect(x, y, 50, 100);
        a.setColor(rojo);
        a.fillOval(x+10, y+5, 30, 30);
        a.setColor(am);
        a.fillOval(x+10, y+35, 30, 30);
        a.setColor(verde);
        a.fillOval(x+10, y+65, 30, 30);
    }
    
    public Semaforos(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getRojo() {
        return rojo;
    }

    public void setRojo(Color rojo) {
        this.rojo = rojo;
    }

    public Color getVerde() {
        return verde;
    }

    public void setVerde(Color verde) {
        this.verde = verde;
    }

    public Color getAm() {
        return am;
    }

    public void setAm(Color am) {
        this.am = am;
    }
    
    
    
}
