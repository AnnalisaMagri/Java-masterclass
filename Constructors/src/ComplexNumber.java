public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real+=real;
        this.imaginary+=imaginary;
    }
    public void add (ComplexNumber other){
        add(other.real, other.imaginary);
    }
    public void subtract(double real, double imaginary){
        this.real-=real;
        this.imaginary-=imaginary;
    }
    public void subtract (ComplexNumber other){
        subtract(other.real, other.imaginary);
    }

}
//        * Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields.
//        In other words, it needs to do a complex number add operation as described above.
//        * Method named add with one parameter other of type ComplexNumber. It needs to add the other parameter to this complex number.
//        * Method named subtract with two parameters real and imaginary of type double, it needs to subtract parameters from fields,
//        in other words, it needs to do a complex number subtract operation as described above.
//        * Method named subtract with one parameter other of type ComplexNumber. It needs to subtract the other parameter from this complex number.