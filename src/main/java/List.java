
//метод разворота связного односвязного списка односвязного
public class List {

    // узел связного списка
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }

    public static class ReverseLinkedList {
        public ListNode reverseList(ListNode head){
            ListNode prev = null; // инициализация как нулл, т.к. первый элемент должен стать последним
            ListNode curr = head;

            //пока курр не станет == нулл (т.е. не достигнет конца списка), выполняется
            while (curr != null){
                ListNode nextTemp = curr.next; //сохр. ссылку на следующий элемент
                curr.next = prev; // уст. ссылку на след. эл. == прев, чтобы развернуть текущий узел
                prev = curr; // уст. прев на текущ. эл.
                curr = nextTemp; // уст. ук.на след. эл. в списке
            }
            return prev;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode newHead = solution.reverseList(head);

        // Ожидаемый результат: 3 -> 2 -> 1
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }


}


