import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
			String line=br.readLine();
			String s[]=line.split(" ");
			bw.write(Integer.parseInt(s[0])+Integer.parseInt(s[1])+"\n");
		}
		bw.flush();
		bw.close();
	}
}
