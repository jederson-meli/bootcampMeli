package br.com.dakar.model;

public class Carros extends Veiculo{

    public Carros(double speed, double acceleration, double turningAngle, String licensePlate) {
        super(speed, acceleration, turningAngle, licensePlate, 1000, 4);
    }
}
