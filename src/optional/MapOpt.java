package optional;

import java.util.Optional;

class ContInfo {
    String phone;   // null 일 수 있음
    String adrs;    // null 일 수 있음

    public ContInfo(String ph, String ad) {
        phone = ph;
        adrs = ad;
    }
    public String getPhone() { return phone; }
    public String getAdrs() { return adrs; }
}

public class MapOpt {
    public static void main(String[] args) {
        Optional<ContInfo> ci = Optional.of(new ContInfo(null, "korea"));
        String phone = ci.map(c -> c.getPhone()).orElse("not phone");
        String adress = ci.map(c -> c.getAdrs()).orElse("not adress");

        System.out.println("adress = " + adress);
        System.out.println("phone = " + phone);
    }
}
