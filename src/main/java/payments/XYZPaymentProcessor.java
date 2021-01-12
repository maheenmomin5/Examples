package payments;

import java.util.ArrayList;
import java.util.List;

public class XYZPaymentProcessor {
	
	List<XYZPaymentApi> processors = new ArrayList<>();
	
	List<XYZPaymentApi> processors;
		processors.add(new XYZPaymentApiImpl());
		
}

	public void process() {
		processors.forEach(p) -> p.deposit(0f, "123", "abc");
	}

}
