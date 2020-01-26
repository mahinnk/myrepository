import java.util.*;
class GFG {

	public static void main (String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter size");
int n=s.nextInt();
int[] a=new int[n];
System.out.println("enter elements");
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int z=a[0],tempi=-1,tempj=-1,score=0;
for(int i=1;i<n;i++)
{
if(a[i]>z){
for(int j=i+1;j<n;j++)
{
if(a[j]>a[i]){
	if(score<(a[i]*a[j])){
		score=a[i]*a[j];
		tempi=i;
		tempj=j;
		}
else if(score==(a[i]*a[j])){
	if(a[tempi]<a[i]){
		tempi=i;
		tempj=j;
}
}

}
}
}
else{

z=a[i];
}
}
if(tempi!=-1){
z=0;
for(int i=0;i<tempi;i++){
if((a[i]<a[tempi]) && (z<a[i]))
	z=a[i];
}
System.out.printf("first number is %d second number is %d third number is %d",z,a[tempi],a[tempj]);
}
else
System.out.println("no solution");

}
}
