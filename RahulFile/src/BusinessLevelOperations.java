
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class BusinessLevelOperations implements FileInterface {
	static Scanner sc=new Scanner(System.in);
	List<String> retrieve= new ArrayList<String>();
	File[] files = new File("C:\\Users\\RAHUL\\eclipse-workspace\\Phase1").listFiles();
       public void showAllFiles() {
		for(File file : files) {
			if(file.isFile()) {
				retrieve.add(file.getName());
				//System.out.println(file.getName());
			}
		}
		retrieve.forEach(System.out::println);	
	}

	
	public void addFile(){
				System.out.println("Enter the file which you want to add:");
				String filename=sc.next();
				File F= new File("C:\\Users\\RAHUL\\eclipse-workspace\\Phase1",filename);
				try {
					if(F.createNewFile()) {
						System.out.println(filename+" file is added to the directory");
						Desktop.getDesktop().edit(F);
					}
					else {
						System.out.println("This file is already there");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		
	}

	public void deleteFile() {
				System.out.println("Enter the file which you want to delete:");
				String filename=sc.next(); 
				File file = new File("C:\\\\\\\\Users\\\\\\\\RAHUL\\\\\\\\eclipse-workspace\\\\\\\\Phase1",filename);
		
				if(file.delete())
					System.out.println(filename+"  Deleted");
				else
					System.out.println("File Not Found");
				}
				
	
	public void searchFile() {
		try {	
			 Scanner scan=new Scanner(System.in);
			 System.out.println("Enter the file name which you want to search:");
			 String fileName=sc.next();
			 File file = new File("C:\\\\Users\\\\RAHUL\\\\eclipse-workspace\\\\Phase1",fileName);
			 
			 FileInputStream fis = new FileInputStream(file);
			 int flag;
			  while ((flag = fis.read()) != -1) {
				System.out.write(flag);
			   }
			}catch(FileNotFoundException e)
			{
				System.out.println("File Not Found");
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.flush();}}
           	

