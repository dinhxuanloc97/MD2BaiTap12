package Bai1;

import java.util.Scanner;

public class Product {
   private String productName;
   private String productID;
   private int productPrice;

    public Product() {
    }

    public Product(String productName, String productID, int productPrice) {
        this.productName = productName;
        this.productID = productID;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
    public  void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma san pham ");
        this.productID = sc.nextLine();
        System.out.println("Nhap vao ten san pham ");
        this.productName = sc.nextLine();
        System.out.println("Nhap vao gia cua san pham ");
        this.productPrice = Integer.parseInt(sc.nextLine());
    }


    public  void displayData(){
        System.out.printf(" Ma Id : %s - Ten San Pham : %s  -  Gia sp : %d \n", this.productID,this.productName,this.productPrice);
    }
}
