package function;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 将Token写入文件，以便后台持续运行时获取。分别定义了读和写两个方法
 * @author root
 *
 */
public class SaveToken {
	/**
	 * 将Token写入文件
	 * @param Token
	 */
	public void WriteStringToFile(String Token) {  
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("Token.txt"));  
            ps.print(Token);// 往文件里写入字符串
            ps.close();
        } catch (FileNotFoundException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }
    }
	
	/**
	 * 从文件读取内容
	 * @return 文件的内容
	 */
	public String readString(){
	    String str="";
	    try {
	        FileInputStream in=new FileInputStream("Token.txt");
	        // size  为字串的长度 ，这里一次性读完  
	        int size=in.available();  
	        byte[] buffer=new byte[size];  
	        in.read(buffer);  
	        in.close();  
	        str=new String(buffer,"UTF-8");
	    } catch (IOException e) {  
	        // TODO Auto-generated catch block  
	        return null;  
	    }  
	    return str;  
	}  

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaveToken file = new SaveToken();
		file.WriteStringToFile("123456789");
		System.out.println(file.readString());
	}*/

}