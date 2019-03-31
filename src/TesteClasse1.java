public class TesteClasse1 {
    
    public static void main(String[] args) {
   
        Classe1 c1 = new Classe1();
        c1.aluno = "Hudson Galiza";
        c1.semestre = "4 semestre";
        c1.disciplina = "AED III";
        
        System.out.println(c1.aluno);
        System.out.println("Você foi matriculado na matéria:" + c1.disciplina);
}
}
