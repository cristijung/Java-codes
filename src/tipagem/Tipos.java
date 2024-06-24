package tipagem;

public class Tipos {
    //variáveis primitivas
    byte varByte = 127;
    short varShort = 32767;
    public int number = 128;
    public long numLong = 9223372036854775807L;

    public float decimal = 3.14f;
    public double varDouble = 5.6;

    //tipo char e booleano
    public char varChar = 'A';
    public boolean varBoolean = true;

    //variáveis de referência --> objetos
    public String varString = "Oiiiii!!";
    public Integer varInteger = 48;

    //um método
    public void showValues() {
        System.out.println("Variável de String: " + varString);

    }

}
