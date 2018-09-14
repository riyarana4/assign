import java.io.*;
public class FileHandling1
{
    public static void main(String ars[])
    {
        File f=new File("C:\Users\Riya Rana\Desktop\Assign10");
		
		try{
			FileInputStream fin=new FileInputStream(f);
			int i;
			i=fin.read();
			
			while(i!=-1)
			{
				System.out.println((char)i);
				i=fin.read();
			}
	fin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		System.out.println("\nFile path = "+f.getPath());
		
       
    }
}