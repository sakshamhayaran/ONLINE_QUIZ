import java.util.*;
public class OnlineQuiz {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("\n============================");
        System.out.println("|| WELCOME TO ONLINE QUIZ ||");
        System.out.println("============================");
        int ch; String yon;
        boolean yesorno = true;
        while (yesorno) {
            System.out.println("\n1. SCIENCE QUIZ");
            System.out.println("2. MATHS QUIZ");
            System.out.println("3. GENERAL KNOWLEDGE QUIZ");
            System.out.println("\nSelect Your Choice : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    ScienceQuiz obj1 = new ScienceQuiz();
                    obj1.Science();
                    break;

                case 2:
                    MathsQuiz obj2 = new MathsQuiz();
                    obj2.Maths();
                    break;

                case 3:
                    GeneralKnowledgeQuiz obj3 = new GeneralKnowledgeQuiz();
                    obj3.GeneralKnowledge();
                    break;

                default:
                    System.out.println("\nERROR !!!! You Selected Invalid Input.");
            }
            System.out.println("\nDo you want to play again ?");
            System.out.println(" ( Yes or No ) ");
            yon = sc.next();
            yesorno = yon.equalsIgnoreCase("Yes");
        }
    }
}