package tp2.numbersManager.model;

public class Complex {

    private double re, im;

    public double getRe() {
        return re;
    }
    public double getIm() {
        return im;
    }
    public void setRe(double re) {
        this.re = re;
    }
    public void setIm(double im) {
        this.im = im;
    }

    public Complex() {this(0.0, 0.0);}
    public Complex(double imaj){
        this(0.0, imaj);
    }
    public Complex(double reel , double imaj){
        setRe(reel);
        setIm(imaj);
    }
    public Complex(Complex autre){
        this(autre.re, autre.im);
    }

    @Override
    public String toString() {
        if(re == 0)
            if(im == 0)
                return "0";
            else
                return    im + " i ";
        else
        if(im > 0)
            return re + " + " + im + " i ";
        else
            return re + " " + im + " i ";
    }

    @Override
    public boolean equals(Object autre) {
        Complex z = new Complex();
        System.out.println(z.toString());
        if(autre instanceof Complex c)
            if(c.re != this.re)
                return false;
            else
            if(c.im != this.im)
                return false;
            else return true;
        return false;
    }


    public static void main(String[] args) {

        Object o = new Complex(2, 5);
        System.out.println(o);
    }

}
