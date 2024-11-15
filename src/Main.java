import  java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wat is u naam ");
        String naam = scanner.nextLine();
        System.out.println("wat is u  leeftijd");
        int leeftijd = scanner.nextInt() ;

        System.out.println("U naam is " + naam + "u leeftijd is " + leeftijd);


    }
}