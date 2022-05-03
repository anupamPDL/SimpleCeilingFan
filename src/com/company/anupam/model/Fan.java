package com.company.anupam.model;

import static com.company.anupam.model.FanDirection.CLOCKWISE;
import static com.company.anupam.model.FanDirection.COUNTERCLOCKWISE;

public class Fan {

        public static final int OFF = 0;
        private int speed = OFF;

        private FanDirection fanDirection = CLOCKWISE;

        public int getFanSpeed() {
            return speed;
        }

        public FanDirection getFanDirection() {
            return fanDirection;
        }

        public void speedUpFan() {
            if (speed == 3) {
                speed = OFF;
            } else {
                speed++;
            }
        }

        public void reverseFanDirection() {
            fanDirection = (fanDirection == CLOCKWISE) ? COUNTERCLOCKWISE : CLOCKWISE;
        }

        @Override
        public String toString() {
            return "Fan{" +
                    "speed=" + speed +
                    ", fanDirection=" + fanDirection +
                    '}';
        }
}
enum FanDirection {
    CLOCKWISE,
    COUNTERCLOCKWISE
}
