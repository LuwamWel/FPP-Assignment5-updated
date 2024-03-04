import java.util.Objects;

public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed){
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize(){
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    // return ramSize multiplied by processorSpeed
    public double computePower() {
        return getRamSize() * getProcessorSpeed();
    }

    @Override
    public String toString() {
        return "Computer{" +
                " manufacturer='" + manufacturer + '\'' +
                ", processor='" + processor + '\'' +
                ", ramSize=" + ramSize +
                ", processorSpeed=" + processorSpeed +
                '}';
    }

    //@Override
    public boolean equals(Object obj) {
        if(this == obj) {return true;}

        if(obj == null || getClass() != obj.getClass()) { return false; }

        Computer computer = (Computer) obj;
        if(manufacturer.equals(computer.manufacturer) &&
                (processor.equals(computer.processor)) &&
                (ramSize == computer.getRamSize()) &&
                (processorSpeed == computer.getProcessorSpeed())
        ){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(manufacturer,processor,ramSize,processorSpeed);
    }


}
