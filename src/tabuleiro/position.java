package tabuleiro;

public class position {
    private int linha;
    private int coluna;
    private int apagar;

    public position(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getLinha() {
        return this.linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return this.coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    @Override
    public String ToString(){
        return linha + ", " + coluna;
    }
}
