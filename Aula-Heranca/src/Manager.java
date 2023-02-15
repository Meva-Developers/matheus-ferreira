//child class - The manager is an Employee and needs to implement the methods of the contract
public class Manager extends Employee implements Authorized {

    private Authentication authenticator;

    public Manager() {
        this.authenticator = new Authentication();
    }
   public void setPassword(int password) {
        this.authenticator.setPassword(password);
    }


    public boolean check(int password) {
        return this.authenticator.check(password);
    }

    public double getBonus() {
        return super.getSalario();
    }
}