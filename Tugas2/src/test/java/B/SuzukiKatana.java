package B;

public class SuzukiKatana extends Car{
    String warna;

    public SuzukiKatana(int kapasitas_tangki, String transmisi, String jumlah_CC, int tahun_pembuatan, String warna){
        super(kapasitas_tangki, transmisi, jumlah_CC, tahun_pembuatan);
        this.warna=warna;
    }

    public void gas(){
        System.out.println("Suzuki Katana bergerak maju");
    }

    public void belok(){
        System.out.println("Suzuki Katana berbelok");
    }

    public void rem(){
        System.out.println("Suzuki Katana berhenti");
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
