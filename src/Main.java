public class Main {
    public static void main(String[] args) {
        int prova1 = 4;
        int prova2 = 4;
        int prova3 = 4;
        int prova4 = 4;
        int nota = (prova1 + prova2 + prova3 + prova4) / 4;
        System.out.println(getNota(nota));
        String notaSt = getNota(nota);
    }

    public static String getNota(int nota) {
        if (nota >= 7){
            return "passou direto";
        } else if (nota >= 5){
            return "Recuperação";
        } else
            return "Reprovado";
    }
}

 