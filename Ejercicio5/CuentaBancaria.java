public class CuentaBancaria {

    int numberAcount;
    String owner;
    double balance;

    public CuentaBancaria( int numberAcount,String owner,int balance)
    {
        this.numberAcount= numberAcount;
        this.owner=owner;
        this.balance=0;
    }

    public void depositar(double moneytodeposit)
    {
        if (moneytodeposit<0)
        {
            System.out.println("you can't deposit a negative number");
        }
        else
        {
            balance+=moneytodeposit;

        }
        System.out.println("your money has been added it to your account:"+ this.owner);
    }

    public  void checkout(double moneytake)
    {
        if (moneytake > 0  && moneytake <balance)
        {
            balance-=moneytake;
            System.out.println("your have took"+ moneytake +"from your account, Have a wonderful day.");

        }
        else if (moneytake>balance)
        {
            System.out.println("you don't have enough money to take");
        }
        else
        {
            System.out.println("The amount to take must be higher than zero");
        }


    }
    public double balanceTotal()
    {
        return balance;
    }

}
