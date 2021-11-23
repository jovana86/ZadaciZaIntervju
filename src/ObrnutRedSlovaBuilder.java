public class ObrnutRedSlovaBuilder {
    public static void main(String[] args){

        String word = "Wakeup";
        String reverse = new StringBuilder (word).reverse ().toString ();
        System.out.printf("Original String : %s, reversed String %s  %n", word , reverse);
    }
}
