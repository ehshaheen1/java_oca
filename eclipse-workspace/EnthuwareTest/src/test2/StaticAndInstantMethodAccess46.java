package test2;

public class StaticAndInstantMethodAccess46 {

    
    void m1(){
    	StaticAndInstantMethodAccess46.m2();  // 1
        m4();             // 2
        //StaticAndInstantMethodAccess46.m3();  // 3
    }
    
    static void m2(){ }  // 4
    
    void m3(){
        m1();            // 5
        m2();            // 6
       // StaticAndInstantMethodAccess46.m1(); // 7
    }
    
    static void m4(){ }
}

