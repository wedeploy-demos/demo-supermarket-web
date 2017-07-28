package io.wedeploy.supermarket.model;

import org.json.JSONObject;

/**
 * @author Silvio Santos
 */
public class CartProduct {

	public CartProduct(JSONObject jsonObject) {
		id = jsonObject.optString("id", "");
		productFilename = jsonObject.optString("productFilename", "");
		productId = jsonObject.optString("productId", "");
		productPrice = jsonObject.optDouble("productPrice", 0);
		productTitle = jsonObject.optString("productTitle", "");
	}

	public String getImageUrl() {
		return "https://ui-supermarket.wedeploy.sh/assets/images/" + productFilename;
	}

	public String getProductId() {
		return productId;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public String getId() {
		return id;
	}

	private String id;
	private String productFilename;
	private String productId;
	private double productPrice;
	private String productTitle;

}
