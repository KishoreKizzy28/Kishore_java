package String_Buffer;

public class String_buffer {
	public static void main(String[] args) {
		
	
	StringBuffer sb=new StringBuffer("Hello ");  
	sb.insert(5,"Java");//now original string is changed  
	System.out.println(sb);//prints HJavaello
	sb.append("welcome");
	System.out.println(sb);
	System.out.println(sb.reverse());
	System.out.println(sb.capacity());
	
	
	
	}  
}  


