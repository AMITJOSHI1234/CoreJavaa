package in.co.Interfaces;

public class Person implements SocialWorker,Richman3 {

	@Override
	public void earnmoney() {
		// TODO Auto-generated method stub
		System.out.println("Earn money");
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		System.out.println("Less Party");
	}

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		System.out.println("More donation");
	}

	@Override
	public void HelpToOther() {
		// TODO Auto-generated method stub
		System.out.println("Help others");
	}

}
