import java.util.*;

public class Digits {
    private ArrayList<Integer> digitList = new ArrayList<Integer>();

    public Digits(int num) {
        String digs = Integer.toString(num);
        if (digs.length() > 1) {
            for (int i = 0; i < digs.length(); i++) {
                digitList.add(new Integer(Integer.parseInt(digs.substring(i, i + 1))));
            }
        }
        else {
            digitList.add(new Integer(num));
        }
    }

    public boolean isStrictlyIncreasing() {
        for (int i = 0; i < digitList.size() - 1; i ++) {
            if (digitList.get(i) >= digitList.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public String getDigitList() {
        String out = "";
        for (int i = 0; i < digitList.size(); i ++) {
            out += digitList.get(i) + " ";
        }
        return out;
    }
}
