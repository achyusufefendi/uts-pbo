package View;

import Model.ModelMobil;
import Node.NodeMobil;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewMobil {
    public void cetakAllMobi(ArrayList<NodeMobil> mobil1){
        for (int i = 0; i<mobil1.size(); i++){
            System.out.println("kode mobil : "+mobil1.get(i).kode_mobil);
            System.out.println("merek mobil : "+mobil1.get(i).merek_mobil);
            System.out.println("warna mobil : "+mobil1.get(i).warna_mobil);
            System.out.println("stok mobil : "+mobil1.get(i).stok_mobil);
            System.out.println("-----------------------------------------------------");
        }
    }

    public void insertMobil(ModelMobil modelMobil){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan merek mobil : ");
        String merek = input.nextLine();
        System.out.println("masukkan warna mobil : ");
        String warna = input.nextLine();
        modelMobil.insertMobil(merek,warna);
    }

    public void cetakMobil(ModelMobil modelMobil){
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan merek mobil : ");
        String merek = input.nextLine();
        NodeMobil mobil = modelMobil.searchMobil(merek);
        if (mobil != null) {
            System.out.println("kode mobil : " + mobil.kode_mobil);
            System.out.println("merek mobil : " + mobil.merek_mobil);
            System.out.println("warna mobil : " + mobil.warna_mobil);
        }else{
            System.out.println("data merek tidak ditemukan");
        }
    }

    public void updateStokMobil(ModelMobil modelMobil){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan merek mobil : ");
        String merek = input.nextLine();
        System.out.println("stok mobil : ");
        int newstok = input.nextInt();
        modelMobil.updateStok(newstok,merek);
    }
}