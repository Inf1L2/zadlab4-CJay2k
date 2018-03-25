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
public class Stożek {
    public double wysokosc;
    public double ppodstawy;
    public double tworzaca;
    public double promien;
    final double pi=3.14159265359;
    public double obj;
    public double pole;
    
    public Stożek(double x, double y) {
        this.promien = x;
        this.wysokosc = y;
    }
    
    public void liczTworz(){
        this.tworzaca=Math.sqrt((this.wysokosc*this.wysokosc)+(this.promien*this.promien));
    }
    public void liczPole(){
        liczTworz();
        this.pole=pi*this.promien*(this.promien+this.tworzaca);
        System.out.println("Pole prostopadłościanu to: " + this.pole);
    }
    public void liczObjetosc(){
        this.obj=this.pi*(this.promien*this.promien)*this.wysokosc*1/3;
        System.out.println("Objętość stożka to: " + this.obj);
    }
    public void pokazDane(){
        System.out.println("STOŻEK");
        System.out.println("Promień podstawy stożka to: " + this.promien);
        System.out.println("Tworząca stożka to: " + this.wysokosc);
        System.out.println("Wysokość stożka to: " + this.wysokosc);
        liczPole();
        liczObjetosc();
    }
}
