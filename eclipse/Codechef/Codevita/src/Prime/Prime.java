package Prime;
import java.util.*;
//import java.lang.*;

public class Prime {

	static boolean checkPrime(int n)
	{
	    int i;
	    if(n%2==0)
	    {
	    	return false;     
	    }   
	    for(i=3;i<=Math.sqrt(n);i=i+2)
	    {
	    	if(n%i==0)
	    		return false;
	    }
	    return true;
	}
	static int primeTime(int D,int P)
	{
	    int j,k,result=0,div,temp,flag=1;
	    div=D/P;
	   
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    list.add(2);
	    for(int i=3;i<D;i=i+2)
	    {
	    	if(checkPrime(i))
	    	{
	    		list.add(i);
	    	}
	    }
	    
	    for(j=0;j<list.size();j++)
	    {
		    temp=list.get(j);
		      
		    for(k=0;k<P-1;k++)
		    {
		        temp=temp+div;
		        if(list.contains(temp))
		        {
		        	continue;
		        }
		        else
		        {
		        	flag=0;
		        	break;
		        }
		        
		    }
		    if(flag==1)
		    	 result++;
		    else
		    	 flag=1;
		 }
	      	return result;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int D,P,result=0;
	    Scanner scan=new Scanner(System.in);
	    
	  
	      D=scan.nextInt();
	      P=scan.nextInt();
	      result=primeTime(D,P); 
	      System.out.print(result);  
	   
	}

}
