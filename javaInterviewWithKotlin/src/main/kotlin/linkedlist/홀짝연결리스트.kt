package hello.linkedlist

/*
fun oddEvenList(head: ListNode?): ListNode{
    if(head == null)
        return null
    val odd: ListNode = head
    var even = head.next
    val evenHead = even

    while(even?.next != null){
        odd.next = odd.next.next
        even.next = even.next.next

        odd = odd.next
        even = even.next
    }

    odd.next = evenHead
    return head
}*/
