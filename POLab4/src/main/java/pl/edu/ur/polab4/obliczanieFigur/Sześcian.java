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
public class Sześcian {
    public double bok;
    public double obj;
    public double pole;
    
    public Sześcian(double x) {
        this.bok = x;
    }
    
    public void liczPole(){
        this.pole=6*Math.pow(this.bok, 6);
        System.out.println("Pole sześcianu to: " + this.pole);
    }
    public void liczObjetosc(){
        this.obj=Math.pow(this.bok, 3);
        System.out.println("Objętość sześcianu to: " + this.obj);
    }
    public void pokazDane(){
        System.out.println("SZEŚCIAN");
        System.out.println("Bok sześcianu to: " + this.bok);
        liczPole();
        liczObjetosc();
    }
}
