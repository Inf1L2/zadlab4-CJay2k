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
public class Prostopadłościan {
    public double bok1;
    public double bok2;
    public double wysokosc;    
    public double obj;
    public double pole;
    
    public Prostopadłościan(double x, double y, double z) {
        this.bok1 = x;
        this.bok2 = y;
        this.wysokosc = z;
    }
    public void liczPole(){
        this.pole=(2*this.bok1*this.bok2)+(2*this.bok2*this.wysokosc)+(2*this.bok1*this.wysokosc);
        System.out.println("Pole prostopadłościanu to: " + this.pole);
    }
    public void liczObjetosc(){
        this.obj=this.bok1*this.bok2*this.wysokosc;
        System.out.println("Objętość prostopadłościanu to: " + this.obj);
    }
    public void pokazDane(){
        System.out.println("PROSTOPADŁOŚCIAN");
        System.out.println("Bok 1 prostopadłościanu to: " + this.bok1);
        System.out.println("Bok 2 prostopadłościanu to: " + this.bok2);
        System.out.println("Wysokość prostopadłościanu to: " + this.wysokosc);
        liczPole();
        liczObjetosc();
    }
}
