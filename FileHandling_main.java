package phase1project;
	import java.io.IOException;
	import java.util.Scanner;

	public class FileHandling_main {
		
		public static void main(String[] args) throws IOException{
			System.out.println("\n Welcome to our Application project --> File Handling\n");
			System.out.println("File Handling Application consists of features given below\n1.Displaying the all files in the Directory\n2.Add files to the Existing Directory\n3.Delete Files in the Existing Directory\n4.Search Files in the Existing Directory\n");
			Scanner sc=new Scanner(System.in);
			
			Listing_theFiles display=new Listing_theFiles();
			Adding_theFile add=new Adding_theFile();
			Deleting_theFile delete=new Deleting_theFile();
			Searching_theFile search=new Searching_theFile();
			String path="F:\\Ragul\\";
			
			label:while(true) {
				 System.out.println("Enter your choice\n1.list the files in the Directory\n2.File Operations(Add,Delete,Search)\n3.Close Application ");
				 int choice=sc.nextInt();
				
				 switch(choice) {
				 case 1:display.displayTheFile(path);
				        break;
				 case 2:while(true) {
					
					  		System.out.println("Enter Which file operation you want\n1.Add File\n2.Delete File\n3.Search File\n4.Back to Our main choices");
					  		int choice1=sc.nextInt();
					  		
					  		switch(choice1){
					  		case 1:add.addToFile(path);
					  			   break;
					  		case 2:delete.deleteTheFile(path);
					  			   break;
					  		case 3:search.searchTheFile(path);
					  			   break;
					  		case 4:continue label;
					  		}
					}
				 
				 case 3:System.exit(0);
				        break;
				 default:System.out.println("invalid operation");
				}
			}

		}

	}


