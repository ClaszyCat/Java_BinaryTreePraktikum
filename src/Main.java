import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Object> binaryTree = new BinaryTree<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pencarian Berkas Data, Masukkan Data dengan angka dan huruf. Contoh 1A 2B");
        System.out.print("Masukkan data : ");
        //data yang diinput harus dipisah dengan spasi
        String input = scanner.nextLine();

        String[] data = input.split(" ");
        for (String item : data) {
            binaryTree.insert(item);
        }

        binaryTree.preorder();
        binaryTree.inorder();
        binaryTree.postorder();
    }
}
