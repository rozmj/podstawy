package _10_swing;

import javax.swing.*;
import java.awt.*;

public class Okno2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setTitle("Nasze drugie Okno");

        JLabel label = new JLabel("Ala ma kota");
        frame.add(label);

        frame.setVisible(true);

    }
}
