public class Lista {

    private Nodo root;

    public Lista() {
        root = null;
    }
    
    public void addHead(Nodo n){
        Nodo top=root;
        n.setNext(top);
        root=n;
    }
    public void remove(String s){
        if(root==null) return;
        if(root.getValue().equals(s)){
            root=root.getNext();
            return;
        }
        Nodo temp=root;
        while(temp.getNext()!=null && !temp.getNext().getValue().equals(s)){
            temp=temp.getNext();
        }
        if(temp.getNext()!=null){
            temp.setNext( temp.getNext().getNext() );
        }

    }
    public void add(String s){
        addTail(new Nodo(s));
    }

    public boolean exists(String s){
        Nodo temp=root;
        while(temp!=null){
            if(temp.getValue().equals(s)){
                return true;
            }
            temp=temp.getNext();
        }
        return false;
        

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
