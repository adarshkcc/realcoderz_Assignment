package assignment;

// question 8
public class StringModifier {

	String insertCharacter(String string,char c,int position)
	{
		StringBuffer sb=new StringBuffer(string);
		if(position <sb.length())
		{
		sb.insert(position, c);
		String s=new String(sb);
		return s;
		}
		else
			return "Enter the correct position";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringModifier sm=new StringModifier();
System.out.println(sm.insertCharacter("Welcome", 'n', 5));
	}

}
