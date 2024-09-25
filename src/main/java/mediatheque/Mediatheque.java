package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		PrintCatalogVisitor printCatalog = new PrintCatalogVisitor(); 
		for (Item i : items){
			i.accept(printCatalog);
		}
	}


	public void printOnlyBooks() {
		PrintBooksOnlyVisitor printOnlyBooks = new PrintBooksOnlyVisitor(); 
		for (Item i : items){
			i.accept(printOnlyBooks);
		}
	}

	public void printOnlyCDs() {
		PrintCDsOnlyVisitor printOnlyCDs = new PrintCDsOnlyVisitor(); 
		for (Item i : items){
			i.accept(printOnlyCDs);
		}
	}

}
