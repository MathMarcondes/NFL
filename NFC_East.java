public class NFC_East extends Regiões {

    
    
    public NFC_East(String name, int victories, int lost, int positions, String próximoConfronto) {
        super(name, victories, lost, positions, próximoConfronto);
    }
    public void Status(){
        System.out.println(getName());
        System.out.println("Vitórias: " + getVictories());
        System.out.println("Derrotas: " + getLost());
        System.out.println("Posição Tabela: " + getPositions());
    }
    public void jogadores(){

    }
    public void jogosPassados(){

    }
    public void probabilidadeVitória(){
        
    }
}
