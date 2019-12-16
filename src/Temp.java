import java.util.Arrays;

public class Temp {

	public static void main(String[] args) {
		String s="temp";
		char[] str=s.toCharArray();
		int sz=s.length();
		int[] as=new int[100];
		for(int i=0;i<sz;i++)
		{
			as[i]=(int)str[i];
			//System.out.println(i+":\t"+as[i]+"\n");
		}
		Arrays.sort(as);
		
		System.out.println(as.length);
		for(int i=0;i<sz;i++)
		{
			System.out.println(Character.toString((char)as[i]));
		}
	}
}
