/*interface Converter {
    abstract double convertToEuro(double amount);
    abstract double convertToUSD(double amount);
    abstract double getConversionRate(String currency);
}

class CurrencyConverter implements Converter {
    public double convertToEuro(double amount) {
        return amount/4.34;
    }
    public double convertToUSD(double amount) {
        return amount/4.04;
    }
    public double getConversionRate(String currency) {
        if(currency.equals("Euro")) {
            return 4.34;
        } else if(currency.equals("USD")) {
            return 4.04;
        } else {
            return -1;
        }
    }
}

class UnitConverter implements Converter {
    public double convertToEuro(double amount) {
        return 0;
    }
}

public class ConverterTest {
    public static void main(String[] args) {
        CurrencyConverter konwerter = new CurrencyConverter();
        double euro = konwerter.convertToEuro(500);
        System.out.println("500 PLN --> " + euro);
    }
}
*/