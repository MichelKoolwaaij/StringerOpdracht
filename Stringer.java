package dea.michel.domein;

/**
 * Created by Michel Koolwaaij on 28-09-18.
 */
public class Stringer implements IStringer{
    private String string;
    private String reverse;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    private void doReverse(){
        reverse="";
        for (int i=string.length()-1;i>=0;i--){
            reverse=reverse+string.charAt(i);
        }
    }

    public void setCalcReverse(String string) {
        String[] parts = string.split("[*+-]");
        int first;
        int last;
        String calc;

        if (parts.length>1) {
            first = Integer.valueOf(parts[0]);
            last = Integer.valueOf(parts[1]);

            if (string.contains("+")) {
                calc = "" + (first + last);
            } else if (string.contains("-")) {
                calc = "" + (first - last);
            } else if (string.contains("*")) {
                calc = "" + (first * last);
            } else calc = "error";
        }
        else calc = "0";

        setString(calc);
    }

    public String getReverse() {
        doReverse();
        return reverse;
    }

    public void setReverse(String reverse) {
        this.reverse = reverse;
    }
}
