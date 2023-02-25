public class Main {
    public static void main(String[] args) {
        // object for users
        User u1 = new User("AN", 20000);
        User u2 = new User("BAO", 1000000, 0.2);
        // item
        Item item = new Item("ferrari", 200000);
        Item item2 = new Item("innova", 20000);
        // deposit
        u1.deposit(500);
        System.out.println("\n\n");
        // transfer money from user to user
        User.transferMoneyFromTo(100, u1, u2);
        System.out.println("\n\n");
        // buy
        User.buy(u1, item2);
        User.buy(u2, item);
        System.out.println("\n\n");
        // number of user
        System.out.println("NUMBER OF USERS");
        System.out.println(User.getCounter());
    }
}
