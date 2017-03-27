public class Product {
private String name;
private float price;
private boolean onStock;

public Product() {
	name = "Coca Cola";
	price = 10;
	onStock = true;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
