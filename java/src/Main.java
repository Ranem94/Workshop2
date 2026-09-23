public class Main {
    public static void main(String[] args) {

        Account kim = new Account();
        kim.owner = "Kim";
        kim.balance = 1000.0;
        kim.deposit(500.0);
        kim.withdraw(200.0);
        System.out.println(kim.owner);
        System.out.println(kim.balance + " kr ");

        Account moa = new Account();
        moa.owner = "Moa";
        moa.balance = 50.0;
        System.out.println(moa.owner);
        System.out.println( moa.balance);
        kim.deposit(-50.0);
        kim.withdraw(-10.0);
        kim.withdraw(5000.0);
    }
}
