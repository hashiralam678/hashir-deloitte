package com.deloitte;
import java.io.*;

public class FileHandling {
	public static void main(String []args) {
		
	try {
		File file=new File("hello1.txt");
//		FileInputStream fin = new FileInputStream(file);
		FileReader fin = new FileReader(file);
		BufferedReader br = new BufferedReader(fin);
//		int c;
//		
//		while((c=fin.read())!=-1)
//		{
//			System.out.print((char)c);
//		}

		FileWriter fout = new FileWriter("World1.txt");
		BufferedWriter bw = new BufferedWriter(fout);
		
		String line;
		while((line=br.readLine())!=null) {
//		System.out.println(line);
			bw.write(line+"\n");
		}
		
		br.close();
		bw.close();
	}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
}
