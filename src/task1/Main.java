package Task1;

import Task1.DataUtil;

import static java.lang.Math.max;

public class Main {
public static void main(String[]args){
        int[]intArray={3,7,1,5,9};
        double[]doubleArray={2.5,4.8,1.3,6.7,3.2};

        System.out.println("AVG Integer Array: " + DataUtil.avg(intArray));
        System.out.println("MAX Double Array: "+ DataUtil.max(doubleArray));
        System.out.println("MIN Integer Array: "+DataUtil.min(intArray));
        }
        }