package pl.wlodarczyk.robert;

public class Computer {

    private Processor processor;
    private PowerSuply powerSuply;
    private GraphicCard graphicCard;

    public Computer(String processor, String powerSuply, String graphicCard) {
        this.processor = new Processor(processor);
        this.powerSuply = new PowerSuply(powerSuply);
        this.graphicCard = new GraphicCard(graphicCard);
    }


    public String description() {

        return toString();


    }

    public Processor getProcessor() {
        return processor;
    }

    public PowerSuply getPowerSuply() {
        return powerSuply;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", powerSuply=" + powerSuply +
                ", graphicCard=" + graphicCard +
                '}';
    }
}
