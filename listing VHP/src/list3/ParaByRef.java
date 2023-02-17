package list3;

public class ParaByRef {
    int x, y;

    ParaByRef(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void ParaByRef(ParaByRef o) {
        o.x = o.x + this.x;
        o.x = o.x + this.y;
    }
}
class Parabyrefdemo {
    public static void main(String[] args) {
        ParaByRef p = new ParaByRef(2,3);
        ParaByRef q = new ParaByRef(3, 2);

        System.out.println("q.x = " + q.x);
        System.out.println("q.y = " + q.y);

        p.ParaByRef(q);

        System.out.println("q.x = " + q.x);
        System.out.println("q.y = " + q.y);
    }
}

