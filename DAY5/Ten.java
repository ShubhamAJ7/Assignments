class Ten
{
public static void main(String args[])
{
int f=0,s=1,n=10,t;
System.out.println(f+"\n"+s);

while(n>2)
{
t=f+s;
f=s;
s=t;
System.out.println(s);
n--;
}
}
}