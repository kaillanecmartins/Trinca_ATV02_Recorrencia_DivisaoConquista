package q3;

public class Questao3 {
    private double valor;
    private double und;
    private int troca;
    private int saida;

    public Questao3(double valor, double und, int troca) {
        this.valor = valor;
        this.und = und;
        this.troca = troca;
        this.saida = 0;
    }
    
    public Questao3(){
        
    }
    
    public int calculaQTD(){
        int qtd = (int) (this.valor / this.und);
        return qtd;
    }
    
    public int calculaSaida(int qtd){
        
        if(qtd > 0){
           this.saida += qtd + calculaSaida((int)(qtd/this.troca));
        }
        
        return this.saida;
    }

    public double getValor() {
        return valor;
    }

    public double getUnd() {
        return und;
    }

    public int getTroca() {
        return troca;
    }

    public int getSaida() {
        return saida;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setUnd(double und) {
        this.und = und;
    }

    public void setTroca(int troca) {
        this.troca = troca;
    }

    public void setSaida(int saida) {
        this.saida = saida;
    }
    
    
    
}
