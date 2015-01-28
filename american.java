 /**
 *
 * @author David Craig
 */

public class american extends bankAccount {

    public american(String bankName, String cardNum, String date) {
        super(bankName, cardNum, date);
    }

    public String maskAccount() {
        String[] a = cardNum.split("-");
        return "xxxx-xxxx-xxxx-" + a[3];
    }

    @Override
    public int compareTo(bankAccount o) {
        return super.compareTo(o, o);
    }

}
