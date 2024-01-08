package zad2;

public interface Silnik {
    void uruchom();
    void zatrzymaj();
}

/*    1. Stwórz interfejs Silnik z metodami uruchom() i zatrzymaj().
      2. Utwórz klasę BenzynowySilnik, która implementuje Silnik
         i symuluje działanie silnika na benzynę.
      3. Utwórz klasę Samochód,
         która posiada prywatne pole typu Silnik.
         W konstruktorze przyjmij Silnik jako argument.
         Dodaj metody start() i stop(), które będą delegować odpowiednio
         zadanie uruchomienia i zatrzymania silnika do obiektu klasy Silnik.
 */