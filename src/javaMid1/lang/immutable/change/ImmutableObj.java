package javaMid1.lang.immutable.change;

public class ImmutableObj {
    private final int value;
    private final int password;

    public ImmutableObj(int value,int password) {
        this.value = value;
        this.password = password;
    }


    public ImmutableObj add(int addValue,int password){
        if(password == this.password) {
            int result = value + addValue;
            return new ImmutableObj(result,this.password);
        }else{
            System.out.println("권한이 없습니다.");
            return this;
        }
    }
    public int getValue(){
        return value;
    }
}
