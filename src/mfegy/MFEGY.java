
package mfegy;


public class MFEGY {

    public static void main(String[] args) {
        String sor = "3 4 5";
        String sor2 = "4,23 8,56 -12,23";
        String sor3 = "-1,2 -3,4 -5,6";
        String sor4 = "1 2 1";

        MFEGYclass mf1 = new MFEGYclass(sor);
        MFEGYclass mf2 = new MFEGYclass(sor2);
        MFEGYclass mf3 = new MFEGYclass(sor3);
        MFEGYclass mf4 = new MFEGYclass(sor4);
        
        System.out.println(mf1);
        System.out.println(mf2);
        System.out.println(mf3);
        System.out.println(mf4);
    }
    
}
