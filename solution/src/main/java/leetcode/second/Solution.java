package leetcode.second;

/**
 * Created by Mirana on 2017/3/13.
 */
public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur ,fi,se,ret;
        fi = l1;
        se = l2;
        cur = new ListNode(0);
        ret = cur;
        int carry = 0;
        boolean flag = true;
        while(flag){
            // 循环的非空判断
            // 可能双方均为null、l1和l2位数不齐
            if(fi==null&&se==null){
                break;
            }
            if(fi==null)
                fi=new ListNode(0);
            if(se==null)
                se=new ListNode(0);
            int x = fi.val+se.val+carry;
            cur.next = new ListNode(x%10);
            carry = x/10;
            fi = fi.next;
            se = se.next;
            cur = cur.next;
        }
        if(carry >0){
            cur.next = new ListNode(carry);
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode l1=null ,l2, l3=new ListNode(1);
        l2 = new ListNode(9);
        l2.next=l3;
        ListNode listNode = s.addTwoNumbers(l1, l2);
        String a = "";
        while (listNode.next!=null){
            a+=listNode.val+"->";
            listNode = listNode.next;
        }
        a+=listNode.val;
        System.out.println(a);
    }
}
