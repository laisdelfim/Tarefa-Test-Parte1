import java.util.List;
import java.util.Objects;

public class Pessoas {

    private String nome;

    private String sexo;

    private int idade;

    public Pessoas() {

    }

    public Pessoas(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;

    }

    public Pessoas(Pessoas pessoa) {
        this(pessoa.getNome(), pessoa.getSexo(), pessoa.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Pessoas> listaPessoas() {

        Pessoas pessoa1 = new Pessoas("Lais", "Feminino", 33);
        Pessoas pessoa2 = new Pessoas("Brayan", "masculino", 13);
        Pessoas pessoa3 = new Pessoas("Tiago", "masculinoo", 36);
        Pessoas pessoa4 = new Pessoas("Marlene", "feminino", 64);
        return List.of(pessoa1, pessoa2, pessoa3, pessoa4);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Pessoas pessoa = (Pessoas) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome) && Objects.equals(sexo, pessoa.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sexo, idade);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }

}
