public class NestedSLList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first;
    public NestedSLList(int x) {
        first = new IntNode(x, null);
    }


}
