package model;

public class SampahPlastik extends JenisSampah {

    public SampahPlastik(String kodeJenis, String nama, long hargaPerKg) {
        super(kodeJenis, nama, hargaPerKg);
    }

    @Override
    public long hitungNilai(double beratKg) {
        return Math.round(hargaPerKg * beratKg);
    }
}