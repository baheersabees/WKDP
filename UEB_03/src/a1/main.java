package a1;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        Board board = new Board(3, 3);
        Cell cell = board.getGrid()[0][0];
        ClassInfo classInfo = new ClassInfo(new LinkedList<>());
        System.out.println("Class Name: " + classInfo.getClassName());
        System.out.println("Full Class Name: " + classInfo.getFullClassName());
        System.out.println("Package Name: " + classInfo.getPackageName());
    }
}
