package Bai2;
public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root=null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    public Node insertNode(Node curent,int value){
        if (curent==null){
            curent=new Node(value);
            return curent;
        }else {
            if (value<curent.getValue()){
                curent.setLeft(insertNode(curent.getLeft(),value));
            }else if (value>curent.getValue()){
                curent.setRight(insertNode(curent.getRight(),value));
            }else {
                return curent;
            }
        }return curent;
    }
    public void insert(int value){
        this.root=insertNode(this.root,value);
    }
    public void postOrder(Node node){
        if (node!=null){
            //Duyệt các Node bên cây trái đệ quy
            postOrder(node.getLeft());
            //Duyệt các node bên cây phải đệ quy
            postOrder(node.getRight());
            System.out.println(node.getValue()+"");
        }
    }
    public static boolean searchNodeByKey(Node node,int key){
        if (node==null){// nốt root( gốc) có sẵn trong cây nhị phân.
            return false;
        }else if (key==node.getValue()){//so sánh giá trị key nhập vào với giá trị của node gốc.
            return true;
        }else if (key<node.getValue()){
            return searchNodeByKey(node.getLeft(),key);
        }else {
            return searchNodeByKey(node.getRight(),key);
        }
    }

}