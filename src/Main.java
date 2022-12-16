import java.util.Scanner;
/*
    * @author Emircan Aktaş - 16.Dec.2022
 */
public class Main {
    public static void main(String[] args) {

        double startPrice = 10.0,km, perKm = 2.20,costumerPrice;

        Scanner inp = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("Taximeter starting price : 10.0$\n" +
                "Taximeter perKm price : 2.20$");
        System.out.println("*****************************");

        System.out.print("Enter the distance in km :");
        km = inp.nextInt();

        costumerPrice = startPrice + (km * perKm);
        costumerPrice = (costumerPrice < 20) ? 20 :costumerPrice;

        System.out.println("Total price :" + costumerPrice + "$");




    }
}