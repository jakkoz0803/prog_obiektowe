package zad1;

public record Person(String imie, int wiek) {
    public Person {
        if(wiek < 0) {
            wiek = 0;
        }
    }
}


/*Stwórz rekord Person, który reprezentuje imię i wiek osoby.
Dodaj konstruktor, który weryfikuje, czy podany wiek nie jest ujemny.
W przypadku podania wartości ujemnej, ustaw wiek na 0.
Stwórz przypadek testowy.
 */