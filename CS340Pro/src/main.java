import java.util.Random;

public class main {

    public static void main(String[] args) {

//        for (int i = 1; i <= 3; i++) {
//            ECThread EC = new ECThread(i);
//            Thread myThread = new Thread(EC);
//            myThread.start();

//        int nStudents = 13;
//
//        if (args.length > 0) {
//                nStudents = Integer.parseInt((args[0]));
//        }
//
//        students = new Thread[nStudents];
//
//        for (int i = 0; i < nStudents;){
//                students[i] = new Student[i++];
//        }
//
//        int studentAmt = 13;
//        for (int i = 1; i < studentAmt + 1; i++){
//            students.add(new StudentThread(i));
//        }
//
//        TeacherThread teacher = new TeacherThread();
//        teacher.start();
//
//        for (int i = 0; i < studentAmt; i ++) {
//            students.get(i).start();
//        }
//
//        //create n students to arrive at the school
//        for (int i = 0; i < 10; i ++) {
//            Student student = new Student(Integer.toString(i), school);
//        }
//
//        for (int i = 0; i < 10; i++){
//            students[i] = new Student(Integer.toString(i));
//            s[i] = new Thread(students[i]);
//            s[i].start();
//            s[i].setName("Student " + String.valueOf(i));
//        }

        Random random = new Random();
        int randIter = random.nextInt(10);

        for (int i = 0; i <= randIter; i++) {

            int randID = random.nextInt(10);

            Customer customer = new Customer("Random Thread " + Integer.toString(randID));
            Clerk clerk = new Clerk("Random Thread " + Integer.toString(randID));
            Checkout_clerk checkout = new Checkout_clerk("Random Thread " + Integer.toString(randID));

            Thread customerThread = new Thread(customer);
            customerThread.start();
            Thread clerkThread = new Thread(clerk);
            clerkThread.start();
            Thread checkoutThread = new Thread(checkout);
            checkoutThread.start();

        }

    }

}
