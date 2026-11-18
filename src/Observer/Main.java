package Observer;

public class Main {
    static void main() {
        WeatherStation weatherStation = new WeatherStation();
        ConsoleDisplay consoleDisplay = new ConsoleDisplay();
        FanController fanController = new FanController();

        weatherStation.subscribe(consoleDisplay);
        weatherStation.subscribe(fanController);

        weatherStation.setTemperature(26);
        weatherStation.setTemperature(30);

        weatherStation.unsubscribe(consoleDisplay);
        weatherStation.setTemperature(27);
    }
}
