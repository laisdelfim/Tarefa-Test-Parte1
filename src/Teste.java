import java.util.List;
import java.util.stream.Collectors;

public class Teste {
  public static void main(String[] args) throws Exception {

    List<Pessoas> lista = new Pessoas().listaPessoas();

    lista.stream()
        .forEach(pessoa -> System.out.println(pessoa));

    List<Pessoas> listaFeminino = lista.stream()
        .filter(pessoa -> pessoa.getSexo().equals("Feminino"))
        .collect(Collectors.toList());

    listaFeminino.forEach(System.out::println);
  }

}