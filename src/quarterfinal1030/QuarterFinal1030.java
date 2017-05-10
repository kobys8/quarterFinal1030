/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quarterfinal1030;

/**
 *
 * @author kms080
 */
public class QuarterFinal1030 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Qfun quarterFun1 = new Qfun(10, "jobob");
        quarterFun1.drawString();
        Qfun quarterFun2 = new Qfun(1, "adsadqwdjersdgfrrdgedrgeosfvdfgsdfdsgvbfdsaerfsfoeswfwserfqwadeqwb");
        System.out.print(quarterFun2.hasJoBob());
        quarterFun2.triangle();
    }
}

class Qfun {
    private String qString;
    private int qInt;
    public Qfun(int realInt, String realString) {
        qString = realString;
        qInt = realInt;
    }
    public void setQString(String newString) {
        qString = newString;
    }
    public String getQString() {
        return qString;
    }
    public String toString() {
        return ("qString = " + qString + "\nqInt = " + qInt);
    }
    public void drawString() {
        System.out.print("\n");
        for(int i = 0; i <= qString.length() - 1; i++) {
            for(int j = 0; j <= qInt - 1; j++) {   
                System.out.print(qString.charAt(i));
            }
            System.out.print("\n");
        }
    }
    public boolean hasJoBob() {
        char[] jobobChars = {'j','o','b','o','b'};
        int charIndex = 0;
        String jobob = "";
        String temp = qString.toLowerCase();
        for(int i = 0; i <= temp.length() - 1; i++) {
            if(temp.charAt(i) == jobobChars[charIndex]) {
                jobob += jobobChars[charIndex];
                charIndex++;
            }
        }
        System.out.print(qString + " has jobob? ");
        return jobob.equalsIgnoreCase("jobob");
    }
    public void triangle() {
        for(int i = 0; i <= qInt; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = (qInt - i); k >= 1; k--) {
                System.out.print("X");
            }
            System.out.print("\n");
        }
    }
}
