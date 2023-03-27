import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Komsumsi> listKomsumsi = new ArrayList<>();
        Komsumsi<Makanan, Minuman> breakfast = new Komsumsi<>();
        Komsumsi<Makanan, Minuman> lunch = new Komsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("Soti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setKomsumsi(roti, susu);
        listKomsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("Nasi Putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air Putih");
        lunch.setKomsumsi(nasi, air);
        listKomsumsi.add(lunch);

        System.out.println("Menu konsumsi");
        for (Komsumsi<Makanan, Minuman> konsumsi: listKomsumsi){
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
}

    }
}
