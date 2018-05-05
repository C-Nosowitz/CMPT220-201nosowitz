import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File_finder {
	//public static String w;
	
	public static void getFile(String s,File file) {
		File[] list = file.listFiles();
		//String w = "" ;	
		if(list!= null)
        for (File fil : list) {
            if (fil.isDirectory()){
                getFile(s,fil);
            }
            else if (s.equalsIgnoreCase(fil.getName())){
                //System.out.println(fil.getParentFile().getAbsolutePath());
                
            	System.out.println(fil.getParentFile().getAbsolutePath());
            	
                }
            }
		
        //return w;
      
      }	
	public static void main(String[] args) {
		File_finder ff = new File_finder();
		//String l ="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any file name: ");
		String s = scan.nextLine();
		//System.out.println(s);
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the directory to search for the file: ");
		String directory = scan1.next();
		//String directory1 = directory + s;
		ff.getFile(s, new File(directory));
		//System.out.print(l);
		//String fullDir = directory + s;
		//System.out.println(w);
		//File_finder createLink = new File_finder();
		//createLink.proceed(directory1);
		File f = new File(directory);
		if (f.exists()) {
			System.out.println("File exists.");
			try {
				Desktop desktop = Desktop.getDesktop();
				desktop.open(f);
			}
			catch(IOException ex){
		
				System.out.println("Error opening file" + ex);
			}
		}
		else{
			System.out.println("File does not exist");
		}
		scan.close();
		scan1.close();
	}
}