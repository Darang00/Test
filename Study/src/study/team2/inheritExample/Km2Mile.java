package study.team2.inheritExample;

public class Km2Mile extends Converter{
	
	//Constructor
	public Km2Mile(double ratio){
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "Km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}
		public static void main(String[] args) {
			Km2Mile toMile = new Km2Mile(1.6);
			toMile.run();
			

		}

	}


