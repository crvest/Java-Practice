import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {

    // exercise 1: sum integers from 1 to 10
    public int getStreakGoal() {
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        return sum;
    }

    // exercise 2: sum all prices in an array and return total
    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for(int i = 0; i < prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }

    // exercsie 3: print out each menu item in an Arraylist
    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(menuItems.get(i));
        }
    }

    // ninja bonus 2, overload displaymenu with prices
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        // return false if array sizes are different
        if(menuItems.size() != prices.size()){
            return false;
        }
        for(int i = 0; i < menuItems.size(); i++){
            System.out.printf("%d\t%s\t--\t$%.02f\n", i, menuItems.get(i), prices.get(i));
        }
        return true;
    }

    // exercsie 4: take customer name input and print customized greeting
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s. \n", userName);
        System.out.printf("There are %d people in front of you.\n", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }

    // ninja bonus 1
    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        for(int i = 1; i <= maxQuantity; i++) {
            System.out.printf("\n%d\t-\t$%.02f",i, price*i-(.5*(i-1)));
        }
    }

}