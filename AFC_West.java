public class AFC_West extends Regiões{
    
    
    
    public AFC_West(String name, int victories, int lost, int positions, String próximoConfronto) {
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
