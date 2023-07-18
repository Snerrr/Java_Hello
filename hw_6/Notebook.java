package hw_6;

public class Notebook {
  String model;
     double screen;
     double weight;
     int quantityCores;
     int RAM;
     int capacityHardDrive;
     String colour;

    public Notebook(String model, double screen, double weight, int quantityCores, int RAM, int capacityHardDrive, String colour) {
        this.model = model;
        this.screen = screen;
        this.weight = weight;
        this.quantityCores = quantityCores;
        this.RAM = RAM;
        this.capacityHardDrive = capacityHardDrive;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "model:" + model  +
                "  screen:" + screen +
                "  weight:" + weight +
                "  quantityCores:" + quantityCores +
                "  RAM:" + RAM +
                "  capacityHardDrive:" + capacityHardDrive +
                "  colour:" + colour;
    }
}
