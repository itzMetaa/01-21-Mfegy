
package mfegy;


public class MFEGYclass {
    //Field / Paraméterek
    private double EggyuthatoA;
    // nem fogom fel az együttható a-t mit akar jelenteni
    private double A, B, C;
    private double D, X1, X2;
    private int GyokokSzama;

    // Get-Set
    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }

    public double getD() {
        return D;
    }
    
    public int getGyokokSzama() {
        return GyokokSzama;
    }

    public double getX1() {
        return X1;
    }

    public double getX2() {
        return X2;
    }
    
    //Metódusok / Konstruktor
    
    public MFEGYclass(String sor) {
        //2. Feladat
        String[] adatok = sor.replace(',', '.').split(" ");
        
        this.setA(Double.parseDouble(adatok[0]));
        this.setB(Double.parseDouble(adatok[1]));
        this.setC(Double.parseDouble(adatok[2]));
        
        //3. Feladat
        if (this.A>0 || this.A<0) {
            this.EggyuthatoA = Double.parseDouble(adatok[0]);
        }
        //4. Feladat
        this.D = (Math.pow(this.B, 2)-(4*this.A*this.C));
        
        //5. Feladat
        if (this.D<0) {
            this.GyokokSzama = 0;
        } else if (this.D==0) {
            this.GyokokSzama = 1;
        } else if (this.D>0){
            this.GyokokSzama = 2;
        }
        
        //6. Feladat
        try{
            this.X1 = ((this.B*(-1.0))+((Math.sqrt(this.D))/(2*this.A)));
        } catch(Exception e) {
            this.X1 = Double.NaN;
            System.out.println(e);
        }
        
        try{
            this.X2  = ((this.B*(-1.0))-((Math.sqrt(this.D))/(2*this.A)));
        } catch(Exception e) {
            this.X2  = Double.NaN;
            System.out.println(e);
        }

    }

    @Override
    public String toString() {
        return "MFEGYclass{" + "A=" + A + ", B=" + B + ", C=" + C + ", D=" + D + ", X1=" + X1 + ", X2=" + X2 + ", GyokokSzama=" + GyokokSzama + '}';
    }
}
