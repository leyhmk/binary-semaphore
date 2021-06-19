public class PrintY extends Printer implements Runnable {


    /**
     * Override the run() method in the Runnable class.
     * This method control the printing of the lower case
     * letter "y".
     */
    @Override
    public void run() {
        while (true) {
            try {
                //Wait until the number of printed "W" is more than the number of
                //printed "y" and "z"
                countUpper.P();

                //Make the thread sleep for a random number of milliseconds
                Thread.sleep((long) (Math.random()*300));

                Y_BINARY.P(); //Wait until the binary semaphore for printing "y" is available
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("y");
            Z_BINARY.V(); //Release the binary semaphore for printing "z"
        }
    }
}
