public class Azione extends Thread{
    
    Salvadanaio salvadanaio;
    boolean inserisci;

    public Azione(Salvadanaio s, boolean i){
        this.salvadanaio = s;
        this.inserisci = i;
    }

    public void run(){
        for(int i = 0; i < 10000; i++){
            if(inserisci){
                salvadanaio.inserisci();
            }
            else{
                salvadanaio.preleva();
            }
        }
    }

}
