public class DecimalNumericPrimitives {

    public static void main(String[] args) {

//        float myNumber = 25.4; doesn't compile because java sees any literals with decimals as a float
        float myNumber = 25.4F; //fixes this or we can use 25.4f (f/F works)
//         double before = 10_._25; illegal underscores (cannot be directly before/after decimal points)
//        int x = _10_; you also cannot use one at the start or after int/float/any type of number

        double myDouble = 2.54;
        double myDouble2 = 2.54F; // F doesn't do anything here, automatically gets converted to a double
        double anotherDouble = 2.45D; // D is not necessary since I'm using a double anyway
        double scientific = 5.000125E03;
        double scientific2 = 5.000125E3;
        double myDouble3 = 5000.125; // same as above^

        System.out.println("scientific= " + scientific);
        System.out.println("scientific2= " + scientific2);
        System.out.println("myDouble3= " + myDouble3); // all 3 of these are the same

        double hexPi = 0x1.91eb851eb851fp1; // p indicates hexadecimal floating point number

        System.out.println("hexPi= " + hexPi);
    }
}
