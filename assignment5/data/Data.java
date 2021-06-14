package vyshnavi.assignment.data;

public class Data {
    int i;
    char ch;
    public void printLocalVariables(){
        int i ;
        char ch;
        /*System.out.println("Local Variables:"+i+" "+ch);*/ //Local Variables must be initialized
        // Cause global variables will be assigned default values when class loads.
    }
    public void printVariables()
    {
        System.out.println("Global Variables:"+i+" "+ch);
    }
}
