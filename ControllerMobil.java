package Controller;

import Model.ModelMobil;
import View.ViewMobil;

public class ControllerMobil {
    ModelMobil modelMobil;
    ViewMobil viewMobil;

    public ControllerMobil(ModelMobil modelMobil, ViewMobil viewMobil) {
        this.modelMobil = modelMobil;
        this.viewMobil = viewMobil;
    }

    public void viewAllMobil(){
        viewMobil.cetakAllMobi(modelMobil.viewMobil());
    }

    public void insertMobil(){
        viewMobil.insertMobil(modelMobil);
    }

    public void setViewMobil(){
        viewMobil.cetakMobil(modelMobil);
    }

    public void updateStoMobil(){
        viewMobil.updateStokMobil(modelMobil);
    }

    public void viewMobil() {
    }
}