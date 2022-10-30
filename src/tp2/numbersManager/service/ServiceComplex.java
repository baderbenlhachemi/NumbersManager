package tp2.numbersManager.service;

import tp2.numbersManager.model.Complex;

public class ServiceComplex {

    // addition
    public static Complex plus(Complex z1, Complex z2) {
        Complex z = null;
        double reel = z1.getRe() + z2.getRe();
        double imaj = z1.getIm() + z2.getIm();
        z = new Complex(reel, imaj);
        return z;
    }
    // Subtraction
    public static Complex mines(Complex z1, Complex z2) {
        Complex z = null;
        double reel = z1.getRe() - z2.getRe();
        double imaj = z1.getIm() - z2.getIm();
        z = new Complex(reel, imaj);
        return z;
    }
    // multiplication
    public static Complex times(Complex z1, Complex z2) {
        Complex z = null;
        double reel = z1.getRe() * z2.getRe()
                - z1.getIm() * z2.getIm();
        double imaj = z1.getRe() * z2.getIm()
                + z2.getRe() * z1.getIm();

        z = new Complex(reel, imaj);
        return z;
    }
    // division  z1/z2 = z1 * (1/z2)
    public static Complex divides(Complex z1, Complex z2) {
        return times(z1, reciprocal(z2));
    }
    // module
    public static double module(Complex z) {
        return Math.hypot(z.getRe(), z.getIm());
    }
    // conjugate
    public static Complex conjugate(Complex z) {
        Complex zR = null;
        double reel = z.getRe();
        double imaj = -z.getIm();

        zR = new Complex(reel, imaj);
        return zR;
    }
    // reciprocal
    public static Complex reciprocal(Complex z) {
        Complex zR = null;
        double reel = z.getRe()/module(z);
        double imaj = -z.getIm()/module(z);

        zR = new Complex(reel, imaj);
        return zR;
    }

}
