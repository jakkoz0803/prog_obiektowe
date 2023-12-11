class TemperatureSensor implements Sensor {
    public double temperature;
    public String status;

    public TemperatureSensor(double temperature, String status) {
        this.temperature = temperature;
        this.status = status;
    }

    @Override
    public double readValue() {
        return temperature;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void reset() {
        this.temperature = 23.0;
        this.status = "default";
        System.out.println("zresetowano temperature");
    }
}
