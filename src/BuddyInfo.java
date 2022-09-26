public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name){
        this.name = "";
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo homer = new BuddyInfo("Homer");
        System.out.println("Hello " + homer);

    }
}
