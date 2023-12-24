import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


 class  BankAccount implements Comparable <BankAccount>{

    private int accountNo ;
    private String holderName ;
    private double balance ;

    public BankAccount (int accountNo ,String holderName , double balance ){
        this.accountNo=accountNo;
        this.holderName=holderName;
        this.balance=balance;
    }


    public double balanceChange(double amount ){

        this.balance-=amount;
        return this.balance;
    }

    @Override
    public int compareTo(BankAccount other) {
        return this.holderName.compareTo(other.holderName);
    }


    @Override
    public String toString() {
        return "BankAccount{" + "accountNo=" + accountNo + ", holderName=" + holderName + ", balance=" + balance + '}';
    }

}

public class Main {

    public static void main(String[] args) {
        List <BankAccount> myArrays=new ArrayList<>();
        BankAccount a1 = new BankAccount(1,"Mohanad",2000);
        BankAccount a2 = new BankAccount(2,"khalid",3000);
        BankAccount a3 = new BankAccount(3,"hamza",9999);
        BankAccount a4 = new BankAccount(4,"Ali",5000);

        myArrays.add(a1);
        myArrays.add(a2);
        myArrays.add(a3);
        myArrays.add(a4);

        Collections.sort(myArrays);

        for(BankAccount a:myArrays){

            a.balanceChange(500d);
        }
        ListIterator ptr =myArrays.listIterator();

        while(ptr.hasNext()){
            System.out.println(ptr.next());
        }
    }
}