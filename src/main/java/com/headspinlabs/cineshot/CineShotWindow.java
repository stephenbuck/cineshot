package com.headspinlabs.cineshot;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;

class CineShotWindow extends JFrame {

    private CineShotControl control;
    private CineShotMonitor monitor;

    public CineShotWindow() {

        super(CineShotMain.CINESHOT_TITLE);

        this.control  = new CineShotControl();
        control.setOpaque(true);
        control.setMinimumSize(new Dimension(100, 100));
        control.setPreferredSize(new Dimension(100, 100));
        control.setLayout(new BorderLayout());

        this.monitor  = new CineShotMonitor();
        monitor.setOpaque(true);
        monitor.setMinimumSize(new Dimension(100, 100));
        monitor.setPreferredSize(new Dimension(100, 100));
        monitor.setLayout(new BorderLayout());

        JMenuItem menuFileExit = new JMenuItem("Exit");
        menuFileExit.setToolTipText("Exit");
        menuFileExit.addActionListener((event) -> { fileExit(); });

        JMenu menuFile = new JMenu("File");
        menuFile.add(menuFileExit);

        JMenuItem menuHelpAbout = new JMenuItem("About");
        menuHelpAbout.setToolTipText("Help");
        menuHelpAbout.addActionListener((event) -> { helpAbout(); });

        JMenu menuHelp = new JMenu("Help");
        menuHelp.add(menuHelpAbout);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuFile);
        menuBar.add(menuHelp);
        
        setJMenuBar(menuBar);

        JSplitPane splitter = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, control, monitor);
        splitter.setOneTouchExpandable(true);
        splitter.setDividerLocation(0.5f);
        splitter.setPreferredSize(new Dimension(100, 100));
        splitter.setPreferredSize(new Dimension(100, 100));
        splitter.setDividerSize(10);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(splitter, BorderLayout.CENTER);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize((screenSize.width / 10) * 8, (screenSize.height / 10) * 8);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void fileExit() {
    }

    private void helpAbout() {
    }
}

