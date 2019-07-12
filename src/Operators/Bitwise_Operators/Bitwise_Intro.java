package Operators.Bitwise_Operators;

public class Bitwise_Intro {

    public static void main(String[] args) {

        //Bitwise AND (&)
        System.out.println(9 & 7);

        //Bitwise OR (|)
        System.out.println(19 | 7);

        //Bitwise XOR (^)
        System.out.println(9 ^ 7);

        //Left shift (<<)
        System.out.println(9 << 7);

        //Bitwise complement (~): inverts one and zero in a
        // number
        int i = 1;
        System.out.println(i);

        int j = ~i + 1;
        System.out.println(j);

        i = ~j + 1;
        System.out.println(i);

        //Demonstrate the bitwise logical operators

        String binary[] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        int a = 3; // 0+2+1 or 0011 in binary
        int b = 6; // 4+2+0 or 0110 in binary
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;

        System.out.println("    a = " + binary[a]);
        System.out.println("    b = " + binary[b]);
        System.out.println("    a|b = " + binary[c]);
        System.out.println("    a&b = " + binary[d]);
        System.out.println("    a^b = " + binary[e]);
        System.out.println("~a&b|a&~b = " + binary[f]);
        System.out.println("    ~a = " + binary[g]);

    }
}
