package baitapjava71;

public class DiscountRate {
  private static double serviceDiscountPremium=0.2;
  private static double serviceDiscountGold=0.15;
  private static double serviceDiscountSilver=0.1;
  private static double ProductDiscountPremium=0.1,ProductDiscountGold=0.1,ProductDiscountSilver=0.1;
  public static double getServiceDiscountRate(String type) {
	 if(type.equals(serviceDiscountGold)) {
		return 0.15;
	 }
	  else if(type.equals(serviceDiscountPremium)) {
		return 0.2;
	 }
	  else if(type.equals(serviceDiscountSilver)) {
		 return 0.1;
	 }
	return 0;
   }
}

