package chapter11.hspedu.homework;

public class homework02 {
	public static void main(String[] args) {
		System.out.println(Frock.getNextNum());
		System.out.println(Frock.getNextNum());
		Frock frock = new Frock();
		Frock frock2 = new Frock();
		Frock frock3 = new Frock();
		System.out.println(frock.getSerialNumber());
		System.out.println(frock2.getSerialNumber());
		System.out.println(frock3.getSerialNumber());
	}
}	
class Frock{
	private static int currentNum = 100000;
	public static int getNextNum() {
		currentNum += 100;//将currentNum增加100
		return currentNum;
		
	}
	private  int serialNumber ;
	
	public Frock() {
		serialNumber = getNextNum();
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	
	
}

class TestFrock{
	
}