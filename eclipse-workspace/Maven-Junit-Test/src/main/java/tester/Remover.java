package tester;

public class Remover {

	public String remove(String s)
	{
		int len=s.length();
		String ret="";
		if(len==1)
		{
			if(s.equals("A"))
				ret="";
			else 
				ret=s;
		}
		else if(len>1)
		{
			if(s.charAt(0)=='A' && s.charAt(1)!='A')
				ret=s.substring(1,len);
			
			else if(s.charAt(0)!='A' && s.charAt(1)=='A')
				ret=s.charAt(0)+s.substring(2,len);
			
			else if(s.charAt(0)=='A' && s.charAt(1)=='A')
				ret=s.substring(2,len);
			
			else
				ret=s;
		}
		return ret;
	}
	
}
