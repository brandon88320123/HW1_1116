public class p17 {
	public static void main(String[] args) {
		Car9 car1;
		car1 = new Car9();
		car1.setnumgas(1234,20.5);
		int numb = car1.getNum();
		double gass = car1.getGas();
		System.out.println("�լd�˫~���ɱo��");
		System.out.println("�����O" + numb + "�T�o�q�O" + gass);	
	}
}

class Car9
{
	int num;
	double gas;	
	int getNum()
	{
		System.out.println("�լd����");
		return num;	
	}
	double getGas()
	{
		System.out.println("�լd�T�o�q");
		return gas;	
	}
	void setnumgas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�����]��"+num+"�o�q�]��"+gas);
			
	}
	
}