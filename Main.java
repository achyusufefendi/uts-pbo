import Controller.ControllerMobil;
import Database.AllModel;
import View.ViewMobil;

import java.util.Scanner;

public class Main {

    static void insertStaticMobil() {
        AllModel.mobil1.insertMobil("Avanza", "hitam");
        AllModel.mobil1.insertMobil("Avanza", "putih");
    }

    static void menu_utama() {
        Scanner input = new Scanner(System.in);
        ViewMobil viewMobil = new ViewMobil();
        ControllerMobil controlMobil = new ControllerMobil(AllModel.mobil1, viewMobil);
        System.out.println("PROGRAM PERSEWAAN MOBIL");
        System.out.println();

        int pil_menuUtama = 0;
        while (pil_menuUtama != 6) {
            System.out.println("Menu Utama");
            System.out.println("1. Manajemen Mobil");
            System.out.println("2. Manajemen Pegawai");
            System.out.println("3. Manajemen Anggota");
            System.out.println("4. Transaksi Peminjaman");
            System.out.println("5. Transaksi Pengembalian");
            System.out.println("6. EXIT");
            System.out.println();
            System.out.println("masukkan pilihan anda : ");
            pil_menuUtama = input.nextInt();
            switch (pil_menuUtama) {
                case 1:
                    int pil_menuMobil = 0;
                    while (pil_menuMobil != 7) {
                        System.out.println("anda masuk pilihan menu Manajemen Mobil");
                        System.out.println("");
                        System.out.println("1. Cetak semua daftar mobil");
                        System.out.println("2. Tambah mobil");
                        System.out.println("3. Update stok mobil");
                        System.out.println("4. Update data mobil");
                        System.out.println("5. Delete mobil");
                        System.out.println("6. Pencarian mobil");
                        System.out.println("7. Kembali ke Menu Utama");
                        System.out.println("masukkan pilihan : ");
                        pil_menuMobil = input.nextInt();
                        switch (pil_menuMobil) {
                            case 1:
                                System.out.println(" daftar mobil ");
                                controlMobil.viewAllMobil();
                                break;
                            case 2:
                                System.out.println(" tambah mobil ");
                                controlMobil.insertMobil();
                                break;
                            case 3:
                                System.out.println(" update stok mobil ");
                                controlMobil.updateStoMobil();
                                break;
                            case 4:
                                System.out.println(" update data mobil ");
                                break;
                            case 5:
                                System.out.println(" delete mobil ");
                                break;
                            case 6:
                                System.out.println(" pencarian mobil ");
                                controlMobil.viewMobil();
                                break;
                            case 7:
                                System.out.println(" kembali ke Menu Utama ");
                                break;
                            default:
                                System.out.println("Pilihan tidak ada!!");
                        }
                    }
                    break;
                case 2:
                    System.out.println("anda masuk pilihan menu Manajemen Pegawai");
                    break;
                case 3:
                    System.out.println("anda masuk pilihan menu Manajemen Anggota");
                    break;
                case 4:
                    System.out.println("anda masuk pilihan menu Transaksi Peminjaman");
                    break;
                case 5:
                    System.out.println("anda masuk pilihan menu Transaksi Pengembalian");
                    break;
                case 6:
                    System.out.println("- EXIT -");
                    break;
                default:
                    System.out.println("Pilihan tidak ada!!");
            }
        }
    }

    public static void main(String[] args) {
        insertStaticMobil();
        menu_utama();
    }
}
