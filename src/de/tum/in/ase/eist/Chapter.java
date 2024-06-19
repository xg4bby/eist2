package de.tum.in.ase.eist;

public class Chapter implements Comparable<Chapter> {

	private final String name;
	private final int pageNumber;

	public Chapter(String chapter, int page) {
		this.name = chapter;
		this.pageNumber = page;
	}

	public String getName() {
		return name;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	@Override
	public String toString() {
		return "Chapter: " + name + ", page: " + pageNumber;
	}

	@Override
	public int compareTo(Chapter o) {
		return this.name.compareTo(o.getName());
	}
}
