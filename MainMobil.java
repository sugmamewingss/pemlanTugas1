import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("       MOBIL MOBILAN");
        System.out.println("         by: alep");
        System.out.println();
        System.out.println("           MENU");
        System.out.println("===============================");
        // dibawah ini adalah proses instansiasi 1 object baru dari kelas Mobil
        // diletakkan diluar while agar dapat menyimpan masukan user nantinya
        Mobil m1 = new Mobil();
        m1.setKecepatan(20); // kecepatan awal mobil, 20km/jam
        m1.setManufaktur("Kijang recing"); // merk awal mobil
        m1.setNoPlat("UI 1231 UA"); // plat awal mobil
        m1.setWarna("Merah"); // warna awal mobil
        m1.setWaktu(1); // waktu yg ditempuh mobil selama perjalanan (satuan jam)
        while (true) { // perulangan, agar program dapat berjalan terus sampai user ingin keluar
            // OPSI MENU
            System.out.println("1. Informasi mobil");
            System.out.println("2. Atur informasi mobil");
            System.out.println("3. Keluar");
            System.out.print("System: ");
            int masukan = input.nextInt();
            // SWITCH-CASE, UNTUK MEMILIH OPSI PADA MENU
            switch (masukan) {
                case 1:
                    m1.displayMessage();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("System: Mau merubah apa?");
                    System.out.println("1. Merk mobil");
                    System.out.println("2. Nomor plat mobil");
                    System.out.println("3. Warna mobil");
                    System.out.println("4. Kecepatan mobil");
                    System.out.println("5. Waktu tempuh mobil jika ingin bepergian");
                    System.out.print("System: ");
                    int masukan2 = input.nextInt();
                    // SWTICH-CASE LAGI UNTUK OPSI MENU
                    switch (masukan2) {
                        case 1:
                            System.out.println("Mau ubah jadi merk apa?");
                            System.out.print("System: ");
                            String masukan3 = input.next();
                            m1.setManufaktur(masukan3); // memanggil ethod void (behavior) di kelas mobil untuk
                                                        // mengganti merk mobil berdasarkan masukan user
                            break;
                        case 2:
                            System.out.println("Berapa nomor plat mobilnya?");
                            System.out.print("System: ");
                            String masukan5 = input.next();
                            m1.setNoPlat(masukan5); // memanggil method void (behavior) di kelas mobil untuk merubah
                                                    // plat mobil berdasarkan masukan user
                            break;
                        case 3:
                            System.out.println("Mau warna apa nih mobilnya?");
                            System.out.print("System: ");
                            String masukan6 = input.next();
                            m1.setWarna(masukan6); // memanggil method void (behavior) di kelas mobil untuk merubah
                                                   // warna mobil berdasasrkan masukan user
                            break;
                        case 4:
                            System.out.println("Berapa kecepatan yang ingin kamu atur? (km/jam)");
                            System.out.print("System: ");
                            double masukan7 = input.nextDouble();
                            m1.setKecepatan(masukan7); // memanggil method void (behavior) di kelas mobil untuk merubah
                                                       // kecepatan mobil berdasasrkan masukan user
                            break;
                        case 5:
                            System.out.println("Berapa lama waktu yang ingin ditempuh mobil? (Satuan jam)");
                            System.out.print("System: ");
                            double masukan4 = input.nextDouble();
                            m1.setWaktu(masukan4); // memanggil method void (behavior) di kelas mobil untuk merubah
                                                   // waktu tempuh mobil berdasasrkan masukan user
                            break;
                        default:
                            System.out.println("System: Maaf, menu tidak tersedia"); // jika user memasukkan opsi selain
                                                                                     // yang ada di menu
                            break;
                    }
                    System.out.println();
                    System.out.println("SIP! Berikut beberapa perubahan dari mobil kamu");
                    System.out.println();
                    m1.displayMessage();
                    break;

                case 3:
                    System.out.println("Sampai Jumpa!");
                    return;
                default:
                    System.out.println("System: Maaf, menu tidak tersedia"); // jika user memasukkan opsi selain yang
                                                                             // ada di menu
                    break;
            }
            System.out.println();
            System.out.println("*SYSTEM MENGULANG KEMBALI");
            System.out.println();
        }
    }
}
