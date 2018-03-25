/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Adrian Hrycaj
 */
public class Prostokąt {
    public double bok1;
    public double bok2;
    public double obw;
    public double pole;
    
    public Prostokąt(double x, double y) {
        this.bok1 = x;
        this.bok2 = y;
    }
    public void liczPole(){
        this.pole=this.bok1*this.bok2;
        System.out.println("Pole prostokąta to: " + this.pole);
    }
    public void liczObwod(){
        this.obw=2*this.bok1+2*this.bok2;
        System.out.println("Obwód prostokąta to: " + this.obw);
    }
    public void pokazDane(){
        System.out.println("PROSTOKĄT");
        System.out.println("Bok 1 prostokąta to: " + this.bok1);
        System.out.println("Bok 2 prostokąta to: " + this.bok2);
        liczPole();
        liczObwod();
    }
}
