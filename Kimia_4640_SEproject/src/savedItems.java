import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author KimiaR
 *
 */
public class savedItems {

	/**
	 * @param args
	 */

	// the item founder
    private static Scanner item;
	//Variables
    static String name ="";
    static String category = "";
    static String description = "" ; 	
	//main   
	public static void main(String[] args)
	{
		savedItems obj = new savedItems();
		String searchItem = "Pasta";
		
		obj.setName(searchItem);
		obj.setDescription(description);
		obj.setCategory(category);
		// Access to the text file or database
		String filepath = "src/Items.txt";
		
		checkSavedItem (searchItem,filepath);
	
	}
	public static void checkSavedItem (String searchItem,String filepath) 
	{
		boolean found = false;
	 try {
		 item = new Scanner (new File(filepath));
		 item.useDelimiter("[,\n]");
			while (item.hasNext() && !found) 
			{
				name = item.next();
				category =  item.next();
				description	= item.next();
				if(name.equals(searchItem)) 
				{
					found = true;
				}
			}
			if(found) {
				System.out.println("name: "+name+" category: "+category+" description: "+description);
			}
			else
			{
				System.out.println("Not found");
				saveItem(filepath, searchItem);
			}
		 }
		catch(Exception e)
		{
			// reading file fails or connecting to database fails
			System.out.println("Error");
		}
	}
	//Override methods form interface class
	//getters and setters method
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String c) {
		category = c;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String d) {
		description = d;
	}
	
	//----- add item and save it 
	private static void saveItem(String filePath, String text) {
		File file = new File(filePath);
		FileWriter fr = null;
		BufferedWriter br = null;
		PrintWriter pr = null;
		try {
			
			fr = new FileWriter(file, true);
			br = new BufferedWriter(fr);
			pr = new PrintWriter(br);
			pr.println(text);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pr.close();
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
