package net.vanheesch;

import java.util.Random;
import java.util.stream.IntStream;

public class Processor {
    private static final Random g = new Random();
    public static void main(String[] args) {
        char[][][] q = {
                { {'L','i','a','m'}, {'M','i','l','a'}, {'N','o','a','h'}, {'E','m','i','l','i','a'},
                        {'F','i','n','n'}, {'L','e','a'}, {'B','e','n'}, {'S','o','f','i','a'} },
                { {'t','a','n','z','t'}, {'c','o','d','e','t'}, {'b','a','s','t','e','l',
                        't'}, {'z','o','c','k','t'}, {'l','i','e','b','t'}, {'h','ö',
                        'r','t'}, {'s','a','m','m','e','l','t'}, {'z','e','r','l','e','g','t'} },
                { {'B','l','u','e','t','o','o','t','h','-','B','o','x','e','n'}, {'A','v','o',
                        'c','a','d','o','s'}, {'T','i','k','T','o','k','-','V','i','d','e','o',
                        's'}, {'S','n','e','a','k','e','r'}, {'L','E','D','-','S','t','r','i',
                        'p','e','s'}, {'P','r','o','t','e','i','n','r','i','e','g','e','l'},
                        {'P','l','a','s','t','i','k','r','o','b','o','t','e','r'}, {'R','e','g',
                        'e','n','j','a','c','k','e','n'} }
        };

        IntStream.range(0, 5).forEach(i -> {
            p(q[0][g.nextInt(q[0]
                    .length)]);
            p(" ");
            p(q[1][g.nextInt(q[1]
                    .length)]);
            p(" ");
            p(q[2][g.nextInt(q[2]
                    .length-1)]);
            p("\n");
        });
    }
    public static void p(char[] x) {
        for (char y : x) System.out.print(y);
    }
    public static void p(String s) {
        System.out.print(s);
    }
}
