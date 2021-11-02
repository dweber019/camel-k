package ch.w3tec;

import org.apache.camel.main.Main;

public class MainApp {

    public static void main(String... args) throws Exception {
        Main main = new Main();
        main.configure().addRoutesBuilder(new CamelRoute());
        main.run(args);
    }

}

