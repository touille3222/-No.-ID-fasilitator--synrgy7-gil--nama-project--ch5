package A;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        BankAccount akun1=new BankAccount("001", "Gilang Zhanuardy Pamungkas", "wush3222@gmail.com", "085156811350", 100000);
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Balance: "+akun1.getBalance());
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw Balance");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println("====================================================");

            if(choice == 1){
                System.out.print("Enter amount to deposit: ");
                int amount = scanner.nextInt();
                akun1.deposit(amount);
                System.out.println("====================================================");
            }else if(choice == 2){
                System.out.print("Enter amount to withdraw: ");
                int amount = scanner.nextInt();
                if (amount <= akun1.getBalance()){
                    akun1.withdraw(amount);
                }else{
                    System.out.println("Saldo anda tidak mencukupi");
                    System.out.println("you don't have enough balance to withdraw");
                }
                System.out.println("====================================================");
            }else if(choice == 3){
                System.exit(0);
            }
        }
    }
}
