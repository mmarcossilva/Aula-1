package aula1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um numero para ver se ele é primo: ");
        int n = sc.nextInt();

        boolean primo = true;
        for(int i = 2; i<n; i++){
            if(n%i==0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.print(n + " é primo");
        }else{
            System.out.print(n + " não é primo");
        }
    }
}
