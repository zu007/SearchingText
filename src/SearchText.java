import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;


public class SearchText {

	public static void main(String[] args) throws IOException {
		
	Path Source=Paths.get("NameList.txt");
	Charset charset=Charset.forName("US-ASCII");
	ArrayList<String> lines=new ArrayList<String>();
	try (BufferedReader reader=Files.newBufferedReader(Source,charset))
	{
		String str=null;
		while((str=reader.readLine())!=null){
			System.out.println(str);
			lines.add(str);
			
		}
		
	} catch (Exception e) {
		e.getMessage();
	}

		
	for(int i=0;i<lines.size();i++){
		if(lines.get(i).contains("Head First Ajax")){
			System.out.println("find");
			break;
		}
		
	}
	
	
	

	}

}
