class PressureSensor implements Sensor {
    public double pressure;
    public String status;

    public PressureSensor(double pressure, String status) {
        this.pressure = pressure;
        this.status = status;
    }

    @Override
    public double readValue() {
        return pressure;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void reset() {
        this.pressure = 1013.0;
        this.status = "default";
        System.out.println("zresetowano pressure");
    }
}
