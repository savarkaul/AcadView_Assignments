import java.io.*;
class DynamicData {
	public static void main(String[] args) throws IOException
	{
		File f1= new File("abc.txt");	
		boolean result= f1.exists();
		System.out.println("Already exists? "+((result)?"Yes":"No"));
		result= f1.createNewFile();
		FileWriter fw= new FileWriter("abc.txt");
		String str="C:/Users/Test/video.mp4";
		fw.write(str);
		fw.close();
		FileReader fr= new FileReader("abc.txt");
		int data= fr.read();
		
		while(data != -1)
		{
		System.out.print((char)data);
		data= fr.read();
		}		
		fr.close(); 		
	}

}
