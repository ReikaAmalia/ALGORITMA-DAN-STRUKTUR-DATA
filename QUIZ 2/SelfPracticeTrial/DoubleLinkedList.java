package SelfPracticeTrial;

public class DoubleLinkedList {
    Node head;
    Node tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public void addTeam(Team team) {
        Node newNode = new Node(team);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void updateTeam(String teamName, int goalsFor, int goalsAgainst) {
        Node current = head;
        while (current != null) {
            if (current.team.name.equals(teamName)) {
                current.team.updateStats(goalsFor, goalsAgainst);
                sortList();
                break;
            }
            current = current.next;
        }
    }

    private void sortList() {
        if (head == null) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.team.points < current.next.team.points ||
                        (current.team.points == current.next.team.points &&
                                (current.team.wins < current.next.team.wins ||
                                        (current.team.wins == current.next.team.wins &&
                                                current.team.goalsFor
                                                        - current.team.goalsAgainst < current.next.team.goalsFor
                                                                - current.next.team.goalsAgainst)))) {
                    Team temp = current.team;
                    current.team = current.next.team;
                    current.next.team = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void printTable() {
        Node current = head;
        int position = 1;
        while (current != null) {
            System.out.println(position + ". " + current.team);
            current = current.next;
            position++;
        }
    }
}
