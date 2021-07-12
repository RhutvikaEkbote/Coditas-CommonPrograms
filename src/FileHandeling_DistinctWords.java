import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class FileHandeling_DistinctWords {

	public List<String> getDistinctWordList(String fileName){
		
		BufferedReader br = null;
		List<String> wordList = new ArrayList<String>();
		try {
			FileInputStream fis = new FileInputStream(fileName);
			DataInputStream dis = new DataInputStream(fis);
			 br = new BufferedReader(new InputStreamReader(dis));
			String line = null;
			while((line = br.readLine()) != null){
				//to seperate tokens
				StringTokenizer st = new StringTokenizer(line, " ,.;:\"");
				//to check if there are more token
				while(st.hasMoreTokens()){
					//returns next token
					String tmp = st.nextToken().toLowerCase();
					if(!wordList.contains(tmp)){
						wordList.add(tmp);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try{if(br != null) br.close();}catch(Exception ex){}
		}
		return wordList;
	}
	

	public static void main(String[] args) {
		FileHandeling_DistinctWords distFw = new FileHandeling_DistinctWords();
		List<String> wordList = distFw.getDistinctWordList("D:\\myfile.txt");
		for(String str:wordList){
			System.out.println(str);
		}

	}

}
