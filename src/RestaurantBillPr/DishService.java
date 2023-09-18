package RestaurantBillPr;

import java.util.ArrayList;
import java.util.List;

public class DishService {



        private List<Dish> dishList=new ArrayList<>();


        public DishService(){
            fillDishList();
        }

        private void fillDishList() {
            Dish dish1=new Dish(100,"Kabab 1",25.0);
            Dish dish2=new Dish(101,"Kabab 2",20.0);
            Dish dish3=new Dish(102,"Kabab 3",200.0);
            Dish dish4=new Dish(200,"Paxlava",10.0);
            Dish dish5=new Dish(201,"Paxlava 2",8.0);
            Dish dish6=new Dish(202,"Desert",7.0);
            Dish dish7=new Dish(300,"Ayran",3.0);
            Dish dish8=new Dish(301,"Cola",30);
            Dish dish9=new Dish(302,"Tea",1);
            Dish dish10=new Dish(303,"Water",0.5);
            this.dishList.add(dish1);
            this.dishList.add(dish2);
            this.dishList.add(dish3);
            this.dishList.add(dish4);
            this.dishList.add(dish5);
            this.dishList.add(dish6);
            this.dishList.add(dish7);
            this.dishList.add(dish8);
            this.dishList.add(dish9);
            this.dishList.add(dish10);
        }


        public void showMenu(){
            System.out.println("           *** Menu ***                ");
            System.out.printf("%-3s    %-20s    %-6s     \n","Code","Name","Price");
            System.out.printf("%-3s    %-20s    %-6s     \n","***","****","************");

            for (Dish dish:dishList){

                System.out.printf("%-3s    %-20s    %-6s  AZN\n",dish.getCode(),dish.getName(),dish.getPrice());

            }
        }


        public Dish findDishByCode(int code){//500
            if (code==0){
                System.out.println("Main Menu");
            }else {
                for (Dish dish:dishList){
                    if (dish.getCode()==code){
                        return dish;
                    }
                }
                System.out.println("Not Found!");
            }
            return null;
        }

}
