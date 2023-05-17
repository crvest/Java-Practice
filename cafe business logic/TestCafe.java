import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {

        /*
         * You will need add 1 line to this file to create an instance
         * of the CafeUtil class.
         * Hint: it will need to correspond with the variable name used below..
         */
        CafeUtil appTest = new CafeUtil();

        /* ============ App Test Cases ============= */

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());

        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        ArrayList<Double> menuPrice = new ArrayList<Double>();
        menuPrice.add(1.5);
        menuPrice.add(3.5);
        menuPrice.add(4.5);
        menuPrice.add(3.5);
        appTest.displayMenu(menu);
        System.out.println("----- Display Menu Test (Overloaded) -----");
        appTest.displayMenu(menu, menuPrice);

        // System.out.println("\n----- Add Customer Test-----");
        // ArrayList<String> customers = new ArrayList<String>();
        // // --- Test 4 times ---
        // for (int i = 0; i < 4; i++) {
        // appTest.addCustomer(customers);
        // System.out.println("\n");
        // }

        // ninja bonus 1 test
        System.out.println("\n----- Print Price Chart Test -----");
        String columbian = new String("Columbian Coffee Grounds");
        double columbianPrice = 15.0;
        int columbianQuantity = 3;
        appTest.printPriceChart(columbian, columbianPrice, columbianQuantity);

        // ninja bonus 2 test

    }
}
