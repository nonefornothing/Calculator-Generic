public class Kali implements Aritmatika {

	public Number hasil;

	@Override
	public <Z> void aritmatika(Z angka1, Z angka2) {

		if (angka1 instanceof Double || angka2 instanceof Double) {
			if ((double) angka1 % 1 == 0 && ((double) angka2 % 1 == 0)) {
				this.hasil = ((Double) angka1).intValue() * ((Double) angka2).intValue();
			} else {
				this.hasil = (Double) angka1 * (Double) angka2;
				if(((Double)this.hasil) % 1 == 0) {
					this.hasil = ((Double) this.hasil).intValue();
				}
			}
		}
		
	}
	
	public Number getHasil() {
		return hasil;
	}
	
}
