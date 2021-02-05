package day40_Constructor;

public class ConstructorCall2 {

    public ConstructorCall2(){
       //this(); cannot call itself
      //   this(8); calling itself cause it's contained the default constructor
    }

    public ConstructorCall2(int a){
       this();
    }


}
