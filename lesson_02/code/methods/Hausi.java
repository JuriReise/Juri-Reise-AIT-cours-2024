package methods;

public class Hausi {

    public static void main(String[] args) {
// Alte Frau im Bus
        BusKommt();
        FrauDrausen();
        FrauZahlt();
        BusAbfahren();


    } // end of main

    public static void BusKommt(){
        System.out.println("Willkommen an Bord, Liebe Fahrgäste!!!!");

    }
    public static void FrauDrausen(){

        System.out.println("Erste schrit, puch. Zweite schrit, puch!!! Warte, ich bin müde, bald werde ich drinen");

    }
    public static void BusAbfahren(){

        System.out.println("Erste schrit, puch. Zweite schrit, puch!!! Warte, ich bin müde, bald werde ich ddrausen");
    }
    public static void FrauZahlt(){
        Plastiktüte();
        Ledertasche();
        Gelbbörse();
        ZweiEuro();

    }
public static void Plastiktüte(){
    System.out.println("Sie öffnete die Plastiktüte und holte eine Ledertasche heraus.");
}
public static void Ledertasche(){
    System.out.println("Sie öffnete die Ledertasche und holte eine Geldbörse heraus.");
}
public static void Gelbbörse(){
    System.out.println("Sie öffnete ihre Geldbörse und nahm 10 Euro heraus.");
}
public static void ZweiEuro(){
    System.out.println("Sie gab 10 Euro und erhielt 2 Euro zurück...");
}

} // end of class
