package coolmens;

public class CostumerDetails {
private String cName;
private int dDetail;
private int cDiscount;
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public int getdDetail() {
	return dDetail;
}
public void setdDetail(int dDetail) {
	this.dDetail = dDetail;
}
public int getcDiscount() {
	return cDiscount;
}
public void setcDiscount(int cDiscount) {
	this.cDiscount = cDiscount;
}
public CostumerDetails(String cName, int dDetail, int cDiscount) {
	super();
	this.cName = cName;
	this.dDetail = dDetail;
	this.cDiscount = cDiscount;
}
@Override
public String toString() {
	return "\n Costumer Details : \n Costumer Name : " + cName + " \n Delivery Detail : " + dDetail + " \n Costumer Discount=" + cDiscount + "\n";
}

}
