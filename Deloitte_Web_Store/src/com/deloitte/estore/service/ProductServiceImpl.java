package com.deloitte.estore.service;

import java.sql.SQLException;
import java.util.List;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.repo.ProductRepo;
import com.deloitte.estore.repo.ProductRepoImpl;

public class ProductServiceImpl implements ProductService {
		private ProductRepo pRepo;

		public ProductServiceImpl() {
			super();
			pRepo = new ProductRepoImpl();
		}

		

		@Override
		public boolean addProduct(Product product) throws Exception
		{
				
			if(pRepo.getProductById(product.getProductId()) == null)
			{
				throw new Exception();
			}
			else if(product.getProductName() == null || product.getProductName().length() < 3)
			{
				throw new Exception();
			}
			else if(product.getPrice() < 0 )
			{
				throw new Exception();
			}
			else
			{
				System.out.println("product validated from product service Impl.");
				return pRepo.addProduct(product);

			}
							
		}

		@Override
		public boolean deleteProduct(Product product) throws Exception{
			
			if(pRepo.getProductById(product.getProductId()) == null)
			{
				throw new Exception();
			}
//			else if(product.getProductName() == null || product.getProductName().length() < 3)
//			{
//				throw new Exception();
//			}
//			else if(product.getPrice() < 0 )
//			{
//				throw new Exception();
//			}
			else
			{
				System.out.println("product validated from product service Impl.");
				return pRepo.deleteProduct(product);

			}
		}

		@Override
		public boolean updateProduct(Product product) throws Exception {
			if(pRepo.getProductById(product.getProductId()) == null)
			{
				throw new Exception();
			}
			else if(product.getProductName() == null || product.getProductName().length() < 3)
			{
				throw new Exception();
			}
			else if(product.getPrice() < 0 )
			{
				throw new Exception();
			}
			else
			{
				System.out.println("product validated from product service Impl.");
				return pRepo.updateProduct(product);

			}
		}

		@Override
		public Product getProductById(int productId) throws SQLException {
			return pRepo.getProductById(productId);
		}

		@Override
		public List<Product> getAllProducts() throws Exception {
			// TODO Auto-generated method stub
			return getAllProducts();
		}


}
