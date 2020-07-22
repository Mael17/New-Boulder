package model.element;

public enum ElementTypes {
	Rockford("Actor",'R'),
	RockfordLeft("Actor",'d'),
	RockfordRight("Actor",'b'),
	RockfordUp("Actor",'u'),
	RockfordDown("Actor",'n'),
	Firefly("Actor",'F'),
	Butterfly("Actor",'B'),
	Dirt("Cell",'D'),
	Titanium("Cell",'T'),
	Wall("Cell",'W'),
	WallMagic("Cell",'w'),
	ExitClosed("Cell",'E'),
	ExitOpen("Cell",'e'),
	Rock("Item",'O'),
	Diamond("Item",'X'),
	Amoeba("Item",'A'),
	Empty("Cell",'_');

	private ElementTypes(String kind, char letter)
	{
		this.kind = kind;
		this.letter = letter;
	}

	private char letter;
	private String kind;

	public char getLetter()
	{
		return letter;
	}
	
	public String getKind()
	{
		return kind;
	}
}
