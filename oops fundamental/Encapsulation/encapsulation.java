class BankAccount{
    private  String accountHolder;
    private  double balance = 0.0;

    public void setAccountHolder(){
        
    }
    public void deposit(double amount){

        if(amount<=0){
            return IlegalArgumentException("Enter valid amount");
        }
        this.balance+=amount; 
    }
    public void withdraw(double amount){
       if(amount<=0||amount>this.balance){
            return IlegalArgumentException("Enter valid amount");
        }
        this.balance-=amount;
    }
    public double getbalance(){
        return this.balance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
}

//We have exposed deposit,withdraw,getbalance,getAccountHolder without giving direct access to actual data