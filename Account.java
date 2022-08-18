public class Account
{
    int ano;
    String name;
    long balance;
    public Account()
    {
        ano=101;
        name="abc";
        balance=200000000;
    }
    public Account(int a,String n,long b)
    {
        ano=a;
        name=n;
        balance=b;
    }
    public String toString()
    {
        return "Account number ="+ano+"\nName ="+name+"\nBalance"+balance;
    }
    public void display()
    {
        System.out.println("Account number ="+ano+"\nName ="+name+"\nBalance"+balance);
    }
    public void addBalnce()
    {
        int add=100;
        balance=balance+add;
        System.out.println("After adding balance ="+balance);
    }
    public void withdrawBal()
    {
        int amt=500;
        if(balance>=amt)
        {
            balance=balance-amt;
            System.out.println("After Withdraw balance ="+balance);
        }
        else
        {
            System.out.println("Insufficient Amount");
        }
    }
    public static void main(String[] args) {
        System.out.println("\tAccount Details");
        System.out.println();
        Account a = new Account();
        a.display();
        System.out.println(a);
        Account a2 = new Account(102,"aman",500);
        a2.display();
        a2.addBalnce();
        //a2.display();
        a2.withdrawBal();
    }
}
