public class Bagi implements Aritmatika {

	public Number hasil;

	@Override
	public <Z> void aritmatika(Z angka1, Z angka2) {

		if (angka1 instanceof Double || angka2 instanceof Double) {
			if ((Double) angka1 < (Double) angka2) {
				this.hasil = (Double) angka1 / (Double) angka2;
			} else {
				if ((Double) angka1 % 1 == 0 && ((Double) angka2 % 1 == 0)) {
					this.hasil = ((Double) angka1) / ((Double) angka2);
					if ((Double) hasil % 1 == 0) {
						this.hasil = ((Double) this.hasil).intValue();
					}

				}else {
					this.hasil = (Double) angka1 / (Double) angka2;
					if (((Double) this.hasil) % 1 == 0) {
						this.hasil = ((Double) this.hasil).intValue();
					}
				}
			}
		}

	}

	public Number getHasil() {
		return hasil;
	}

}
