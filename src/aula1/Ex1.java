package aula1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira até qual número gostaria de visualizar os números pares: ");
        int max = sc.nextInt();
        for(int i = 1; i<max; i++){
            if(i%2==0)
                System.out.println(i);
        }
    }
}
