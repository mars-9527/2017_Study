package wish.designmodel._04factorymethod;

class UndergraduateFactory implements Factory {

	@Override
	public LeiFeng CreateLeiFeng() {
		return new Undergraduate();
	}

}
