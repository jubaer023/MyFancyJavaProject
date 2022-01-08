public class Singleton{
    static String c;
    public static Singleton single = null;

    private Singleton(String a,String b)
    {
        this.c=a.concat(b);
    }

    public static Singleton getInstance(String a, String b) {
        if (single == null)
            single = new Singleton(a, b);
        return single;
    }
}

class Main{
    public static void main(String[] args) {

        //getting instance
        Singleton single = Singleton.getInstance("Hello", "World");

        System.out.println(single.c);
    }
}