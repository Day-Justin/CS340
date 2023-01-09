public class main {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            ECThread EC = new ECThread(i);
            Thread myThread = new Thread(EC);
            myThread.start();

        }
    }

}
