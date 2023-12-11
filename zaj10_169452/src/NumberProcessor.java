public class NumberProcessor implements DataProcessor {
    @Override
    public String processData(String data) {
        if(data != null) {
            return "Processed: " + data;
        }
        return "";
    }

    @Override
    public boolean isValid(String data) {
        if(data != null) {
            return data.matches("-?\\d+(\\.\\d+)?");
        } else {
            return false;
        }
    }
}
