package academy.learnprogramming;

public class Complex {

    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex plus(Complex b) {
        double newReal = real + b.real;
        double newImaginary = imaginary + b.imaginary;
        return new Complex(newReal, newImaginary); // returning new object, similar to String, since we are making this immutable
    }

    public Complex minus(Complex b) {
        double newReal = real - b.real;
        double newImaginary = imaginary - b.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex times(Complex b) {
        double newReal = real * b.real - imaginary * b.imaginary;
        double newImaginary = real * b.imaginary + imaginary * b.real;
        return new Complex(newReal, newImaginary);
    }

    public static Complex plus (Complex a, Complex b) {
//        double real = a.real + b.real;
//        double imaginary = a.imaginary + b.imaginary;
//        return new Complex(real, imaginary);
        return a.plus(b); // can just do this too
    }

    public static void main(String[] args) {
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);

//        Complex bPlusA = b.plus(a); works and so does the below line
        Complex bPlusA = Complex.plus(a, b);

        System.out.println("a real= " + a.real + " a imaginary= " + a.imaginary);
        System.out.println("b real= " + b.real + " b imaginary= " + b.imaginary);
        System.out.println("bPlusA real= " + bPlusA.real + " bPlusA imaginary= " + bPlusA.imaginary);

    }
}
