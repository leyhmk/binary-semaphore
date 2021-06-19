public class PrinterCon {


    /**
     * For testing the whole system.
     */
    public static void main(String[] args) throws InterruptedException {

        new Thread(new PrintW()).start(); //Create and start the thread for printing "W"
        new Thread(new PrintX()).start(); //Create and start the thread for printing "X"
        new Thread(new PrintY()).start(); //Create and start the thread for printing "y"
        new Thread(new PrintZ()).start(); //Create and start the thread for printing "z"

        //Make the thread sleep for a random number of milliseconds
        Thread.sleep((long) (Math.random() * 1000));

        System.exit(0); //Stop the threads
    }
}
