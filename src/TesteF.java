import java.util.List;
import java.util.stream.Stream;

public class TesteF {
  @Test
  public void conferirFiltroLista() {
    List<Pessoas> lista = new Pessoas().listaPessoas();
    Stream<Pessoas> stream = lista.stream()
        .filter(pessoa -> pessoa.getSexo().equals("Feminino"));

    stream.forEach(pessoa -> Assert.assertEquals("Feminino", pessoa.getSexo()));

  }
}
