package controleremoto;
public class FuncoesControle {
    
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Métodos especiais
    public void estadoAtual(){
        System.out.println("");
    }
    
    
    //Métodos personalizados
    public void Volume(){
        
    }
    
    public void Ligado(){
        
    }
    
    public void Tocando(){
        
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
            
}
