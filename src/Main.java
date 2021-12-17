import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */


         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */







            System.out.println("Podaj 10 liczb");

            Scanner in = new Scanner (System.in);

            Set<Integer> number = new TreeSet<>();

            for(int i = 0;i<10;i++){

                int numer = in.nextInt();

                number.add(numer);
            }

            System.out.println("Liczby: "+number);

            methoda(number);
        }


        public static void methoda(Set<Integer> number){

            int i=0;

            for(Integer x :number){

                System.out.println("Liczba "+(i+1)+" :"+x);

                i++;
            }
        }

    }


