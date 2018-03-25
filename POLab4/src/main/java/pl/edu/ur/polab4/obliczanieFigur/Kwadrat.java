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
public class Kwadrat {
    public double bok;
    public double obw;
    public double pole;
     
    public Kwadrat(double x) {
        this.bok = x;
    }
    public void liczPole(){
        this.pole=bok*bok;
        System.out.println("Pole kwadratu to: " + this.pole);
    }
    public void liczObwod(){
        this.obw=4*bok;
        System.out.println("Obwód kwadratu to: " + this.obw);
    }
    public void pokazDane(){
        System.out.println("KWADRAT");
        System.out.println("Bok kwadratu to: " + this.bok);
        liczPole();
        liczObwod();
    }
}
