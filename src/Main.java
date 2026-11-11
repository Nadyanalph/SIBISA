import model.*;

public class Main {
    public static void main(String[] args) {
        JenisSampah pet = new SampahPlastik("PL-001", "Botol PET", 3000);
        JenisSampah kardus = new SampahKertas("KR-001", "Kardus", 2000, 0.10);
        JenisSampah alum = new SampahLogam("LG-001", "Aluminium", 8000);

        cetak(pet, 5);
        cetak(kardus, 10);
        cetak(alum, 12);
    }

    private static void cetak(JenisSampah jenis, double beratKg) {
        System.out.println(jenis.deskripsi() + " | " + beratKg
                + " kg = Rp" + jenis.hitungNilai(beratKg));
    }
}