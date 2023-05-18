import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // create menu items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 2.95;
        // System.out.printf(item1.name + " " + item1.price);
        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4.95;
        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 1.05;
        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 1.75;
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";
        Order order2 = new Order();
        order2.name = "Jimmy";
        Order order3 = new Order();
        order3.name = "Noah";
        Order order4 = new Order();
        order4.name = "Sam";

        // add item1 to order2
        System.out.println("----------");
        order2.items.add(item1);
        order2.total += item1.price;
        System.out.printf("%s Total: $%.2f\n",order2.name, order2.total);

        // add item4 to order 3
        System.out.println("----------");
        order3.items.add(item4);
        order3.total += item4.price;
        System.out.printf("%s Total: $%.2f\n",order3.name, order3.total);

        // add item2 to order4
        System.out.println("----------");
        order4.items.add(item2);
        order4.total += item2.price;
        System.out.printf("%s Total: $%.2f\n",order4.name, order4.total);

        // ready order1
        System.out.println("----------");
        order1.ready = true;
        System.out.printf("%s order ready: %s\n",order1.name, order1.ready);

        // add 2 item2 to order4
        System.out.println("----------");
        order4.items.add(item2);
        order4.total += item2.price;
        order4.items.add(item2);
        order4.total += item2.price;
        System.out.printf("%s Total: $%.2f\n",order4.name, order4.total);

        // ready order2
        System.out.println("----------");
        order2.ready = true;
        System.out.printf("%s order ready: %s\n",order2.name, order2.ready);
        
        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}