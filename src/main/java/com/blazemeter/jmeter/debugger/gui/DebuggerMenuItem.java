package com.blazemeter.jmeter.debugger.gui;

import org.apache.jorphan.logging.LoggingManager;
import org.apache.log.Logger;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DebuggerMenuItem extends JMenuItem implements ActionListener {
    private static final Logger log = LoggingManager.getLoggerForClass();
    private static DebuggerDialog dialog;
    private static Icon helpIcon;

    public DebuggerMenuItem() {
        super("Step-by-Step Debugger", getBugIcon());
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (dialog == null) {
            dialog = new DebuggerDialog();
        }

        dialog.pack();
        dialog.setVisible(true);
    }

    // many from http://www.veryicon.com/icons/system/fugue/
    public static ImageIcon getBugIcon() {
        return new ImageIcon(DebuggerMenuItem.class.getResource("/com/blazemeter/jmeter/debugger/bug.png"));
    }

    public static ImageIcon getStartIcon() {
        return new ImageIcon(DebuggerMenuItem.class.getResource("/com/blazemeter/jmeter/debugger/start.png"));
    }

    public static ImageIcon getStopIcon() {
        return new ImageIcon(DebuggerMenuItem.class.getResource("/com/blazemeter/jmeter/debugger/stop.png"));
    }

    public static ImageIcon getStepIcon() {
        return new ImageIcon(DebuggerMenuItem.class.getResource("/com/blazemeter/jmeter/debugger/step.png"));
    }

    public static ImageIcon getLogoIcon() {
        return new ImageIcon(DebuggerMenuItem.class.getResource("/com/blazemeter/jmeter/debugger/logo.png"));
    }

    public static ImageIcon getBPIcon() {
        return new ImageIcon(DebuggerMenuItem.class.getResource("/com/blazemeter/jmeter/debugger/breakpoint.png"));
    }

    public static ImageIcon getContinueIcon() {
        return new ImageIcon(DebuggerMenuItem.class.getResource("/com/blazemeter/jmeter/debugger/continue.png"));
    }

    public static ImageIcon getPauseIcon() {
        return new ImageIcon(DebuggerMenuItem.class.getResource("/com/blazemeter/jmeter/debugger/pause.png"));
    }

    public static Icon getHelpIcon() {
        return new ImageIcon(DebuggerMenuItem.class.getResource("/com/blazemeter/jmeter/debugger/help.png"));
    }

}
