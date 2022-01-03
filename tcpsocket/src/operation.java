public class operation {
    int type ;
    float transfert;

    public operation(int type, float transfert) {
        this.type = type;
        this.transfert = transfert;
    }

    public operation(float transfert) {
        this.transfert = transfert;
    }

    public float getTransfert() {
        return transfert;
    }

    public void setTransfert(float transfert) {
        this.transfert = transfert;
    }
}
