package br.com.dakar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Veiculo {
    double speed;
    double acceleration;
    double turningAngle;
    String licensePlate;
    double weight;
    int whells;
}
