public class Aplic {
    public static void main(String[] args) {

            Prova provaUmAluno1 = new Prova();
            double notaTotalProvaUmAluno1 = provaUmAluno1.calcularNotaTotalAluno1(4, 2.5);
            System.out.println("Nota total prova um: " + notaTotalProvaUmAluno1);

            Prova provaDoisAluno1 = new Prova();
            double notaTotalProvaDoisAluno1 = provaDoisAluno1.calcularNotaTotalAluno1(1, 7);
            System.out.println("Nota total prova dois: " + notaTotalProvaDoisAluno1);

            Aluno mediaProvaUmDoisAluno1 = new Aluno();
            double mediaProvaAluno1 = mediaProvaUmDoisAluno1.calcularMediaAluno1(notaTotalProvaUmAluno1, notaTotalProvaDoisAluno1);
            System.out.println("Média do aluno 1: "+mediaProvaAluno1);


            Prova provaUmAluno2 = new Prova();
            double notaTotalProvaUmAluno2 = provaUmAluno2.calcularNotaTotalAluno2(6.5, 3.5);
            System.out.println("\n\nNota total prova um: " + notaTotalProvaUmAluno2);

            Prova provaDoisAluno2 = new Prova();
            double notaTotalProvaDoisAluno2 = provaDoisAluno2.calcularNotaTotalAluno2(0, 3);
            System.out.println("Nota total prova dois: " + notaTotalProvaDoisAluno2);

            Aluno mediaProvaUmDoisAluno2 = new Aluno();
            double mediaProvaAluno2 = mediaProvaUmDoisAluno2.calcularMediaAluno2(notaTotalProvaUmAluno2, notaTotalProvaDoisAluno2);
            System.out.println("Média do aluno 2: "+mediaProvaAluno2);


            Prova provaUmAluno3 = new Prova();
            double notaTotalProvaUmAluno3 = provaUmAluno1.calcularNotaTotalAluno3(5, 4);
            System.out.println("\n\nNota total prova um: " + notaTotalProvaUmAluno3);

            Prova provaDoisAluno3 = new Prova();
            double notaTotalProvaDoisAluno3 = provaDoisAluno3.calcularNotaTotalAluno3(6, 1.5);
            System.out.println("Nota total prova dois: " + notaTotalProvaDoisAluno3);

            Aluno mediaProvaUmDoisAluno3 = new Aluno();
            double mediaProvaAluno3 = mediaProvaUmDoisAluno3.calcularMediaAluno3(notaTotalProvaUmAluno3, notaTotalProvaDoisAluno3);
            System.out.println("Média do aluno 3: "+mediaProvaAluno3);


            Turma mediaTurma = new Turma();
            double mediaTurmaTotal = mediaTurma.calcularMediaTotal(mediaProvaAluno1,mediaProvaAluno2,mediaProvaAluno3);
            System.out.println("\n\nMédia da turma: "+mediaTurmaTotal);

    }
}
