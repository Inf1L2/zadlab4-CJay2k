/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;
import pl.edu.ur.polab4.Student;
/**
 *
 * @author Adrian Hrycaj
 */
public class Tab {
    public String imie;
    public String nazwisko;
    public int nr_indeksu;
    public String nazwa_specjalnosci;
    public String rok_studiow;
    public int indeks_tablicy;
    
    String[][] student = new String[100][5];
    
    public void wypelnijTablice(){
        for(int i = 0; i<100; i++){
            for(int j = 0; j<5; j++){
                if(j==2){
                    student[i][j]="0";
                }
                else{
                    student[i][j]="";
                }
            }
        }
    }

    public Tab(String imie, String nazwisko, int nr_indeksu, String nazwa_specjalnosci, String rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.rok_studiow = rok_studiow;
    }

    public Tab(int indeks_tablicy) {
        this.indeks_tablicy = indeks_tablicy;
    }
    
    public void wprowadzDane(){
        student[this.indeks_tablicy][0]=this.imie;
        student[this.indeks_tablicy][1]=this.imie;
        student[this.indeks_tablicy][2]=this.imie;
        student[this.indeks_tablicy][3]=this.imie;
        student[this.indeks_tablicy][4]=this.imie;
    }
}

