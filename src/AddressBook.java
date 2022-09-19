import java.util.*;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfo;

    public void addBuddy(BuddyInfo buddyInfo1){
       buddyInfo.add(buddyInfo1);
    }

    public void removeBuddy(BuddyInfo buddyInfo1){
        buddyInfo.remove(buddyInfo1);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
