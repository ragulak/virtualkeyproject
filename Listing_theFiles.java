package phase1project;
import java.io.File;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;

	public class Listing_theFiles {

		public void displayTheFile(String path) {
			
			File file=new File(path);
			if(file.isDirectory()){
				
				List<String> FilesList = Arrays.asList(file.list());
			    Collections.sort(FilesList);
			
			    for(String s:FilesList)
			    	System.out.println(s);
			}
			else
				System.out.println(file.getAbsolutePath() + " is not a directory");
	}
	}


