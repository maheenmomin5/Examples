package theoffice.newyork;

import theoffice.DistributionCenters;

public class NewYorkDistributionCenter extends DistributionCenters {

	DeliveryBike deliveryBike = new DeliveryBike();
	
	@Override
	public void shipProduct(DistributionCenters.Product product)   {
		deliveryBike.deliver(product);
	}
	
	static class DeliveryBike {
		void deliver(DistributionCenters.Product product) {
			if (product.name.equals("kettlebells")) {
				System.out.println("Not delivering heavy product");
			}
			System.out.println("Bike delivering product " + product.name);
		}
	}
	
}
