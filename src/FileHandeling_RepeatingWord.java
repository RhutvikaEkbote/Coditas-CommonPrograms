
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandeling_RepeatingWord{

	public static void main(String[] args) throws FileNotFoundException  , IOException{
		String line , word="";
		int count =0,maxcount=0;
		
		ArrayList<String> words = new ArrayList<String>();
		
		FileReader file = new FileReader("D:\\myfile.txt");
		//to read text from char based stream
		BufferedReader br = new BufferedReader(file);
		
		//to read Line bt Line
		while((line = br.readLine())!=null ) {
			String string[]=line.toLowerCase().split("([,.\\s]+)");
			
		
			for(String s:string) {
				words.add(s);
			}
			
		}
		
		
		count=1;
		for(int i=0;i<words.size();i++) {
			for(int j=i+1;j<words.size();j++) {
				if(words.get(i).equals(words.get(j))) {
					count++;
				}
			}
			
			
			if(count>maxcount) {
				maxcount=count;
				word=words.get(i);
			}
		}
		
		System.out.println("most repeated word is :"+word);
		br.close();
	}
	

}
