package a.aaula06oo.eccapsulamneto;

public class ControleRemoto implements Controlador {
    //atributos 
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //metodos especiais
    
    public ControleRemoto(){
        this.volume = 50;
        this.ligado =  true;
        this.tocando = false;
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
    
    //metodos abstratos
    //@Override quer dizer que eu ja tinha um metodo definido e eu estou sobre escrevendo ele.
    
    
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i =0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu!");
        if (this.getTocando()) {
            
        } else {
        }
    }
    @Override

    public void maisVolume() { //isso é um botao, cada vez q eu chamar ele add + 5 no volume
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
            if(this.getVolume() > 100){
                this.setVolume(this.getVolume() - 5);
                System.out.println("Volume ja esta no maximo!");
            }
        } 
    }

    @Override
    public void menosVolue() {//isso é um botao, cada vez q eu chamar ele add - 5 no volume
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } 
    }

    @Override
    public void ligarMudo() {
         if (this.getLigado() && this.getVolume()>0) {
            this.setVolume(0);
        } 
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
    
}
