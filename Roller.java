import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Roller extends RollDice implements ActionListener{

    int roll = 0;
    int d20 = 20;
    int d10 = 10;
    int d8 = 8;
    int d6 = 6;
    int d4 = 4;
    JLabel label;
    JFrame frame;
    JPanel panel;
    JButton button20;
    JButton button10;
    JButton button8;
    JButton button6;
    JButton button4;
    Random randNum = new Random();


    //d20
    ActionListener list20 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            roll = rollDice(d20);
            button20.setText("Click to roll D20: " +Integer.toString(roll));
        }
    };
   
    //d10
    ActionListener list10 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            roll = rollDice(d10);
            button10.setText("Click to roll D10: " +Integer.toString(roll));
        }
    };    

    //d8
    ActionListener list8 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            roll = rollDice(d8);
            button8.setText("Click to roll D8: " +Integer.toString(roll));
        }
    };

    //d6
    ActionListener list6 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            roll = rollDice(d6);
            button6.setText("Click to roll D6: " +Integer.toString(roll));
        }
    };
    
    //d4
    ActionListener list4 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            roll = rollDice(d4);
            button4.setText("Click to roll D4: " +Integer.toString(roll));
        }
    };
   
    
    public void actionPerformed(ActionEvent e){
    } 

    
    public Roller(){
        frame = new JFrame();
        button20 = new JButton("Click to Roll D20");
        button10 = new JButton("Click to Roll D10");
        button8 = new JButton("Click to Roll D8");
        button6 = new JButton("Click to Roll D6");
        button4 = new JButton("Click to Roll D4");


        button20.addActionListener(list20);
        button10.addActionListener(list10);
        button8.addActionListener(list8);
        button6.addActionListener(list6);
        button4.addActionListener(list4);

        panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 80, 10, 80));
        //panel.setLayout(new GridLayout(0, 1));
        panel.add(button20);
        panel.add(button10);
        panel.add(button8);
        panel.add(button6);
        panel.add(button4);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Dice Roller");
        frame.pack();
        frame.setVisible(true);
    }
    
}