import java.io.*;

public class Bus {
    private int busNo;
    private boolean ac;
    private int cpacity;

    Bus(int no, boolean ac, int cap) {
        this.busNo = no;
        this.ac = ac;
        this.cpacity = cap;
    }

    public int getcpacity() {
        return cpacity;
    }

    public void setcpacity(int cpacity) {
        this.cpacity = cpacity;
    }

    public int getBusnumber() {
        return busNo;
    }

    public void setBusnumber(int busNo) {
        this.busNo = busNo;
    }

    public void display() {
        System.out.println("Buseno " + busNo + "buscapacity " + cpacity + "bustype " + ac);
    }

}
