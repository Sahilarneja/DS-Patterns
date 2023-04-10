
	class reversehello extends Thread{
		static int threadCount=1;
		public void run() {
			if(threadCount<=50) {
				threadCount++;
				Thread thread=new Thread(new reversehello());
				thread.start();
				try {
					thread.join();
                    Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// /try {
				// 	thread.sleep(1000);
				// } catch (InterruptedException e) {
				// 	// TODO Auto-generated catch block
				// 	e.printStackTrace();
				// }
                System.out.println("HELLO FROM "+Thread.currentThread().getName());
			}
		}
    
		public static void main(String[] args) {
			reversehello t1=new reversehello();
			Thread a1=new Thread(t1);
			a1.start();
			
		}
	}