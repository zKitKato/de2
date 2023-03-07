
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zKitKato_
 *
 */
public class Lotto {
    public static void main(String[] args) throws IOException {
        // vars
        int[] zahlen_Eingabe = new int[6];
        int[] lotto_Zahlen = new int[6];
        // ui output
        System.out.print("******** Willkommen beim Zahlenlotto 6 aus 49 ******\n");
        System.out.println("Geben Sie Ihren Tipp ab!");

        // calling number input method
        getippt(zahlen_Eingabe);
        System.out.print("\n");

        System.out.println("Ihr Tipp: ");

        // Calling sorting method
        sortieren(zahlen_Eingabe);
        for(int t: zahlen_Eingabe) System.out.print(t + "\t");
        System.out.print("\n");

        System.out.println("Ziehung der Lottozahlen: ");
        //generating the lotto nums
        int[] gezogeneNummern = zieheLottozahlen(lotto_Zahlen);
        //sorting the generated nums
        sortieren(gezogeneNummern);
        for(int gN : gezogeneNummern) System.out.print(gN + "\t");
        System.out.print("\n");

        //find how many numbers are equal
        int rightNums = ermittleRichtige(gezogeneNummern, zahlen_Eingabe);

        System.out.println("\nSie haben " + rightNums + " Richtige!!!");
        System.out.println("\n****************************************************");
    }

    /**
     * Input of six numbers by the user.
     * Check that no input is double or greater than 49 and lower than 1
     *
     * @param zahlen_Eingabe
     * @throws IOException
     */
    public static void getippt(int[] zahlen_Eingabe) throws IOException {
        // input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // var
        boolean zahlSchonVorhanden;
        int eingabe;

        for (int i = 0; i < zahlen_Eingabe.length; i++) {
            do {
                System.out.print((i + 1) + ". Zahl: ");
                eingabe = Integer.parseInt(br.readLine());
                zahlSchonVorhanden = false;
                for (int j = 0; j < i; j++) {
                    if (eingabe == zahlen_Eingabe[j]) {
                        zahlSchonVorhanden = true;
                        break;
                    }
                }
                if (eingabe <= 0 || eingabe > 49 || zahlSchonVorhanden) {
                    System.out.println("Ungültige Zahl. Bitte erneut eingeben.");
                }
            } while (zahlSchonVorhanden || eingabe <= 0 || eingabe > 49);
            zahlen_Eingabe[i] = eingabe;
        }
    }

    /**
     * Generates six numbers in range of 1 to 49
     *
     * @param lotto_Zahlen
     * @return the generated numbers
     */
    public static int[] zieheLottozahlen(int[] lotto_Zahlen) {
        boolean genNumNotExist;
        int zufall;
        for (int j = 0; j < lotto_Zahlen.length; j++) {
            do {
                zufall = (int) (Math.random() * 49) + 1;
                genNumNotExist = true;
                for (int i = 0; i < j; i++) {
                    if (zufall == lotto_Zahlen[i]) {
                        genNumNotExist = false;
                        break;
                    }
                }
            } while (!genNumNotExist);
            lotto_Zahlen[j] = zufall;
        }
        return lotto_Zahlen;
    }

    /**
     * Comparing the two arrays gezogeneNummern and tipp.
     *
     * @param gezogeneNummern
     * @param tipp
     * @return The amount of numbers which are the same
     */
    public static int ermittleRichtige(int[] gezogeneNummern, int[] tipp) {
        // var
        int correct_nums = 0;
        // checking for same numbers in gezogeneNummern and tipp
        for (int i = 0; i < tipp.length; i++) {
            for(int k : tipp) {
                if (k == gezogeneNummern[i]) {
                    // if the same number is in both arrays correct_nums adding 1
                    correct_nums++;
                }
            }
        }
        return correct_nums;
    }

    /**
     * SelcetionSort
     *
     * @param elements
     */
    public static void sortieren(int[] elements) {
        // https://www.happycoders.eu/de/algorithmen/selection-sort/
        for (int i = 0; i < elements.length - 1; i++) {
            // Search the smallest element in the remaining array
            int minPos = i;
            int min = elements[minPos];
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < min) {
                    minPos = j;
                    min = elements[minPos];
                }
            }
            // Swap min with element at pos i
            if (minPos != i) {
                elements[minPos] = elements[i];
                elements[i] = min;
            }
        }
    }
}


