package homework5.exercitiu3;

import java.util.Scanner;

/*Ex. 3 Creeaza un program care cere utilizatorului să introducă două numere întregi și apoi sa aleaga o operație matematică (+, -, *, /).
Folosește switch pentru a executa operația selectata de user. Dacă operația nu este validă, afișează un mesaj de eroare.*/
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numar1, numar2;
        String oper, actiune;
        System.out.println("operatiuni");
        while (true) {
            try {
                System.out.println("introdu numar1");
                numar1 = scanner.nextDouble();
                System.out.println("introdu numar2");
                numar2 = scanner.nextDouble();
                scanner.nextLine();//curatim buferu
                System.out.println("introdu una din operatii +,-,*,/,%");
                oper = scanner.nextLine();
                double rezultat = calcul(numar1, numar2, oper);//folosim metoda
                System.out.println("rezultat este " + rezultat);

            } catch (Exception e) {
                System.out.println("ai introdus ceva gresit");
                scanner.nextLine();//iarasi curatim buferu
            }
            System.out.println("vrei sa mai faci operatii? da/nu");
            actiune = scanner.nextLine();
            if (actiune.equalsIgnoreCase("nu")) {
                System.out.println("programul s-a finisat. La revedere!");
                break;
            } else if (actiune.equalsIgnoreCase("da")) {
                System.out.println("programul continua...");
            } else {
                System.out.println("comanda necunoscuta");
            }
        }
        scanner.close();//inchid scaneru

    }

    //metoda de calcul
    public static double calcul(double num1, double num2, String operatie) throws IllegalArgumentException {
        switch (operatie) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) throw new IllegalArgumentException("nu se imparte la 0!");
                return num1 / num2;
            case "%":
                if (num2 == 0) throw new IllegalArgumentException("nu se face modul cu 0!");
                return num1 % num2;
            default:
                throw new IllegalArgumentException("operatie necunoscuta " + operatie);
        }
    }
}
