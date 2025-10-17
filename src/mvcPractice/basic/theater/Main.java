package mvcPractice.basic.theater;

import mvcPractice.basic.theater.controller.TheaterController;
import mvcPractice.basic.theater.model.TheaterModel;
import mvcPractice.basic.theater.view.TheaterView;

public class Main {
    public static void main(String[] args) {
        TheaterModel model = new TheaterModel(5, 8);
        TheaterView view = new TheaterView();
        TheaterController controller = new TheaterController(model, view);
        controller.run();
    }
}
