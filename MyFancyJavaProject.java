public class singleton{  
    static String c,s;
    public singleton(String a,String b)
    {
        this.c=a.concat(b); 
        s = "I am a string part of Singleton class"; 
    }    
    
    public static void main(String[] args) throws Exception{  
        String a="Instance";
        String b=" Created";
        singleton create_obj=new singleton(a,b);
        System.out.println(create_obj.c);
    }  
}  