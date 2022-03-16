package br.com.dakar.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Corrida {
    double distance;
    double prize;
    String name;
    int allowedVehicles;
    List<Veiculo> veiculoList = new ArrayList<>();
    SalvaVidasAuto rescuerCarro;
    SalvaVidasMoto rescuerMoto;

    public void addCarro(double speed, double acceleration, double turningAngle, String licensePlate) {
        if (veiculoList.size() <= allowedVehicles) {
            veiculoList.add(new Carros(speed, acceleration, turningAngle, licensePlate));
        }
    }

    public void addMoto(double speed, double acceleration, double turningAngle, String licensePlate) {
        if (veiculoList.size() <= allowedVehicles) {
            veiculoList.add(new Motocicetas(speed, acceleration, turningAngle, licensePlate));
        }
    }

    public void deleteVeiculo(Veiculo veiculo) {
        veiculoList.remove(veiculo);
    }

    public void deleteVeiculoComPlaca(String placa) {
        for (Veiculo veiculo: veiculoList) {
            if (veiculo.getLicensePlate().equals(placa)) {
                veiculoList.remove(veiculo);
            }
        }
    }

    public Optional<Veiculo> getWinner() {
        return veiculoList.stream()
                .max(Comparator.comparing(vehicle -> vehicle.getSpeed()*0.5*vehicle.getAcceleration()/
                        (vehicle.getTurningAngle()*(vehicle.getWeight() - (vehicle.getWhells()*100) ))));
    }
}
