package RestaurantBillPr;

import java.util.Scanner;

public class BillGenerator01 {
    public static void main(String[] args) {

        getSelectionMenu();
    }

    private static void getSelectionMenu() {
        Scanner inp =new Scanner(System.in);

        int select=-1;
        while (select!=0){
            System.out.println("-----------------------------------------------");
            System.out.println(" *** Baku Restaurant Order App *** ");
            System.out.println("1-Menu");
            System.out.println("2-Order");
            System.out.println("3-Cancel Order");
            System.out.println("4-Check please");
            System.out.println("0-Exit");
            System.out.println("Choice : ");
            select=inp.nextInt();
            System.out.println("------------------------------------------------");

            switch (select){
                case 1:
                    //Menu
                    break;
                case 2:
                    // Order
                    break;
                case 3:
                    // Cancel Order
                    break;
                case 4:
                    //Check please
                    break;
                case 0:
                    System.out.println("Have a nice day.");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }

        }

    }
}

