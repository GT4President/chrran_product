public class Product {
private String name;
private float price;
private int id;
private boolean onStock;

public Product(int id) {
	name = "Coca Cola";
	price = 10;
	this.id = id;
	onStock = true;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
