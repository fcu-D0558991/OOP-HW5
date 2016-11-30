package fcu.iecs.oop.pokemon;

public class Pokemon {
	private String name;
	private int cp;
	public Pokemon(String initialName,int initialcp)
	{
		name=initialName;
		cp=initialcp;
	}
	public String getName(){
		return (name);
	}
	public int getcp(){
		return cp;
	}
	public void setcp(int newCp){
		cp=newCp;
	}
}
