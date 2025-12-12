public class App {
    public static void main(String[] args) throws Exception {
        Lista l =new Lista();
        
        l.addTail(new Nodo("mario"));
        l.addTail(new Nodo("luigi"));
        l.addHead(new Nodo("gian"));
        l.addTail(new Nodo("rossi"));
        l.addTail(new Nodo("mario"));
        System.out.println(l);
    }
    }

