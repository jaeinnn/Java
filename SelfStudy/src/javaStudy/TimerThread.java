package javaStudy;

 class TimerThread extends Thread { //Thread ��ӹ��� 
	 
	 int n = 0; 
	 
	 @Override
	 public void run() {
		 while(true) { //���� ������ �÷��Ѵ�.
			 System.out.println(n);
			 n++; 
			 try {
				 sleep(1000); //1�ʵ��� ���� �� �� �����.
			 }
			 catch(InterruptedException e) {return;}
		 }
		 
	 }

}
