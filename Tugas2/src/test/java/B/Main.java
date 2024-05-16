package B;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HondaJazz Jazz=new HondaJazz(5, "Matic", "1500CC", 2014, "Kuning");
        ToyotaFortuner Fortuner=new ToyotaFortuner(7, "Manual", "2500CC", 2019, "Hitam");
        SuzukiKatana Katana=new SuzukiKatana(6, "Manual", "2350CC", 2001, "Hijau");

        while(true){
            System.out.println("1. Honda Jazz");
            System.out.println("2. Toyota Fortuner");
            System.out.println("3. Suzuki Katana");
            System.out.println("4. Exit");
            System.out.print("Pilih mobil: ");
            int choice=scanner.nextInt();
            System.out.println("====================================================");

            if (choice == 1){
                while(true) {
                    System.out.println("Honda Jazz");
                    Jazz.description();
                    System.out.println("1. Gas");
                    System.out.println("2. Belok");
                    System.out.println("3. Berhenti");
                    System.out.println("4. Back");
                    System.out.print("Pilih aksi: ");
                    int aksi = scanner.nextInt();

                    if (aksi == 1) {
                        Jazz.gas();
                    } else if (aksi == 2) {
                        Jazz.belok();
                    } else if (aksi == 3) {
                        Jazz.rem();
                    } else if (aksi == 4) {
                        break;
                    }
                    System.out.println("====================================================");
                }
            }else if (choice == 2){
                while(true) {
                    System.out.println("Toyota Fortuner");
                    Fortuner.description();
                    System.out.println("1. Gas");
                    System.out.println("2. Belok");
                    System.out.println("3. Berhenti");
                    System.out.println("4. Back");
                    System.out.print("Pilih aksi: ");
                    int aksi = scanner.nextInt();

                    if (aksi == 1) {
                        Fortuner.gas();
                    } else if (aksi == 2) {
                        Fortuner.belok();
                    } else if (aksi == 3) {
                        Fortuner.rem();
                    } else if (aksi == 4) {
                        break;
                    }
                    System.out.println("====================================================");
                }
            }else if (choice == 3){
                while(true) {
                    System.out.println("Suzuki Katana");
                    Katana.description();
                    System.out.println("1. Gas");
                    System.out.println("2. Belok");
                    System.out.println("3. Berhenti");
                    System.out.println("4. Back");
                    System.out.print("Pilih aksi: ");
                    int aksi = scanner.nextInt();

                    if (aksi == 1) {
                        Katana.gas();
                    } else if (aksi == 2) {
                        Katana.belok();
                    } else if (aksi == 3) {
                        Katana.rem();
                    } else if (aksi == 4) {
                        break;
                    }
                    System.out.println("====================================================");
                }
            }
        }
    }
}
