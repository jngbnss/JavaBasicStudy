package javaMid2.collection.list;

public interface MyList <E>{
    int size();
    void add(E e);
    void add(int index,E e);
    E get(int indxe);
    E set(int index,E element);
    E remove(int index);
    int indexOf(E o);
}
