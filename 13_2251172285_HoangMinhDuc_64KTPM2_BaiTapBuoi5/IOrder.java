package HouseBuilder;

public interface IOrder {
	void Reset();
	void BuildOrderId();
	void BuildTotalAmount();
	void BuildPromotion();
	Order GetResult();
}
