package generics.genericinterface.example;

public class CostumerRepo implements Repository<Customer>{
    @Override
    public void save(Customer type) {
        System.out.println("Costumer is saved .......");
    }
}
