package mvcExample.basic.theater;

import mvcExample.basic.theater.controller.TheaterController;
import mvcExample.basic.theater.model.TheaterModel;
import mvcExample.basic.theater.view.TheaterView;

public class Main {
    public static void main(String[] args) {
        TheaterModel model = new TheaterModel(5, 8);
        TheaterView view = new TheaterView();
        TheaterController controller = new TheaterController(model, view);
        controller.run();
    }
}
