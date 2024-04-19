import java.io.*;

class H5_Abstract{
	public static void main(String[] args)throws IOException{
		Temperature temp;
		Humidity hum;

		temp = new Temperature(19.1, 20.3, 18.7 );
		hum = new Humidity(90.1, 89.2, 92.3 );

		System.out.println("Temperature Max ="+temp.max());
		System.out.println("Temperature Min ="+temp.min());
		System.out.println("Temperature Avg ="+temp.avg());

		System.out.println("Humidity Max ="+hum.max());
		System.out.println("Humidity Min ="+hum.min());
		System.out.println("Humidity Avg ="+hum.avg());
	}
}