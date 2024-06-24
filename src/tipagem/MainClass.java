package tipagem;

import tipagem.conditionals.Conditions;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Esta é a Classe Main");
        // cria a instância da classe Tipos
        Tipos tipos = new Tipos();
        Conditions condicao = new Conditions();

        //invocação do método da classe Tipos
        tipos.showValues();

        //invocação do método com parâmetros da classe Conditions
        condicao.exampleIfElse(15);
        condicao.exampleIfElseIfElse(14);
    }
}
