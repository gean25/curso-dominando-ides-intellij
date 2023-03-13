package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);
        Livro livro1 = new Livro("O problema dos 3 corpos",300);
        System.out.println(livro1);
        /*
        int a = 5;
        int b = 5;
        System.out.println("Hello World " + (a+b));
        */
     }
    }

class Livro{
    private String nome;
    private Integer nm_pag;

    public Livro(String nome, Integer nm_pag) {
        this.nome = nome;
        this.nm_pag = nm_pag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNm_pag() {
        return nm_pag;
    }

    public void setNm_pag(Integer nm_pag) {
        this.nm_pag = nm_pag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", nm_pag=" + nm_pag +
                '}';
    }
}
