package com.github.jagarsoft;

public class Disassembler implements Z80OpCode { // extends z80
    // eliminar cuando se mueva a Z80OpCode
    static int offset = 0;

    
    String cc[] = new String[] {
            "NZ", "Z", "NC", "C", "PO", "PE", "P", "M" 
    };

    // cuando extienda de z80 todos los metodos de abajo sobrecargaran a los de la clase z80
    public int NOP(byte z, byte y) {
        System.out.println("NOP");
        return 0;
    }

    public int EX_AF_AF_(byte z, byte y) {
        System.out.println("EX AF, AF'");
        return 0;
    }

    public int DJNZ(byte y, byte d) {
        if( offset == 0 ){
            return ++offset;
        }

        System.out.println("DJNZ " + d);
        return offset = 0;
    }

    public int JR(byte y, byte d) {
        if( offset == 0 ){
            return ++offset;
        }
        
        System.out.println("JR " + d);
        return offset = 0;
    }

    public int JR_cc(byte y, byte d) {
        if( offset == 0 ){
            return ++offset;
        }
        
        System.out.println("JR " + cc[y-4] + ", " + d);
        return offset = 0;
    }
}
