package dol;

import java.sql.Array;

public class Nombre {

	private String Name;
	private Array Names;
	
	public Nombre() {
		super();
	}
	
	public Nombre(String name, Array names) {
		super();
		Name = name;
		Names = names;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Array getNames() {
		return Names;
	}

	public void setNames(Array names) {
		Names = names;
	}
	
	
}
