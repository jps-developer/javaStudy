package extends1.overriding;

public class FriendMain {
    public static void main(String[] args) {

        Friend[] frns = new Friend[4];
        int cnt = 0;

        frns[cnt++] = new UnivFriend("seo","computer","1212");
        frns[cnt++] = new CompFriend("ill","R&D","1234");
        frns[cnt++] = new UnivFriend("jae","moive","4232");
        frns[cnt++] = new CompFriend("king","Customs","4561");

        for (Friend frn : frns) {
            frn.showInfo();
            System.out.println();
        }

        /* UnivFriend[] ufrns = new UnivFriend[2];
        int ucnt = 0;

        CompFriend[] cfrns = new CompFriend[2];
        int ccnt = 0;

        ufrns[ucnt++] = new UnivFriend("seo","computer","1212");
        ufrns[ucnt++] = new UnivFriend("jae","moive","4232");

        cfrns[ccnt++] = new CompFriend("ill","R&D","1234");
        cfrns[ccnt++] = new CompFriend("king","Customs","4561");

        for (CompFriend cfrn : cfrns) {
            cfrn.showInfo();
        }
        for (UnivFriend ufrn : ufrns) {
            ufrn.showInfo(); */
        }
}
