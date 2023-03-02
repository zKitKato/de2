import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String onePlayer, secondPlayer;
        int maxDarts, dartsPlayed = -3, dart = 0;
        System.out.print("Max Darts: ");
        maxDarts = Integer.parseInt(br.readLine());
        System.out.print("Name Player 1: ");
        onePlayer = br.readLine();
        System.out.print("Name Player 2: ");
        secondPlayer = br.readLine();
        try {


            do {
                System.out.println(onePlayer + ": ");
                for (int i = 1; i < 4; i++) {
                    System.out.print("Dart " + i + ":");
                    dart = Integer.parseInt(br.readLine());
                }
                System.out.println(secondPlayer + ": ");
                for (int j = 1; j < 4; j++) {
                    System.out.print("Dart " + j + ":");
                    dart = Integer.parseInt(br.readLine());
                }
                dartsPlayed++;
            } while (dartsPlayed != maxDarts);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }


}