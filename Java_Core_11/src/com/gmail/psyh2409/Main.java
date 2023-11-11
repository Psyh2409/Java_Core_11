package com.gmail.psyh2409;

import java.util.Arrays;
import java.util.Collections;

import com.gmail.psyh2409.Car.Car;

public class Main {

	public static void main(String[] args) {
		Integer[] integers = new Integer[(int) (Math.random()*20)];
		for (int i = 0; i < integers.length; i++) {
            integers[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(integers));
		Arrays.sort(integers);
		Collections.reverse(Arrays.asList(integers));
		System.out.println(Arrays.toString(integers));
		Collections.reverse(Arrays.asList(integers));
		System.out.println(Arrays.toString(integers));
		
		Car[][] cars = new Car[(int)(Math.random()*10)][(int)(Math.random()*20)];
		fillInTwoDimsDiffCars(cars);
		System.out.println(Arrays.deepToString(cars));
		fillInTwoDimsSameCar(cars, new Car());
		System.out.println(Arrays.deepToString(cars));
	}

	public static void fillInTwoDimsSameCar(Car[][] cars, Car car) {
		for (int i = 0; i < cars.length; i++) {
			Arrays.fill(cars[i], car);
		}
	}

	public static void fillInTwoDimsDiffCars(Car[][] cars) {
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars[i].length; j++) {
				cars[i][j] = new Car();
			}
		}
	}

}
/*Output:
[63, 78, 99, 76, 37, 28, 31, 44, 20, 46, 31]
[99, 78, 76, 63, 46, 44, 37, 31, 31, 28, 20]
[20, 28, 31, 31, 37, 44, 46, 63, 76, 78, 99]
[[Car [horsepower=15.303892673504627, year=1944, rule=Rule [diameter=17.90202355397063, material=leather], engine=Engine [cylinders=4]], Car [horsepower=17.548135500093174, year=1900, rule=Rule [diameter=3.3327683837576894, matherial=leather], engine=Engine [cylinders=5]], Car [horsepower=82.609819826685, year=1984, rule=Rule [diameter=26.454115516655413, matherial=leather], engine=Engine [cylinders=0]], Car [horsepower=1.7367198955177354, year=1980, rule=Rule [diameter=13.767366730174535, matherial=leather], engine=Engine [cylinders=4]], Car [horsepower=140.35504069462434, year=1922, rule=Rule [diameter=17.616160684505083, matherial=leather], engine=Engine [cylinders=9]], Car [horsepower=120.39004541500265, year=1921, rule=Rule [diameter=26.763566672612875, matherial=leather], engine=Engine [cylinders=7]]], [Car [horsepower=159.09936019335782, year=2001, rule=Rule [diameter=1.5107056607776725, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=25.899606234163606, year=2021, rule=Rule [diameter=22.384286828392497, matherial=leather], engine=Engine [cylinders=8]], Car [horsepower=56.98744464437031, year=1990, rule=Rule [diameter=11.781816090305385, matherial=leather], engine=Engine [cylinders=8]], Car [horsepower=2.1262972292457993, year=1954, rule=Rule [diameter=47.38701281395264, matherial=leather], engine=Engine [cylinders=8]], Car [horsepower=68.79047247106453, year=1987, rule=Rule [diameter=34.65434317611544, matherial=leather], engine=Engine [cylinders=4]], Car [horsepower=175.92860773907083, year=1953, rule=Rule [diameter=43.21037570226549, matherial=leather], engine=Engine [cylinders=5]]], [Car [horsepower=132.92871627672767, year=1927, rule=Rule [diameter=38.63100942973062, matherial=leather], engine=Engine [cylinders=0]], Car [horsepower=18.937429479586008, year=1964, rule=Rule [diameter=6.727449288965792, matherial=leather], engine=Engine [cylinders=4]], Car [horsepower=53.50634082113936, year=1976, rule=Rule [diameter=22.210123096336925, matherial=leather], engine=Engine [cylinders=0]], Car [horsepower=121.60864876174617, year=1927, rule=Rule [diameter=7.39858352462599, matherial=leather], engine=Engine [cylinders=0]], Car [horsepower=44.38964851384193, year=2009, rule=Rule [diameter=9.506733117444476, matherial=leather], engine=Engine [cylinders=3]], Car [horsepower=71.58487272245138, year=1919, rule=Rule [diameter=46.956586441464204, matherial=leather], engine=Engine [cylinders=1]]], [Car [horsepower=112.3600673720284, year=1926, rule=Rule [diameter=36.16004487557088, matherial=leather], engine=Engine [cylinders=2]], Car [horsepower=118.3974522686907, year=1924, rule=Rule [diameter=10.25706932421121, matherial=leather], engine=Engine [cylinders=8]], Car [horsepower=186.3730400453793, year=1944, rule=Rule [diameter=30.409891074708828, matherial=leather], engine=Engine [cylinders=6]], Car [horsepower=156.54009631031877, year=2015, rule=Rule [diameter=18.426764100662517, matherial=leather], engine=Engine [cylinders=8]], Car [horsepower=149.9541639901003, year=1938, rule=Rule [diameter=6.725100725378081, matherial=leather], engine=Engine [cylinders=5]], Car [horsepower=8.945327898466315, year=1902, rule=Rule [diameter=7.9426250939384495, matherial=leather], engine=Engine [cylinders=0]]], [Car [horsepower=183.76377864739467, year=2020, rule=Rule [diameter=1.866542334100929, matherial=leather], engine=Engine [cylinders=3]], Car [horsepower=42.895006809553784, year=1915, rule=Rule [diameter=21.77453044497184, matherial=leather], engine=Engine [cylinders=3]], Car [horsepower=75.36124689061012, year=1996, rule=Rule [diameter=45.76768538368848, matherial=leather], engine=Engine [cylinders=4]], Car [horsepower=0.39619452388326426, year=1991, rule=Rule [diameter=11.2244009351817, matherial=leather], engine=Engine [cylinders=1]], Car [horsepower=3.200202592216672, year=1951, rule=Rule [diameter=22.11546849763496, matherial=leather], engine=Engine [cylinders=4]], Car [horsepower=175.05359656959078, year=1900, rule=Rule [diameter=9.594528048523621, matherial=leather], engine=Engine [cylinders=3]]]]
[[Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, material=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]]], [Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]]], [Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]]], [Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]]], [Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]], Car [horsepower=151.8860071045061, year=1916, rule=Rule [diameter=36.0143090617814, matherial=leather], engine=Engine [cylinders=7]]]]


 */