package decorator;

public class ComputerWithExtraRam extends ComputerDecorator{
    private int ram = 4;

    public ComputerWithExtraRam(ComputerContract computer,int ram){
        super(computer);
        this.ram = ram;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" with " + ram + " GB ram";
    }


}
