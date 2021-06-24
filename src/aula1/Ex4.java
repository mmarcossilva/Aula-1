package aula1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira até qual número gostaria de visualizar os números primos: ");
        int n = sc.nextInt();


        for(int i = 1; i<n; i++){
            if(checkIfPrime(i))
                System.out.println(i);
        }
    }

    public static boolean checkIfPrime(int num){
        boolean primo = true;
        for(int i = 2; i<num; i++){
            if(num%i==0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
}
