package B;

public class HondaJazz extends Car{
    String warna;

    public HondaJazz(int kapasitas_tangki, String transmisi, String jumlah_CC, int tahun_pembuatan, String warna) {
        super(kapasitas_tangki, transmisi, jumlah_CC, tahun_pembuatan);
        this.warna=warna;
    }

    public void gas(){
        System.out.println("Honda Jazz bergerak maju");
    }

    public void belok(){
        System.out.println("Honda Jazz berbelok");
    }

    public void rem(){
        System.out.println("Honda Jazz berhenti");
    }

    public void description(){
        System.out.println("Jumlah roda: "+jumlah_roda);
        System.out.println("Kapasitas tangki: "+kapasitas_tangki);
        System.out.println("Transmisi: "+transmisi);
        System.out.println("Jumlah CC: "+jumlah_CC);
        System.out.println("Tahun pembuatan: "+tahun_pembuatan);
        System.out.println("Warna: "+warna);
    }
}
