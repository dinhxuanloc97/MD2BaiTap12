package Bai1;

import java.util.*;

public class ProductManager {
    static List<Product> listproducts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        do {
            System.out.println("************ Quan li san pham *********");
            System.out.println("1.Them thong tin san pham ");
            System.out.println("2.Sua thong tin san pham theo Id ");
            System.out.println("3.Xoa thong tin san pham theo id ");
            System.out.println("4.Hien thi thong tin san pham ");
            System.out.println("5.tim kiem thong tin san pham theo ten ");
            System.out.println("6.Sap xep san pham theo tang dan theo gia ");
            System.out.println("7.Sap xep san pham giam dan theo gia ");
            System.out.println("Lua chon cau ban la ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhap so thong tin san pham can them ");
                    int num = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < num; i++) {
                        Product productnew = new Product();
                        productnew.inputData();
                        listproducts.add(productnew);
                    }
                    break;
                case 2:
                    System.out.println("nhập vào mã sản phẩm cần update");
                    String inputMaSp = sc.nextLine();
                    for (Product sp: listproducts) {
                        if (sp.getProductID() == inputMaSp){
                            System.out.println("nhập lại tên sản phẩm");
                            String updateName = sc.nextLine();
                            if (updateName!=""&& updateName.length()!=0){
                                sp.setProductName(updateName);
                            }
                            System.out.println("nhập vào giá bán sản phẩm");
                            int giaBanUpdate = Integer.parseInt(sc.nextLine());
                            sp.setProductPrice(giaBanUpdate);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhap thong tin san pham muon xoa theo Id ");
                    int deleteProduct = Integer.parseInt(sc.nextLine());
                    for (Product deleteP: listproducts){
                        if (deleteP.getProductPrice()==deleteProduct){
                            listproducts.remove(deleteProduct);
                        }
                    }
                    break;
                case 4:
                    System.out.println(" Dach sach  san pham la  ");
                    for (Product product : listproducts) {
                        product.displayData();
                    }
                    break;
                case 5:
                    System.out.println("Nhap vao ten san pham can tim ");
                    String seachproduct = sc.nextLine();
                    boolean exist = false;
                    for (Product productSeach : listproducts){
                        if (productSeach.getProductName().contains(seachproduct)){
                            productSeach.displayData();
                            exist = true;
                        }
                    }
                    if (!exist){
                        System.out.println("khong co sp nao ");
                    }
                    break;
                case 6:
                    System.out.println("sắp xếp giá tăng dần");
                    Collections.sort(listproducts, new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            if (o1.getProductPrice() > o2.getProductPrice()) {
                                return 1;
                            } else if (o1.getProductPrice() == o2.getProductPrice()) {
                                return 0;
                            } else {
                                return -1;
                            }
                        }
                    });

                        break;
                case 7:
                    System.out.println("sap xep tho gia giam dan ");
                    Collections.sort(listproducts, new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            if (o1.getProductPrice() < o2.getProductPrice()) {
                                return 1;
                            } else if (o1.getProductPrice() == o2.getProductPrice()) {
                                return 0;
                            } else {
                                return -1;
                            }
                        }
                    });

                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.err.printf("vui long chon lai tu 1 den 7");
            }
        }while (true);
    }
}
