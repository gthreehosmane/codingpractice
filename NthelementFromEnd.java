package com.solutions;

class ListNode {
  ListNode(int x) {
    value = x;
 }  
  int value;
  ListNode next;

int nthElementFromTheEnd(ListNode l, int n) {
   ListNode temp = l;
          ListNode temp1 = l;
          ListNode tail = null;
          int count = 0,val=0,pos=0;
          if(l == null)
          {
           val = 0;
           return val;
          }
          else{
              while(temp!=null)
               {
                   count++;
                   temp = temp.next;
               }
              if(count<n)
                  return -1;
               while(temp1!=null)
               {
                   pos++;
                   if(pos==(count-n))
                     val = temp1.value;
                   temp1 = temp1.next;
               }
          }
          return val;
}
public static void main(String[] args){
	
	ListNode ln = new ListNode(10);
	ln.nthElementFromTheEnd(ln,1);
}
}

