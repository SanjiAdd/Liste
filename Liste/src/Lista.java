public class Lista {

    private Nodo root;

    public Lista() {
        root = null;
    }
    
    public void addHead(Nodo n){
        n.setNext(root);
        root=n;
    }

    public void addTail(Nodo n) {
        if (root == null) {
            root = n;
        } else {
            Nodo temp = root;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(n);
        }
    

    }


    @Override
    public String toString() {
        String s = "la Lista contiene: ";
        Nodo temp= root;
        while(temp!=null){
            s+= temp.getValue()+"-";
            temp=temp.getNext();
        }
        return s + "\n";
    }
}
