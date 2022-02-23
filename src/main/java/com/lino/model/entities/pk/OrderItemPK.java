package com.lino.model.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.lino.model.entities.Order;
import com.lino.model.entities.Product;

//classe auxiliar  para gerar o id da order de item
@Embeddable
public class OrderItemPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne//(Muitos Para um) muitas ordens de pedidos para muitos pedidos
	@JoinColumn(name = "order_id")
	private Order order;

	@ManyToOne//(Muitos Para um) muitas ordens de pedidos para muitos produtos
	@JoinColumn(name = "product_id")
	private Product product;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public int hashCode() {
		return Objects.hash(order, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPK other = (OrderItemPK) obj;
		return Objects.equals(order, other.order) && Objects.equals(product, other.product);
	}

}
