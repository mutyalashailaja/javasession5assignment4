package methodoverriding;

public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b1=new sbibank();
		b1.getRateOfInterest();
		
		b1=new Icici();
		b1.getRateOfInterest();
		
		b1=new Axis();
		b1.getRateOfInterest();

	}

}
