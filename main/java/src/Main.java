import java.util.Scanner;

public class Main {

    // method for currency conversion rates (USD to EUR)
    private static double convertCurrency(double amount, String fromCurrency, String toCurrency){
        // set the fixed conversion rate
        double conversionRate = 0.85; // EUR when USD is 1 USD
        return amount * conversionRate;
    }

    public static double performCurrencyConversion(double amount, String fromCurrency, String toCurrency){
        return convertCurrency(amount, fromCurrency,toCurrency);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // user input
        System.out.println("Enter the amount to convert: ");
        String amountInput = input.nextLine();
        double amount = Double.parseDouble(amountInput);

        System.out.println("Enter the source currency: (e.g. USD)");
        String fromCurrency = input.nextLine();
        System.out.println("Enter the target currency: (e.g. EUR)");
        String toCurrency = input.nextLine();

        // create and start the conversion thread(user thread)

        // create and start the background daemon thread

        // wait for the conversion thread to complete

        // close the scanner
        input.close();




    }


}
