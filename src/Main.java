import factory.abstractfactory.Application;
import factory.abstractfactory.GUIFactory;
import factory.abstractfactory.MacGUIFactory;
import factory.abstractfactory.WindowsGUIFactory;
import factory.abstractmethod.PhoneSeller;
import factory.abstractmethod.PhoneSellerContract;
import factory.abstractmethod.phone.PhoneContract;
import factory.abstractmethod.phone.PhoneType;
import factory.simplefactory.computer.ComputerContract;
import factory.simplefactory.ComputerSeller;
import factory.simplefactory.ComputerSellerContract;
import factory.simplefactory.computer.ComputerType;

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


        //////////////////////////////////decorator///////////////////////////////////////////
        /*

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

         */


        //////////////////////////////simple factory///////////////////////////////////////////////
        /*

        ComputerSellerContract computerSellerContract = new ComputerSeller();
        ComputerContract computer = computerSellerContract.sellComputer(ComputerType.GAME_COMPUTER);
        System.out.println(computer.getDescription());

         */

        /////////////////////////////////factory method////////////////////////////////////////////
        /*
        PhoneSellerContract seller = new PhoneSeller();
        PhoneContract phone = seller.buyPhone(PhoneType.LENOVO);
        System.out.println(phone.getDescription());
       ////////////////////////////////////////////////////////////////////////////////////////////
         */

        GUIFactory windowsGUIFactory = new WindowsGUIFactory();
        GUIFactory macGUIFactory = new MacGUIFactory();
        Application windowsApplication = new Application(windowsGUIFactory);
        Application macApplication = new Application(macGUIFactory);

        macApplication.render();









    }
}