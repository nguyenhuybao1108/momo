public class User {
    private String name;
    private int id;
    private int balance;
    private double discount;
    private static int counter = 0;

    public static void buy(User user, Item item) {
        user.balance -= item.getPrice() * (1 - user.discount);
        if (user.getBalance() < 0) {
            System.err.println("Can not do this transaction ");
            user.balance += item.getPrice() * (1 - user.discount);
            System.out.println("Balance of " + user.name + " : " + user.getBalance());
        } else {
            System.out.println(user.name + " bought " + item.getName());
            System.out.println("Balance of " + user.name + " : " + user.getBalance());
        }
    }

    public static void transferMoneyFromTo(int money, User u1, User u2) {
        u1.balance -= money;
        u2.balance += money;
        System.out.println(u1.name + " transfer " + money + " to " + u2.name);
        System.out.println("Balance of " + u1.name + " : " + u1.getBalance());
        System.out.println("Balance of " + u2.name + " : " + u2.getBalance());
        System.out.println("\n");

    }

    public static int getCounter() {
        return counter;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
        System.out.println(name + " deposit " + money + "\nBalance of " + name + " : " + getBalance());
    }

    public User(String name, int balance) {
        System.out.printf("%s balance is %d \n", name, balance);
        counter++;
        this.name = name;

        this.balance = balance;
    }

    public User(String name, int balance, Double discount) {
        // VIP person with discount
        System.out.printf("%s balance is %d \n", name, balance);
        counter++;
        this.name = name;

        this.balance = balance;
        this.discount = discount;

    }

}
