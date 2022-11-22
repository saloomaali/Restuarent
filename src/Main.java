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

    int total = 0;


    public int generateBill(String name, long phnNo){
        this.name = name;
        this.phnNo = phnNo;
        total = this.tea * 10 + this.coffee * 15 + this.snacks * 10 + this.idli * 8 + this.dosa * 6;
        return total;


    }

}
public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();
        ;
        while (true) {
            System.out.println("select your items \n 1 - Tea-10 \n 2 - Coffee-15 \n 3 - Snacks-10 \n 4 - idli-8 \n " +
                    " 5 - dosa-6\n 6 - Generate Bill \n 7 - view all transaction \n 8 - exit");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();

            switch (n) {

                case 1:
                    System.out.println("Enter the count of tea");
                    int tea = input.nextInt();
                    c.tea = tea;
                    break;


                case 2:
                    System.out.println("Enter count of coffee");
                    int coffee = input.nextInt();
                    c.coffee = coffee;
                    break;

                case 3:
                    System.out.println("Enter count of snacks");
                    int snacks = input.nextInt();
                    c.snacks = snacks;
                    break;

                case 4:
                    System.out.println("Enter count of idli");
                    int idli = input.nextInt();
                    c.idli = idli;
                    break;

                case 5:
                    System.out.println("Enter count of dosa");
                    int dosa = input.nextInt();
                    c.dosa = dosa;
                    break;

                case 6:
                    Customer c = new Customer()
                    System.out.println("Generating the bill");
                    System.out.println("Enter name and phn Number");
                    String name = input.next();
                    long phnNo = input.nextLong();
                    System.out.println("name : " + name);
                    System.out.println("phnNo : " + phnNo);
                    System.out.println("Count of tea : " + c.tea + " total price for tea : " + c.tea * 10);
                    System.out.println("Count of Coffee : " + c.coffee + " total price for coffee : " + c.coffee * 15);
                    System.out.println("Count of snacks : " + c.snacks + " total price for snacks : " + c.snacks * 10);
                    System.out.println("Count of idli : " + c.idli + " total price for idli : " + c.idli * 8);
                    System.out.println("Count of dosa : " + c.dosa + " total price for dosa : " + c.dosa * 6);
                    System.out.println("total amount is " + c.generateBill(name,phnNo));

                    customers.add(c);
                    break;


                case 7:
                    System.out.println("viewing all the transactions");
                    for (Customer prs : customers) {
                        System.out.println("name : " + prs.name);
                        System.out.println("phnNo : " + prs.phnNo);
                        System.out.println("total amount is " + prs.generateBill(prs.name, prs.phnNo));
                    }
                    break;

                case 8:
                    System.out.println("you are exiting from the program");
                    System.exit(0);


            }
//            System.out.println("do you wish to continue? true / false");
//            ch = input.nextBoolean();
        }
    }
}