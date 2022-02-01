import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import BO.DishBO;
import DAO.DishDAO;
import DAO.DishJdbcDAO;
import entity.Dish;

public class DishAdd {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//		DishDAO dao = context.getBean("DishDAO", DishDAO.class);
//		
//		DishBO bo = new DishBO();
//		
//		for (Dish d : bo.getAllDishList()) {
//			System.out.println(d.getName());
//		}
		
//		do {
//			Dish dish = new Dish();
//			
//			System.out.println("Enter dish name");
//			dish.setName(br.readLine());
//			
//			System.out.println("Enter dish price");
//			dish.setPrice(Double.parseDouble(br.readLine()));
//			
//			System.out.println("Enter discount");
//			dish.setDiscount(Double.parseDouble(br.readLine()));
//			
//			dao.insertDish(dish);
//			
//			System.out.println("Value successfully inserted");
//			
//			System.out.println("Do you want to add more? Y/N");
//			
//			if (br.readLine().trim().equalsIgnoreCase("N")) {
//				System.exit(0);
//			}
//		} while (true);
		
		List<Dish> nd = new ArrayList<Dish>();
		nd.add(new Dish(1, "Pav Bhaji", 200.0, 1.0,
				"https://www.rajbhog.com/wp-content/uploads/2021/02/Pav-Bhaji-870x635.jpg", "northern"));
		nd.add(new Dish(2, "Chhole Bhature", 100.0, 2.0, "images/chb.jfif", "northern"));
		nd.add(new Dish(3, "Samose", 20.0, 5.0, "images/samose.jfif", "northern"));
		nd.add(new Dish(4, "Chilli Potato", 80.0, 10.0, "images/chilli_potato.png", "northern"));
		nd.add(new Dish(5, "Gol Gappe", 30.0, 2.0, "images/ggp.jfif", "northern"));
		
		List<Dish> sd = new ArrayList<Dish>();
		sd.add(new Dish(1, "Idli", 20.0, 1.0, "images/idli.jfif", "southern"));
		sd.add(new Dish(2, "Dosa", 50.0, 4.0, "images/dosa.jfif", "southern"));
		sd.add(new Dish(3, "Masala Dosa", 75.0, 4.0,
				"https://i.ndtvimg.com/i/2017-08/masala-dosa_620x330_81504097859.jpg", "southern"));
		
		List<Dish> bv = new ArrayList<Dish>();
		bv.add(new Dish(0, "Thumbs Up", 10.0, 2.0, "images/Thums Up - Soft Drink - Front.jpg", "Beverages"));
		bv.add(new Dish(1, "CocaCola", 10.0, 1.0, "images/drinks.jpg", "Beverages"));
		
		DishJdbcDAO dao = new DishJdbcDAO();
		
		for (Dish dish : bv) {
			dao.addDish(dish);
			System.out.println(dish.getName() + " added.\n" );
		}
		
		System.out.println("Done.");
	}

}
