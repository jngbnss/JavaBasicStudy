package mvcExample.basic.lottery;

import mvcExample.basic.lottery.model.Model;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        System.out.println(model.getAnswer());
    }
}
