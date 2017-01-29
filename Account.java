//author Adam Varco
import javax.swing.JOptionPane;


public class Account {

	
	private int id;
	private double balance;
	//private double annualInterestRate;
	//private double 
	
	
	//sets up an empty constructor
	public Account()
	{
		
		balance = 100;
	}
	// this sets up id to be an int and balance to be a double
	public Account(int id, double balance) 
	{
		this.id = id;
		this.balance = balance;
		
	}

//gets and returns an ID
   public int getId() 
   {
	   return id;
	   //JLabel and test field
	 
    }
//sets the ID to what the user types
   public void setId(int id) 
    {
   this.id = id;
    }
//gets and returns the balance
   public double getBalance() 
   {
	return balance;
	//button
    }
   //sets the balance
   public void setBalance(double balance) 
    {
	
    	if (balance < 0) 
	{
		//Validation.reportError("cannot be a negative value");
		//return;
		JOptionPane.showMessageDialog(null, "cannot be a negative value");
		//return;
		//IllegalArgumentException b=
		//throw new InsufficientFundsExcepion("Cannnot be less than or equal to zero");
		//throw b;
		}
	
    	
	
	this.balance = balance;
}



//method to withdraw from the balance
    public void withdraw(double w) throws InsuficientFundsException, IllegalArgumentException{ 
    
   
    	if (w > balance) {
    		throw new InsuficientFundsException("Cannot be greater than the balance");
  //
    	}
    
    	else if (w <= 0) {
		
		//Validation.reportError("cannot be a negative value");
		//return;
	  throw new IllegalArgumentException("Cannot be less than or equal to zero");
  }
   else{
    
		this.balance = balance - w;
	}
    }
   

//sets up a method to deposit to the balance
    public void deposit(double d) throws IllegalArgumentException{
	if (d <0) {
		///Validation.reportError("cannot be a negative value");
		//return;
		//JOptionPane.showMessageDialog(null, "cannot be a negative value");
		//return;
		//IllegalArgumentException d1=
			//new IllegalArgumentException("Cannnot be a negative value");
		//throw d1;
		
		throw new IllegalArgumentException("cannot be less than 0");
		}

        this.balance = balance + d;
}
}





