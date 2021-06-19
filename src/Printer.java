public class Printer {


    //Binary Semaphore for printing upper case letter "W" and "X"
    protected static final BinarySemaphore W_BINARY = new BinarySemaphore(1);
    protected static final BinarySemaphore X_BINARY = new BinarySemaphore(0);


    //Binary Semaphore for printing lower case letter "y" and "z"
    protected static final BinarySemaphore Y_BINARY = new BinarySemaphore(1);
    protected static final BinarySemaphore Z_BINARY = new BinarySemaphore(0);


    //Semaphore for counting the number of "W", "y" and "z" printed
    //Ensure the total number of "y"s and "z"s do not exceed the number of "W"s printed
    protected static final Semaphore countUpper = new Semaphore(0);

}

