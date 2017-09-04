package wish.designmodel._22interpreter;

/**
 * ÀŸ∂»¿‡
 */
class Speed extends Expression {

	@Override
	public void excute(String key, double value) {
		String speed;
		if(value < 500)
			speed = "slow";
		else if(value >= 1000)
			speed = "quick";
		else
			speed = "normal";
		
		System.out.println(speed + " ");
	}

}
