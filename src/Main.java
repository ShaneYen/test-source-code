

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

        LinkedList myLinkedList = new LinkedList(4);


        myLinkedList.appendList(7);


//        myLinkedList.removeLastNode();

        myLinkedList.prependList(8);

        myLinkedList.printList();
        myLinkedList.insertNode(3, 9);
        myLinkedList.printList();
        myLinkedList.setNode(2, 100);
        myLinkedList.printList();
        myLinkedList.removeNode(1);
        myLinkedList.printList();



    }
}
