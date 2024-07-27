package designpatterns.adapter;

public class School {
    public static void main(String[] args) {
        AssignmentWork aw = new AssignmentWork();
        Pen pilotPen = new PenAdapter();
        aw.setPen(pilotPen);
        aw.writeAssignment("I'm abit tired ti write an assignment");

    }
}
