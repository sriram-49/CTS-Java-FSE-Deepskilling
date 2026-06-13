public class EcommerceSearch {
    static class Product{
        int productId;
        String productName;
        String category;

        Product(int productId,String productName,String category){
            this.productId=productId;
            this.productName=productName;
            this.category=category;
        }
    }
    static Product linearSearch(Product p[],int id){
        for(int i=0;i<p.length;i++){
            if(p[i].productId==id)
                return p[i];
        }
        return null;
    }
    static Product binarySearch(Product p[],int id){
        int low=0;
        int high=p.length-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(p[mid].productId==id)
                return p[mid];

            if(id<p[mid].productId)
                high=mid-1;
            else
                low=mid+1;
        }
        return null;
    }
    public static void main(String[] args) {
        Product products[]={
                new Product(101,"Laptop","Electronics"),
                new Product(102,"Mobile","Electronics"),
                new Product(103,"Shoes","Fashion"),
                new Product(104,"Watch","Accessories"),
                new Product(105,"Bag","Fashion")
        };
        int searchId=104;
        Product p1=linearSearch(products,searchId);
        if(p1!=null)
            System.out.println("Linear Search Found: "+p1.productName);
        else
            System.out.println("Product Not Found");
        Product p2=binarySearch(products,searchId);
        if(p2!=null)
            System.out.println("Binary Search Found: "+p2.productName);
        else
            System.out.println("Product Not Found");
    }
}