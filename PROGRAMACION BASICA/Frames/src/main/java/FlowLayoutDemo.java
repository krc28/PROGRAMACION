package Semana4;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author USUARIO
 */
public class FlowLayoutDemo extends JFrame{
    private JRadioButton RtoLbutton;
    private JRadioButton LtoRbutton;
    private FlowLayout experimentLayout = new FlowLayout();
    private String RtoL = "Right to left";
    private String LtoR = "Left to right";
    private JButton applyButton = new JButton("Apply component orientation");
    
    public FlowLayoutDemo(String name) {
        super(name);
    }
    
    public void addComponentsToPane(final Container pane) {
        final JPanel compsToExperiment = new JPanel();
        compsToExperiment.setLayout(getExperimentLayout());
        getExperimentLayout().setAlignment(FlowLayout.TRAILING);
        JPanel controls = new JPanel();
        controls.setLayout(new FlowLayout());
        
        setLtoRbutton(new JRadioButton(getLtoR()));
        getLtoRbutton().setActionCommand(getLtoR());
        getLtoRbutton().setSelected(true);
        setRtoLbutton(new JRadioButton(getRtoL()));
        getRtoLbutton().setActionCommand(getRtoL());
        
        //Add buttons to the experiment layout
        compsToExperiment.add(new JButton("Button 1"));
        compsToExperiment.add(new JButton("Button 2"));
        compsToExperiment.add(new JButton("Button 3"));
        compsToExperiment.add(new JButton("Long-Named Button 4"));
        compsToExperiment.add(new JButton("5"));
        //Left to right component orientation is selected by default
        compsToExperiment.setComponentOrientation(
                ComponentOrientation.LEFT_TO_RIGHT);
        
        //Add controls to set up the component orientation in the experiment layout
        final ButtonGroup group = new ButtonGroup();
        group.add(getLtoRbutton());
        group.add(getRtoLbutton());
        controls.add(getLtoRbutton());
        controls.add(getRtoLbutton());
        controls.add(getApplyButton());
        
        //Process the Apply component orientation button press
        getApplyButton().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String command = group.getSelection().getActionCommand();
                //Check the selection
                if (command.equals("Left to right")) {
                    compsToExperiment.setComponentOrientation(
                            ComponentOrientation.LEFT_TO_RIGHT);
                } else {
                    compsToExperiment.setComponentOrientation(
                            ComponentOrientation.RIGHT_TO_LEFT);
                }
                //update the experiment layout
                compsToExperiment.validate();
                compsToExperiment.repaint();
            }
        });
        pane.add(compsToExperiment, BorderLayout.CENTER);
        pane.add(controls, BorderLayout.SOUTH); ;
    }
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        FlowLayoutDemo frame = new FlowLayoutDemo("FlowLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        frame.addComponentsToPane(frame.getContentPane());
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        //Schedule a job for the event dispatchi thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    /**
     * @return the RtoLbutton
     */
    public JRadioButton getRtoLbutton() {
        return RtoLbutton;
    }

    /**
     * @param RtoLbutton the RtoLbutton to set
     */
    public void setRtoLbutton(JRadioButton RtoLbutton) {
        this.RtoLbutton = RtoLbutton;
    }

    /**
     * @return the LtoRbutton
     */
    public JRadioButton getLtoRbutton() {
        return LtoRbutton;
    }

    /**
     * @param LtoRbutton the LtoRbutton to set
     */
    public void setLtoRbutton(JRadioButton LtoRbutton) {
        this.LtoRbutton = LtoRbutton;
    }

    /**
     * @return the experimentLayout
     */
    public FlowLayout getExperimentLayout() {
        return experimentLayout;
    }

    /**
     * @param experimentLayout the experimentLayout to set
     */
    public void setExperimentLayout(FlowLayout experimentLayout) {
        this.experimentLayout = experimentLayout;
    }

    /**
     * @return the RtoL
     */
    public String getRtoL() {
        return RtoL;
    }

    /**
     * @param RtoL the RtoL to set
     */
    public void setRtoL(String RtoL) {
        this.RtoL = RtoL;
    }

    /**
     * @return the LtoR
     */
    public String getLtoR() {
        return LtoR;
    }

    /**
     * @param LtoR the LtoR to set
     */
    public void setLtoR(String LtoR) {
        this.LtoR = LtoR;
    }

    /**
     * @return the applyButton
     */
    public JButton getApplyButton() {
        return applyButton;
    }

    /**
     * @param applyButton the applyButton to set
     */
    public void setApplyButton(JButton applyButton) {
        this.applyButton = applyButton;
    }
}
