public class Product {
private String name;
private float price;
private int id;

public Product(int id) {
	name = "Coca Cola";
	price = 10;
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
