package lt.vcd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite N (nuo 0 iki 12): ");
        int n = sc.nextInt();
        
        long faktorialas = 1;
        
        for (int i = 1; i <= n; i++) {
            faktorialas = faktorialas * i;
        }
        
        System.out.println("Atsakymas: " + faktorialas);
    }
}
