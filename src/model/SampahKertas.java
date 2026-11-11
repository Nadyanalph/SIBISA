package model;

public class SampahKertas extends JenisSampah {
    private final double potonganKadarAir; // 0.10 berarti dipotong 10 persen

    public SampahKertas(String kodeJenis, String nama, long hargaPerKg,
                        double potonganKadarAir) {
        super(kodeJenis, nama, hargaPerKg);
        this.potonganKadarAir = potonganKadarAir;
    }

    @Override
    public long hitungNilai(double beratKg) {
        double beratBersih = beratKg * (1 - potonganKadarAir);
        return Math.round(hargaPerKg * beratBersih);
    }

    @Override
    public String deskripsi() {
        return super.deskripsi() + " potongan " + (int) (potonganKadarAir * 100) + "%";
    }
}