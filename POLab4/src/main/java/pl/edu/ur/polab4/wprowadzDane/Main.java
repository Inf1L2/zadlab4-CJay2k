package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;
import pl.edu.ur.polab4.Student;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c,i;
        String imie, nazwisko, nazwa_specjalnosci, rok_studiow;
        int nr_indeksu;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("OPCJE");
            System.out.println("1. Wprowadzanie danych studenta pod wybrany index tablicy");
            System.out.println("2. Edycję (nadpisanie danych studenta) spod wybranego indeksu");
            System.out.println("3. Usunięcie danych studenta (tj. nadpisanie elementów tablicy wartościami domyślnymi)");
            System.out.println("4. Wyświetlenie obiektu o danym indeksie");
            System.out.println("5. Wyświetlenie wszystkich obiektów");
            System.out.println("6. Wyświetlenie zakresu obiektów w podanym zakresie");
            System.out.println("0. Aby zakończyć działanie programu");
            System.out.print("Wybierz co chcesz zrobić: ");

        c=scanner.nextInt();
        
            switch(c){
              case 1:
                System.out.print("Podaj ideks tablicy: ");
                i=scanner.nextInt();
                imie=scanner.next();
                nazwisko=scanner.next();
                nr_indeksu=scanner.nextInt();
                nazwa_specjalnosci=scanner.next();
                rok_studiow=scanner.next();
                Student student = new Student(imie, nazwisko, nr_indeksu, nazwa_specjalnosci, rok_studiow);
                Tab.wprowadzDane();
                break;

              case 2:
                
                break;

              case 3:
                
                
                break;

              case 4:
                
                break;

              case 5:
                
                break;

              case 6:
                
                
                break;

              

              default:
                System.out.print("Wybrano nieistniejącą opcję");
                break;
            }
        }while(c!=0);
    }
    
}
