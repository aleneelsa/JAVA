import java.util.Scanner;
class MultiplicationTable{
	public synchronized. void printTable(int number){
		for(int i=1;i<=10;i++) {
			System.out.println(number+"x"+i+"="+i*number);
		}
		System.out.println(" ");
	}
}

class MyThread1 extends Thread{
	MultiplicationTable t=new MultiplicationTable();
	int num;
	MyThread1(int num,MultiplicationTable t){
		this.num=num;
		this.t=t;			
	}
	public void run() {
		t.printTable(num);
		
	}
}




class MyThread2 extends Thread{
	MultiplicationTable t=new MultiplicationTable();
	int num;
	MyThread2(int num,MultiplicationTable t){
		this.num=num;
		this.t=t;			
	}
	public void run() {
		t.printTable(num);
		
	}
}




class MyThread3 extends Thread{
	MultiplicationTable t=new MultiplicationTable();
	int num;
	MyThread3(int num,MultiplicationTable t){
		this.num=num;
		this.t=t;			
	}
	public void run() {
		t.printTable(num);
		
	}
}





public class MultiThread {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table you want to run by Thread1 :");
		int n=sc.nextInt();
		System.out.println("Enter the table you want to run by Thread2 :");
		int n2=sc.nextInt();
		System.out.println("Enter the table you want to run by Thread3 :");
		int n3=sc.nextInt();
		MultiplicationTable m=new MultiplicationTable();
		MyThread1 t=new MyThread1(n,m);
		t.start()	;
		MyThread2 t2=new MyThread2(n2,m);
		t2.start()	;
		MyThread3 t3=new MyThread3(n3,m);
		t3.start()	;
		sc.close();
		
		}

}
