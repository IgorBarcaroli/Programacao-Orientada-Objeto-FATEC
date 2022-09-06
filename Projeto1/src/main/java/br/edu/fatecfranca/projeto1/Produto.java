package br.edu.fatecfranca.projeto1;

/**
 *
 * @author daniel.pires
 */

// uma classe é algo abstrato, serve de modelo
// para a criação de objetos, que são instanciados

public final class Produto {
    private String nome;
    private int qtde;
    private double preco;
    
    // método construtor vazio - deve ter o mesmo nome da classe
    public Produto(){
        
    }
    // método construtor para inicializar as variáveis
    // deve ter o mesmo nome da classe
    public Produto(String nome, int qtde, double preco){
        // this representa o objeto que chamou o método
        this.setNome(nome);
        this.setQtde(qtde);
        this.setPreco(preco);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQtde(int qtde) {
        if (qtde >= 0) {
            this.qtde = qtde;
        }
        else {
            System.out.println("Quantidade não pode ser negativa!");
        }
    }
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
        else {
            System.out.println("Preço não pode ser negativo!");
        }
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getQtde() {
        return this.qtde;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    
    // comprar um produto em x unidades
    public void comprar(int x){
        this.setQtde(this.qtde + x);
    }
    // vender um produto em x unidades
    public void vender(int x){
        this.setQtde(this.qtde - x);
    }
    // subir o preço de um produto em x unidades
    public void subir(double x){
        this.preco += x;
    }
    // desce o preço de um produto em x unidades
    public void descer(double x){
        if (x <= this.preco){
            this.preco -= x;
        }
    }
    public void mostrar(){
        System.out.println("Dados \nNome: " + this.nome +
               " Qtde " + this.qtde + " Preço " + this.preco);
    }
}
