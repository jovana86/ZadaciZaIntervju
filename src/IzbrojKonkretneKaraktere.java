public class IzbrojKonkretneKaraktere {
    public static void main (String[] args){
        String string = "elephant";
        char slovo =  'e';
        int count = 0;
        for(int i=0; i<string.length (); i++) {
            if(string.charAt ( i ) ==slovo)
                count++;
        }
        System.out.println ("Slovo " + slovo + " se pojavljuje " + count + " puta.");
        }
    }

