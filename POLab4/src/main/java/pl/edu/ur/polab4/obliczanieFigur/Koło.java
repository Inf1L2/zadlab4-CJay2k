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
public class Koło {
    public double promien;
    final double pi=3.14159265359;
    public double obw;
    public double pole;

    public Koło(double x) {
        this.promien = x;
    }
    
    public void liczPole(){
        this.pole=this.pi*(this.promien*this.promien);
        System.out.println("Pole koła to: " + this.pole);
    }
    public void liczObwod(){
        this.obw=2*this.pi*this.promien;
        System.out.println("Obwód koła to: " + this.obw);
    }
    public void pokazDane(){
        System.out.println("KOŁO");
        System.out.println("Promień koła to: " + this.promien);
        liczPole();
        liczObwod();
    }
}
