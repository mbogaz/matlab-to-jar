
import addition.MatlabOps;
import com.mathworks.toolbox.javabuilder.MWArray;
import com.mathworks.toolbox.javabuilder.MWClassID;
import com.mathworks.toolbox.javabuilder.MWException;
import com.mathworks.toolbox.javabuilder.MWNumericArray;

public class Application {

    public static void main(String[] args) throws MWException {
        long start = System.currentTimeMillis();
        MatlabOps matlaboperationsInstance = new MatlabOps();
        long end = System.currentTimeMillis();
        System.out.println("time 1 : " + (end - start));
        MWArray aIn = null;
        MWArray bIn = null;
        MWNumericArray yOut = null;
        Object[] results = null;
        try {
            double aInData = 5.0;
            aIn = new MWNumericArray(aInData, MWClassID.DOUBLE);
            double bInData = 3.0;
            bIn = new MWNumericArray(bInData, MWClassID.DOUBLE);
            long time2 = System.currentTimeMillis();
            System.out.println("time 1 : " + (time2 - end));
            results = matlaboperationsInstance.addition(1, aIn, bIn);
            if (results[0] instanceof MWNumericArray) {
                yOut = (MWNumericArray) results[0];
            }
            System.out.println("addition : " + yOut);

            long time3 = System.currentTimeMillis();
            System.out.println("time 2 : " + (time3 - time2));
            results = matlaboperationsInstance.substraction(1, aIn, bIn);
            if (results[0] instanceof MWNumericArray) {
                yOut = (MWNumericArray) results[0];
            }
            System.out.println("substraction : " + yOut);
            long time4 = System.currentTimeMillis();
            System.out.println("time 3 : " + (time4 - time3));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Dispose of native resources
            MWArray.disposeArray(aIn);
            MWArray.disposeArray(bIn);
            MWArray.disposeArray(results);
        }
    }
}
