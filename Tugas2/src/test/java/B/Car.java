package B;

public class Car extends Vehicle{
    int kapasitas_tangki;
    String transmisi;
    String jumlah_CC;
    int tahun_pembuatan;

    public Car(int kapasitas_tangki, String transmisi, String jumlah_CC, int tahun_pembuatan) {
        jumlah_roda=4;
        this.kapasitas_tangki=kapasitas_tangki;
        this.transmisi=transmisi;
        this.jumlah_CC=jumlah_CC;
        this.tahun_pembuatan=tahun_pembuatan;
    }

    public void gas(){
        System.out.println("mobil bergerak maju");
    }

    public void belok(){
        System.out.println("mobil berbelok");
    }

    public void rem(){
        System.out.println("mobil berhenti");
    }
}
