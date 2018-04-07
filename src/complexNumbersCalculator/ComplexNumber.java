package complexNumbersCalculator;

public class ComplexNumber {
	private double realPart, imaginaryPart;
	
	public ComplexNumber(double real, double imaginary) {
		this.realPart = real;
		this.imaginaryPart = imaginary;
	}
	
	public ComplexNumber(double real) {
		this.realPart = real;
		this.imaginaryPart = 0.0;
	}
	
	public double getRealPart() {
		return realPart;
	}

	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	public double getImaginaryPart() {
		return imaginaryPart;
	}

	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	
	public ComplexNumber conjugate() {
		return new ComplexNumber(realPart, -imaginaryPart);
	}
	
	public ComplexNumber negation() {
		return new ComplexNumber(-realPart, -imaginaryPart);
	}
	
	public double square() {
		return realPart*realPart + imaginaryPart*imaginaryPart;
	}
	
	public double abs() {
		return Math.sqrt(square());
	}
	
	public ComplexNumber add(ComplexNumber cm) {
		return new ComplexNumber(realPart+cm.realPart, imaginaryPart+cm.imaginaryPart);
	}
	
	public ComplexNumber subtract(ComplexNumber cm) {
		return new ComplexNumber(realPart-cm.realPart, imaginaryPart-cm.imaginaryPart);
	}
	
	public ComplexNumber multiply(ComplexNumber cm) {
		return new ComplexNumber(realPart*cm.realPart - imaginaryPart*cm.imaginaryPart, imaginaryPart*cm.realPart + realPart*cm.imaginaryPart);
	}
	
	public ComplexNumber divide(ComplexNumber cm) {
		ComplexNumber tmpComplex = new ComplexNumber(cm.realPart/cm.square(), -cm.imaginaryPart/cm.square());
		return multiply(tmpComplex);
	}
	
	public ComplexNumber divide(double num) {
		return new ComplexNumber(realPart/num, imaginaryPart/num);
	}
	
	public String toString() {
        if (imaginaryPart==0) return ""+realPart;
        else if(realPart==0) return ""+imaginaryPart+"i";
        else if(imaginaryPart>0) return ""+realPart+"+"+imaginaryPart+"i";
        else return ""+realPart+"-"+(-imaginaryPart)+"i";
	}
	
}
