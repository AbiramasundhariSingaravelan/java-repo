import java.io.File;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("D:/blue/abctest.txt");
		if(f.exists())
		{
			System.out.println("unable to create a file. File already exists");

		}
		else
		{
			System.out.println("Created" +f.getName());
		}
	}

}
