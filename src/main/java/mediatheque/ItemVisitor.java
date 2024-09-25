package mediatheque;

public interface ItemVisitor {

    public void visit(Book i);
    public void visit(CD i);

}
