package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private double temperature;

    List<TemperatureObserver> listaTemperatureObserver = new ArrayList<>();

    void subscribe(TemperatureObserver o) {
        listaTemperatureObserver.add(o);
    };

    void unsubscribe(TemperatureObserver o) {
        listaTemperatureObserver.remove(o);
    }

    void setTemperature(double temp) {
        this.temperature = temp;
        notifyObservers();
    }

    private void notifyObservers() {
        for (TemperatureObserver o : listaTemperatureObserver) {
            o.onTemperatureChanged(temperature);
        }
    }
}
