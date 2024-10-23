import decorator.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*

        System.out.println("System started");
        Thread.sleep(1000);

        WeatherStation station = new WeatherStation();
        System.out.println("task1.WeatherStation object is created");
        Thread.sleep(1000);

        PhoneDisplay phone = new PhoneDisplay();
        System.out.println("task1.WeatherObserver ( Phone )  object is created");
        Thread.sleep(1000);

        WindowsDisplay windows = new WindowsDisplay();
        System.out.println("task1.WeatherObserver ( Windows )  object is created");
        Thread.sleep(1000);

        station.addObserver(windows);
        station.addObserver(phone);
        System.out.println("Observers are registered the list");
        Thread.sleep(1000);




        Thread dataProviderThread = new Thread(() -> {
            while (true) {
                try {
                    Double randomDouble = Math.random() * 10;
                    Thread.sleep(1000);
                    station.setTemperature(randomDouble);
                    System.out.println(randomDouble);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


            }


        }
        );

        Thread presentedThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    windows.display(new TemperatureStrategy() {
                        @Override
                        public Double getTemperature(Double value) {
                            return value+1000;
                        }
                    });

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


            }


        }
        );


        dataProviderThread.start();
        presentedThread.start();


         */


        /////////////////////////////////////////////////////////////////////////////

        //ComputerContract basicComputer = new ComputerConcrete();
        //ComputerDecorator decorator = new ComputerDecorator(basicComputer);
        //System.out.println(decorator.getDescription());
        //ComputerContract graphicCardComputer = new ComputerWithGraphicalCard(basicComputer);
        //System.out.println(graphicCardComputer.getDescription());

        ComputerContract computer = new ComputerConcrete();
        ComputerContract computerWithRam = new ComputerWithExtraRam(computer,16);
        System.out.println(computerWithRam.getDescription());

        ComputerContract computerMix = new ComputerWithGraphicalCard(computerWithRam);
        System.out.println(computerMix.getDescription());

        ComputerContract computerMix2 = new ComputerWithExtraLargeScreen(computerMix,17.5);
        System.out.println(computerMix2.getDescription());



        


    }
}