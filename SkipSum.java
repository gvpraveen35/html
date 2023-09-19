public class SkipSum
{ 
public static int skipSum(int[] arr)
{
int sum=0;
int skipCount=1;
for(int i=0;i<arr.length;i+=skipCount)
{
for(int j=i;j<Math.min(i+skipCount,arr.length); j++)
{
sum+=arr[j];
}
skipCount++;
}
return sum;
}
public static void main(String args[])
{
int[] array={1,2,3,4,5,6,7};
int result=skipSum(array);
System.out.println("sum of the element with skiping:" + result);
}
}