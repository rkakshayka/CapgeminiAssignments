package collection_framework1;

import java.util.HashSet;

public class CollectionQ2 {
    public static void main(String[] args) {
        product p1=new product("Laptop");
        product p2=new product("Mobile");
        product p3=new product("Tablet");
    
        HashSet<product> uniqueProduct = new HashSet<product>();
        uniqueProduct.add(p1);
        uniqueProduct.add(p2);
        uniqueProduct.add(p3);
        
        //Adding of a duplicate product "Mobile"
        uniqueProduct.add(p2);//it won't added
        System.out.println(uniqueProduct);
    }
}

class product{
    private String product_name;
    
    public product(String product_name){
        this.product_name = product_name;
    }
    
    @Override
    public String toString(){
        return "Product name: "+ product_name;
    }
}

