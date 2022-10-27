public class SLList {
    public IntNode first;
    public int size;

    private IntNode sentinel;
    public SLList() {
        sentinel = new IntNode(63,null);
        size = 0;
    }




    public SLList(int x) {
        sentinel = new IntNode(63,null);
        sentinel.next =new IntNode(x,null);
        size = 1;
    }

    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size = 1;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    public void addLast(int x) {

        IntNode L = sentinel;
        if (sentinel.next == null) {
            sentinel.next = new IntNode(x, null);
            return;
        }
        while (L.next != null) {
            L = L.next;
        }
        L.next = new IntNode(x, null);
        size+=1;
    }

//    public static int size(IntNode p) {
//        if (p.next == null) {
//            return 1;
//        }
//        return 1 + size(p.next);
//    }
//
//    public int size() {
//        return size(first);
//    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        int x = L.getFirst();
        System.out.print(x);
    }
}


