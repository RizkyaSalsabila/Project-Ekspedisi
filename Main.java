import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main (String[] args) {

        //Deklarasi Scanner
        Scanner input = new Scanner(System.in);

        //Deklarasi Variabel
        int pilihanMenu;

        //Variabel Menu Data Pengirim Barang (Case 1 dan Case 3)
        String namaPengirim, alamatPengirim, kotaPengirim, provinsiPengirim, noTelpPengirim;
        int kodePosPengirim;

         //Variabel Menu Data Penerima Barang (Case 2 dan Case 3)
         String namaPenerima, alamatPenerima, kotaPenerima, provinsiPenerima, noTelpPenerima;
         int kodePosPenerima;

        //Variabel Menu Jenis Pengiriman Barang (Case 3)
        String jenis1 = ""; 
        String jenis2 = ""; 
        String jenisPengiriman = "";
        int beratBarang;


        System.out.println("Selamat Datang  di Ekspedisi Pengiriman Barang (PUCAT)\n");
        
        //Pilihan menu yang akan dipilih
        System.out.println("(1) Data Pengirim Barang");
        System.out.println("(2) Data Penerima Barang");
        System.out.println("(3) Menu Jenis Pengiriman Barang");
        System.out.println("(4) Menu Petugas");

        //Masukkan pilihan menu yang tersedia
        System.out.println("\nSilahkan pilih salah satu dari menu di atas");
        pilihanMenu = Integer.parseInt(input.nextLine());

        switch (pilihanMenu) {
            case 1:
                //Menu Pengiriman Barang
                System.out.println("\nSELAMAT DATANG DI DATA PENGIRIM BARANG");
                System.out.println("--------------------------------------------------------------\n\n");

                System.out.print("Masukkan Nama Pengirim    : ");
                namaPengirim = input.nextLine();
                System.out.print("Masukkan Alamat Pengirim  : ");
                alamatPengirim = input.nextLine();
                System.out.print("Masukkan Kode Pos         : ");
                kodePosPengirim = Integer.parseInt(input.nextLine());
                System.out.print("Masukkan Kota             : ");
                kotaPengirim = input.nextLine();
                System.out.print("Masukkan Provinsi         : ");
                provinsiPengirim = input.nextLine();
                System.out.print("Masukkan Nomor Telepon    : ");
                noTelpPengirim = input.nextLine();

                System.out.println("\nDATA BERHASIL DITAMBAHKAN\n");
                //List Data Pengirim
                System.out.println("#Hasil Data Pengirim");
                System.out.println("Nama Pengirim   : " + namaPengirim);
                System.out.println("Alamat Pengirim : " + alamatPengirim);
                System.out.println("Kode Pos        : " + kodePosPengirim);
                System.out.println("Kota            : " + kotaPengirim);
                System.out.println("Provinsi        : " + provinsiPengirim);
                System.out.println("Nomor Telepon   : " + noTelpPengirim);
                break;
            case 2:
                //Menu DataPengiriman Barang
                System.out.println("\nSELAMAT DATANG DI DATA PENERIMA BARANG");
                System.out.println("--------------------------------------------------------------\n\n");

                System.out.print("Masukkan Nama Penerima    : ");
                namaPenerima = input.nextLine();
                System.out.print("Masukkan Alamat Penerima  : ");
                alamatPenerima = input.nextLine();
                System.out.print("Masukkan Kode Pos         : ");
                kodePosPenerima = Integer.parseInt(input.nextLine());
                System.out.print("Masukkan Kota/Kabupaten   : ");
                kotaPenerima = input.nextLine();
                System.out.print("Masukkan Provinsi         : ");
                provinsiPenerima = input.nextLine();
                System.out.print("Masukkan Nomor Telepon    : ");
                noTelpPenerima = input.nextLine();

                System.out.println("\nDATA BERHASIL DITAMBAHKAN\n");
                //List Data Pengirim
                System.out.println("#Hasil Data Penerima");
                System.out.println("Nama Penerima   : " + namaPenerima);
                System.out.println("Alamat Penerima : " + alamatPenerima);
                System.out.println("Kode Pos        : " + kodePosPenerima);
                System.out.println("Kota            : " + kotaPenerima);
                System.out.println("Provinsi        : " + provinsiPenerima);
                System.out.println("Nomor Telepon   : " + noTelpPenerima);
                break;
            case 3:
                //Menu Jenis Pengiriman Barang
                System.out.println("\nSELAMAT DATANG DI MENU JENIS PENGIRIMAN BARANG");
                System.out.println("--------------------------------------------------------------\n\n");
                
                System.out.print("Masukkan Nama Pengirim    : ");
                namaPengirim = input.nextLine();
                System.out.print("Masukkan Kota             : ");
                kotaPengirim = input.nextLine();
                System.out.print("Masukkan Provinsi         : ");
                provinsiPengirim = input.nextLine();
                System.out.print("Masukkan Nama Penerima    : ");
                namaPenerima = input.nextLine();
                System.out.print("Masukkan Kota/Kabupaten   : ");
                kotaPenerima = input.nextLine();
                System.out.print("Masukkan Provinsi         : ");
                provinsiPenerima = input.nextLine();
                System.out.print("Masukkan Berat Barang     : ");
                beratBarang = input.nextInt();
                System.out.println(jenisPengiriman);

                if (kotaPengirim.equalsIgnoreCase(kotaPenerima) && provinsiPengirim.equalsIgnoreCase(provinsiPenerima)) {
                    jenis1 = "Via Darat, ";
                    if(beratBarang >= 40) {
                        jenis2 = "jenis Full Truck Load / FTL";
                    } else {
                        jenis2 = "jenis Less Than Load / LTL";
                    }
                } else if (provinsiPengirim.equalsIgnoreCase(provinsiPenerima)) {
                    jenis1 = "Via Laut, ";
                    if(beratBarang >= 1000 ) {
                        jenis2 = "jenis Full Truck Load / FTL";
                    } else {
                        jenis2 = "jenis Less Than Load / LTL";
                    } 
                } else {
                    jenis1 = "Via Udara";
                }
                jenisPengiriman = jenis1 + jenis2;

                System.out.println("\nDATA BERHASIL DITAMBAHKAN\n");
                //List Jenis Pengiriman Barang
                System.out.println("#List Jenis Pengiriman Barang");
                System.out.println("Nama Pengirim      : " + namaPengirim);
                System.out.println("Kota Pengirim      : " + kotaPengirim);
                System.out.println("Provinsi Pengirim  : " + provinsiPengirim);
                System.out.println("Nama Penerima      : " + namaPenerima);
                System.out.println("Kota Penerima      : " + kotaPenerima);
                System.out.println("Provinsi Penerima  : " + provinsiPenerima);
                System.out.println("Pengiriman barang Anda akan dikirim dengan " + jenisPengiriman);
                break;
            case 4:
                //Menu Petugas
                break;
            default:
            System.out.println("Input yang Anda masukkan salah");
            System.out.println("Silahkan isi input sesuai pilihan menu yang tersedia");    
        }
    input.close();
    }
}
