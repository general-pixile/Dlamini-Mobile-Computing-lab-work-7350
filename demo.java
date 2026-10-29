import java.lang.*;
class a extends Thread{
	public void run(){
		for(i=1;i<5;i++)
		{
			System.out.println("from thread A:i="+);
		}
		System.out.println("exit from thread A");
	}
}

class b extends Thread
{
	public void run()
	{
		for(int j=1;j<5;j++)
		{
			System.out.println("from Thread B:j=+j);
		}
		System.out.println("exit from Thread B");
	}
}


