public class ObrnutRedSlovaBuffer {

    public static void main(String [] args) {

        String word = "HelloWorld";
        String reverse = new StringBuffer (word).reverse ().toString ();
        System.out.printf("Original String  %s, reversed String %s %n", word, reverse);
    }
}
