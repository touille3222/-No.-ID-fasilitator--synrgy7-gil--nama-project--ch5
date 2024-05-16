import java.util.Scanner;

public class ParkingCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float harga_parkir;

        System.out.print("Masukkan jumlah jam parkir : ");
        int jumlah_jam = scanner.nextInt();

        if (jumlah_jam<24){
            harga_parkir = limaJam(jumlah_jam);
            System.out.println("$"+harga_parkir);
        }else{
            harga_parkir = duaEmpatJam(jumlah_jam);
            System.out.println("$"+harga_parkir);
        }
    }

    public static float limaJam(int jumlah_jam){
        float harga_parkir;
        int sisa_jam;

        if (jumlah_jam>5){
            sisa_jam = jumlah_jam-5;
            harga_parkir = (float) (1+(sisa_jam*0.5));
        }else{
            harga_parkir = (float) 1;
        }
        return harga_parkir;
    }

    public static float duaEmpatJam(int jumlah_jam){
        float harga_parkir;
        int sisa_jam;

        if (jumlah_jam>24){
            sisa_jam = jumlah_jam-24;
            harga_parkir = (float) (15+(sisa_jam*0.5));
        }else{
            harga_parkir = (float) 15;
        }
        return harga_parkir;
    }

}