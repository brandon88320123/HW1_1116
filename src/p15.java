public class p15 {
	public static void main(String[] args) {
		Car8 car1;
		car1 = new Car8();		
		int num=1234;
		double gas=20.5;	
		car1.setNumGas(num,gas);
	}
}

class Car8
{
	int num;
	double gas;
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��" + num + "�N�T�o�q�]��" + gas);
				
	}
	void show() {
		System.out.println("�����O" + num);
		System.out.println("�o�q�O" + gas);
	}
}