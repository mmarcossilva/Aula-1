package aula1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade de numeros: ");
        int n = sc.nextInt();
        System.out.print("Insira a quantidade de vezes que o numero repete: ");
        int m = sc.nextInt();
        System.out.print("Insira o numero que repete: ");
        int d = sc.nextInt();
        int numFound = 0;
        int i = 10;
        while (numFound < n) {
            if(checkOccurrences(i, d, m)) {
                numFound++;
                System.out.println(i);
            }
            i++;
        }
    }
    public static boolean checkOccurrences(int num, int numToCheck, int occurrences){
        String converted = Integer.toString(num);
        int match = 0;
        for(int i = 0; i<converted.length(); i++){
            if(Character.getNumericValue(converted.charAt(i)) == numToCheck)
                match++;
        }
        return occurrences <= match;
    }
}
