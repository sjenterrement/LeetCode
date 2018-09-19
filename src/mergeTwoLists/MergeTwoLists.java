package mergeTwoLists;

public class MergeTwoLists {
	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1,ListNode l2) {
		ListNode returnNode=new ListNode(-1);
		ListNode headNode=returnNode;
		while (l1!=null&&l2!=null) {
			if (l1.val<=l2.val) {
				returnNode.next=l1;
				l1=l1.next;
			}else {
				returnNode.next=l2;
				l2=l2.next;
			}
			returnNode=returnNode.next;
		}
		if (l1==null) {
			returnNode.next=l2;
		}else {
			returnNode.next=l1;
		}
		return headNode.next;
	}
	
	public static void main(String[] args) {
//		ListNode l1=new ListNode();
		
	}
}
