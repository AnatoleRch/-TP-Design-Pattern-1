package mediatheque;

public class PrintBooksOnlyVisitor implements ItemVisitor{
    public void visit(Book i){
        i.print();
    }
    public void visit(CD i){
    }
}


