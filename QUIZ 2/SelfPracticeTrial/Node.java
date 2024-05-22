package SelfPracticeTrial;

public class Node {
    Team team;
    Node prev;
    Node next;

    public Node(Team team) {
        this.team = team;
        this.prev = null;
        this.next = null;
    }
}
