public interface LoudAnimal {
    abstract void makeNoise();
}

class Dog implements LoudAnimal {
    public void makeNoise() {
        System.out.println("bark");
    }
}

class Cat implements LoudAnimal {
    public void makeNoise() {
        System.out.println("moew");
    }
}