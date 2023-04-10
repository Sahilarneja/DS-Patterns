import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class laptop implements Comparator {
		String brand;
		int Ram;
		int price;
		
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public int getRam() {
			return Ram;
		}
		public void setRam(int ram) {
			Ram = ram;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "laptop [brand=" + brand + ", Ram=" + Ram + ", price=" + price + "]";
		}
		public laptop(String brand, int ram, int price) {
			super();
			this.brand = brand;
			this.Ram=ram;
			this.price = price;
		}
		public int compare(laptop lap2) {
			if(this.getPrice()>lap2.getPrice())
				return 1;
			else {
				return -1;
			}
			}
		
		
		public static void main(String args[]) {
			ArrayList<laptop>laps=new ArrayList<laptop>();
			laps.add(new laptop("Apple",16,400));
			laps.add(new laptop("Lenovo", 12,200));
            laps.add(new laptop("Dell",6,100));

            Collections.sort(laps);
            for(laptop l:laps){
                System.out.println(l);
            }
			//laps.foreach(System.out::println);
			}
	}
	

