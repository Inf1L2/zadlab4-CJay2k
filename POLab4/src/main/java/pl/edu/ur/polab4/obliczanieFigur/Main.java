package pl.edu.ur.polab4.obliczanieFigur;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c;
        double x, y, z;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("KALKULATOR");
            System.out.println("1. Koło");
            System.out.println("2. Kula");
            System.out.println("3. Kwadrat");
            System.out.println("4. Prostokąt");
            System.out.println("5. Prostopadłościan");
            System.out.println("6. Stożek");
            System.out.println("7. Sześcian");
            System.out.println("0. Aby zakończyć działanie programu");
            System.out.print("Wybierz figurę dla której chcesz wykonać obliczenia: ");

        c=scanner.nextInt();
        
            switch(c){
              case 1:
                System.out.print("Podaj promień: ");
                x=scanner.nextDouble();
                Koło koło = new Koło(x);
                koło.pokazDane();
                break;

              case 2:
                System.out.print("Podaj promień: ");
                x=scanner.nextDouble();
                Kula kula = new Kula(x);
                kula.pokazDane();
                break;

              case 3:
                System.out.print("Podaj bok: ");
                x=scanner.nextDouble();
                Kwadrat kwadrat = new Kwadrat(x);
                kwadrat.pokazDane();
                break;

              case 4:
                System.out.print("Podaj bok 1: ");
                x=scanner.nextDouble();
                System.out.print("Podaj bok 2: ");
                y=scanner.nextDouble();
                Prostokąt prostokąt = new Prostokąt(x, y);
                prostokąt.pokazDane();
                break;

              case 5:
                System.out.print("Podaj bok 1: ");
                x=scanner.nextDouble();
                System.out.print("Podaj bok 2: ");
                y=scanner.nextDouble();
                System.out.print("Podaj wysokość: ");
                z=scanner.nextDouble();
                Prostopadłościan prostopadłościan = new Prostopadłościan(x, y, z);
                prostopadłościan.pokazDane();
                break;

              case 6:
                System.out.print("Podaj promień: ");
                x=scanner.nextDouble();
                System.out.print("Podaj wysokość: ");
                y=scanner.nextDouble();
                Stożek stożek = new Stożek(x, y);
                stożek.pokazDane();
                break;

              case 7:
                System.out.print("Podaj bok: ");
                x=scanner.nextDouble();
                Sześcian sześcian = new Sześcian(x);
                sześcian.pokazDane();
                break;

              default:
                System.out.print("Wybrano nieistniejącą opcję");
                break;
            }
        }while(c!=0);
    }
    
}
