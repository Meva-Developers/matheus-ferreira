//COMPOSIÇÂO - É como se elas se comunicassem, trocassem informações.
// Ou seja, serve para reutilizar dados, sem ter que criar mais código pra isso.
// Simplesmente passamos a informação - na forma de Objeto - para outro Objeto,
// e este se encarrega de obter os dados e como trabalhar em cima dele.
public class Authentication {

    private int password;

    public void setPassword(int password) {
        this.password = password;

    }

    public boolean check(int password) {
        if (this.password == password) {
            return true;
        } else {
            return false;
        }
    }
}
