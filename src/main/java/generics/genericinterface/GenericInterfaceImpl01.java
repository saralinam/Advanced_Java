package generics.genericinterface;

//if we implement generic interface the implementing class also should implement be generic
public class GenericInterfaceImpl01<T> implements GenericInterface<T>{
    @Override
    public void setValue(T t) {

    }
    @Override
    public T getValue() {
        return null;
    }
}
