
/**
 *
 * @author David Craig
 */
public class hsbc extends bankAccount {

    public hsbc(String bankName, String cardNum, String date) {
        super(bankName, cardNum, date);
    }

    public String maskAccount() {
        String[] a = cardNum.split("-");
        return a[0].substring(0, 2) + "xx-xxxx-xxxx-xxxx";
    }
    
    

    @Override
    public int compareTo(bankAccount o) {
        return super.compareTo(o, o);
    }
}
