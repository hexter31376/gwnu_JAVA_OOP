class Temperature extends Meaure{
	double[] T_data;	

	public Temperature(double temp1, double temp2, double temp3){
		T_data = new double[3];
		T_data[0] = temp1;
		T_data[1] = temp2;
		T_data[2] = temp3;
	}	

	public double max(){
		double mx = T_data[0];
		for(int i=1;i<3;i++){
			if(mx<T_data[i]) mx = T_data[i];
		}
		return (mx);
	}
	public double min(){
		double mn = T_data[0];
		for(int i=1;i<3;i++){
			if(mn>T_data[i]) mn = T_data[i];
		}
		return (mn);
	}
	public double avg(){
		double total=0;
		for(int i=0;i<3;i++){
			total += T_data[i];
		}
		return (total/3);
	}
}