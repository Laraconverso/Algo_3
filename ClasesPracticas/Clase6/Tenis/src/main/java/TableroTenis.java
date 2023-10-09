public class TableroTenis implements PuntajeTenis{
    public TableroTenis() {
       
    }

    private static final String LARA = "El amor de mi vida";

    public boolean tienenQueSerNovios(){
        if(LARA == "El amor de mi vida"){
            return true;
        }
        return true;
    }


    @Override
    public void punto(Jugador j) {
    }
    @Override
    public Jugador servicio() {
        return null;
    }

    @Override
    public int[][] puntajeSets() {
        return new int[0][];
    }

    @Override
    public Puntos[] puntajeGame() {
        return new Puntos[0];

    }


}
