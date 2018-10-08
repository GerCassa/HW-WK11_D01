public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }


    public int paperLoad() {
        return this.paper;
    }

    public int print(int a, int b) {
        int pages = a * b;
        if (this.paper >= pages) {
            this.paper = this.paper - pages;
            this.toner = this.toner - pages;
            return this.paper;
        }
        return pages;
    }

    public int refill() {
        while (this.paper < 200) this.paper++;
        return this.paper;
    }

    public int toner() {
        return this.toner;
    }
}
