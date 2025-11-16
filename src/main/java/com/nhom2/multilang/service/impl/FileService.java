package com.nhom2.multilang.service.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.nhom2.multilang.dto.ProductList;
import com.nhom2.multilang.model.Product;

@Service
public class FileService {
	private static final String BASE_PATH = "D:/workspace/java/spring_mvc_giua_ki/uploads/";
	
	public void writeTxt(List<Product> list, String file_name) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter(BASE_PATH + file_name));
        for (Product p : list) {
        	System.out.println(p.getProductId() + "," + p.getWeight() + "," + p.getPrice());
            writer.write(p.getProductId() + "," + p.getWeight() + "," + p.getPrice());
            writer.newLine();
        }
        writer.close();
    }

    public List<Product> readTxt(String path) throws Exception {
        List<Product> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));

        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            list.add(new Product(
                Float.parseFloat(parts[0]),
                Double.parseDouble(parts[1]),
                Integer.parseInt(parts[2])
            ));
        }
        br.close();
        return list;
    }
    
    public void writeJson(List<Product> list, String file_name) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(BASE_PATH + file_name), list);
    }
    
    public List<Product> readJson(String path) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(path),
                new TypeReference<List<Product>>() {});
    }
	
    public void writeXml(List<Product> list, String file_name) throws Exception {
        XmlMapper mapper = new XmlMapper();

        ProductList wrapper = new ProductList();
        wrapper.products = list;

        mapper.writeValue(new File(BASE_PATH + file_name), wrapper);
    }
    
    public List<Product> readXml(String path) throws Exception {
        XmlMapper mapper = new XmlMapper();
        ProductList wrapper = mapper.readValue(new File(path), ProductList.class);
        return wrapper.products;
    }
}
