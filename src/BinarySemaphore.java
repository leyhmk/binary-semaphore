public class BinarySemaphore extends Semaphore {


    /**
     * Create an Binary Semaphore with the given
     * initial value. If the initial value is larger
     * than one, set the initial value as one. Else
     * set the initial value as zero.
     *
     * @param initial the initial value for the binary
     *                semaphore
     */
    public BinarySemaphore(int initial){
        super((initial!=0)? 1:0);
    }


    /**
     * Override the V() method in the Semaphore class.
     */
    @Override
    public final synchronized void V(){
        super.V();
        // As the maximum value for an binary semaphore is one
        // If value is larger than one, set the value to one instead
        if (value>1){
            value =1;
        }
    }
}
