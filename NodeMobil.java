package Node;

public class NodeMobil {
    public int kode_mobil;
    public String merek_mobil;
    public int stok_mobil;

    public String warna_mobil;

    public NodeMobil(int kode_mobil, String merek_mobil, String warna_mobil) {
        this.kode_mobil = kode_mobil;
        this.merek_mobil = merek_mobil;
        this.warna_mobil = warna_mobil;
    }

    public void updateStok(int newStok){
        this.stok_mobil = this.stok_mobil + newStok;
    }

}