import java.util.HashMap;
import java.util.StringTokenizer;

public class StringTokenizer2 {

    HashMap<String, Integer> map1 = new HashMap<>();
    HashMap<String, Integer> map2 = new HashMap<>();

    public void reconcile(String s) {
        StringTokenizer st1 = new StringTokenizer("123,123,50,HDFC,567,ICICI,ACCOUNT TRANSFER",",");
        int index = 1;
        String txnid = "";
        String fromaccnum = "";
        int txnamt = 0;
        String frombank = "";
        String toaccnum = "";
        String toacctbank = "";
        String txntype = "";

        while (st.hasMoreElements()) {
            String tokenval = st.nextToken();
            if (index == 1) {
                txnid = tokenval;
            } else if (index == 2) {
                fromaccnum = tokenval;
            } else if (index == 3) {
                txnamt = Integer.parseInt(tokenval);
            } else if (index == 4) {
                frombank = tokenval;
            } else if (index == 5) {
                toaccnum = tokenval;
            } else if (index == 6) {
                toacctbank = tokenval;
            } else if (index == 7) {
                txntype = tokenval;
            }
            index++;
        }

        // Perform your logic to reconcile transactions and update HashMaps
        // Here, we are simply adding the transaction amount to the respective bank's map

        if (frombank.equals("HDFC")) {
            map1.put(txntype, map1.getOrDefault(txntype, 0) + txnamt);
            map2.put("From bank", map2.getOrDefault("From bank", 0) + txnamt);
        } else {
            map2.put(txntype, map2.getOrDefault(txntype, 0) + txnamt);
            map2.put("From bank", map2.getOrDefault("From bank", 0) + txnamt);
        }
    }

    public void printOutput() {
        System.out.println("RECEIVABLES HDFC");
        for (String key : map1.keySet()) {
            System.out.println(key + " " + map1.get(key));
        }

        System.out.println("RECEIVABLES ICICI");
        for (String key : map2.keySet()) {
            if (!key.equals("From bank")) {
                System.out.println(key + " " + map2.get(key));
            }
        }

        System.out.println("From bank");
        System.out.println(map2.get("From bank") + " HDFC");
        System.out.println(map1.getOrDefault("From bank", 0) + " ICICI");
    }

    public static void main(String args[]) {
        String str = "50,100,124,24,76,89";
        StringTokenizer2 stringTokenizer2 = new StringTokenizer2();
        stringTokenizer2.reconcile(str);
        stringTokenizer2.printOutput();
    }
}
