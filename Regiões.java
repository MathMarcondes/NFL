public abstract class Regiões {
    private String name;
    private int victories;
    private int lost;
    private int positions;
    private String próximoConfronto;



    

    public Regiões(String name, int victories, int lost, int positions, String próximoConfronto) {
        this.name = name;
        this.victories = victories;
        this.lost = lost;
        this.positions = positions;
        this.próximoConfronto = próximoConfronto;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVictories() {
        return victories;
    }
    public void setVictories(int victories) {
        this.victories = victories;
    }
    public int getLost() {
        return lost;
    }
    public void setLost(int lost) {
        this.lost = lost;
    }
    public int getPositions() {
        return positions;
    }
    public void setPositions(int positions) {
        this.positions = positions;
    }
    //  
    public void adicionarVit(){
        setVictories(getVictories()+1);
    }
    public void adicionarLos(){
        setLost(getLost()+1);
    }

    //
    

    public void estatísticas(){

    }
    @Override
    public String toString() {
        return "Regiões [lost=" + lost + ", name=" + name + ", positions=" + positions + ", próximoConfronto="
                + próximoConfronto + ", victories=" + victories + "]";
    }
    public void marcarJogo(){

    }
    

    

    

}
