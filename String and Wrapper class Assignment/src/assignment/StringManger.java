package assignment;

public class StringManger {

	String inserString(String string1,String string2,char ch)
	{
		int pos=0;
		StringBuffer sb=new StringBuffer(string1);
		for(char c:string1.toCharArray())
		{
			if(c==ch)
			{
			sb.insert(pos, string2);
			}
			pos++;
		}
		String s=new String(sb);
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringManger m=new StringManger();
		
	System.out.println(	m.inserString("Hello World", "java",'W'));

	}

}
