

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
//        myLinkedList.printList();
        myLinkedList.appendList(6);
        myLinkedList.appendList(7);
        myLinkedList.printList();
        myLinkedList.getLength();
        myLinkedList.removeLastNode();
        myLinkedList.printList();
        myLinkedList.getLength();
        myLinkedList.prependList(4);
        myLinkedList.printList();
        myLinkedList.getLength();
        //myLinkedList.removeFirstNode();
//        myLinkedList.printList();
//        System.out.println(myLinkedList.getNode(1).value);
//        myLinkedList.insertNode(2, 9);
//        myLinkedList.printList();
//        myLinkedList.set(2, 8);
//        myLinkedList.printList();
//        myLinkedList.removeNode(2);
//        myLinkedList.printList();
        myLinkedList.reverseList();
        myLinkedList.printList();


    }
}
