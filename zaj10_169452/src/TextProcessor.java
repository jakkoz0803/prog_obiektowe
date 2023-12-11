class TextProcessor implements DataProcessor {

    @Override
    public String processData(String data) {
        if(data != null) {
            return new StringBuilder(data).reverse().toString();
        }
        return "";
    }

    @Override
    public boolean isValid(String data) {
        if(data != null && data.isEmpty() == false) {
            return true;
        } else {
            return false;
        }
    }
}
