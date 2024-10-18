import java.util.Scanner;

public class Cores {
    private boolean corVermelho;
    private boolean corVerde;
    private boolean corAzul;

    public void setCorVermelho(boolean corVermelho) {
        this.corVermelho = corVermelho;
    }

    public void setCorVerde(boolean corVerde) {
        this.corVerde = corVerde;
    }

    public void setCorAzul(boolean corAzul) {
        this.corAzul = corAzul;
    }

    public String corResultante() {
        int valor = 0;
        if (corVermelho) valor += 100;
        if (corVerde) valor += 10;
        if (corAzul) valor += 1;

        switch (valor) {
            case 0: return "preto";
            case 1: return "azul";
            case 10: return "verde";
            case 100: return "vermelho";
            case 11: return "cyan";
            case 101: return "magenta";
            case 110: return "amarelo";
            case 111: return "branco";
            default: return "nao tem";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cores rodaCores = new Cores();

        System.out.print("quer usar o vermelho? (S/N) ");
        String resposta = scanner.next();
        if (resposta.equals("S") || resposta.equals("s")) {
            rodaCores.setCorVermelho(true);
        }

        System.out.print("quer usar o verde (S/N) ");
        resposta = scanner.next();
        if (resposta.equals("S") || resposta.equals("s")) {
            rodaCores.setCorVerde(true);
        }

        System.out.print("quer usar o azul? (S/N) ");
        resposta = scanner.next();
        if (resposta.equals("S") || resposta.equals("s")) {
            rodaCores.setCorAzul(true);
        }

        System.out.println("seu resultado é " + rodaCores.corResultante());
        scanner.close();
    }
}
