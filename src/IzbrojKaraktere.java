import java.util.Scanner;

public class IzbrojKaraktere {
    public static void main (String[] args){
        Scanner scanner = new Scanner ( System.in );


//        String string = "The best of both worlds";
        int count = 0;
        int i = 0;
        System.out.println ("Unesi rec/recenicu za koju zelis da se izbroje karakteri");
        String string = scanner.nextLine ();
        do {


//        for (int i =0; i<string.length (); i++) {
            if (string.charAt ( i ) != ' ') {
                count++;
//        }
            }
            i++;
        }
        while (i<string.length ());
        System.out.println ("Ukupan broj karaktera bez razmaka u stringu je: " + count);
    }
}
