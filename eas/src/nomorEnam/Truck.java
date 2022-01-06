/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomorEnam;

/**
 *
 * @author Asus
 */
public class Truck extends Mobil implements Taxable{
	private String name, body;
	private double price;
	
	public Truck(String name, String body, double price, Engine e, Transmission t) {
		this.name = name;
		this.body = body;
		this.price = price;
		this.setEngine(e);
		this.setTransmission(t);
        }
        
        public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
        
	public double getTax() {
		return this.price * taxRate;
	}
        
        
}
        
    