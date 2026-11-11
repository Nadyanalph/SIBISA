package model;

public class SampahLogam extends JenisSampah {
    private static final double AMBANG_BONUS_KG = 10;
    private static final long BONUS_PER_KG = 500;

    public SampahLogam(String kodeJenis, String nama, long hargaPerKg) {
        super(kodeJenis, nama, hargaPerKg);
    }

    @Override
    public long hitungNilai(double beratKg) {
        long nilai = Math.round(hargaPerKg * beratKg);
        if (beratKg > AMBANG_BONUS_KG) {
            nilai += Math.round((beratKg - AMBANG_BONUS_KG) * BONUS_PER_KG);
        }
        return nilai;
    }
}