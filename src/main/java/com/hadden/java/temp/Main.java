package com.hadden.java.temp;

import java.util.*;

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
        //Lambda lambda = new Lambda();
        //lambda.run();
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
        int ints3[] = new int[]{1, 2, 3};
        int a[][] = new int[5][5];
        int []xxx;

        System.out.println(a[1][0]);
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

        x = 5;

        while (x > 0) {
            System.out.println(x--);
        }

        for (x = 0; x < 3; x++) {
            System.out.println(x);
        }

        do {

        } while (false);

        switch (x) {
            case 1:
                break;
            default:
                break;
        }

        System.out.println(MyInterface.ClassInsideInterface.getX());

        // Member inner class
        class Obs<T> implements Enumeration<T> {

            @Override
            public boolean hasMoreElements() {
                return false;
            }

            @Override
            public T nextElement() {
                return null;
            }
        }

        Obs<String> ob = new Obs<String>();

        // Annonymous inner class
        new Enumeration<String>() {

            @Override
            public boolean hasMoreElements() {
                return false;
            }

            @Override
            public String nextElement() {
                return null;
            }
        };

        assert true == true : "Crap";

        System.out.println(1 == 2 ? "EQUAL" : "NO EQUAL");

        StringBuffer sb = new StringBuffer();
        sb.append("STRING BUFF");
        System.out.println(sb);

        List<Integer> list = Arrays.asList(40, 30); // Cannot use add with this
        list = new ArrayList<Integer>();
        list.add(20);
        list.add(10);

        for (int li = 0; li < list.size(); li++) {
            System.out.println(list.get(li));
        }

        for (int num : list) {
            System.out.println(num);
        }

        list.stream().sorted((Integer o1, Integer o2) -> o1 < o2 ? -1 : o2 > o1 ? 1 : 0).forEach(ii -> System.out.println("Here: " + ii));

        Iterator<Integer> lit = list.iterator();

        while (lit.hasNext()) {
            System.out.println(">" + lit.next());
        }

        ListIterator lit2 = list.listIterator(list.size());

        while (lit2.hasPrevious()) {
            System.out.println(">>" + lit2.previous());
        }

        MyEnum o = MyEnum.ORANGE;
        System.out.println(o.getColour());

        Set<String> mySet = new HashSet<String>();
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
