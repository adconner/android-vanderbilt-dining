package edu.vanderbilt.vuphone.android.storage;

import java.util.Calendar;
import java.util.Random;

import android.util.Log;
import edu.vanderbilt.vuphone.android.dining.R;
import edu.vanderbilt.vuphone.android.objects.Range;
import edu.vanderbilt.vuphone.android.objects.RestaurantHours;
import edu.vanderbilt.vuphone.android.objects.RestaurantMenu;
import edu.vanderbilt.vuphone.android.objects.Time;

public class StaticRestaurantData {

	int maxMenuItems = 10;

	String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "k", "l",
			"m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y",
			"z" };
	Random r = new Random();

	public void createAllRestaurants() {
		randData();
		theCommonsFoodGalleryData();
		commonGroundsData();
		chefJamesData();
		centerSmoothieData();
		pubData();
		ctWestData();
		quiznosTowersData();
		quiznosMorganData();
		roTikiData();
		starbucksData();
		grinsData();
		suziesCafeEngData();
		suziesCafeBlairData();
		suziesCafeDivinityData();
		nectarData();
		mcTyeireData();
		varsityBranscombData();
		varsityTowersData();
		varsityMorganData();
		varsitySarrattData();
		hemingwayMarketData();
	}

	private void randData() {
		RestaurantHours rh = new RestaurantHours();

		//TODO On Monday through Friday, where 11:00 am is needed, something has caused
		// the display of 11:00 PM instead
		
		Time start = new Time(10, 0);
		Time stop = new Time(14, 0);
		rh.addRange(Calendar.SUNDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(10, 30);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));
		start = new Time(11, 0);
		stop = new Time(14, 30);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(10, 30);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));
		start = new Time(11, 0);
		stop = new Time(14, 30);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));
		start = new Time(16, 30);
		stop = new Time(19, 30);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(10, 30);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));
		start = new Time(11, 0);
		stop = new Time(14, 30);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(10, 30);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));
		start = new Time(11, 0);
		stop = new Time(14, 30);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));
		start = new Time(16, 30);
		stop = new Time(19, 30);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(10, 30);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));
		start = new Time(11, 0);
		stop = new Time(14, 30);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		start = new Time(10, 0);
		stop = new Time(14, 0);
		rh.addRange(Calendar.SATURDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "Rand Dining Center is the focal point of the campus community. Its central location, great food, and comfortable atmosphere provide students, faculty, and staff an opportunity to gather, socialize, and interact. Rand retail offers a varity of foods such as baked goods, made-for-you or build-your own salads, and regional favorites like Mediterranean and Asian foods.";

		Restaurant rand = new Restaurant("Rand Dining Center", rh, true, (int) (36.146405 * 1E6), (int) (-86.803178 * 1E6),
				"Cafeteria", menu, description, R.drawable.rand, true, true,
				false, null,
				"http://www.vanderbilt.edu/dining/rest_rand.php");
		rand.create();
	}

	private void theCommonsFoodGalleryData() {
		RestaurantHours rh = new RestaurantHours();
		//TODO On Saturday and Sunday where 11:00 AM is needed, 11:00 PM is being displayed instead

		Time start = new Time(11, 0);
		Time stop = new Time(20, 0);
		rh.addRange(Calendar.SUNDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(20, 30);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(20, 30);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(20, 30);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(20, 30);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(20, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(20, 0);
		rh.addRange(Calendar.SATURDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "The Commons Center is the dining facility and community square of The Commons. The state-of-the-art dining facility includes a salad bar with sizzle station, Chef�s Table, specialty pizza oven, deli, wok, grill, and vegan/vegetarian food.";
		
		Restaurant commonsFood = new Restaurant("The Commons Food Gallery", rh,
				true, (int) (36.141951 * 1E6), (int) (-86.797127 * 1E6), "Cafeteria", menu, description, R.drawable.commons,
				true, true, false, null, "http://www.vanderbilt.edu/dining/rest_commons.php");
		commonsFood.create();
	}

	private void commonGroundsData() {
		RestaurantHours rh = new RestaurantHours();

		//TODO Need a way to show that Common Grounds is open 24 hours a day that makes sense
		Time start = new Time(7, 0);
		Time stop = new Time(7, 0);
		rh.addRange(Calendar.SUNDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.SATURDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "Common Grounds 24-hour coffee shop in The Commons Center offers grab-n-go meals, beverages and sundries. Particular emphasis on using biodegradable/compostable products and only serves 100% organic/fair trade coffee.";
		
		Restaurant commonGrounds = new Restaurant("The Common Grounds", rh,
				false, (int) (36.141771 * 1E6), (int) (-86.79694 * 1E6), "Munchie Mart", menu, description, R.drawable.commongrounds,
				true, true, false, null, "http://www.vanderbilt.edu/dining/commongrounds.php");
		commonGrounds.create();
		
	}

	private void chefJamesData() {
		RestaurantHours rh = new RestaurantHours();
		//TODO Currently on Friday where 11:00 AM is needed, there is currently an 11:00 PM
		
		Time start = new Time(16, 0);
		Time stop = new Time(19, 0);
		rh.addRange(Calendar.SUNDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(19, 30);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(19, 30);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(19, 30);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(19, 30);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(15, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		start = new Time(16, 0);
		stop = new Time(19, 0);
		rh.addRange(Calendar.SATURDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "Chef James Bistro serves hot gourmet entrees and sides, soups, coffee, gourmet grab-n-go salads, sandwiches, entrees and sides.";
		
		Restaurant chefJames = new Restaurant("Chef James Bistro", rh, false,
				(int) (36.146321 * 1E6), (int) (-86.803037 * 1E6), "Cafe", menu, description, R.drawable.chefjamesbistro, true,
				true, false, null,
				"http://www.vanderbilt.edu/dining/line_chefjamesbistro.php");
		chefJames.create();
	}

	private void centerSmoothieData() {
		RestaurantHours rh = new RestaurantHours();

		// Center Smoothie is closed on Saturday and Sunday
		// TODO Implement a way to display closed for a restaurant that's closed
		// all day
		Time start = new Time(7, 0);
		Time stop = new Time(21, 0);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(21, 0);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(21, 0);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(21, 0);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(15, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "Gourmet smoothie shop offering grab-n-go meal plan options.";
		
		Restaurant centerSmoothie = new Restaurant("Center Smoothie", rh,
				false, (int) (36.146545 * 1E6), (int) (-86.803471 * 1E6), "Smoothie", menu, description, R.drawable.centersmoothie,
				true, true, false, null, "http://www.vanderbilt.edu/dining/line_centersmoothie.php");
		centerSmoothie.create();
	}

	private void pubData() {
		RestaurantHours rh = new RestaurantHours();
		// The Pub is closed on Saturday and Sunday
		// TODO Implement a way to display closed for a restaurant that's closed
		// all day
		// On Monday to Friday, where 11:00 AM should be, there is currently an 11:00 PM
		Time start = new Time(11, 0);
		Time stop = new Time(21, 0);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(21, 0);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(21, 0);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(21, 0);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(20, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "Casual dining restaurant serving al-a-carte lunch (burgers, paninis, salads, sandwiches, chicken fingers) and themed dinners (Mexican, BBQ, Italian, etc). The Pub is a perfect place to watch a game on its state-of-the-art TV/sound system.";
		
		Restaurant thePub = new Restaurant("The Pub at Overcup Oak", rh, false,
				(int) (36.146626 * 1E6), (int) (-86.803736 * 1E6), "Sports Bar", menu, description, R.drawable.pub, true,
				true, false, null, "http://www.vanderbilt.edu/dining/line_pub.php");
		thePub.create();
	}

	private void ctWestData() {
		RestaurantHours rh = new RestaurantHours();
		// C.T. West is closed on Friday and Saturday
		// TODO Implement a way to display closed for a restaurant that's closed
		// all day
		// Currently for Sunday through Thursday, 11:00 PM exists where 11:00 AM needs to exist
		Time start = new Time(11, 0);
		Time stop = new Time(21, 0);
		rh.addRange(Calendar.SUNDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(21, 0);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(21, 0);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(21, 0);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(21, 0);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "Cowboy-themed casual BBQ restaurant in Carmichael West serving BBQ, burgers, chili, and much more!";
		
		Restaurant ctWest = new Restaurant("C.T. West", rh, false, (int) (36.147418 * 1E6), (int) (-86.806839 * 1E6),
				"BBQ", menu, description, R.drawable.ctwest, true, true,
				false, null, "http://www.vanderbilt.edu/dining/line_ctwest.php");
		ctWest.create();
	}

	private void quiznosTowersData() {
		RestaurantHours rh = new RestaurantHours();
		// TODO Implement a way to show that a restaurant is open beyond the
		// current day, on Friday and Saturday, Quiznos is open til 4:00 AM and Sunday through Thursday
		// is open til 12:30 AM the next day.
		// On Sunday through Saturday, there exists 11:00 PM where there needs to be an 11:00 AM 
		Time start = new Time(11, 0);
		Time stop = new Time(0, 30);
		rh.addRange(Calendar.SUNDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(0, 30);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(0, 30);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(0, 30);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(0, 30);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(4, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(4, 0);
		rh.addRange(Calendar.SATURDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "Located in Carmichael Towers and Morgan Hall, Quiznos delivers uncompromising quality for those looking for a tasty, fresher alternative to traditional fast food restaurants. Serving sandwiches, soup, and salads.";
		
		Restaurant quiznosTowers = new Restaurant("Quiznos Sub - Towers", rh,
				false, (int) (36.147461 * 1E6), (int) (-86.806705 * 1E6), "Sandwich", menu, description, R.drawable.quiznos,
				true, true, false, null, "http://www.vanderbilt.edu/dining/line_quiznos_towers.php");
		quiznosTowers.create();
	}

	private void quiznosMorganData() {
		RestaurantHours rh = new RestaurantHours();
		// TODO On Monday through Friday, there exists an 11:00 PM instead of an 11:00 AM
		//Check Morgan Quiznos hours after break because hours are currently not clear
		Time start = new Time(11, 0);
		Time stop = new Time(22, 0);
		rh.addRange(Calendar.SUNDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(22, 0);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(22, 0);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(22, 0);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(22, 0);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(22, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(22, 0);
		rh.addRange(Calendar.SATURDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "Located in Carmichael Towers and Morgan Hall, Quiznos delivers uncompromising quality for those looking for a tasty, fresher alternative to traditional fast food restaurants. Serving sandwiches, soup, and salads.";
		
		Restaurant quiznosMorgan = new Restaurant("Quiznos Sub - Morgan", rh,
				false, (int) (36.140584 * 1E6), (int) (-86.806286 * 1E6), "Sandwich", menu, description, R.drawable.quiznos,
				true, true, false, null, "http://www.vanderbilt.edu/dining/line_quiznos_morgan.php");
		quiznosMorgan.create();
	}

	private void roTikiData() {
		RestaurantHours rh = new RestaurantHours();
		
		//TODO Currently where 11:00 PM is, there needs to be an 11:00 AM.
		//Need to show that restaurant is closed all day on Saturday and Sunday
		Time start = new Time(11, 0);
		Time stop = new Time(22, 0);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(22, 0);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(22, 0);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(22, 0);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(15, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "Island-themed quick-service restaurant serving chef-crafted wraps, paninis, pizza, sandwiches, and salads.";
		
		Restaurant roTiki = new Restaurant("Ro*Tiki", rh, false, (int) (36.144847 * 1E6), (int) (-86.805728 * 1E6),
				"Cafe/Munchie Mart", menu, description, R.drawable.rotiki, true, true,
				false, null, "http://www.vanderbilt.edu/dining/line_rotiki.php");
		roTiki.create();
	}

	private void starbucksData() {
		RestaurantHours rh = new RestaurantHours();
		// TODO Implement a way to show that a restaurant is closed all day
		// The 11:00 PM that's on this restaurant is correct
		// Starbucks is closed all day on Saturday
		Time start = new Time(12, 0);
		Time stop = new Time(23, 0);
		rh.addRange(Calendar.SUNDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(23, 0);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(23, 0);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(23, 0);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(23, 0);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(15, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "Starbucks takes the Commodore Card (Meal Money and Commodore Cash) and serves pastries and beverages Sunday through Friday.";
		
		Restaurant starbucks = new Restaurant("Starbucks", rh, false, (int) (36.144368 * 1E6), (int) (-86.805529 * 1E6),
				"Coffee", menu, description, R.drawable.starbucks, true, true,
				false, null, "http://www.vanderbilt.edu/dining/line_starbucks.php");
		starbucks.create();
	}

	private void grinsData() {
		RestaurantHours rh = new RestaurantHours();
		// TODO Implement a way to show that a restaurant is closed on a day
		// Restaurant is closed all day on Saturday and Sunday
		// Where 11:00 PM exists on Monday though Friday, there needs to be an 11:00 AM

		Time start = new Time(11, 0);
		Time stop = new Time(21, 0);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(21, 0);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(21, 0);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(21, 0);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(11, 0);
		stop = new Time(15, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "Grins Vegetarian Cafe in the Schulman Center offers wraps, salads, paninis, and baked goods with a Kosher-certified kitchen.";
		
		Restaurant grins = new Restaurant("Grins - Vegetarian Cafe", rh, false,
				(int) (36.144785 * 1E6), (int) (-86.806399 * 1E6), "Vegetarian", menu, description, R.drawable.grins, true,
				true, false, null, "http://www.vanderbilt.edu/dining/line_grins.php");
		grins.create();
	}

	private void suziesCafeEngData() {
		RestaurantHours rh = new RestaurantHours();
		// TODO Implement a way to show that a restaurant is closed on a certain day
		// Restaurant is closed all day on Saturday and Sunday

		Time start = new Time(7, 30);
		Time stop = new Time(14, 30);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(7, 30);
		stop = new Time(14, 30);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(7, 30);
		stop = new Time(14, 30);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(7, 30);
		stop = new Time(14, 30);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(7, 30);
		stop = new Time(14, 30);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}
		
		String description = "All three locations offer an assortment of delicious sandwiches, bagels, muffins, wraps, coffee and many other treats. Suzie's takes cash, Commodore Card and Meal Plan at Blair and Featheringill and takes cash, Meal Plan, Commodore Card, and Visa and Mastercard at the Divinity School.";

		Restaurant suziesCafeEng = new Restaurant("Suzie's Cafe - Engineering",
				rh, false, (int) (36.144801 * 1E6), (int) (-86.802836 * 1E6), "Cafe", menu, description,
				R.drawable.suzies, true, true, false, null,
				"http://www.vanderbilt.edu/dining/line_suziescafe.php");
		suziesCafeEng.create();
	}

	private void suziesCafeBlairData() {
		RestaurantHours rh = new RestaurantHours();
		// TODO Implement a way to show that a restaurant is closed on a certain day
		// Restaurant is closed all day on Saturday and Sunday
		Time start = new Time(7, 30);
		Time stop = new Time(14, 30);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(7, 30);
		stop = new Time(14, 30);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(7, 30);
		stop = new Time(14, 30);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(7, 30);
		stop = new Time(14, 30);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(7, 30);
		stop = new Time(14, 30);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "All three locations offer an assortment of delicious sandwiches, bagels, muffins, wraps, coffee and many other treats. Suzie's takes cash, Commodore Card and Meal Plan at Blair and Featheringill and takes cash, Meal Plan, Commodore Card, and Visa and Mastercard at the Divinity School.";
		
		Restaurant suziesCafeBlair = new Restaurant("Suzie's Cafe - Blair", rh,
				false, (int) (36.13863 * 1E6), (int) (-86.805874 * 1E6), "Cafe", menu, description, R.drawable.suzies,
				true, true, false, null, "http://www.vanderbilt.edu/dining/line_suziescafe.php");
		suziesCafeBlair.create();
	}

	private void suziesCafeDivinityData() {
		RestaurantHours rh = new RestaurantHours();
		// TODO Implement a way to show that a restaurant is closed on a certain day
		// Restaurant is closed all day on Saturday and Sunday
		Time start = new Time(8, 30);
		Time stop = new Time(14, 30);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(8, 30);
		stop = new Time(14, 30);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(8, 30);
		stop = new Time(14, 30);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(8, 30);
		stop = new Time(14, 30);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(8, 30);
		stop = new Time(14, 30);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "All three locations offer an assortment of delicious sandwiches, bagels, muffins, wraps, coffee and many other treats. Suzie's takes cash, Commodore Card and Meal Plan at Blair and Featheringill and takes cash, Meal Plan, Commodore Card, and Visa and Mastercard at the Divinity School.";
		
		Restaurant suziesCafeDiv = new Restaurant("Suzie's Cafe - Divinity",
				rh, false, (int) (36.14654 * 1E6), (int) (-86.800662 * 1E6), "Cafe", menu, description,
				R.drawable.suzies, true, true, false, null,
				"http://www.vanderbilt.edu/dining/line_suziescafe.php");
		suziesCafeDiv.create();
	}

	private void nectarData() {
		RestaurantHours rh = new RestaurantHours();
		// TODO Implement a way to show that a restaurant is closed on a certain day
		// Restaurant is closed all day on Saturday and Sunday
		Time start = new Time(10, 0);
		Time stop = new Time(19, 0);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(10, 0);
		stop = new Time(19, 0);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(10, 0);
		stop = new Time(19, 0);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(10, 0);
		stop = new Time(19, 0);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(10, 0);
		stop = new Time(19, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "This campus natural food store offers alternative natural, organic and gourmet products including grab & go, beverages, snacks, frozen meals, specialty food and whole body care. Located on the first floor of Barnard.";
		
		Restaurant nectar = new Restaurant("Nectar", rh, false, (int) (36.148782 * 1E6), (int) (-86.803473 * 1E6),
				"Organic Munchie Mart", menu, description, R.drawable.nectar, true, true,
				false, null, "http://www.vanderbilt.edu/dining/nectar.php");
		nectar.create();
	}

	private void mcTyeireData() {
		RestaurantHours rh = new RestaurantHours();
		// TODO Implement a way to show that a restaurant is closed on a certain day
		// Restaurant is closed all day on Saturday and Sunday
		// Restaurant does not have its own icon or description

		Time start = new Time(7, 0);
		Time stop = new Time(10, 0);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));
		start = new Time(18, 0);
		stop = new Time(19, 0);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(10, 0);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));
		start = new Time(18, 0);
		stop = new Time(19, 0);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(10, 0);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));
		start = new Time(18, 0);
		stop = new Time(19, 0);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(10, 0);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));
		start = new Time(18, 0);
		stop = new Time(19, 0);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(10, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "";
		
		Restaurant mcTyeire = new Restaurant("McTyeire", rh, false, (int) (36.143796 * 1E6), (int) (-86.803227 * 1E6),
				"onCampus", menu, description, R.drawable.dining, true, true,
				false, null, null);
		mcTyeire.create();
	}

	private void varsityBranscombData() {
		RestaurantHours rh = new RestaurantHours();
		// TODO Implement a way to show that a restaurant is open 24 hours a day 7 days a week
		// Currently shown by 7:00 AM - 7:00 AM
		Time start = new Time(7, 0);
		Time stop = new Time(7, 0);
		rh.addRange(Calendar.SUNDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.SATURDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "Open 24 hours! Featuring grab-n-go snacks, microwave meals, salads, fresh fruits, sandwiches, plus Bongo Java coffees, Muffin Tin baked goods, tons of groceries, and more! Plus, Varsity Marketplace is home to Ro*Tiki, our island-themed quick-service restaurant offering chef-crafted soups, salads, wraps, sandwiches, and pizza. And Varsity Marketplace is a VU Meal Plan location.";
		
		Restaurant varsityBranscomb = new Restaurant(
				"Varsity Market - Branscomb", rh, false, (int) (36.144929 * 1E6), (int) (-86.805791 * 1E6), "Munchie Mart",
				menu, description, R.drawable.marketplace, true, true, false,
				null, "http://www.vanderbilt.edu/dining/varsitymarketplace.php");
		varsityBranscomb.create();
	}

	private void varsityTowersData() {
		RestaurantHours rh = new RestaurantHours();
		// TODO Implement a way to show that a restaurant is open 24 hours a day 7 days a week
		// Currently shown by 7:00 AM - 7:00 AM
		Time start = new Time(7, 0);
		Time stop = new Time(7, 0);
		rh.addRange(Calendar.SUNDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.SATURDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "Located in the basement of Carmichael Towers East, Varsity Towers features grocery items, a variety of bottled beverages, dairy products, sandwiches, salads, fresh fruits, and more. And Varsity Towers is a VU Meal Plan location open 24/7.";
		
		Restaurant varsityTowers = new Restaurant("Varsity Market - Towers",
				rh, false, (int) (36.147903 * 1E6), (int) (-86.805857 * 1E6), "Munchie Mart", menu, description,
				R.drawable.towers, true, true, false, null,
				"http://www.vanderbilt.edu/dining/varsitytowers.php");
		varsityTowers.create();
	}

	private void varsityMorganData() {
		RestaurantHours rh = new RestaurantHours();
		// TODO Implement a way to show that a restaurant is open beyond the
		// current day 
		// Restaurant is currently open til 1 AM the next day 7 days a week
		Time start = new Time(10, 0);
		Time stop = new Time(1, 0);
		rh.addRange(Calendar.SUNDAY, new Range(start, stop));

		start = new Time(10, 0);
		stop = new Time(1, 0);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(10, 0);
		stop = new Time(1, 0);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(10, 0);
		stop = new Time(1, 0);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(10, 0);
		stop = new Time(1, 0);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(10, 0);
		stop = new Time(1, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		start = new Time(10, 0);
		stop = new Time(1, 0);
		rh.addRange(Calendar.SATURDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "Bringing convenience to Area VI, Varsity Morgan offers grocery items, beverages, dairy products, and sandwiches, salads, and fresh fruits. VU Meal Plans may be used at Varsity Morgan.";
		
		Restaurant varsityMorgan = new Restaurant("Varsity Market - Morgan",
				rh, false, (int) (36.140609 * 1E6), (int) (-86.806328 * 1E6), "Munchie Mart", menu, description,
				R.drawable.morgan, true, true, false, null,
				"http://www.vanderbilt.edu/dining/varsitymorgan.php");
		varsityMorgan.create();
	}

	private void varsitySarrattData() {
		RestaurantHours rh = new RestaurantHours();
		// TODO Implement a way to show that a restaurant is closed all day
		// Restaurant is closed all day on Saturday and Sunday

		Time start = new Time(8, 0);
		Time stop = new Time(16, 0);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(8, 0);
		stop = new Time(16, 0);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(8, 0);
		stop = new Time(16, 0);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(8, 0);
		stop = new Time(16, 0);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(8, 0);
		stop = new Time(16, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "This mini-market in Sarratt Student Center features grab-n-go items, snacks, beverages, sandwiches, salads, fresh fruits, plus a whole lot more. And Jr. Varsity Market is a VU Meal Plan location.";
		
		Restaurant varsitySarratt = new Restaurant(
				"Jr. Varsity Market - Sarratt", rh, false, (int) (36.146587 * 1E6), (int) (-86.803428 * 1E6), "Munchie Mart",
				menu, description, R.drawable.jr, true, true, false,
				null, "http://www.vanderbilt.edu/dining/jrvarsitymarket.php");
		varsitySarratt.create();
	}

	private void hemingwayMarketData() {
		RestaurantHours rh = new RestaurantHours();
		// TODO Implement a way to show that a restaurant is open beyond the
		// current day
		// Strange situation because restaurant opens at 10:00 AM on Sunday then is open 
		// 24 hours a day until it closes on on Saturday at 11:00 PM
		Time start = new Time(10, 0);
		Time stop = new Time(10, 0);
		rh.addRange(Calendar.SUNDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.MONDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.TUESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.WEDNESDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(7, 0);
		rh.addRange(Calendar.THURSDAY, new Range(start, stop));

		start = new Time(7, 0);
		stop = new Time(23, 0);
		rh.addRange(Calendar.FRIDAY, new Range(start, stop));

		start = new Time(10, 0);
		stop = new Time(23, 0);
		rh.addRange(Calendar.SATURDAY, new Range(start, stop));

		RestaurantMenu menu = new RestaurantMenu();
		int items = r.nextInt(maxMenuItems);
		for (int i = 0; i < items; i++) {
			String name = new String();
			for (int j = 0; j < 14; j++)
				name = name + letters[r.nextInt(letters.length)];
			menu
					.addItem(new RestaurantMenu.MenuItem(name,
							"A wonderful blend of nothing and everything to make something"));
		}

		String description = "A Market serving Kissam Quad, Hemingway Market is located inside Hemingway Hall.";
		
		Restaurant hemingwayMarket = new Restaurant("Hemingway Market", rh,
				false, (int) (36.149829 * 1E6), (int) (-86.80124 * 1E6), "Munchie Mart", menu, description, R.drawable.hemingway,
				true, true, false, null, "http://www.vanderbilt.edu/dining/hemingwaymarket.php");
		hemingwayMarket.create();
	}
}
