package SeleniumTraining;

import java.io.IOException;

public class AutoITDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String pathdetails = "C:\\Users\\vivekp\\Desktop\\vivek.exe";
		
		String[] cmd = {pathdetails, "AutoITTest", "AutoMSG"};
		
      Runtime.getRuntime().exec(cmd);
	}

}
