public class IntList {

    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        first =f;
        rest =r;
    }

    public int size(){
        if (rest ==null){
            return 1;
        }
        return 1+ this.rest.size();
    }

    public int iternativeSize(){
        IntList p = this;
        int totalSize=0;
        while (p!= null){
            totalSize +=1;
            p=p.rest;
        }
        return totalSize;
    }


    public int get( int i){
        IntList p=this;
        int number=0;
        int index = 1;
        while (p != null) {
            if (index == i) {
                number=p.first;
                break;
            } else {
                index += 1;
                p = p.rest;
            }
        }
    return number;
    }


    public static void main (String[] args){
//        IntList L =new IntList(5, null);
//        L.rest= new IntList(10,null);
//        L.rest.rest=new IntList(15,null);

        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
        System.out.print(L.get(2));

    }
}
