//contrato - who signs this contract must implement the methods set on the interface
// an interface cannot have normal methods or anything concreted, only abstracted

//A Interface é muito utilizada em grandes projetos para obrigar o programador
// a seguir o padrão do projeto, por esta tratar-se de um contrato onde o mesmo é obrigado a
// implementar seus métodos, ele deverá sempre seguir o padrão de implementação da Interface.

public abstract interface Authorized {


    public abstract void setPassword(int password);
    public abstract boolean check(int password);
}
