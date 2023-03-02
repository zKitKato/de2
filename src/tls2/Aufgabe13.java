package tls2;

import org.jetbrains.annotations.Contract;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.Arrays;


public class Aufgabe13 {

    public static void main(String[]args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Anzahl der Spieler: ");

        String[] player = new String[Integer.parseInt(br.readLine())];

        String[] feld = new String[player.length];

        for(int i = 0; i < player.length; i++) {

            System.out.print("Geben sie den Spielernamen ein: ");

            player[i] = br.readLine();

        }

        System.out.print("Spieler: \t");

        for(String name: player){

            System.out.print(name +"\t");

        }

        System.out.print("\nAugen: \t\t");

        int[] augen = new int[player.length];

//        int index = getIndexMax(wuerfeln(augen));
//
//        System.out.println(player[index]);

    }

    @Contract("_ -> param1")
    public static int[] wuerfeln(int[] feld) {

        for(int i = 0; i<feld.length;i++)

            feld[i]=(int) (Math.random() * 12) + 1;

        return feld;

    }


}