public class p26{
	public static void main(String[] args) {
		Car5678 car1;
		car1 = new Car5678();
		car1.show();
		}
}

class Car5678
{
	private int num;
	private double gas;	
	public Car5678() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void show()
	{
		System.out.println("�����O" + num);
		System.out.println("�T�o�q�O" + gas);
	}
}