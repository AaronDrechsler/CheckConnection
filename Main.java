
public class Main {
	public static void main(String args[]) {
		LogFileHandler.createFile();
		 try {
		        while (true) {
		        	LogFileHandler.writeIntoFile(ConnectionChecker.checkConnection());
		            Thread.sleep(60 * 1000);
		        }
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
	}
		

}
