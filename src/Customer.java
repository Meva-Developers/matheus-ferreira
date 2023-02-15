public class Customer implements Authorized {

    private final Authentication authenticator;

    public Customer(){
        this.authenticator = new Authentication();
    }

    @Override
    public void setPassword(int password) {
        this.authenticator.setPassword(password);

    }

    @Override
    public boolean check(int password) {
       boolean checked =  this.authenticator.check(password);
        return checked;
    }
}