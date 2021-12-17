public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        System.out.print("break:\n");
        for( int a=0;a<=9;a++){

            if(a==7)

                break;

            System.out.println(a + " ");

        }
        System.out.print("continue:\n");

        for (int b = 0;b<=162;b++){

            if( b% 94== 0)

                continue;

            System.out.println(b + " ");

        }
        System.out.print("return:\n");

        for (int c = 49;c>=0;c--){

            if(c==42)

                return;

            System.out.println(c + " ");
        }

    }
}



