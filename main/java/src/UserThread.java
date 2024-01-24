public class UserThread extends Thread{
    // attributes
    private double amount;
    private String fromCurrency;
    private String toCurrency;

    // constructor
    public UserThread(double amount, String fromCurrency, String toCurrency){
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    @Override
    public void run(){
        double result = Main.performCurrencyConversion(amount,fromCurrency, toCurrency)
        System.out.println("Conversion result: " + result);
    }

}
