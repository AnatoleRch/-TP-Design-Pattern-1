package mediatheque;

public class PrintCDsOnlyVisitor implements ItemVisitor{
    public void visit(Book i){
    }
    public void visit(CD i){
        i.print();
    }
}
