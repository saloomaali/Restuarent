import java.util.ArrayList;
import java.util.Scanner;
class Customer{
    String name;
    long phnNo;
    int tea = 0;
    int coffee = 0;
    int snacks = 0;
    int idli = 0;
    int dosa = 0;

    public void ctea(int tea){

        this.tea = tea * 10;
    }
    public void ccoffee(int coffee){

        this.coffee = coffee * 15;
    }
    public void csnacks(int snacks){

        this.snacks = snacks * 10;
    }
    public void cidli(int idli){

        this.idli = idli * 8;
    }
    public void cdosa(int dosa){

        this.dosa = dosa * 8;
    }

}
public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();
        System.out.println("enter customer name and phn number");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        long phnNo = input.nextLong();

        Customer c = new Customer();


        while(true){
            System.out.println("select your items \n 1 - Tea-10 \n 2 - Coffee-15 \n 3 - Snacks-10 \n 4 - idli-8 \n " +
                    " 5 - dosa-6\n 6 - Generate Bill \n 7 - view all transaction \n 8 - exit");
            int n = input.nextInt();

            switch (n){

                case 1 :
                    System.out.println("Enter the count of tea");
                    int tea = input.nextInt();
                    c.tea = tea;


                case 2 :
                    System.out.println("Enter count of coffee");
                    int coffee = input.nextInt();
                    c.coffee = coffee;

                case 3 :
                    System.out.println("Enter count of snacks");
                    int snacks = input.nextInt();
                    c.snacks = snacks;

                case 4 :
                    System.out.println("Enter count of idli");
                    int idli = input.nextInt();
                    c.idli = idli;

                case 5 :
                    System.out.println("Enter count of dosa");
                    int dosa = input.nextInt();
                    c.dosa = dosa;

            }
        }
    }
}