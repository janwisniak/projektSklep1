import java.util.Scanner;

public class Main {
    // tutaj nasze obiekty
    public static electronics phone = new electronics("phone", 2500, 1, false);
    public static electronics laptop = new electronics("laptop", 4000, 2, false);
    public static clothing shirt = new clothing("shirt", 60, 3, false);
    public static clothing pants = new clothing("pants", 100, 4, false);
    public static book hobbit = new book("hobbit", 50, 5, false);
    public static book panTadeusz = new book("pan Tadeusz", 30, 6, false);

    // tutaj nasze przeceny
    public static void main(String[] args) {
        int discountnum = (int)(Math.random() * 6) + 1;
        System.out.println("dzisiaj mamy " + discountnum + " promocji oto one:");
        for(int i = 0; i < discountnum; i++){
            int discountid = (int)(Math.random() * discountnum) + 1;
            switch (discountid){
                case 1://elektronika
                    if (phone.discount == false){
                        phone.discount = true;
                        phone.price = phone.price / 2;
                        System.out.println(phone.name);}
                    else{i--;}
                    break;
                case 2:
                    if(laptop.discount == false){
                        laptop.discount = true;
                        laptop.price = laptop.price / 2;
                        System.out.println(laptop.name);}
                    else{i--;}
                    break;
                case 3://ubrania
                    if(shirt.discount == false){
                        shirt.discount = true;
                        shirt.price = shirt.price / 2;
                        System.out.println(shirt.name);}
                    else{i--;}
                    break;
                case 4:
                    if(pants.discount == false){
                        pants.discount = true;
                        pants.price = pants.price / 2;
                        System.out.println(pants.name);}
                    else{i--;}
                    break;
                case 5://książki
                    if(hobbit.discount == false){
                        hobbit.discount = true;
                        hobbit.price = hobbit.price / 2;
                        System.out.println(hobbit.name);}
                    else{i--;}
                    break;
                case 6:
                    if(panTadeusz.discount == false){
                        panTadeusz.discount = true;
                        panTadeusz.price = panTadeusz.price / 2;
                        System.out.println(panTadeusz.name);}
                    else{i--;}
                    break;
            }
        }

        //tutaj nasz interfejs
        int liczbaprod = 0;
        int ilosc =0;
        String[] koszyknazwa = new String[255];
        int koszykcena=0;
        int add=0;
        int test=0;

        boolean loop = true;
        while(loop == true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Witam w sklepie. Prosze wybierz akcję:\n 1. Wyświetl produkty\n 2. Jak działa zniżka\n 3. wyświetl koszyk\n 4. zakończ");
            int wybor = sc.nextInt();
            switch(wybor){
                case 1://1
                    System.out.println("Wybierz kategorię produktu: \n 1. Elektronika\n 2. Odzież\n 3. Książki\n 4. Powrót do menu głównego");
                    int wybor2 = sc.nextInt();
                    switch(wybor2){
                        case 1://1.1
                            System.out.println("Wybierz jaka elektronika:\n 1. Telefon\n 2. Laptop\n 3. Powrót do menu głównego");
                            int searche = sc.nextInt();
                            switch(searche){
                                case 1://1.1.1
                                    System.out.println("Produkt: " + phone.name + ", Cena: " + phone.price);
                                    System.out.println("Czy chcesz dodać do koszyka?\n 1. Tak\n 2. Nie");
                                    add = sc.nextInt();
                                    if(add == 1){
                                        System.out.println("ile sztuk?");
                                        ilosc = sc.nextInt();
                                        koszykcena = koszykcena + (phone.price * ilosc);
                                        for(int i = liczbaprod; i <= ilosc + liczbaprod ; i++){
                                            koszyknazwa[i] = phone.name;
                                            test=i;
                                        }
                                        liczbaprod = test;
                                    }
                                    break;
                                case 2://1.1.2
                                    System.out.println("Produkt: " + laptop.name + ", Cena: " + laptop.price);
                                    System.out.println("Czy chcesz dodać do koszyka?\n 1. Tak\n 2. Nie");
                                    add = sc.nextInt();
                                    if(add == 1){
                                        System.out.println("ile sztuk?");
                                        ilosc = sc.nextInt();
                                        koszykcena = koszykcena + (laptop.price * ilosc);
                                        for(int i = liczbaprod; i <= ilosc + liczbaprod; i++){
                                            koszyknazwa[i] = laptop.name;
                                            test=i;
                                        }liczbaprod = test;
                                    }
                                    break;
                            }
                            break;
                        case 2://1.2
                            System.out.println("Wybierz jakie  ubrania:\n 1. Koszulka\n 2. Spodnie\n 3. Powrót do menu głównego");
                            int searchc = sc.nextInt();
                            switch(searchc){
                                case 1://1.2.1
                                    System.out.println("Produkt: " + shirt.name + ", Cena: " + shirt.price);
                                    System.out.println("Czy chcesz dodać do koszyka?\n 1. Tak\n 2. Nie");
                                    add = sc.nextInt();
                                    if(add == 1){
                                        System.out.println("ile sztuk?");
                                        ilosc = sc.nextInt();
                                        koszykcena = koszykcena + (shirt.price * ilosc);
                                        for(int i = liczbaprod; i <= ilosc + liczbaprod; i++){
                                            koszyknazwa[i] = shirt.name;
                                            test=i;
                                        }liczbaprod = test;
                                    }
                                    break;
                                case 2://1.2.2
                                    System.out.println("Produkt: " + pants.name + ", Cena: " + pants.price);
                                    System.out.println("Czy chcesz dodać do koszyka?\n 1. Tak\n 2. Nie");
                                    add = sc.nextInt();
                                    if(add == 1){
                                        System.out.println("ile sztuk?");
                                        ilosc = sc.nextInt();
                                        koszykcena = koszykcena + (pants.price * ilosc);
                                        for(int i = liczbaprod; i <= ilosc + liczbaprod; i++){
                                            koszyknazwa[i] = pants.name;
                                            test=i;
                                        }liczbaprod = test;
                                    }
                                    break;
                            }
                            break;
                        case 3://1.3
                            System.out.println("wybierz jakie Książki:\n 1. Hobbit\n 2. Pan Tadeusz\n 3. Powrót do menu głównego");
                            int searchb = sc.nextInt();
                            switch(searchb){
                                case 1://1.3.1

                                    System.out.println("Książka: " + hobbit.name + ", Cena: " + hobbit.price);
                                    System.out.println("Czy chcesz dodać do koszyka?\n 1. Tak\n 2. Nie");
                                    add = sc.nextInt();
                                    if(add == 1){
                                        System.out.println("ile sztuk?");
                                        ilosc = sc.nextInt();
                                        koszykcena = koszykcena + (hobbit.price * ilosc);
                                        for(int i = liczbaprod; i <= ilosc + liczbaprod; i++){
                                            koszyknazwa[i] = hobbit.name;
                                            test=i;
                                        }liczbaprod = test;
                                    }
                                    break;
                                case 2://1.3.2

                                    System.out.println("Książka: " + panTadeusz.name + ", Cena: " + panTadeusz.price);
                                    System.out.println("Czy chcesz dodać do koszyka?\n 1. Tak\n 2. Nie");
                                    add = sc.nextInt();
                                    if(add == 1){
                                        System.out.println("ile sztuk?");
                                        ilosc = sc.nextInt();
                                        koszykcena = koszykcena + (panTadeusz.price * ilosc);

                                        for(int i = liczbaprod; i <= ilosc + liczbaprod; i++){
                                            koszyknazwa[i] = panTadeusz.name;
                                            test=i;
                                        }liczbaprod = test;
                                    }
                                    break;
                            }
                            break;
                        case 4://1.4
                            break;
                    }
                    break;
                case 2://2
                    System.out.println("każdy produkt na znizce jest o 50% tańszy\n 1. Powrót do menu głównego");
                    int powrot = sc.nextInt();
                    break;
                case 3://3
                    koszyk(koszyknazwa, koszykcena,liczbaprod);
                    break;
                case 4://4
                    System.out.println("Dziękujemy za zakupy!");
                    loop = false;
                    break;
                default:
            }
        }
    }

    //tutaj nasz koszyk
    public static void koszyk(String[] koszyknazwa,int koszykcena, int liczbaprod) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Koszyk: ");
        for(int i = 0; i < liczbaprod; i++){
            System.out.println(koszyknazwa[i]);
        }
        System.out.println("Cena: " + koszykcena);
        System.out.println("Wróć do menu 1.");
        int powrot = sc.nextInt();
    }

    //tutaj nasze produkty
    public static class product{
        String name;
        int price;
        int ID;
        boolean discount;

        public product(String name, int price, int ID){
            this.name = name;
            this.price = price;
            this.ID = ID;
            this.discount = false;
        }
    }

    public static class electronics extends product{
        public electronics(String name, int price, int ID, boolean discount){
            super(name, price, ID);
            this.discount = discount;
        }
    }

    public static class clothing extends product{
        public clothing(String name, int price, int ID, boolean discount){
            super(name, price, ID);
            this.discount = discount;
        }
    }
    public static class book extends product{
        public book(String name, int price, int ID, boolean discount) {
            super(name, price, ID);
            this.discount = discount;
        }
    }
}