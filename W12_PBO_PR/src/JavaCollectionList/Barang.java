package JavaCollectionList;

public class Barang {
    private Status status;
    private ServicePackage servicePackage;
    private City city;
    private int weight, quantity, priceItem;
    private String productName;
	
    @Override
    public String toString() {
        String result = this.productName + " | " + this.quantity + " | "
                + this.weight + " | " + city.getDestination() + " | " +
                servicePackage.getService() + " | " + servicePackage.getValue()+ " | " 
                +((priceItem*quantity)+servicePackage.getValue());	
	return result;				
    }   
}


