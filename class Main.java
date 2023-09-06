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
