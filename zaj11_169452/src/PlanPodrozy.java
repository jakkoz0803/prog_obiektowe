public class PlanPodrozy {
    Biletomat biletomat;

    public PlanPodrozy(Biletomat biletomat) {
        this.biletomat = biletomat;
    }

    public void wystawBilet() {
        biletomat.wystawBilet();
    }

    public int obliczDziennyKosztPodrozy(int koszt, int dni) {
        try {
            return koszt / dni;
        }catch(ArithmeticException e){
            System.out.println("Dzielenie przez 0");
            return koszt;
        }
    }
}
