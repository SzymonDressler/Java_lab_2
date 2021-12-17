import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */



        methoda2(methoda1());
        String a []= new String[6];
        methoda3(a);
        methoda4(a);
        methoda5("Ivan");
        methoda5("Ivan","Engels");
        methoda5("Ivan","Engels",26);
        int zmiennaA=(methoda6(6,7));
        int zmiennaB=(methoda6(1,2,3));
        System.out.println("wynik: "+(methoda6(6,7))+" wynik: "+methoda6(1,2,3));

    }
    public  static int [] methoda1 (){
        int [] a = {40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20};


        return a;
    }
    public static void methoda2 (int[]a){
        for (int number: a){
            System.out.println("This is: " + number);
        }
    }


    public static void  methoda3  (String[] a){
        Scanner in = new Scanner(System.in);
        int i=0;
        for (String element :a ){
            System.out.println("\nPodaj " + (i + 1) + " element  tablicy: ");
            a [i]=in.nextLine();
            i++;
        }
    }
    public static void methoda4(String []a){
        System.out.print("Wywolujemy elementy tablicy od ostatniego elementu \n");
        for (int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);

        }
    }

    public static void methoda5(String imie){

        System.out.println("Mam na imie "+imie);

    }
    public static void methoda5(String imie, String nazwisko){
        System.out.println("Mam na Imie "+imie+" a na nazwisko Nazwisko "+nazwisko);

    }
    public static void methoda5(String imie,String nazwisko, int wiek){

        System.out.println("Mam na Imie "+imie+" a na  Nazwisko "+nazwisko+" oraz mam "+wiek);
    }

    public static int methoda6(int a , int b){
        return a+b;
    }
    public static int methoda6(int a,int b,int c){
        return a+b+c;
    }

}
