package Bai2;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt= new BinaryTree();
        bt.insert(8);
        bt.insert(3);
        bt.insert(9);
        bt.insert(10);
        bt.insert(15);
        //duyệt cây nhị phân tính từ node root
        bt.postOrder(bt.getRoot());
        //tìm kiếm giá trị
        boolean exitKey= BinaryTree.searchNodeByKey(bt.getRoot(),35);
        if (exitKey){
            System.out.printf("có phần tử trong cây");
        }else {
            System.out.println("không có phần tử trong cây");
        }
    }
}
