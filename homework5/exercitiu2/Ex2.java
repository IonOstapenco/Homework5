package homework5.exercitiu2;

/*Ex2. Avem cifrele de la 1 la 20. Utilizand bucla while, scriem un program care av itera de la 1 la 20.
Pentru fiecare numar, utilizam if else pentru a determina daca numarul este par sau impar si afisam mesajele
corespunzatoare:
- Numarul este par .
SAU
- Numarul este impar.*/
public class Ex2 {
    public static void main(String[] args) {
        int number = 20;
        int count = 1;
        while (number <= 20) {
            if (count % 2 == 0) {
                System.out.println(count + " este numar par");
            } else {
                System.out.println(count + " este numar impar");
            }
            count++;
            if (count > number) {
                break;
            }
        }
    }
}
