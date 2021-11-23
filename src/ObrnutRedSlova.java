import com.sun.javafx.binding.StringFormatter;

import java.util.Scanner;

public class ObrnutRedSlova {

    public static void main(String[] args) {
        String original, reverse = "";
        Scanner scanner = new Scanner ( System.in );

        System.out.println ("Unesi teks koji zelis da se ucita od poslednjeg do prvog karaktera");
        original = scanner.nextLine ();

        int length = original.length ();

        for (int i=length - 1; i >=0; i-- ) {
            reverse = reverse + original.charAt ( i );

        }
        System.out.println ("Obrnut red slova zadate reci/recenice je : " + reverse);

    }
}
