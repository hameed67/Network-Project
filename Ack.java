/**
 * Created by hameedhakimi on 3/22/17.
 */
import java.io.Serializable;


public class Ack implements Serializable {
    private int packetNumber;

    public Ack(int packetNumber){
        this.packetNumber = packetNumber;
    }

    public void setPackerNumber(int packetNumber){
        this.packetNumber = packetNumber;
    }

    public int getPacketNumber(){
        return this.packetNumber;
    }

    @Override
    public String toString() {
        return "Packet number: " + this.getPacketNumber();
    }
}
