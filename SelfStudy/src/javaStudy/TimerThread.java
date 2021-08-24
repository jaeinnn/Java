package javaStudy;

 class TimerThread extends Thread { //Thread 상속받음 
	 
	 int n = 0; 
	 
	 @Override
	 public void run() {
		 while(true) { //무한 루프를 시랭한다.
			 System.out.println(n);
			 n++; 
			 try {
				 sleep(1000); //1초동안 잠을 잔 후 깨어난다.
			 }
			 catch(InterruptedException e) {return;}
		 }
		 
	 }

}
