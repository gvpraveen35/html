class Main
{
public static int largest(int first,int second,int third)
{
int max=first;
if(second>max)
{
max=second;
}
if(third>max){
max=third;
}
return max;
}
public static int smallest(int first,int second,int third)
{
int min=first;
if(second<max)
{
min=second;
}
if(third<max){
min=third;
}
return min;
}
public static int keyfinding(int input1,int input2,int input3)
{
String res="";
if(input1>=100&& input1<=9999)&&(input2>=1000&&input2<=9999)&&(input3>=1000&&input3<=9999))
{
int a=0;int b=0;int c=0;
String inp1=String.valueof(input1);
String inp2=String.valueof(input2);
String inp3=String.valueof(input3);
for(int i=0;i<4;i++)
{
a=Integer.parseInt(String.valueof(int1.charAt(i)));
b=Integer.parseInt(String.valueof(int2.charAt(i)));
c=Integer.parseInt(String.valueof(int3.charAt(i)));
res+=String.valueof(largest(a,b,c)-smallest(a,b,c));
}
}
return Integer.parseInt(res);
}
public static void main(String args[])
{
System.out.println(keyfind(3521,2452,1352));
}
} 
