import java.util.Arrays;
import java.util.Objects;

public class Main {

    boolean b1;
    byte b2;
    char c;
    short s;
    int i;
    long l;
    float f;
    double d;
    int[] ints;

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        boolean b1 = true; // 1
        byte b2 = 1; // 8
        char c = 'a'; // 16
        short s = 1; // 16
        int i = 1; // 32
        long l = 1; // 32
        float f = 1; // 64
        double d = 1; //

        char oct = 015;
        char hex = 0XFF;

        int[] ints = new int[5];
        int[] ints2 = {1, 2, 3};

        System.out.println("Hello World!");
        System.out.println(d + i);
        System.out.println(this.ints);
        System.out.println(ints[0]);
        System.out.println(b2 << 2);

        if (this instanceof Main) {
            System.out.println("Main");
        }

        System.out.println("AND = " + (1 & 0));
        System.out.println("OR = " + (1 | 0));
        System.out.println("XOR = " + (1 ^ 1));

        int x, y, z = 1;
        x = y = z;
        System.out.println("x = " + x);

        byte narrowed = (byte)i;
        int widended = b2;
        float fl = (float)21.2; // Defeault to double so must be cast
        byte autonarrowed = 2; // int literal is autonarrowed

        inside((byte)i);

        Child child = new Child();
        child.call();

        Parent parent = child;
    }

    synchronized final void sync() {
    }

    private void inside(byte b) {
        System.out.println("Inside = " + b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return b1 == main.b1 &&
                b2 == main.b2 &&
                c == main.c &&
                s == main.s &&
                i == main.i &&
                l == main.l &&
                Float.compare(main.f, f) == 0 &&
                Double.compare(main.d, d) == 0 &&
                Arrays.equals(ints, main.ints);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(b1, b2, c, s, i, l, f, d);
        result = 31 * result + Arrays.hashCode(ints);
        return result;
    }
}
