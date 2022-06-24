package jana60;

public class Utente {
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private int age;

    //constr

    public Utente(String nome, String cognome, String email, String password, int age) throws Exception {
        this.nome = nome;
        this.cognome = cognome;
        if ( !(email.contains("@")) || !(email.contains(".") ))
            throw new Exception("La mail deve contenere un '@' e un '.'");
        this.email = email;
        if ( password.length()<8 || password.length()>12)
            throw new Exception("La password deve contenere tra gli 8 e i 12 caratteri");
        this.password = password;
        if (age<18)
            throw new Exception("Devi avere più di 18 anni");
        this.age = age;
    }


    //getter/setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if ( password.length()<8 || password.length()>12)
            throw new Exception("La mail deve contenere un '@' e un '.'");
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception {
        if ( !(email.contains("@")) || !(email.contains(".") ))
            throw new Exception("La password deve contenere tra gli 8 e i 12 caratteri");
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age<18)
            throw new Exception("Devi avere più di 18 anni");
        this.age = age;
    }

    //altri

    @Override
    public String toString() {
        return "Utente con nome: " + nome +", cognome: " + cognome +" ed età di: "+age+". Email: " + email +
                ", password: " + password +". Grazie per esserti registrato";
    }
}
