1. Ogólny opis programu
Program działa w konsoli i ma być to sklep internetowy. Przy uruchomieniu:

Losowo wybiera liczbę promocji i stosuje je do produktów, cena zostaje zmniejszona o połowę.
Następnie wchodzi w pętlę menu, gdzie użytkownik może:
Przeglądać produkty i dodawać je do koszyka.
Sprawdzić, jak działają zniżki.
Wyświetlić zawartość koszyka.
Zakończyć program.
Produkty są podzielone na kategorie: elektronika, odzież i książki. Każdy produkt ma nazwę, cenę, ID i opcję znizki. Koszyk przechowuje nazwy produktów i całkowitą cenę.


2. Struktura klas
Kod definiuje hierarchię klas dla produktów. Wszystkie klasy są statyczne i zagnieżdżone w klasie Main.

Klasa bazowa: product

Pola:

String name: Nazwa produktu.
int price: Cena produktu (w jakiejś walucie, np. PLN).
int ID: Unikalny identyfikator produktu.
boolean discount: wskazuje, czy produkt jest na zniżce.
Konstruktor: Przyjmuje name, price i ID. Ustawia discount na false.
Opis: Klasa bazowa dla wszystkich produktów. Nie ma dodatkowych metod.

Klasa dziedzicząca: electronics
Dziedziczy z product.
Konstruktor: Przyjmuje name, price, ID i discount. Wywołuje konstruktor rodzica i ustawia discount.
Opis: Reprezentuje produkty elektroniczne.

Klasa dziedzicząca: clothing
Dziedziczy z product.
Konstruktor: Podobny do electronics.
Opis: Reprezentuje odzież.

Klasa dziedzicząca: book
Dziedziczy z product.
Konstruktor: Podobny do electronics.
Opis: Reprezentuje książki.
Statyczne obiekty produktów


W klasie Main zdefiniowane są statyczne instancje produktów:

electronics phone = new electronics("phone", 2500, 1, false);
electronics laptop = new electronics("laptop", 4000, 2, false);
clothing shirt = new clothing("shirt", 60, 3, false);
clothing pants = new clothing("pants", 100, 4, false);
book hobbit = new book("hobbit", 50, 5, false);
book panTadeusz = new book("pan Tadeusz", 30, 6, false);
Te obiekty są używane w całym programie.


3. Metoda główna: main
Metoda main jest punktem wejścia programu. Działa w dwóch fazach: generowanie zniżek i interfejs użytkownika.

Faza 1: Generowanie zniżek

int discountnum = (int)(Math.random() * 6) + 1;: Losuje liczbę promocji (od 1 do 6).
Wyświetla komunikat o liczbie promocji.

W pętli for (od 0 do discountnum-1):
Losuje discountid (od 1 do discountnum).
Używa switch do wybrania produktu na podstawie discountid:
Jeśli produkt nie ma zniżki (discount == false), ustawia discount = true, zmniejsza cenę o połowę (price = price / 2) i wyświetla nazwę.
Jeśli produkt już ma zniżkę, zmniejsza licznik pętli (i--), aby spróbować ponownie.

Faza 2: Interfejs użytkownika
Zmienne lokalne:
int liczbaprod = 0;: Licznik produktów w koszyku.
int ilosc = 0;: Ilość sztuk do dodania.
String[] koszyknazwa = new String[255];: Tablica nazw produktów w koszyku (maksymalnie 255 pozycji).
int koszykcena = 0;: Całkowita cena koszyka.
int add = 0;: wskaznik decyzji o dodaniu do koszyka.
int test = 0;: Pomocnicza zmienna do aktualizacji liczbaprod.
boolean loop = true;: kontrola działanią pętli menu.
Pętla while(loop == true):
Wyświetla menu główne: "Witam w sklepie. Prosze wybierz akcję: 1. Wyświetl produkty 2. Jak działa zniżka 3. wyświetl koszyk 4. zakończ".
int wybor = sc.nextInt();: Czyta wybór użytkownika.

switch(wybor):

Case 1: Wyświetl produkty.
Podmenu kategorii: 1. Elektronika, 2. Odzież, 3. Książki, 4. Powrót.
Dla każdej kategorii dalsze podmenu wyboru produktu.
Po wybraniu produktu wyświetla nazwę i cenę, pyta o dodanie do koszyka.
Jeśli tak, pyta o ilość, aktualizuje koszykcena i dodaje nazwy do koszyknazwa (w pętli for).
Case 2: Wyjaśnienie zniżki: "każdy produkt na znizce jest o 50% tańszy".
Case 3: Wywołuje metodę koszyk(koszyknazwa, koszykcena, liczbaprod);.
Case 4: Kończy program: "Dziękujemy za zakupy!", ustawia loop = false.


4. Metoda: koszyk
Sygnatura: public static void koszyk(String[] koszyknazwa, int koszykcena, int liczbaprod)
Opis: Wyświetla zawartość koszyka.
Iteruje przez koszyknazwa od 0 do liczbaprod-1 i wyswietla nazwy produktów.
Wyświetla całkowitą cenę: "Cena: " + koszykcena.
