package ex3.ex5;
/* @author Luam */

public class Casa {
    protected Porta[] portas = new Porta[10];
    protected int qtdePortas = 0;
    protected String cor;
    
    void addPortas(Porta p){
        portas[qtdePortas]= p;
        qtdePortas++;
    }

    void quantasAbertas(){
        int s=0;
        for (int i=0; i<qtdePortas; i++){
            if(portas[i].estado) {
                s++;
            }
        }
        System.out.printf("tem %d portas abertas!\n", s);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}
