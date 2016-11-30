package fcu.iecs.oop.pokemon;
public class GYM {
	public static void fight(Pokemon p1,Pokemon p2)
	{
		int cp11;
		double num=Math.random();
		if (num<=0.5)
		{
			System.out.println("Winner is"+" "+p1.getName());
			cp11=p1.getcp()+500;
			p1.setcp(cp11);
		}
		else
		{
			System.out.println("Winner is"+" "+p2.getName());
			cp11=p2.getcp()+500;
			p2.setcp(cp11);
		}
	}
}
