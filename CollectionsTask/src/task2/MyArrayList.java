package task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class MyArrayList<E> extends ArrayList<E> {
    ArrayList<E> arrayList;

    public MyArrayList() {
        arrayList = new ArrayList<>();
    }

    @Override
    public boolean add(E e) {
        return super.add(e);
    }

    @Override
    public E set(int index, E element) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Can't editing array!!!");
    }

    @Override
    public E remove(int index) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Can't removing from array!!!");
    }

    @Override
    public boolean remove(Object o) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Can't removing from array!!!");
    }

    @Override
    public void clear() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Can't clear array!!!");
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Can't removing from array!!!");
    }

    @Override
    public boolean removeAll(Collection<?> c) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Can't removing from array!!!");
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Can't removing from array!!!");
    }
}
