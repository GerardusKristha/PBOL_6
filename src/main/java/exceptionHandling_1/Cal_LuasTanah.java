package exceptionHandling_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class Cal_LuasTanah extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_y_ORIGIN = 250;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;
    private static final int LABEL_WIDTH = 150;
    private static final int LEFT_MARGIN = 30;

    private JLabel labelPanjang, labelLebar, labelLuas;
    private JButton buttonHitung;
    private JTextField input_panjang, input_lebar, outputluas;
    private Color color1, color2, color3;

    public static void main(String[] args) {
        Cal_LuasTanah frame = new Cal_LuasTanah();
        frame.setVisible(true);
    }

    public Cal_LuasTanah() {
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Luas Tanah");
        setLocation(FRAME_X_ORIGIN, FRAME_y_ORIGIN);

        color1 = new Color(230, 244, 253);
        color2 = new Color(9, 87, 134);
        contentPane.setBackground(color1);

        labelPanjang = new JLabel("Panjang(m)");
        labelPanjang.setForeground(color2);
        labelPanjang.setBounds(LEFT_MARGIN, 20, LABEL_WIDTH, BUTTON_HEIGHT);
        contentPane.add(labelPanjang);

        input_panjang = new JTextField();
        input_panjang.setForeground(color2);
        input_panjang.setBounds(LEFT_MARGIN + BUTTON_WIDTH, 20, LABEL_WIDTH, BUTTON_HEIGHT);
        contentPane.add(input_panjang);
        input_panjang.addActionListener(this);

        labelLebar = new JLabel("Lebar(m)");
        labelLebar.setForeground(color2);
        labelLebar.setBounds(LEFT_MARGIN, 25 + BUTTON_HEIGHT, LABEL_WIDTH, BUTTON_HEIGHT);
        contentPane.add(labelLebar);

        input_lebar = new JTextField();
        input_lebar.setForeground(color2);
        input_lebar.setBounds(LEFT_MARGIN + BUTTON_WIDTH, 25 + BUTTON_HEIGHT, LABEL_WIDTH, BUTTON_HEIGHT);
        contentPane.add(input_lebar);
        input_lebar.addActionListener(this);

        labelLuas = new JLabel("Luas(m)");
        labelLuas.setForeground(color2);
        labelLuas.setBounds(LEFT_MARGIN, 30 + (2 * BUTTON_HEIGHT), LABEL_WIDTH, BUTTON_HEIGHT);
        contentPane.add(labelLuas);

        outputluas = new JTextField();
        outputluas.setBounds(LEFT_MARGIN + BUTTON_WIDTH, 30 + (2 * BUTTON_HEIGHT), LABEL_WIDTH, BUTTON_HEIGHT);
        outputluas.setEditable(false);
        outputluas.setBackground(Color.WHITE);
        outputluas.setForeground(color2);
        contentPane.add(outputluas);

        buttonHitung = new JButton("Hitung ");
        buttonHitung.setBackground(color2);
        buttonHitung.setForeground(color1);
        buttonHitung.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        buttonHitung.setBounds(LEFT_MARGIN + BUTTON_WIDTH, 35 + (3 * BUTTON_HEIGHT), BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(buttonHitung);
        buttonHitung.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Frame frame = (JFrame) rootPane.getParent();
        try {
            int hasilInput = Integer.parseInt(input_panjang.getText()) * Integer.parseInt(input_lebar.getText());
            String hasilJumlah = String.valueOf(hasilInput);
            outputluas.setText(hasilJumlah);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(frame, "Maaf, hanya integer yang di perbolehkan!", "Error", JOptionPane.ERROR_MESSAGE );
        }
    }

}
