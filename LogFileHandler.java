import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class LogFileHandler {
	private static String LOGFILENAME = "ConnLog.txt";
	public static void createFile() {	
		 try {
			
		      File myObj = new File(LogFileHandler.LOGFILENAME);
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	public static void writeIntoFile(boolean connectionExists) {

		 try {
		     FileWriter myWriter = new FileWriter(LogFileHandler.LOGFILENAME, true);
			 if (connectionExists == false) {
		      myWriter.write("not connected " + getTime()+"\n");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		      }else {
			 	myWriter.write("connected " + getTime()+"\n");
			 	myWriter.close();
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 }
	 public static String getTime() {
			 SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
			 Date date = new Date(System.currentTimeMillis());
			 String time = new String (formatter.format(date));
			 return time;
		 }
}

