
public class p51 {
public static void main (String [] args) {

	Car51[] car1;
	car1 = new Car51[3];
	for (int i = 0;i<car1.length;i++) {
		car1[i] = new Car51();
	}
	car1[0].setCar(1234,20.5);
	car1[1].setCar(4567,30.5);
	car1[2].setCar(4568,40.5);	
	for(int i=0;i<car1.length;i++) {
		car1[i].show();
	}
}
}
class Car51{

	private int num;
	private double gas;
	public Car51() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�N�T�o�q�]��"+gas+"�����l");
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}

