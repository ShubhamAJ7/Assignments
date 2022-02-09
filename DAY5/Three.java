class Three
{
public static void main(String args[])
{
float p=1000,r=4,t=3,CI=1;
float k;
k=p*(1+r/100);

while(t>0)
{
CI=CI*k;
t--;
}
System.out.println(CI);
}
}