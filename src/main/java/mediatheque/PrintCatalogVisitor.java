package mediatheque;

public class PrintCatalogVisitor implements ItemVisitor{
    public void visit(Book i){
        i.print();
    }
    public void visit(CD i){
        i.print();
    }
}
