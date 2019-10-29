package com.example.tugaspraktikum3;

class Hewan {
    private String nama, jenis, pemakan;

    public Hewan(String nama, String jenis, String pemakan) {
        this.nama = nama;
        this.jenis = jenis;
        this.pemakan = pemakan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getPemakan() {
        return pemakan;
    }

    public void setPemakan(String pemakan) {
        this.pemakan = pemakan;
    }

}
