public class RewardValue {
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private double cashValue;
    private double milesValue;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }

    // Convert cash to miles (assuming a conversion rate)
    private double convertCashToMiles(double cash) {
        // Define the conversion rate from cash to miles
        double conversionRate = 1 / MILES_TO_CASH_CONVERSION_RATE;
        return cash * conversionRate;
    }

    // Convert miles to cash
    private double convertMilesToCash(double miles) {
        return miles * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public double getMilesValue() {
        return milesValue;
    }
}
