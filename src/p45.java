
public class p45 {
public static void main (String [] args) {
	System.out.println("�ŧicar1");
	Car45 car1;
	car1 = new Car45();
	car1.setCar(1234,20.5);	
	System.out.println("�ŧicar2");
	Car45 car2;	
	System.out.println("�Ncar1���w��car2");
	car2 =  car1;	
	System.out.println("car1��");
	car1.show();	
	System.out.println("�ŧicar1");
	car2.show();	
	System.out.println("����car1���������");
	car1.setCar(2345,30.5);	
	System.out.println("car1��");
	car1.show();	
	System.out.println("�ŧicar1");
	car2.show();
}
}
class Car45{

	private int num;
	private double gas;
	public Car45() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q��"+gas+"�����l");
	}
	public void show() {
		System.out.println("������"+num);
		System.out.println("�T�o�q��"+gas);
	}
}

