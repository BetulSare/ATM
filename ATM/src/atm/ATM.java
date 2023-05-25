package atm;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 1500;
        int select = 0;
        int price = 0;
        while (right > 0) {

            System.out.print("Please enter your username: ");
            userName = scan.next();
            System.out.print("Please enter your password: ");
            password = scan.next();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hi, Welcome to Kodluyoruz Bank.");
                System.out.println("Please choose a operation. ");
                System.out.println("1-Para yatırma\n"
                        + "2-Para Çekme\n"
                        + "3-Bakiye Sorgula\n"
                        + "4-Çıkış Yap");

                select = scan.nextInt();
                switch (select) {
                    case 1:
                        System.out.print("Amount of money to be deposited: ");
                        price = scan.nextInt();
                        balance += price;
                        break;

                    case 2:
                        System.out.print("Amount of money to be withdrawn: ");
                        price = scan.nextInt();
                        if (price > balance) {
                            System.out.println("Insufficient balance");
                        } else {
                            balance -= price;
                        }
                        System.out.println(price+" TL has been withdrawn from your account");
                        break;

                    case 3:
                        System.out.printf("Your balance is %s TL", balance);
                        break;

                    case 4:
                        System.out.println("See you again");
                        break;

                    default:
                        System.out.println("Your entered incorrectly.");
                        break;
                }
                break;

            } else {
                right--;
                System.out.println("You entered incorrectly.Try again..");
            }
        }
        
        if(right==0){
            System.out.println("Your account has been blocked");
        }else{
            System.out.printf("\nYour remaining right : %s",right);
        }
    }

}
