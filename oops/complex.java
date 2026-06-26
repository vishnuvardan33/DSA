//print sum,diff,product of two complex nums by creating a class "complex" with seperate methods for each operation whose real and imaginary parts are entered by user

class complex {

    int real, imag;

    public complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static complex sum(complex c1, complex c2) {
        return new complex(c1.real + c2.real, c1.imag + c2.imag);
    }

    public static complex diff(complex c1, complex c2) {
        return new complex(c1.real - c2.real, c1.imag - c2.imag);
    }

    public static complex product(complex c1, complex c2) {
        return new complex(c1.real * c2.real - c1.imag * c2.imag, c1.real * c2.imag + c1.imag * c2.real);
    }

    public void display() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + " + " + imag + "i");
        }
    }

    public static void main(String[] args) {
        complex c1 = new complex(3, 4);
        complex c2 = new complex(1, 2);
        complex sum = complex.sum(c1, c2);
        complex diff = complex.diff(c1, c2);
        complex product = complex.product(c1, c2);
        System.out.print("Sum: ");
        sum.display();
        System.out.print("Difference: ");
        diff.display();
        System.out.print("Product: ");
        product.display();
    }
}
