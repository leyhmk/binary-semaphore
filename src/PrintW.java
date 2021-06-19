public class PrintW extends Printer implements Runnable {


    /**
     * Override the run() method in the Runnable class.
     * This method control the printing of the upper case
     * letter "W".
     */
    @Override
    public void run() {
        while (true){
            try {
                //Make the thread sleep for a random number of milliseconds
                Thread.sleep((long) (Math.random() * 100));

                W_BINARY.P(); //Wait until the binary semaphore for printing "W" is available
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("W");
            countUpper.V(); //Release the semaphore for printing either "y" or "z"
            X_BINARY.V(); //Release the binary semaphore for printing "X"
        }
    }
}
