package theoffice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import theoffice.newyork.NewYorkDistributionCenter;
import theoffice.scranton.ScrantonDistributionCenter;

public class PaperCompany {

	Map<String, DistributionCenters> distributionCenters = new HashMap<String, DistributionCenters>();
	
	List<Order> orders = new ArrayList<Order>();
	
	Integer orderProcessed = 0;
	Float revenueProcessed = 0F;
	
	public PaperCompany() {
		distributionCenters.put("newyork", new NewYorkDistributionCenter());
		distributionCenters.put("scranton", new ScrantonDistributionCenter());
	}
	
	public void receiveShipment() {
		distributionCenters.get("newyork").receiveShipment(new DistributionCenters.Product("posters", 500));
		distributionCenters.get("scranton").receiveShipment(new DistributionCenters.Product("paperstock", 200));
		distributionCenters.get("newyork").receiveShipment(new DistributionCenters.Product("cardboard", 500));
		distributionCenters.get("scranton").receiveShipment(new DistributionCenters.Product("printerpaper", 5000));
		distributionCenters.get("newyork").receiveShipment(new DistributionCenters.Product("kettlebells", 5));
	}
	

	
	public void receiveOrders() {
		
		orders.add(new Order("paperstock", "scranton", 200, 40.00F));
		orders.add(new Order("posters", "newyork", 50, 40.00F));
		orders.add(new Order("printerpaper", "scranton", 5000, 90.00F));
		orders.add(new Order("cardboard", "newyork", 500, 80.00F));
	}
		
	
//	public void receiveOrder(Order order) {
//		try {
//			orders.add(order);
//		} catch (Exception e) {
//			System.out.println("Unable to receive order. Message: " + e.getMessage());
//		}		
//	}
		

	public void processOrders(Order order) {
				this.distributionCenters.get(order.closestLocation).shipProduct(
						new DistributionCenter.Product(
								order.product, 
								order.size
								)
						);
//		
//				order.setProcessed(true);

			
//			revenueProcessed += order.price;
//			orderProcessed++;
//		}	
//	public void readFromFile() throws IOException {
//		File orderInputFile = new File("Users/maheen.momin/eclipse-workspace/SimpliLearn/mytoyota.txt");
//		try (FileInputStream fileInputStream = new FileInputStream(orderInputFile)) {
//			int r = 0;
//			StringBuilder stringBuilder = new StringBuilder();
//			while((r = fileInputStream.read()) != -1) {
//				stringBuilder.append((char)r);
//				
//			}		
			
//			String orders = stringBuilder.toString();
//			System.out.println(orders);
//			String[] lines = orders.split("\n");
//			for (String line : lines) {
//				String[] columns = line.split(",");
//				if (columns.length == 4) {
//					Order order = new Order(
//							columns[0],
//							columns[1],
//							Integer.parseInt(columns[2]),
//							Float.parseFloat(columns[3])
//							);
//					receiveOrder(order);
//				}
//			}
//		}
//	}
	
	public void printSummary() {
		System.out.println("Processed " + orderProcessed + " orders");
		System.out.println("Today we had $" + revenueProcessed + " in revenue");
	}
	
	static class Order {
		
		public Order(String productName, String closestLocation, int size, float price) {
			this.product = productName;
			this.closestLocation = closestLocation;
			this.size = size;
			this.price = price;
		}
		
//		@Override
//		public String toString() {
//			return "Order{" +
//		"processed=" + processed +
//		", product=;" + product + '\'' + 
//		", closestLocation='" + closestLocation + '\'' +
//		",size=" + size +
//		", price=" + price +
//		'}';
//	
		}
		
//		boolean processed = false;
//		public String product;
//		public String closestLocation;
//		int size = 0;
//		float price = 0;
		
//		public void setProcessed(boolean processed) {
//			this.processed = processed;
//		}
		
//		public boolean isProcessed() {
//			return processed;
//		}
//	}

		
	}



