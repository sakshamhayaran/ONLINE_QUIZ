import java.util.*;
public class ScienceQuiz {
    public void Science() {

        Scanner sc = new Scanner(System.in);
        char youranswer1;
        int correct1 = 0;
        System.out.println("\n[Q1] UNIT OF FORCE ?");
        System.out.println("OPTIONS..");
        System.out.println("(a) Pascal");
        System.out.println("(b) Newton");
        System.out.println("(c) Joule");
        System.out.println("(d) Coulomb");
        System.out.println("Your Answer :");
        youranswer1 = sc.next().charAt(0);
        if (youranswer1 == 'b') {
            System.out.println("CORRECT ANSWER! KEEP IT UP.");
            correct1++;
        } else {
            System.out.println("SORRY, WRONG ANSWER!!");
        }
        System.out.println("\n[Q2] ACCELERATION DUE TO GRAVITY ON EARTH ?");
        System.out.println("OPTIONS..");
        System.out.println("(a) 8.9 m/s^2");
        System.out.println("(b) 4.29 m/s^2");
        System.out.println("(c) 11.2 m/s^2");
        System.out.println("(d) 9.8 m/s^2");
        System.out.println("Your Answer :");
        youranswer1 = sc.next().charAt(0);
        if (youranswer1 == 'd') {
            System.out.println("CORRECT ANSWER! KEEP IT UP.");
            correct1++;
        } else {
            System.out.println("SORRY, WRONG ANSWER!!");
        }
        System.out.println("\n[Q3] UNIT OF PRESSURE ?");
        System.out.println("OPTIONS..");
        System.out.println("(a) Pascal");
        System.out.println("(b) Weber");
        System.out.println("(c) Candela");
        System.out.println("(d) Farad");
        System.out.println("Your Answer :");
        youranswer1 = sc.next().charAt(0);
        if (youranswer1 == 'a') {
            System.out.println("CORRECT ANSWER! KEEP IT UP.");
            correct1++;
        } else {
            System.out.println("SORRY, WRONG ANSWER!!");
        }
        System.out.println("\n[Q4] SPEED OF LIGHT ?");
        System.out.println("OPTIONS..");
        System.out.println("(a) 3 x 8^10 m/s");
        System.out.println("(b) 8 x 10^3 m/s");
        System.out.println("(c) 3 x 10^8 m/s");
        System.out.println("(d) 10 x 3^8 m/s");
        System.out.println("Your Answer :");
        youranswer1 = sc.next().charAt(0);
        if (youranswer1 == 'c') {
            System.out.println("CORRECT ANSWER! KEEP IT UP.");
            correct1++;
        } else {
            System.out.println("SORRY, WRONG ANSWER!!");
        }
        System.out.println("\n[Q5] UNIT OF CURRENT ?");
        System.out.println("OPTIONS..");
        System.out.println("(a) HERTZ");
        System.out.println("(b) TESLA");
        System.out.println("(c) AMPERE");
        System.out.println("(d) OHM");
        System.out.println("Your Answer :");
        youranswer1 = sc.next().charAt(0);
        if (youranswer1 == 'c') {
            System.out.println("CORRECT ANSWER! KEEP IT UP.");
            correct1++;
        } else {
            System.out.println("SORRY, WRONG ANSWER!!");
        }
        System.out.println("\n[Q6] RATE OF CHANGE IN VELOCITY ?");
        System.out.println("OPTIONS..");
        System.out.println("(a) Momentum");
        System.out.println("(b) Acceleration");
        System.out.println("(c) Energy");
        System.out.println("(d) Speed");
        System.out.println("Your Answer :");
        youranswer1 = sc.next().charAt(0);
        if (youranswer1 == 'b') {
            System.out.println("CORRECT ANSWER! KEEP IT UP.");
            correct1++;
        } else {
            System.out.println("SORRY, WRONG ANSWER!!");
        }
        System.out.println("\n[Q7] NEWTON'S SECOND LAW : ?");
        System.out.println("OPTIONS..");
        System.out.println("(a) F = m * a");
        System.out.println("(b) F = m / a");
        System.out.println("(c) F = m + a");
        System.out.println("(d) F = m - a");
        System.out.println("Your Answer :");
        youranswer1 = sc.next().charAt(0);
        if (youranswer1 == 'a') {
            System.out.println("CORRECT ANSWER! KEEP IT UP.");
            correct1++;
        } else {
            System.out.println("SORRY, WRONG ANSWER!!");
        }
        System.out.println("\n[Q8] ____ = DISTANCE / TIME");
        System.out.println("OPTIONS..");
        System.out.println("(a) Velocity");
        System.out.println("(b) Acceleration");
        System.out.println("(c) Work done");
        System.out.println("(d) Speed");
        System.out.println("Your Answer :");
        youranswer1 = sc.next().charAt(0);
        if (youranswer1 == 'd') {
            System.out.println("CORRECT ANSWER! KEEP IT UP.");
            correct1++;
        } else {
            System.out.println("SORRY, WRONG ANSWER!!");
        }
        System.out.println("\n[Q9] THE PUSH OR PULL MOVEMENT ON AN OBJECT");
        System.out.println("OPTIONS..");
        System.out.println("(a) Force");
        System.out.println("(b) Gravity");
        System.out.println("(c) Friction");
        System.out.println("(d) Collision");
        System.out.println("Your Answer :");
        youranswer1 = sc.next().charAt(0);
        if (youranswer1 == 'a') {
            System.out.println("CORRECT ANSWER! KEEP IT UP.");
            correct1++;
        } else {
            System.out.println("SORRY, WRONG ANSWER!!");
        }
        System.out.println("\n[Q10] WHAT IS THE SMALLEST PARTICLE OF AN ELEMENT ?");
        System.out.println("OPTIONS..");
        System.out.println("(a) Photon");
        System.out.println("(b) Nucleus");
        System.out.println("(c) Proton");
        System.out.println("(d) Atom");
        System.out.println("Your Answer :");
        youranswer1 = sc.next().charAt(0);
        if (youranswer1 == 'd') {
            System.out.println("CORRECT ANSWER! KEEP IT UP.");
            correct1++;
        } else {
            System.out.println("SORRY, WRONG ANSWER!!");
        }
        System.out.println("\n");
        System.out.println("=================================");
        System.out.println("|| QUIZ COMPLETED SUCCESSFULLY ||");
        System.out.println("||   YOUR RESULT  ->  " + correct1 + "/10   ||");
        System.out.println("=================================");
    }
}