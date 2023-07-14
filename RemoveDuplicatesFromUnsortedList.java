//https://www.codingninjas.com/studio/problems/remove-duplicates-from-unsorted-linked-list_1069331?source=youtube&campaign=YouTube_Lovebabbar29thJan&leftPanelTab=3

public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
    HashSet<Integer> set = new HashSet<>();
    LinkedListNode<Integer> current = head;
    LinkedListNode<Integer> prev = null;

    while (current != null) {
      if (set.contains(current.data)) {
        prev.next = current.next;
      } else {
        set.add(current.data);
        prev = current;
      }
      current = current.next;
    }
    return head;
  }
