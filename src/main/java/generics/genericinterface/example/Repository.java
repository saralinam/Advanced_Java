package generics.genericinterface.example;

public interface Repository<T>{
    void save(T type);

    //some extra methods
}
