

public class Main {



    // main method
    public static void main(String[] args) {

        // pointers
//        HashMap<String, Integer> map1 = new HashMap<>();
//        HashMap<String, Integer> map2 = new HashMap<>();
//        HashMap<String, Integer> map3 = new HashMap<>();

//        map1.put("Value", 11);
//        map2 = map1; // this is a "pointer" to map1
//
//        map1.put("Value", 22);
//        map3.put("value", 34);
//        map2 = map3; // this is a "pointer" to map3
//
//        System.out.println(map1);
//        System.out.println(map2);
//
//        map1 = map3; // we are "pointing" map1 to map3
//        System.out.println(map1);

        // linked list


        LinkedList myLinkedList = new LinkedList(5);
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.printList();


//        myLinkedList.printList();
        myLinkedList.appendList(6);
        myLinkedList.appendList(7);

        myDLL.append(2);
        myDLL.printList();
        myDLL.getLength();
        myDLL.removeLast();
        myDLL.printList();
        myDLL.prepend(0);
        myDLL.printList();














    }
}
