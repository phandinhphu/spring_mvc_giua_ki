package com.nhom2.multilang.dto;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.nhom2.multilang.model.Product;

@JacksonXmlRootElement(localName = "products")
public class ProductList {
	@JacksonXmlElementWrapper(useWrapping = false)
    public List<Product> products;

    public ProductList() {}
}
