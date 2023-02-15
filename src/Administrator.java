public class Administrator extends Employee implements Authorized {

    private Authentication authenticator;

    public Administrator() {
        this.authenticator = new Authentication();
    }

    public void setPassword(int password) {
        this.authenticator.setPassword(password);
    }

    public boolean check(int password) {
       return this.authenticator.check(password);
    }

    public double getBonus() {
        return 50;
    }
}
