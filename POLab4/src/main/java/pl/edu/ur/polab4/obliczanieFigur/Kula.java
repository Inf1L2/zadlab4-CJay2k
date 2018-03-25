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
public class Kula {
    public double promien;
    final double pi=3.14159265359;
    public double obj;
    public double pole;
    
    public Kula(double x) {
        this.promien = x;
    }
    public void liczPole(){
        this.pole=4*this.pi*(this.promien*this.promien);
        System.out.println("Pole kuli to: " + this.pole);
    }
    public void liczObjetosc(){
        this.obj=4/3*this.pi*(this.promien*this.promien*this.promien);
        System.out.println("Objętość kuli to: " + this.obj);
    }
    public void pokazDane(){
        System.out.println("KULA");
        System.out.println("Promień kuli to: " + this.promien);
        liczPole();
        liczObjetosc();
    }
}
