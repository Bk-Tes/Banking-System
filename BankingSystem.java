import java.util.Scanner;
public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 1000;
while(true) {
    System.out.println("Welcome to our International bank");
    System.out.println("******************");
    System.out.println("choice the opertion from 1-4 ");
    System.out.println("1 deposit");
    System.out.println("2 withdraw");
    System.out.println("3 check balance");
    System.out.println("4 exit");
    System.out.println("******************");
    int answer = scanner.nextInt();



    if (answer == 1) {
        System.out.println("enter the amount you want to deposit");
        Double deposit = scanner.nextDouble();
        total = total1(total, deposit);

        System.out.println("your amount is " + total);


    } else if (answer == 2) {

        System.out.println("enter the amount you want to withdraw");
        Double withdraw = scanner.nextDouble();
        if(withdraw>total){
            System.out.println("you have insufficient balance");
        }
        else{

            total = total2(total, withdraw);

        System.out.println("your amount is"+ total);

    }}
else if (answer == 3) {

        System.out.println("your amount is" + total);
    } else if (answer == 4) {


        System.out.println("thank you for banking with us");

}
else{
            System.out.println("invalid input");
        }}}

        static Double total1(Double total,Double deposit ){
            return total+=deposit;
        }
        static Double total2(Double total,Double withdraw  ){
            return total-=withdraw;
    }
}
