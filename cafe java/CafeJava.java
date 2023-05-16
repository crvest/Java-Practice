public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.50;
        double dripCoffee = 2.50;
        double latte = 5;
        double cappuccino = 4.50;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //

        // exercsie 1
        if(isReadyOrder4) {
            System.out.println(generalGreeting + customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccino);
        }
        else {
            System.out.println(generalGreeting + customer4 + pendingMessage);
        }

        // exercise 2
        if(isReadyOrder2) {
            System.out.println(generalGreeting + customer2 + readyMessage);
            System.out.println(displayTotalMessage + (latte*2) );
        }
        else {
            System.out.println(generalGreeting + customer2 + pendingMessage);
        }

        // exercsie 3
        System.out.println(generalGreeting + customer3);
        System.out.println(displayTotalMessage + (latte - dripCoffee) );


    }
}
