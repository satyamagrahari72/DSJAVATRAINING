package OOPS;

public class classobject {
    public static void main(String[] args) {
        //print the trainer name, technology
        //print the student name, technology
        trainer Trainer = new trainer();
        Trainer.trainername = "Vansh";
        Trainer.trainertechnology= "JAVA Android IOS Flutter React Native";
        System.out.println("MY name is : "+ Trainer.trainername+" my technology is:" + Trainer.trainertechnology);

    }
}
    class trainer {
        String trainername;
        String trainertechnology;
    }

    class student {
        String studentname;
        String studentEnrolledtechnology;
    }

