package homework5.exercitiu1;

import java.util.Scanner;

/*Ex 1. Afisare zile saptamana.
Scrie un program care cere utilizatorului să introducă un număr de la 1 la 7.
 Folosește switch pentru a afișa ziua săptămânii corespunzătoare:
1 -> Luni
2 -> Marti
etc ... pana Duminica*/
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ziua;
        String actiune;
        while (true) {

            try {
                System.out.println("introdu un numar de la 1 la 7");
                ziua = scanner.nextInt();
                scanner.nextLine(); // curatim buferul
                switch (ziua) {
                    case (1):
                        System.out.println(ziua + " -> " + "Luni");
                        break;
                    case (2):
                        System.out.println(ziua + " -> " + "Marti");
                        break;
                    case (3):
                        System.out.println(ziua + " -> " + "Miercuri");
                        break;
                    case (4):
                        System.out.println(ziua + " -> " + "Joi");
                        break;
                    case (5):
                        System.out.println(ziua + " -> " + "Vineri");
                        break;
                    case (6):
                        System.out.println(ziua + " -> " + "Sambata");
                        break;
                    case (7):
                        System.out.println(ziua + " -> " + "Duminica");
                        break;
                    default:
                        System.out.println("numar invalid, " +
                                "te rog introdu nr de 1 la 7");
                }

            } catch (Exception e) {
                System.out.println("ai introdus ceva gresit");
                scanner.nextLine();//curatim buferu
            }
            System.out.println("doresti sa introduci mai departe? da/nu");
            actiune = scanner.nextLine();
            if (actiune.equalsIgnoreCase("nu")) {
                System.out.println("programul s-a incheiat. La revedere!");
                break;
            } else if (actiune.equalsIgnoreCase("da")) {
                System.out.println("continuam");
            } else {
                System.out.println("comanda necunoscuta");
            }
        }
        scanner.close();
    }
}
