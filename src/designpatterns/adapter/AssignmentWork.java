package designpatterns.adapter;

public class AssignmentWork {
    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    private Pen pen;
    public  void writeAssignment(String str){
        pen.write(str);
    }
}
