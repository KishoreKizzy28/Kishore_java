package Programs;

public class Fibonnaci_series {
	
public static void main(String[] args) {
	
	int n1= 0,n2=1,n3,i,count=10;
	System.out.print(n1+""+n2);
	for(i=2;i<count;i++) {
		n3 = n1+n2; // 0+1 =1  2 3 5 
		System.out.print(""+n3);
		n1=n2; //1
		n2=n3; //
		
				
		}
	}

}
