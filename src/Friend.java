import java.util.Objects;

public class Friend {
    String myName;
    Friend friend;

    public Friend(String myName) {
        this.myName = myName;
    }

    void letsBeFriend(Friend a){
        this.friend = a;
    }

}
