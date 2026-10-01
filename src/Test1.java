public class Test1 {
    public static void main(String[] args)
    {
        double purchasePrice = 100.00;
        double salesTaxRate = 0.05;
        double computedTax = purchasePrice * salesTaxRate;

        System.out.println("The original price is: $" + purchasePrice);
        System.out.println("The computed 5% sales tax is: $" + computedTax);
    }
}
