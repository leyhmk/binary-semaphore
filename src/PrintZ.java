public class PrintZ extends Printer implements Runnable {


    /**
     * Override the run() method in the Runnable class.
     * This method control the printing of the lower case
     * letter "z".
     */
    @Override
    public void run() {
        while (true) {
                try {
                    //Wait until the number of printed "W" is more than the number of
                    //printed "y" and "z"
                    countUpper.P();

                    //Make the thread sleep for a random number of milliseconds
                    Thread.sleep((long) (Math.random() * 400));

                    Z_BINARY.P();//Wait until the binary semaphore for printing "z" is available
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("z");
                Y_BINARY.V(); //Release the binary semaphore for printing "y"
        }
    }
}
