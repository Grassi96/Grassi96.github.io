package tutorial;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class MoneyConverter {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe einen Betrag in EUR an: ");
        Double money = scanner.nextDouble();
    
        
        convertToDollars(money);
        convertToKuna(money);
        convertToPfund(money);
        convertToSchilling(money);
    }    

    /**
     *
     * @param eur
     */
    public static void convertToDollars(Double eur) {
        System.out.println("Der Betrag in Dollar ist: " + eur * 1.12);
    }
    
    /**
     *
     * @param eur
     */
    public static void convertToKuna(Double eur) {
         System.out.println("Der Betrag in Kuna ist: " + eur * 7.52);
    }
    
    /**
     *
     * @param eur
     */
    public static void convertToPfund (Double eur) {
        System.out.println("Der Betrag in Pfund ist: " + eur * 0.84);
    }

    /**
     *
     * @param eur
     */
    public static void convertToSchilling (Double eur) {
        System.out.println("Der Betrag in Schilling ist: " + eur * 13.76);
    }
   
    
   
}
