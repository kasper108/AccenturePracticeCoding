package Day3.Task5;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public enum Steering {

    RIGHT("Turning right"),
    LEFT("Turning left"),
    CENTER("Straight forward");

    public final String movingDirection;

}
