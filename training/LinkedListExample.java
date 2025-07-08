import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> playList = new LinkedList<>();

        playList.add("Depandi Depang");
        playList.add("Zindagi Zindagi");
        playList.add("Dekha tumko jabse");

        System.out.println("Playlist : " + playList);
        playList.removeFirst();
        System.out.println("Now playing : " + playList.peek());
    }
}
