package com.hcl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.rmi.CORBA.Util;

import catsanddogs.Brudus;
import catsanddogs.Rufus;
import cereal.AbstractCereal;
import cereal.CocoPuffsCereal;
import cereal.SoggyFruitLoopsCereal;
import classes.Tesla;
import classes.Toyota;
import exercises.ArrayRotation;
import exercises.OrderStatistics;
import exercises.OurCircularLinkedList;
import exercises.OurDoublyLinkedList;
import exercises.OurSinglyLinkedList;
import exercises.RangeAndMatrix;
import theoffice.PaperCompany;
import videogames.HalfLife;
import videogames.SuperMario;
import classes.Car;
import classes.Kiwi;


public class App {
	
	public static void main(String[] args)  {
		
		
		
	}
		
		
		
	static void puttingNumbersInOrderExample() {	
		
		int[] numbers = {4,2,4,6,7,8,1,4,6,8};
		//Put numbers in order//
		for (int i = 0; i < numbers.length; i++) {
			int outer = numbers[i];
			int lowest = outer;
			int key = i;
			for (int k = i + 1; k < numbers.length; k++) {
				int inner = numbers[k];
				if (inner < lowest) {
					lowest = inner;
					key = k;
				}
			}
			numbers[i] = lowest;
			numbers[key] = outer;
		}
		for(int i: numbers) {
			System.out.println("Number: " + i);
		}
	}
		
		
		
	
	
	
	
		
	static void exponentialSearchExample() {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,11};
		int lookingFor = 5;
		
		for (int number:numbers) {
			if (number == lookingFor) {
				System.out.println("Found " + number);
			}
		}
		System.out.println("Binary search"); 
		int index = binarySearch(lookingFor , 0, numbers.length, numbers);
		System.out.println("Found anser at index: " + index);
		
		System.out.println("Exponential search");
		index = exponentialSearch(lookingFor, numbers);
		System.out.println("Found answer at index: " + index);
	}
		static int exponentialSearch(int lookingFor, int[]data) {
			
			int range = 2;[]
			int index = 1;
			while (data[index] < lookingFor) {
				System.out.println("Searching up to index: " + index + " has value " + data[index] + " higher than " + lookingFor);
				index += range;
				range = range * 2;

			}
				System.out.println("Found index " + index + " has value " + data[index] + " higher than " + lookingFor);
				return index;
			
	}

		static int binarySearch2(int lookingFor, int start, int end, int[]data) {
			int evaluateIndex = (end + start) / 2;
			if (data[evaluateIndex] == lookingFor) {
				System.out.println("Found " + lookingFor + " at index " + start);
				return evaluateIndex;
			}
			if (data[evaluateIndex] > lookingFor) {
				return binarySearch(lookingFor, start, evaluateIndex, data);
			} else {
				return binarySearch(lookingFor, evaluateIndex, end, data);
			}
		}
	
	
	
	
	
	
	
		
	static void binarySearchExample() {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,11};
		int lookingFor = 5;
		
		for (int number:numbers) {
			if (number == lookingFor) {
				System.out.println("Found " + number);
			}
		}
		int index = binarySearch(lookingFor , 0, numbers.length, numbers);
		System.out.println("Found anser at index: " + index);
	}
	
	static int binarySearch(int lookingFor, int start, int end, int[]data) {
		int evaluateIndex = (end + start) / 2;
		if (data[evaluateIndex] == lookingFor) {
			System.out.println("Found " + lookingFor + " at index " + start);
			return evaluateIndex;
		}
		if (data[evaluateIndex] > lookingFor) {
			return binarySearch(lookingFor, start, evaluateIndex, data);
		} else {
			return binarySearch(lookingFor, evaluateIndex, end, data);
		}
	}
		
		
	
	
	
	
		
	
	static void linearSearchExample() {	
		int[] numbers = {1,2,3,5,6,7};
		int lookingFor = 5;
		for (int number: numbers) {
			if(number == lookingFor) {
				System.out.print("Found " + number);
			}
		}
		
	}
		
		
	
	
	
		

	static void carwashQueueExample() {
		
	final Queue<String> lineAtCarwash = new ArrayBlockingQueue<String>(200);
		
		new Thread(() -> {
			while(true) {
				System.out.println("Line is: " + lineAtCarwash.size() + " long" );
				if (lineAtCarwash.size() > 20) {
					System.out.println("Hurry up");
				}
				try {
					Thread.sleep(300l);
				} catch (InterruptedException e) { }
			}
		}).start();
	
		new Thread(() -> {
				while(true) {
				lineAtCarwash.add("Dodge Ram");
				lineAtCarwash.add("Nissan Rogue");
				lineAtCarwash.add("Charger");
				lineAtCarwash.add("Chevy Camero");
				lineAtCarwash.add("Honda Civic");
				lineAtCarwash.add("Buggy");
				lineAtCarwash.add("Jeep");
				try {
					Thread.sleep(3000l);
				} catch (InterruptedException e) {
				}
				}
		}).start();
		
		new Thread(() -> {
			while (true) {
				if (Math.random() > 0.5) {
					System.out.println("Tom is washing: " + lineAtCarwash.poll());
				} else {
					System.out.println("Suzy is washing: " + lineAtCarwash.poll());
					System.out.println("Sally is washing: " + lineAtCarwash.poll());
					System.out.println("Barry is washing: " + lineAtCarwash.poll());
				}
				try {
					Thread.sleep(1000l);
				} catch (InterruptedException e) { }
			}
		}).start();

	}
		
		
	
	
		
		
		
	static void stackStringExample() {	
		
		String [] words = {
			"banana",
			"dog",
			"fish",
			"tiger",
			"lion",
			"liger",
			"giraffe",
			"elephant"
		};
		Stack<String> stack = new Stack<>();

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (!stack.empty()) {
				String previous = stack.peek();
				if (previous.length() < word.length()) {
					stack.push(word);
				} else {
					printItemsInStack(stack);
					stack.removeAllElements();
					stack.push(word);
				}
			} else {
				stack.push(word);
			}
		}
		printItemsInStack(stack);
		
		}
	
	
	private static void printItemsInStack(Stack<String>stack) {
		System.out.println("=========");
		for (Object entry: stack.toArray()) {
			System.out.println(entry);
	}
	}

	
	
	
	
	
	
	
	static void stackClothesExample() {
	Stack<String> favoriteClothes = new Stack<>();
	favoriteClothes.push("jeans");
	favoriteClothes.push("hoodie");
	favoriteClothes.push("cap");
	favoriteClothes.push("cap");
	favoriteClothes.push("cap");
	favoriteClothes.push("cap");
	
	while(!favoriteClothes.empty()) {
		System.out.println(favoriteClothes.pop());
	}
	}
	
	static void doublyLinkedList() {
		
		OurDoublyLinkedList<String> ourNames = new OurDoublyLinkedList<>();
		ourNames.add("Maheen");
		ourNames.add("Ashna");
		ourNames.add("Shafa");
		ourNames.add("Sara");
		ourNames.add("Komal");
		ourNames.printAllValues();
	}
		
		
		
		static void circularLinkedList() {
		OurCircularLinkedList<String> playList = new OurCircularLinkedList<>();
		playList.add("No Air");
		playList.add("Need You Now");
		playList.add("Cyclone");
		playList.add("Low");
		playList.add("Diamonds");
		playList.add("Bad Romance");
		playList.add("Super Human");
		playList.add("Man Down");
		playList.add("Train Wreck");
		playList.printSomeEntries();


	}
		
		
		
		static void singlyLinkedListExample() {
		OurSinglyLinkedList<String> ourNames = new OurSinglyLinkedList<>();
		ourNames.add("Maheen");
		ourNames.add("Ashna");
		ourNames.add("Shafa");
		ourNames.add("Sara");
		ourNames.add("Komal");
		ourNames.printAllValues();
		
	}
		
		
		
		
	static void matrixExample() {
		RangeAndMatrix.rangeMatrix();
	}
		
		
		
		
	static void meanAndMedianExample() {
			
		OrderStatistics.meanMedianAge();
	}
 
		
		
		
		
		
	static void dunderMifflin() {
	
		PaperCompany theOffice = new PaperCompany();
		theOffice.receiveShipment();
		theOffice.receiveOrders();
		theOffice.processOrders();
		theOffice.printSummary();

	
	}
		
		
		
		
	static void videoGameExample() {
		
		HalfLife halfLife = new HalfLife();
		
		halfLife.showNumberOfWeapons();
		
		SuperMario superMario = new SuperMario();
		
	}
		
	static void hasAIsAAssociationExample() {
		Rufus rufus = new Rufus();
		System.out.println("alive: " + rufus.isAlive());
		System.out.println("name: " + rufus.myName());
		rufus.bark();
		
		Brudus brudus = new Brudus();
		System.out.println("alive: " + brudus.getAnimal().isAlive());
		System.out.println("name: " + brudus.myName());
		brudus.getCat().meow();
	}
	
		
		
	static void abstractExample() {
		List<AbstractCereal> cereals = new ArrayList<AbstractCereal>();
		cereals.add(new SoggyFruitLoopsCereal());
		cereals.add(new CocoPuffsCereal());
		for (int i = 0; i < cereals.size(); i++) {
			cereals.get(i).willIEatIt();
		}
	}
	
	
	
	static void dunderMifflinExample() { 
		
		PaperCompany theOffice = new PaperCompany();
		theOffice.receiveShipment();
		theOffice.receiveOrders();
		theOffice.processOrders();
		theOffice.printSummary();

	}
		
		
		
		
		
		
		
		
	
	
	static void tryCatchExample() {
		String input = "12";
		
		try {
			Integer number = Integer.valueOf(input);
			System.out.println("Our number is:" + number);
		} catch (Exception e) {
			System.out.println("Oops there was an issue");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Done trying to convert " + input);
		}
	}
	
	
	
	
	
	
	
	static void regexEmailExample() {
		String message = "Hello santa.2007@northpole.io Merry Christmas";
				
		Pattern emailPattern = Pattern.compile("[a-z0-9\\.]+@[a-z0-9]+\\.[a-z]{2,5}");
		//("[\\s]+([^\\s]{2,253}\\.[a-z]{2,55}))"); also works, google email regex, theres a code that works 99% of the time//
		Matcher emailMatcher = emailPattern.matcher(message);
		
		if (emailMatcher.find()) {
			System.out.println("Match");
			System.out.println(emailMatcher.group());
			
		} else { 
			System.out.println("No Match");
		}
		
		
	}
	
	
	
	static void regexExample () {
		String message = "Hello, how are you? Call me at 123-123-1234 please";
		// [0-9]{how many characters(spaces count as a character)}//
		Pattern phoneMatch = Pattern.compile("[0-9]{3}-[0-9]{3}-[0-9]{4}");
		Matcher phoneMatcher = phoneMatch.matcher(message);
		if (phoneMatcher.find()) {
			System.out.println(phoneMatcher.group());
		}
	}
	
	
	
	
	
	
		
	static void nestedArrayExample () {
		
		int[][] ourAgesYesterdayAndToday = new int[1][2];
		ourAgesYesterdayAndToday[0][0] = 26;
		ourAgesYesterdayAndToday[0][1] = 27;
		
		for (int i = 0; i < ourAgesYesterdayAndToday.length; i++) {
			System.out.println("One of us is " + ourAgesYesterdayAndToday[i][0] + " today");
			System.out.println("But they will be " + ourAgesYesterdayAndToday[i][1] + " next year");
		}
	}
	
	
		
	static void ageArrayExample () {
		
		int[] ourAges = new int[3];
		ourAges[0] = 37;
		ourAges[1] = 33;
		ourAges[2] = 24;
		
		for (int i = 0; i < ourAges.length; i++) {
			System.out.println("One of us is " + ourAges[i]);
		}
	}
		
	
	
	
	
	
	
	
	static void stringBuilderBufferExample() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder
				.append("hello ")
				.append("how ")
				.append("are ")
				.append("you");
		
		System.out.println(stringBuilder.toString());
				
	}
	
	
	
	
	
	
	
 static void innerClassExample() {
	 
	private static String getSecretWord() {
		return " do not tell anybody I like red hot chilli peppers";
				}
		

		
		final boolean isDinner = true;
		
		abstract class Food {
			abstract String getName();
			abstract boolean isGood();
			boolean isDinner() {
				return isDinner;
			}
			
			void printDetails() {
				System.out.println(getName());
				System.out.println(isGood());
				System.out.println(getName() + " " + isDinner());
			}
		}
		
		Food wasabi = new Food() {
			
			String getName() {
				return "wasabi";
			}
			
			boolean isGood() {
				return false;
			};
		};
		Food dosa = new Food() {
			String getName() {
				return "dosa";
			}
			boolean isGood() {
				return true;
		
			};
		};
			
		wasabi.printDetails();
		dosa.printDetails();
		
	
	class Utils {
		
		String combineWords(String word1, String word2) {
			return word1.concat(" "). concat(word2).concat(getSecretWord());
		}
	}
	}		
		
 
 
 
		
		static void findInMapExample() {
		
		Map<String, Car> cars = new HashMap<String, Car>();
		cars.put("123", new Tesla("123"));
		cars.put("456", new Toyota("456"));
		
		String needToFind = "123";
		
		
		Car ourCar = cars.get(needToFind); 
		System.out.println(ourCar.getVin());
		
		
		
		
		//if you are planning on adding cars frequently, use a linkedlist\\
		
		
	}
		
	static void linkedlistExample() {
		List<Car> cars = new LinkedList<Car>();
		cars.add(new Tesla("123"));
		cars.add(new Toyota("456"));
		
		
		
		//if you are planning on adding cars frequently, use a linkedlist\\
		
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i).isElectric());
		}
	}
		
	
	static void stackExample() {
		Stack<Car> carsInGarage = new Stack<Car>();
		carsInGarage.add(new Toyota("456"));
		carsInGarage.add(new Toyota("789"));
		carsInGarage.add(new Toyota("012"));
		carsInGarage.add(new Tesla("123"));
		
		Car easyToTakeFromGarage = carsInGarage.pop();
		
		System.out.println("The easiest to take out of the garage electric: " + easyToTakeFromGarage);
	
	}		

		static void mapExample() {
		// create naming conventions to quickly find objects//
		// key --> point to --> hashcode --> memory (not relavent how many keys)//
		Map<String, Car> carsByNickname = new HashMap<String, Car>();
		
		carsByNickname.put("tez", new Tesla());
		carsByNickname.put("goat", new Toyota());
		
		Set<String> nicknames = carsByNickname.keySet();
		for (int i = 0; i < nicknames.toArray().length; i++) {
			System.out.println(nicknames.toArray()[i]);
		}
		
		
	}
	
	static void collectionExamples() {
		// Queue of cars at carwash//
	
		Queue<Car> carsQueueAtCarwash = new LinkedList<Car>();
		carsQueueAtCarwash.add(new Toyota(234));
		carsQueueAtCarwash.add(new Toyota(345));
		carsQueueAtCarwash.add(new Toyota(567));
		carsQueueAtCarwash.add(new Tesla(678));
		
		Car nextInLine = carsQueueAtCarwash.remove();
		
		System.out.println("is next in line at carwash electric: " + nextInLine.isElectric());
		
	
		
		
		
// Array is more awkward and fixed in size//   
		Car[] carsArray= new Car[10];
		
		carsArray[0] = new Tesla(422);
		carsArray[1] = new Toyota(556);
		for (int i = 0; i < carsArray.length; i++) {
			if (carsArray[i] != null) {
				System.out.println(carsArray[i].isElectric());
			} else {
				System.out.println("No car at entry" + i);
			}
			
		}
		
		
// List reads more natural and easier//
		List <Car> carsList = new ArrayList<Car>();
		carsList.add(new Tesla(543));
		carsList.add(new Toyota(267));
		
		for (int i = 0; i < carsList.size(); i++) {
			System.out.println(carsList.get(i).isElectric());
			
		}
 
    }
	
	static void kiwiExample() {
    	
    	Kiwi kiwi = new Kiwi();
    	kiwi.printGood();
    	
		Kiwi veryGoodKiwi = new Kiwi(true);
		veryGoodKiwi.printGood("Super good");
	}
}
