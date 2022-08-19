package Day3.Task5;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class VwGolf extends Car{
    private String model;

    public VwGolf() {
        super(CarBrand.VW, 4, TransmissionType.AUTO, EngineType.DIESEL);
        this.model = "GOLF";
    }

    @Override
    public void drive() {
        System.out.println("Vw Golf is moving");
    }
}
