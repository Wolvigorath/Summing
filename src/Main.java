import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;


public class Main {
    public static void main(String[] args)
    {

        Scanner input = new Scanner (System.in);
        String nwLine = System.lineSeparator();
        System.out.println("Podaj liczbę granicy sumy cyfr liczby 4 cyfrowej");
        int min = 1000;
        int max;

        Adding One = new Adding();
        One.Adder(5421,3);
        int minimum = One.getMin();
        System.out.println("Twoja liczba to: " + minimum + " Liczba innych pasujących liczb to: " + One.getCount() + " A ich łączna suma: " + One.getTotalSum());


    }
}