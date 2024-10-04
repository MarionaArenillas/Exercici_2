//llibreria que utilitzarem per llegir el número demanat a l'usuari
import java.util.Scanner;

public class Main {
    //funció descompte
    public static void descompte (double preu) {
        double preuFinal = preu - (0.20 * preu);
        System.out.println("Finalment el que has de pagar és: "+preuFinal);
    }

    //main del codi
    public static void main(String[] args) {
        //donar la benvinguda a l'usuari
        System.out.println("Benvingut al programa!");

        Scanner input = new Scanner(System.in);
        //preguntar si és client VIP i llegir el resultat
        System.out.print("Ets client VIP? (si/no): ");
        String resposta = input.nextLine(); //llegir si es o no VIP

        //crear la variable boolean per guardar si esVip és true
        boolean esVip = resposta.equalsIgnoreCase("si");

        //preguntar el preu del producte
        System.out.print("Quin és el preu del producte? ");
        double preu = input.nextDouble(); //llegir el preu en decimal

        //condicions del problema
        if (esVip){
            System.out.println("Com que ets client VIP tens un 20% de descompte!");
            descompte(preu);
        } else if (preu >= 200) {
            System.out.println("Com que superes els 200€ de compra tens un 20% de descompte");
            descompte(preu);
        } else
            System.out.println("No tens descompte. Has de pagar: "+preu);

    }
}