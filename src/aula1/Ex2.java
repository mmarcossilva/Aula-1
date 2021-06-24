package aula1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o numero de multiplos: ");
        int n = sc.nextInt();
        System.out.print("Insira o numero para ver os multiplos: ");
        int m = sc.nextInt();


        for(int i = 1; i<=n; i++){
            System.out.println(i*m);
        }
    }
}
