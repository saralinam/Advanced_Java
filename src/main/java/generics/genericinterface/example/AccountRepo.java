package generics.genericinterface.example;

public class AccountRepo implements Repository<Account>{
    @Override
    public void save(Account type) {
        System.out.println("Account is save .......");
    }

}
