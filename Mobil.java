public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu;
    private double jarak;

    public void setNoPlat(String s) {
        noPlat = s; // mengganti String noPlat dengan masukan user
    }

    public void setWarna(String s) {
        warna = s; // mengganti String warna dengan masukan user
    }

    public void setManufaktur(String s) {
        manufaktur = s; // mengganti String manufaktur dengan masukan user
    }

    private double rubahKecepatan(double i) { // method private agar dapat digunakan di kelas Mobil saja
        i = (i * 1000) / 3600; // merubah km/h menjadi m/s
        return i;
    }

    public double setKecepatan(double i) { // mengambil kecepatan berdasarkan masukan user
        kecepatan = rubahKecepatan(i); // mengganti double kecepatan dengan hasil dari method rubahKecepatan
        return kecepatan;
    }

    private double rubahSekon(double i) { // method private agar dapat digunakan di kelas Mobil saja
        i = i * 3600; // merubah jam menjadi sekon
        return i;
    }

    public double setWaktu(double i) { // mengambil waktu tempuh berdasarkan masukan user
        waktu = rubahSekon(i); // mengganti double waktu dengan hasil dari method rubahSekon
        return waktu;
    }

    private double hitungJarak() { // method private agar dapat digunakan di kelas Mobil saja
        jarak = (kecepatan * waktu) / 1000; // menghitung jarak tempuh berdasarkan kecepatan dan waktu
        return jarak;
    }

    public void displayMessage() { // menampilkan status mobil
        System.out.println();
        System.out.println("=================================================");
        System.out.println("Berikut adalah informasi pada mobil!");
        System.out.println("Merk mobil                   : " + manufaktur);
        System.out.println("Nomor plat                   : " + noPlat);
        System.out.println("Warna mobil                  : " + warna);
        System.out.printf("Kecepatan mobil              : %.2f m/s", kecepatan);
        System.out.println();
        hitungJarak();
        System.out.printf("Lama perjalanan              : %.2f jam", (waktu / 3600));
        System.out.println();
        System.out.printf("Jarak yang dapat ditempuh    : %.2f km", jarak);
        System.out.println();
        System.out.println("=================================================");
    }

}
