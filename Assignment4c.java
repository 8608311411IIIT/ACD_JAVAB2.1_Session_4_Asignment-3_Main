class C{
 
     public void test(){
           System.out.println("class C test()");
     }
}

class B extends C{

      public void test(){
           System.out.println("class B test()");
      }
}

class A extends B{

       public void test(){
           System.out.println("class A test()");
       }

          public void call(){//call function in class A tries to call test function in class C
           
              super.super.test();//expected that this may call test function in C
             
          }
}

public class Assignment4c{

       public static void main(String []args){
            A obj=new A();//making object of class A
            obj.call();//calling function call() of class A
       }
}
//thus found that it is not possible to invoke test() method defined in C from a method in A
