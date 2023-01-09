public class Checkout_clerk implements Runnable {

    private String name;

    public Checkout_clerk(String RandomThread) {
        name = RandomThread;
    }

    @Override
    public void run() {
        msg("now");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static long time = System.currentTimeMillis();

    public void msg(String m) {
        System.out.println("[" + (System.currentTimeMillis() - time) + "] " + getName()
                + ": " + m);
    }}
