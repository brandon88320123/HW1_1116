public class p24{
	public static void main(String[] args) {
		Car55 car1;
		car1 = new Car55();
		car1.setCar(1234,10.5);
		car1.show();
		System.out.println("���ܧ󨮸�");
		car1.setCar(2321);
		car1.show();
		System.out.println("���ܧ�T�o�q");
		car1.setCar(20.5);
		car1.show();
		
	}
}

class Car55
{
	private int num;
	private double gas;
	public void setCar(int n) {
		num = n;
		System.out.println("�N�����]��" + num);
	}
	public void setCar(double g) {
		gas = g;
		System.out.println("�N�T�o�q�]��" + gas);
	}
	public void setCar(int n,double g) {
		num = n;
		gas = g;
		System.out.println("�N�����]��" + num + "�N�T�o�q�]��" + gas);
	}
	public void show()
	{
		System.out.println("�����O" + num);
		System.out.println("�o�q�O" + gas);
	}
}