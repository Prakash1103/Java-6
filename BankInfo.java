package miss;

public class BankInfo {
	public void saving() {
		System.out.println("Savings amount  is RS 1000");
	}
	public void fixed() {
		System.out.println("Fixed amount is RS 10000 ");
	}
	public void deposit() {
		System.out.println("deposit amount is RS 20000"); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo info=new BankInfo();
		info.saving();
		info.fixed();
		info.deposit();

	}

}
