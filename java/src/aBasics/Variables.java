package aBasics;


public class Variables {
    String a ="Hello "; //4 Instance variable
    String b = "Suraj "; //4
   static String schoolName="KV"; //4
    String name="Suraj Sharma";
    void out(){
        String c="Kumar"; // Local variable
        System.out.println(c); //SurajKumarSharma  surajKumarSharma
        System.out.println(c);
    }
//Instance not instant
    void out2(){
        String d="Sharma";
        System.out.println(d);
        System.out.println(a);
    }
    public static void main(String[] args) {
        Variables obj = new Variables(); //8 byte
        Variables obj2 = new Variables(); //100 * 4 =400;
        //static initialize only once
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.out();

    }
}
