package PBOP6;

public class ThreadsInput extends Thread {
    private int n;

    public ThreadsInput(int n) {
        this.n = n;
    }

    @Override
    public void run() {

        System.out.println(
            "Thread anak ke-" + n + " sedang berjalan"
        );

    }
}   
