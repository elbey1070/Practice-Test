package schoolProject;

import java.util.Scanner;

public class Warehouse {

    static Scanner scan = new Scanner(System.in);

    public static void mainMenu() throws InterruptedException {

        String choose = "";
        do {
        System.out.println( "===== STAR College ===== \n"+
                            "======== Main MENU =======\n" +
                                    "\n"+
                     "\t 1- School Information" +
                     "\t 2- Teacher Menu" +
                     "\t 3- Student Menu" +
                     "\t Q- EXIT");
        System.out.println("Please choose : ");
        choose=scan.nextLine();


        switch (choose){
            case "1" : //School Information
                Warehouse.schoolInformation();
                break;
            case "2": // Teacher Menu
                Teacher.teacherMenu();
                break;
            case "3": // Student Menu
                break;
            case "q":
            case"Q":
                break;
            default:
                System.out.println("Please choose valid data");
        }
        }while (!choose.equalsIgnoreCase("q"));
        Warehouse.stopProject();
    }

    public static void schoolInformation() throws InterruptedException {
        System.out.println("===== STAR College ===== \n"+
                "\t Adress : " + School.adress +
                "\n Phone : " + School.phoneNum);
        Thread.sleep(5000);
    }

    public static void stopProject(){
        System.out.println("Exit from Project");
    }
}
