package theoffice.scranton;

import theoffice.DistributionCenters;

public class ScrantonDistributionCenter extends DistributionCenters {

	public DeliveryTruck deliveryTruck = new DeliveryTruck();
	
	public void shipProduct(Product product ) {
		deliveryTruck.deliver(product);
	}
	
	static class DeliveryTruck {
		boolean isBroken = false;
		public void deliver(DistributionCenters.Product product) {
			if (isBroken) {
		} 
			System.out.println("Truck deliverying product " + product.name);
	}
		public void setBroken(boolean broken) {
			isBroken = broken;
		}
	}
	
}