package ch24_스레드;

public class ThreadMain {
public static void main(String[] args) {
	
	
		Thread thread1 = new Thread(()->{
			System.out.println("스레드이름:"+Thread.currentThread().getName());  //currentThread > 주도권을 가진 thread  = 주도권을 가진 스레드의 이름을 말해랏.
		
			for(int i = 0; i<50; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000); //sleep: 1초 쉬고 해라. 1000이 1초임.
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}, "1번스레드");
		
		//==========================================================================
		Thread thread2 = new Thread(()->{
		System.out.println("스레드이름:"+Thread.currentThread().getName());     //currentThread > 주도권을 가진 thread  = 주도권을 가진 스레드의 이름을 말해랏.
		
		for(int i = 0; i<50; i++) {
		System.out.println(Thread.currentThread().getName() + ":");
		System.out.println(i);
		}
		},"2번 스레드 실행");
		
		//==========================================================================
		Thread thread3 = new Thread(new ThreadTest(), "3번 스레드실행");
		
	
		//==========================================================================
		Thread thread4 = new Thread(new Runnable() {  //익명클래스
			@Override
			public void run() {
				System.out.println("4번 스레드 실행.");
				
			}
		}, "4번");
		
		thread1.start();
		try {
			thread1.join();                    //join : 설정한것 구현 끝나면 다음 스레드 구현.
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}   
		thread2.start();
		thread3.start();
		thread4.start();
}
}
