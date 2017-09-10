import java.util.*;
public class Assignment2 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of words want to sort");
		int n=sc.nextInt();
		String arr[]=new String[n+1];
		System.out.println("Enter the Strings");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextLine();
		}
		String temp;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i].compareTo(arr[j])>0){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The sorted order of the given String");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		//ArrayList<Character> list=new ArrayList<Character>();
		for(int i=0;i<arr.length;i++){
			StringBuilder s=new StringBuilder();
			s.append(arr[i]);
			for(int j=0;j<arr[i].length();j++){
				for(int k=j+1;k<arr[i].length();k++){
				if((int)s.charAt(j)>(int)s.charAt(k)){
					//System.out.println("got");
					char temp2 = s.charAt(j);
					
					 s.replace(j, j+1, String.valueOf(s.charAt(k)));
					 s.replace(k, k+1, String.valueOf(temp2));
				  }
				}
			}
			System.out.print(s);
			System.out.println();
		  }
		}
			
	}

