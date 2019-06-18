package tester;

public class Remover {

	public String remove(String s)
	{
		if(s.length()==1)
		{
			if(s.equals("A"))
				return "";
			else 
				return s;
		}
		else if(s.length()>1)
		{
			if(s.charAt(0)=='A' && s.charAt(1)!='A')
				return s.substring(1,s.length());
			
			else if(s.charAt(0)!='A' && s.charAt(1)=='A')
				return s.charAt(0)+s.substring(2,s.length());
			
			else if(s.charAt(0)=='A' && s.charAt(1)=='A')
				return s.substring(2,s.length());
			
			else return s;
		}
		return s;
	}
	
}
