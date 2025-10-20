package javaMid1.lang.object;
//부모가 없으면 묵시적으로 Object 클래스를 상속받는다.
public class Child extends Parent{
    public void childMethod(){
        System.out.println("Child.childMethod");
    }
}
