

class DateConstructor 
{
    private int dd,mm,yy;//Data Abstraction.
    public DateConstructor()//Default constructor
    {
        dd=1;
        mm=2;
        yy=2019;
    }
    public DateConstructor(int d,int m,int y)//parameterised constructor
    {
        dd=d;
        mm=m;
        yy=y;
    }
    public String toString()
    {
        return "Date ="+dd+"/"+mm+"/"+yy;
    }
    public void disDate()
    {
        System.out.println("Date ="+dd+"/"+mm+"/"+yy);
    } 
    
    public static void main(String[] args) 
    {
        DateConstructor dt = new DateConstructor();
        dt.disDate();
        System.out.println(dt);
        DateConstructor dt2 = new DateConstructor(20,10,2020);
        dt2.disDate();
    }
}    



