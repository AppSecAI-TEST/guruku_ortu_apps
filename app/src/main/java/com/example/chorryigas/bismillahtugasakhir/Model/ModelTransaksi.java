package com.example.chorryigas.bismillahtugasakhir.Model;

/**
 * Created by Choy on 8/6/2017.
 */

public class ModelTransaksi {
    public int id;
    public int id_lowongan;
    public String status;
    public String id_user;
    public String id_guru;

    public ModelTransaksi(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_lowongan() {
        return id_lowongan;
    }

    public void setId_lowongan(int id_lowongan) {
        this.id_lowongan = id_lowongan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getId_guru() {
        return id_guru;
    }

    public void setId_guru(String id_guru) {
        this.id_guru = id_guru;
    }
}
