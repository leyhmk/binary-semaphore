public class PrintX extends Printer implements Runnable {


    /**
     * Override the run() method in the Runnable class.
     * This method control the printing of the upper case
     * letter "X".
     */
    @Override
    public void run() {
        while (true) {
                try {
                    //Make the thread sleep for a random number of milliseconds
                    Thread.sleep((long) (Math.random() * 200));

                    X_BINARY.P(); //Wait until the binary semaphore for printing "X" is available
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("X");
                W_BINARY.V(); //Release the binary semaphore for printing "W"
        }
    }
}
