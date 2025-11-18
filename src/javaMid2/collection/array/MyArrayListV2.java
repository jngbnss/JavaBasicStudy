package javaMid2.collection.array;

import java.util.Arrays;

public class MyArrayListV2 {
    // capacity를 넘어가야 하는 상황이라면 더 큰 배열을 만들어서 문제를 해결해보기
    private static final int DEFAULT_CAPACITY=5;

    private Object[] elementData;
    private int size =0;

    public MyArrayListV2(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity){
        elementData = new Object[initialCapacity];
    }
    public int size(){
        return size;
    }
    public void add(Object e){
        // 코드 추가
        if(size== elementData.length){
            grow();
        }
        elementData[size] = e;
        size++;
    }

    //코드 추가
    private void grow(){
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity*2;
        elementData = Arrays.copyOf(elementData,newCapacity);
    }

    public Object get(int index){
        return elementData[index];
    }
    public Object set(int index,Object element){
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o){
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData,size))+ " size = "+
                size+", capacity = "+elementData.length;
    }
}

// 추가된 부분은 grow() 메서드와 이 메서드를 호출하는 add()메서드이다.
//grow()를 호출해서 기존 배열을 복사한 새로운 배열을 만들고 배열의 크기도 여유있게 2배로 늘려준다.