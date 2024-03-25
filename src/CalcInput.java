import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is responsible for creating the UI and event listeners. Creates an Instance of the
 * Calculations Object that is responsible for handling all calculations.
 */
public class CalcInput extends JFrame {
    private JPanel mainFrame;
    private JButton number1;
    private JButton number4;
    private JButton number7;
    private JButton number5;
    private JButton number8;
    private JButton number2;
    private JButton number3;
    private JButton number6;
    private JButton number9;
    private JButton number0;
    private JButton add;
    private JButton subtract;
    private JButton multiply;
    private JButton divide;
    private JTextField numberInput;
    private JButton equal;
    private JButton clear;
    private JButton decimal;
    private final Calculations calculations;

    /**
     * Construction for the UI elements. Creates Calculations instance shared
     * by the event listeners.
     */
    public CalcInput(){
        this.calculations = new Calculations();
        // Makes the main frame responsible for holding content.
        setContentPane(mainFrame);
        // Sets the original size of the UI
        setSize(300, 250);
        // Sets the title for the frame.
        setTitle("Cool Calculator");
        // Sets the behaviour when the frame is closed.
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Makes the frame visible
        setVisible(true);
        //Sets the initial value in the input field to 0
        numberInput.setText("0");

        /*The following event listeners have self-explanatory names.
        and handle the various buttons associated with the names. */
        number1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.setInput("1"));
            }
        });
        number2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.setInput("2"));
            }
        });
        number3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.setInput("3"));
            }
        });
        number4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.setInput("4"));
            }
        });
        number5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.setInput("5"));
            }
        });
        number6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.setInput("6"));
            }
        });
        number7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.setInput("7"));
            }
        });
        number8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.setInput("8"));
            }
        });
        number9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.setInput("9"));
            }
        });
        number0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.setInput("0"));
            }
        });
        decimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.setInput("."));
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.clearTotal());
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.addInput());
            }
        });
        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.subInput());
            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.mulInput());
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.divInput());
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberInput.setText(calculations.equals());
            }
        });

    }
}
