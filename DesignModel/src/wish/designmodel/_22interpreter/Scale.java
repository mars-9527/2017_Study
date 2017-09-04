package wish.designmodel._22interpreter;

/**
 * Òô½×Àà
 */
class Scale extends Expression {

	@Override
	public void excute(String key, double value) {
		String scale = "";

		switch ((int)value) {
		case 1:
			scale = "low";
			break;
		case 2:
			scale = "mid";
			break;
		case 3:
			scale = "high";
			break;
		}

		System.out.println(scale + " ");
	}

}
