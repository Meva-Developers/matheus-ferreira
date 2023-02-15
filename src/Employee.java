//superclass
public abstract class Employee {

    private String name;
    private String cpf;
    private double salary; //protected is visible only for the child classes in the same package.



    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salary;
    }

    public void setSalario(double salario) {
        this.salary = salario;
    }


}
