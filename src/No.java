public class No implements Definicoes {
    private int vInfo[];
    private int vPos[];
    private No vLig[];
    private int TL;

    public No() {
        vInfo = new int[2*M+1];
        vPos = new int[2*M+1];
        vLig = new No[2*M+1];
    }

    public No(int info, int posArq){
        this();
        vInfo[0] = info;
        vPos[0] = posArq;
        TL = 1;
    }

    public int procurarPosicao(int pos){
        return 0;
    }

    public void remanejar(){

    }

    public int getvInfo(int p) {
        return vInfo[p];
    }

    public void setvInfo(int p,int Info) {
        this.vInfo[p] = Info;
    }

    public int getvPos(int p) {
        return vPos[p];
    }

    public void setvPos(int p,int Posarq) {
        this.vPos[p] = Posarq;
    }

    public No getvLig(int p) {
        return vLig[p];
    }

    public void setvLig(int p, No Lig) {
        this.vLig[p] = Lig;
    }

    public int getTL() {
        return TL;
    }

    public void setTL(int TL) {
        this.TL = TL;
    }
}
