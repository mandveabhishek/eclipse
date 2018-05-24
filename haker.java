import java.util.Scanner;

public class haker {
public static void main(String[] args) {
int a ,b ;	
int arr[] = new int[3]; 	
Scanner sc =  new Scanner(System.in);

a = sc.nextInt();
b = sc.nextInt();


for(int i=0;i<=2;i++) {
	arr[i] = sc.nextInt();
}
int sum =0 ;
if(arr[0]>=a && arr[0]<=b ) {
	sum=arr[0]+arr[2];
}
if(arr[1]>=a && arr[1]<=b ) {
	sum =sum+(arr[1]+=arr[2]);
}

System.out.println("\n\n "+sum);



}
}
