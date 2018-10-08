public class WaterBottle {
    private int vol;

    public WaterBottle(int vol) {
        this.vol = vol;
    }

    public int getVolume() {
        return this.vol;
    }

    public int drink() {
        return this.vol - 10;
    }

    public int empty() {
        return this.vol - this.vol;
    }

    public int refill() {
        while (this.vol < 100) this.vol++;
        return this.vol;
    }
}
