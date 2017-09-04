package wish.designmodel._04factorymethod;

class VolunteerFactory implements Factory {

	@Override
	public LeiFeng CreateLeiFeng() {
		return new Volunteer();
	}

}
