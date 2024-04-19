class Humidity extends Meaure{
	double[] H_data;

	public Humidity(double hum1,double hum2,double hum3){
		H_data = new double[3];
		H_data[0] = hum1;
		H_data[1] = hum2;
		H_data[2] = hum3;
	}
	public double max(){
		double mx = H_data[0];
		for(int i=1;i<3;i++){
			if(mx<H_data[i]) mx = H_data[i];
		}
		return (mx);
	}
	public double min(){
		double mn = H_data[0];
		for(int i=1;i<3;i++){
			if(mn>H_data[i]) mn = H_data[i];
		}
		return (mn);
	}
	public double avg(){
		double total=0;
		for(int i=0;i<3;i++){
			total += H_data[i];
		}
		return (total/3);
	}
}