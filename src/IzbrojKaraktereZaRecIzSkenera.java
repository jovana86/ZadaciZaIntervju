import java.util.Scanner;

public class IzbrojKaraktereZaRecIzSkenera {
    public static void main(String[] args){
        Scanner scanner = new Scanner ( System.in );
                System.out.println ("Unesi rec/recenicu za koju zelis da izbrojis koliko kojih karaktera ima");
        String string = scanner.nextLine ();
//   String string = "geeksforgeeks";
   nadjisvaSlova(string);
}

    static final int MAX_CHAR = 256;
    static void nadjisvaSlova(String string) {
        int brojac[]= new int [MAX_CHAR];
        int duzina = string.length ();

        for (int i=0; i<duzina;i++)
            brojac[string.charAt ( i )]++;
        char slovo[] = new char[string.length ()];
        for (int i =0; i <duzina; i++) {
            slovo[i]= string.charAt ( i );
            int nadji = 0;
            for (int j =0;j<=i; j++){
                if (string.charAt ( i )==slovo[j])
                    nadji ++;
            }
            if (nadji==1)
                System.out.println ("U reci " + string + " Broj pojavljivanja karaktera " + string.charAt ( i ) + " je " + brojac[string.charAt ( i )]);

        }
    }
}
