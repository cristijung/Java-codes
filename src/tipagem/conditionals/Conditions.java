package tipagem.conditionals;

public class Conditions {

    public void exampleIfElse(int Ana) {
        if (Ana > 18) {
            System.out.println("Ana é maior de idade");
        } else {
            System.out.println("Ana é menor de idade");
        }
    }

    public void exampleIfElseIfElse(int Pafuncio) {
        if (Pafuncio < 14) {
            System.out.println("Ele é adolescente, só tem 14!");
        } else if (Pafuncio > 16 ) {
            System.out.println("Pafuncio é adolescente, ele tem 16");
        } else {
            System.out.println("Ele tem 15 anos");
        }
    }
}
