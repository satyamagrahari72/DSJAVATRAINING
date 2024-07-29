package OOPS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIJavaprogramSwing {
    public static void main(String[] args) {
        //to create a frame using swing in java
        JFrame frame = new JFrame("BMI Calculator");

        //create UI components for BMI calculator
         JLabel heightLabel = new JLabel("Enter your Height:");
         JLabel weightLabel = new JLabel("Enter your Weight:");
         JLabel bmiLabel = new JLabel();

         JTextField weightField = new JTextField();
         JTextField heightField = new JTextField();

         JButton bmiButton = new JButton("Calculator BMI");
         //to set the size and position of ui components
        heightLabel.setBounds(50,50,120,20);
        heightField.setBounds(150,50,50,20);
        weightLabel.setBounds(30,80,120,20);
        weightField.setBounds(150,80,50,20);
        bmiButton.setBounds(30,130,120,40);
        bmiLabel.setBounds(170,130,100,40);


        //to attach the label to frame
        frame.add(heightLabel);
        frame.add(heightField);
        frame.add(weightLabel);
        frame.add(weightField);
        frame.add(bmiButton);
        frame.add(bmiLabel);

        //to build the default layout
        frame.setLayout(null);
        //to set the size for frame
        frame.setSize(300,250);
        //to visible the frame on screen
        frame.setVisible(true);

        //to click on the bmi calculator button
        bmiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //to apply the bmi formula
                float weight= Float.parseFloat(weightField.getText().toString());
                float height = Float.parseFloat(heightField.getText().toString());

                float output = weight/(height*height);

                if(output<18.5)
                {
                    bmiLabel.setText("Im under weight");
                } else if(output>18.5 && output< 24.5){
                    bmiLabel.setText("Im normal");
                } else if(output> 24.9 && output< 29.9){
                    bmiLabel.setText("Im overweight");
                }else{
                    bmiLabel.setText("Im obesity");
                }
            }
        });
    }
}
