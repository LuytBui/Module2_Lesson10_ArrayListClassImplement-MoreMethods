public class Main {

    /*
        add(E element), add(int index, E element), addFirst(E element), addLast(E element)
        remove(int index), removeFirst(), removeLast(), remove(E element), removeAll(E element)
        replace(E oldElement, E newElement)
        indexOf(E element), lastIndexOf(E element)
        get(int index)
        set(int index, E element)
        clear()
        toArray()
        isEmpty()
        trimToSize(int newSize)
     */

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add(0, "Zero");
        list.add("Three");
        printMyArrayList(list, "init array list");

        list.replace("One", "Ten");
        list.replaceAll("Three", "Thirteen");
        printMyArrayList(list, "replace some elements");

        list.remove(1);
        list.removeAll("Thirteen");
        printMyArrayList(list, "remove some elements");


        list.clear();
        printMyArrayList(list, "clear list");
    }

    public static void printMyArrayList(MyArrayList list, String msg) {
        System.out.printf("---%s---\n", msg);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------------");
    }

    public static void printMyArrayList(MyArrayList list) {
        printMyArrayList(list, "---------------");
    }
}
