package Model;

import Node.NodeMobil;

import java.util.ArrayList;

public class ModelMobil {
    public ArrayList<NodeMobil> mobil1;
    private int kode_update = -1;
    public ModelMobil(){
        this.mobil1 = new ArrayList<>();
    }

    public void insertMobil(String merek, String warna_mobil){
        this.kode_update++;
        this.mobil1.add(new NodeMobil(this.kode_update, merek, warna_mobil));
    }

    public ArrayList<NodeMobil> viewMobil(){
        return mobil1;
    }

    public void updateStok(int newstok, String merek){
        NodeMobil mobil = searchMobil(merek);
        mobil.updateStok(newstok);
    }

    public NodeMobil searchMobil(String merek){
        NodeMobil mobil = null;
        for (int i = 0; i<mobil1.size(); i++){
            if (merek.equals(mobil1.get(i).merek_mobil)){
                mobil = mobil1.get(i);
            }
        }
        return mobil;
    }

}