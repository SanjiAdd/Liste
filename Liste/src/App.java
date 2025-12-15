public class App {
    public static void main(String[] args) throws Exception {
        Lista l =new Lista();
        
        l.addTail(new Nodo("mario"));
        l.addTail(new Nodo("luigi"));
        l.addHead(new Nodo("gian"));
        l.addTail(new Nodo("rossi"));
        l.addTail(new Nodo("maria"));
        l.addHead(new Nodo("lopi"));
        l.add("anna");
        l.remove("mario");
        System.out.println(l);
        System.out.println( l.exists("anna") );
        l.remove("gian");
        System.out.println(l);
    }
    }

