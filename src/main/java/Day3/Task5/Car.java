package Day3.Task5;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Car extends Vehicle implements CarActions{

    private CarBrand brand;
    private int wheelsCount;
    private TransmissionType transmissionType;
    private EngineType engineType;

    public Car(CarBrand brand, int wheelsCount, TransmissionType transmissionType, EngineType engineType) {
        super(VehicleType.LAND);
        this.brand = brand;
        this.wheelsCount = wheelsCount;
        this.transmissionType = transmissionType;
        this.engineType = engineType;
    }

    @Override
    public void steering() {
        System.out.println("Steering is used");
    }

    @Override
    public void changeGear() {
        System.out.println("Gear changed");
    }

    @Override
    public void drive() {
        System.out.println("Car is moving");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", wheelsCount=" + wheelsCount +
                ", transmissionType=" + transmissionType +
                ", engineType=" + engineType +
                '}';
    }
}
