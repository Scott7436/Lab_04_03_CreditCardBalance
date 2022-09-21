public class Main {
    public static void main(String[] args)
    {
        double creditBal = 5000;
        double rate = 0.17;
        double payment = ((creditBal *= rate));
        double noPay = payment + payment;

        System.out.println("Your Interest after 1 month is $" + payment);
        System.out.println("Your Interest after 2 month is $" + noPay);
    }
}