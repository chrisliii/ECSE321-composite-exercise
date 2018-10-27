package org.mcgill.ecse321.designpatterns.composite;

public class HiddenFile implements Component {
	private String name;
	
	public HiddenFile(String name) {
		this.name = name;
	}
	
	@Override
	public String ls() {
		return null;
	}
}