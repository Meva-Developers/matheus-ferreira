public class InternSystem {

    int password = 1234;
    public void check(Authorized ea){
        ea.check(this.password);

        boolean checked = ea.check(this.password);
        if (checked){
            System.out.println("User authorized on the system.");
        } else {
            System.out.println("Access denied. Please try again.");
        }
    }
}
