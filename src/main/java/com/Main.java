package com;

public class Main {

    public static void main(String[] args) {
        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();

        customLinkedList.add("1");
        customLinkedList.add("2");
        customLinkedList.add("3");
        customLinkedList.add("4");
        customLinkedList.add("5");

        ListIterator<String> listIterator = new ListIterator<>(customLinkedList);
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
