public class SensorTest {
    public static void main(String[] args) {
        TemperatureSensor tem = new TemperatureSensor(10,"zimno");
        System.out.println("temperatura: " + tem.readValue());
        System.out.println("status: " + tem.getStatus());
        tem.reset();
        System.out.println("reset temperatura: " + tem.readValue());
        System.out.println("reset status: " + tem.getStatus());
        System.out.println("====================================================");
        PressureSensor pre = new PressureSensor(982,"migrena");
        System.out.println("cisnienie: " + pre.readValue());
        System.out.println("status: " + pre.getStatus());
        pre.reset();
        System.out.println("reset cisnienie: " + pre.readValue());
        System.out.println("reset status: " + pre.getStatus());
    }
}
