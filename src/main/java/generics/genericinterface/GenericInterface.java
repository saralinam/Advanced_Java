package generics.genericinterface;
//sms --- User  Students -- Teacher - employee  CRUD
public interface GenericInterface<T> {
    void setValue(T t);
    T getValue();
}

