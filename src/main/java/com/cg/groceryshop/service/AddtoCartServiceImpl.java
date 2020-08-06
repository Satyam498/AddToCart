package com.cg.groceryshop.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import com.cg.groceryshop.dao.AddtoCartRepositories;
import com.cg.groceryshop.entity.Product;

@Service
public class AddtoCartServiceImpl implements AddtoCartService{
	
	
	@Autowired
	private AddtoCartRepositories addtocartRepository;

	@Override
	public List<String> forProductStatus(@PathVariable String productId) {
	
		Product product=addtocartRepository.findProductByProductId(productId);
		if(product!=null)
    	{
			List<String> status=new ArrayList<String>();
			status.add(product.getProductName1());
			status.add(product.getProductName1());
			status.add(product.getProductName3());
			status.add(product.getProductName4());
			status.add(product.getProductName5());
			return status;
			}
		else
		{
			Product newProduct=new Product();
			
			newProduct.setProductId(productId);
			newProduct.setProductName1("available");
			newProduct.setProductName2("available");
			newProduct.setProductName3("available");
			newProduct.setProductName4("available");
			newProduct.setProductName5("available");
			addtocartRepository.save("newProduct");
			List<String> status=new ArrayList<String>();
			status.add(newProduct.getProductName1());
			status.add(newProduct.getProductName2());
			status.add(newProduct.getProductName3());
			status.add(newProduct.getProductName4());
			status.add(newProduct.getProductName5());
			return status;		
		}
		
		}

	@Override
	public String forProductBooking(String productId, String productName) {

		if(productName.equals("ProductName1"))
		{
			
			Product existingProduct=addtocartRepository.findProductByProductId(productId);
			System.out.println(existingProduct.getProductName1());
			if(existingProduct.getProductName1().equals("available"))
			{
				existingProduct.setProductName1("occupied");
				 addtocartRepository.save(existingProduct);
				 return "booking done successfully";
			}
			else
			{
				return "sorry!!!the Product is not available......";
			}
			
			
				
		
		
		
	}

		if(productName.equals("ProductName2"))
		{
			
			Product existingProduct=addtocartRepository.findProductByProductId(productId);
			System.out.println(existingProduct.getProductName2());
			if(existingProduct.getProductName2().equals("available"))
			{
				existingProduct.setProductName2("occupied");
				 addtocartRepository.save(existingProduct);
				 return "booking done successfully";
			}
			else
			{
				return "sorry!!!the Product is not available......";
			}
			
		
	    }
	
		if(productName.equals("ProductName3"))
		{
			
			Product existingProduct=addtocartRepository.findProductByProductId(productId);
			System.out.println(existingProduct.getProductName3());
			if(existingProduct.getProductName3().equals("available"))
			{
				existingProduct.setProductName3("occupied");
				 addtocartRepository.save(existingProduct);
				 return "booking done successfully";
			}
			else
			{
				return "sorry!!!the Product is not available......";
			}
			
	
	}
		if(productName.equals("ProductName4"))
		{
			
			Product existingProduct=addtocartRepository.findProductByProductId(productId);
			System.out.println(existingProduct.getProductName4());
			if(existingProduct.getProductName4().equals("available"))
			{
				existingProduct.setProductName4("occupied");
				 addtocartRepository.save(existingProduct);
				 return "booking done successfully";
			}
			else
			{
				return "sorry!!!the Product is not available......";
			}
			

}
		
		if(productName.equals("ProductName5"))
		{
			
			Product existingProduct=addtocartRepository.findProductByProductId(productId);
			System.out.println(existingProduct.getProductName5());
			if(existingProduct.getProductName5().equals("available"))
			{
				existingProduct.setProductName5("occupied");
				 addtocartRepository.save(existingProduct);
				 return "booking done successfully";
			}
			else
			{
				return "sorry!!!the Product is not available......";
			}
			
	}
	return null;
}
}