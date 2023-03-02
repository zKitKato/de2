
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    public static void getippt(int[] zahlen_Eingabe) throws IOException {
        // input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // var
        boolean zahlSchonVorhanden = false;

        // input of the six numbers
        for (int i = 0; i < zahlen_Eingabe.length; i++) {
            System.out.print((i + 1) + ". Zahl: ");
            zahlen_Eingabe[i] = Integer.parseInt(br.readLine());
            // checking if number already exist
            for(int k = 0; k < zahlen_Eingabe.length; k++) {
                for (int j = 0; j < zahlen_Eingabe.length; j++) {
                    /*
                    if number on pos k is equal to number on pos j
                    and k is not the same as j
                    and number on pos j is not 0
                    */
                    if(zahlen_Eingabe[k] == zahlen_Eingabe[j] && k != j && zahlen_Eingabe[j] != 0) {
                        // setting zahlSchonVorhanden to true that it can get replaced
                        zahlSchonVorhanden = true;
                    }
                }
            }
            // if the input is over 49 and under 0 or already existing its invalid
            if(zahlen_Eingabe[i] > 49 && zahlen_Eingabe[i] <= 0 || zahlSchonVorhanden) {
                System.out.println("Invalid");
                i--;
                zahlSchonVorhanden = false;
            }
        }
    }
    public static int[] zieheLottozahlen(int[] lotto_Zahlen) {
        for (int j = 0; j < lotto_Zahlen.length; j++) {
            // generating random number in range of 49 and storing them on pos j in lotto_Zahlen array
            lotto_Zahlen[j] = (int) (Math.random() * 49) + 1;
            // checking if number generated is already generated before
            for(int i = 0; i < lotto_Zahlen.length; i++) {
                if (lotto_Zahlen[j] == lotto_Zahlen[i]) {
                    lotto_Zahlen[j] = (int) (Math.random() * 49) + 1;
                }
            }
        }
        return lotto_Zahlen;
    }
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
    // sorting method
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
