package model;

public abstract class JenisSampah {
    protected String kodeJenis;
    protected String nama;
    protected long hargaPerKg;

    public JenisSampah(String kodeJenis, String nama, long hargaPerKg) {
        this.kodeJenis = kodeJenis;
        this.nama = nama;
        this.hargaPerKg = hargaPerKg;
    }

    // kontrak: setiap jenis wajib menentukan cara menghitung nilainya sendiri
    public abstract long hitungNilai(double beratKg);

    public String deskripsi() {
        return kodeJenis + " - " + nama + " (Rp" + hargaPerKg + "/kg)";
    }

    public String getKodeJenis() { return kodeJenis; }
    public String getNama() { return nama; }
    public long getHargaPerKg() { return hargaPerKg; }
}