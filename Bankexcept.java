   import java.util.Scanner;
	class  InvalidAmountException extends Exception{
	InvalidAmountException(String str){
	super(str);
	}
	}
	class InsufficentFundsException extends Exception{
	InsufficentFundsException(String str){
	super(str);
	}
	}
	public class Bankexcept{
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	InvalidAmountException  amountException=new  InvalidAmountException("Invalid Amount");
	InsufficentFundsException fundsException=new InsufficentFundsException("Invalid Fund");
	int choice;
	System.out.println("Enter the Number of Customers:");
	int noOfCustomer=sc.nextInt();
	Customer [] customer=new Customer[noOfCustomer];
	for(int i=0;i<noOfCustomer;i++) {
	customer[i]=new Customer();
	customer[i].getCustomerdetails();
	}
	do {
	System.out.println("1.Display  Account details");
	System.out.println("2.Search by account number");
	System.out.println("3.Deposit the amount");
	System.out.println("4.Withdraw the amount");
	System.out.println("5.Exit ");
	System.out.println("Enter your choice");
	   choice=sc.nextInt();
	switch(choice) {
	case 1:
	for(int i=0;i<noOfCustomer;i++) {
	customer[i].printCustomerdetails();
	}
	break;
	case 2:
	System.out.println("Enter the Account Number:");
	long searchAccount=sc.nextLong();
	for(int i=0;i<noOfCustomer;i++) {
	if(customer[i].accountNumber==searchAccount) {
	customer[i]. printCustomerdetails();
	}
	}
	break;
	case 3:
	System.out.println("Enter the Account Number:");
	searchAccount=sc.nextLong();
	try {
	System.out.println("Enter the amount to deposite:");
	int depositeAmount=sc.nextInt();
	if(depositeAmount<0) {
	throw amountException;
	}
	else {
	for(int i=0;i<noOfCustomer;i++) {
	if(customer[i].accountNumber==searchAccount) {
	customer[i].accountBalance=customer[i].accountBalance+depositeAmount;
	customer[i].printCustomerdetails();
	}
	}
	 }
	}
	catch( InvalidAmountException e) {
	System.out.println(e.getMessage());
	}
	break;
	case 4:
	System.out.println("Enter the Account Number:");
	searchAccount=sc.nextLong();
	try {
	System.out.println("Enter the amount to Withedraw:");
	int withdrawAmount=sc.nextInt();
	if(withdrawAmount<=0) {
	throw amountException;
	}
	else {
	for(int i=0;i<noOfCustomer;i++) {
	if(customer[i].accountNumber==searchAccount) {
	if(withdrawAmount>customer[i].accountBalance) {
	throw fundsException;
	}
	else {
	customer[i].accountBalance=customer[i].accountBalance;
	customer[i].accountBalance=customer[i].accountBalance-withdrawAmount;
	customer[i].printCustomerdetails();
	}
	}
	}
	}
	}
	catch(InvalidAmountException e) {
	System.out.println(e.getMessage());
	}
	catch(InsufficentFundsException e) {
	System.out.println(e.getMessage());
	}
	break;
	}
	}
	while(choice<5);
	}
	}
	class Customer{
	Scanner sc=new Scanner(System.in);
	long accountNumber;
	String accountType;
	String customerName;
	int accountBalance;
	public void getCustomerdetails() {
	System.out.println("Enter the Account Number:");
	accountNumber=sc.nextLong();
	System.out.println("Enter the Account Type");
	accountType=sc.next();
	System.out.println("Enter the name:");sc.nextLine();
	customerName=sc.nextLine();
	System.out.println("Enter the Account Balance:");
	accountBalance=sc.nextInt();
	}
	public void printCustomerdetails() {
	System.out.println("_________________________________");
	System.out.println("Customer Details are:");
	System.out.println("Account Number:"+accountNumber);
	System.out.println("Account Type:"+accountType);
	System.out.println("Customer Name:"+customerName);
	System.out.println("Acoount Balance:"+accountBalance);
	System.out.println("_________________________________");
	}
	}

