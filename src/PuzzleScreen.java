/**
 *  Copyright (c) 2023 Michael Malloy, Enter-Name
 *  CNIT 25501 Final Project - GET THE bagel
 */

public class PuzzleScreen extends javax.swing.JFrame {
    
    static Puzzle puzzle = null;
    static Player Ted = null;
    
    private static int incorrectAnswers;
    
    enum Status {
        Correct,
        Incorrect,
        Skipped
    }
    
    /**
     * Creates new form Controller
     */
    public PuzzleScreen(Player TedRose) {
        Ted = TedRose;
        initComponents();
        startPuzzle();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSplitPane2 = new javax.swing.JSplitPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        puzzleDisplay = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        AnswerBox = new javax.swing.JTextField();
        SubmitAnswerButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuFileDropdown = new javax.swing.JMenu();
        quitMenuButton = new javax.swing.JMenuItem();
        menuEditDropdown = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[Bagel] - Development Build");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(400, 200));
        setPreferredSize(new java.awt.Dimension(400, 200));

        jSplitPane2.setDividerLocation(200);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        puzzleDisplay.setText("Here be Riddles");
        puzzleDisplay.setEnabled(false);
        puzzleDisplay.setMinimumSize(new java.awt.Dimension(62, 300));
        puzzleDisplay.setName(""); // NOI18N
        puzzleDisplay.setRequestFocusEnabled(false);
        jScrollPane3.setViewportView(puzzleDisplay);

        jSplitPane2.setTopComponent(jScrollPane3);

        jTextField2.setEditable(false);
        jTextField2.setText("Input");

        SubmitAnswerButton.setText("jButton1");
        SubmitAnswerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitAnswerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AnswerBox, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SubmitAnswerButton)
                        .addGap(188, 188, 188))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AnswerBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SubmitAnswerButton)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(jPanel1);

        menuFileDropdown.setText("File");

        quitMenuButton.setText("Quit");
        quitMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuButtonActionPerformed(evt);
            }
        });
        menuFileDropdown.add(quitMenuButton);

        menuBar.add(menuFileDropdown);

        menuEditDropdown.setText("Edit");
        menuBar.add(menuEditDropdown);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Menu Option Handling
    private void quitMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitMenuButtonActionPerformed

    private void SubmitAnswerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitAnswerButtonActionPerformed
        checkAnswer();
    }//GEN-LAST:event_SubmitAnswerButtonActionPerformed

    public static void puzzleScreen(Player TedRose) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuzzleScreen(TedRose).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnswerBox;
    private javax.swing.JButton SubmitAnswerButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEditDropdown;
    private javax.swing.JMenu menuFileDropdown;
    private javax.swing.JTextPane puzzleDisplay;
    private javax.swing.JMenuItem quitMenuButton;
    // End of variables declaration//GEN-END:variables
    
    private void startPuzzle() {
        puzzle = new Puzzle();
        
        puzzle.newPuzzle();
        
        puzzleDisplay.setText(puzzle.puzzleText);
        
        if (puzzle.isBagel) {
            // Win Code
        }
        
        this.incorrectAnswers = 0;
    }
    
    private void checkAnswer() {
        if (puzzle.checkAttempt(AnswerBox.getText())) {
            correctAnswer();
        }
        incorrectAnswer();
    }
    
    private void correctAnswer() {
        Ted.increaseHP(15);
        finishPuzzle(Status.Correct); 
    }
    
    private void incorrectAnswer() {
        Ted.decreaseHP(10);
        this.incorrectAnswers += 1;
        
        if (incorrectAnswers >= 3) {
            finishPuzzle(Status.Incorrect);
        }
    }
    
    private void skipPuzzle() {
        Ted.decreaseHP(30);
        finishPuzzle(Status.Skipped);
        
    }
    
    private void finishPuzzle(Status result) {
        if (result == Status.Correct) {
            System.out.println("Yay");
        } else if (result == Status.Incorrect) {
            System.out.println("Aw");
        } else if (result == Status.Skipped) {
            // Code
        }
    }
    
}
