package schoolProject;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Teacher {
    static Scanner scan = new Scanner(System.in);

    static Map<String ,String> teacherMap = new HashMap<>();
    public static void teacherSet() {
      teacherMap.put("1GAD", "Huseyn, Hasanov, 1980, Math");
      teacherMap.put("1DAG", "Hasan, Aliyev, 1985, Enhlish");
      teacherMap.put("1ERTD", "Aygun, Yov, 1989, Chemistry");
      teacherMap.put("1TTR5D", "Elnur, Hasanov, 1983, Bio");
    }

    public static void teacherMenu() throws InterruptedException {
        String choose = "";
        do {
            System.out.println("===== STAR College ===== \n"+
                    "======== Main MENU =======\n" +
                    "\n"+
                    "\t 1- Teacher List" +
                    "\t 2- Teacher Surname" +
                    "\t 3- Teacher Field" +
                    "\t 4- Teacher ID" +
                    "\t A- Main Menu" +
                    "\t Q- EXIT");
            choose = scan.nextLine();
            switch (choose){
                case "1" :
                    teacherListPrint();
                    break;
                case "2" :
                    teacherSurname();
                    break;
                case "3" :
                    break;
                case "4" :
                    break;
                case "A" :
                case "a":
                    Warehouse.mainMenu();
                    break;
                case "q" :
                case "Q" :
                    break;
                default:
                    System.out.println("Please choose valid data");


            }
        }while(!choose.equalsIgnoreCase("q"));
        Warehouse.stopProject();
    }

    public static void teacherSurname() {
        System.out.println("Please enter Teacher Surname");
        String searchSurname = scan.nextLine();
        Set<Map.Entry<String,String>> teacherEntrySet=teacherMap.entrySet();


    }

    public static void teacherListPrint() throws InterruptedException {
        Set<Map.Entry<String,String>> teacherEntrySet=teacherMap.entrySet();
        for(Map.Entry<String,String> each:teacherEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            System.out.println(eachKey+ " "+ eachValue);

        } Thread.sleep(5000);
    }
}
