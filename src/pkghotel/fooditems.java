package pkghotel;

public class fooditems {
    int tea;
    int coffe;
    int biriyani;
    int juice;
    int shake;

    public fooditems(int tea, int coffe, int biriyani, int juice, int shake) {
        this.tea = tea;
        this.coffe = coffe;
        this.biriyani = biriyani;
        this.juice = juice;
        this.shake = shake;
    }

    public int getTea() {
        return tea;
    }

    public void setTea(int tea) {
        this.tea = tea;
    }

    public int getCoffe() {
        return coffe;
    }

    public void setCoffe(int coffe) {
        this.coffe = coffe;
    }

    public int getBiriyani() {
        return biriyani;
    }

    public void setBiriyani(int biriyani) {
        this.biriyani = biriyani;
    }

    public int getJuice() {
        return juice;
    }

    public void setJuice(int juice) {
        this.juice = juice;
    }

    public int getShake() {
        return shake;
    }

    public void setShake(int shake) {
        this.shake = shake;
    }
}
