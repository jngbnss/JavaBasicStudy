package javaMid1.nested.tested;
 class AnonymousMain {
     public static void main(String[] args) {

        Hello hello = new Hello(){
             @Override
             public void hello() {
                 System.out.println("Hello.hello");
             }
         };
         hello.hello();
     }
}
