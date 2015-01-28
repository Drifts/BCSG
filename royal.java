/**
 *
 * @author David Craig
 */
public class royal extends bankAccount {

    public royal(String bankName, String cardNum, String date) {
        super(bankName, cardNum, date);
    }

    public String maskAccount() {
        String[] a = cardNum.split("-");
        return a[0] + "-xxxx-xxxx-xxxx";
    }

    @Override
    public int compareTo(bankAccount o) {
        return super.compareTo(o, o);
    }
}
