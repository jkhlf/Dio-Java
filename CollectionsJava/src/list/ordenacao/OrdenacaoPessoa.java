package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;


    class ComparatorPorAltura implements Comparator<Pessoa> {
        @Override
        public int compare(Pessoa p1, Pessoa p2) {
          return Double.compare(p1.getAltura(), p2.getAltura());
        }
      }


    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }


    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenaPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
          Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
          return pessoasPorAltura;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }

      public static void main(String[] args) {
          OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();
      
          ordenacaoPessoas.adicionarPessoa("Pedro", 16, 1.66);
          ordenacaoPessoas.adicionarPessoa("Fernando", 10, 1.74);
          ordenacaoPessoas.adicionarPessoa("Tio Phill", 32, 1.90);
          ordenacaoPessoas.adicionarPessoa("David", 27, 1.76);
      
          System.out.println(ordenacaoPessoas.pessoaList);
      
          System.out.println(ordenacaoPessoas.ordenarPorIdade());
      
          System.out.println(ordenacaoPessoas.ordenaPorAltura());
        }
      }

