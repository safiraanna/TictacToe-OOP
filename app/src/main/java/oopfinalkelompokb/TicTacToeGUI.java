package oopfinalkelompokb;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.*;

public class TicTacToeGUI extends JFrame {
    private Container pane;
    private String currentPlayer;
    private JButton [][] board;
    private boolean hasWinner;
    private JMenuBar menuBar;
    // private JMenu menu;
    private JMenuItem quit;
    private JMenuItem newGame;
    //private JLabel turn;

    public TicTacToeGUI() {
        super();
        pane = getContentPane();
        pane.setLayout(new GridLayout(3,3));
        setTitle("Tic Tac Toe");
        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        currentPlayer = "x";
        board = new JButton [3][3];
        hasWinner = false;
        initializeBoard();
        initializeMenuBar();
        // initializeTurnBar();
    }

    private void initializeMenuBar() {
        menuBar = new JMenuBar();
        // menu = new JMenu("File");

        newGame = new JMenuItem("New Game");
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                resetBoard();
            }
        });
        quit = new JMenuItem("Quit");
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        menuBar.add(newGame);
        menuBar.add(quit);
        
        menuBar.setBackground(new java.awt.Color(204, 255, 204));
        
        // menuBar.add(menu);
        setJMenuBar(menuBar);
    }

    private void resetBoard(){
        currentPlayer = "x";
        hasWinner = false;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j].setText("");
            }
        }
    }

    private void initializeBoard(){ 
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                JButton btn = new JButton();
                btn.setFont(new Font(Font.SANS_SERIF, Font.BOLD,100));
                btn.setForeground(new java.awt.Color(51, 51, 51));
                btn.setBackground(new java.awt.Color(255, 248, 220));
                board[i][j] = btn;
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (((JButton)e.getSource()).getText().equals("") && hasWinner == false) {
                            btn.setText(currentPlayer);
                            
                            btn.setOpaque(true);
                            hasWinner();
                            togglePlayer();
                        }
                    }
                });
                pane.add(btn);
            }
        }
    }

    private void togglePlayer() {
        if (currentPlayer.equals("x"))
            currentPlayer = "o";
        else
            currentPlayer = "x";
    }

    private void hasWinner() {
        if (currentPlayer.equals("x")) {
            JOptionPane.showMessageDialog(null, "o's turn");
        } else {
            JOptionPane.showMessageDialog(null, "x's turn");
        }
       
        if(board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)) {
            board[0][0].setBackground(new java.awt.Color(204, 255, 204));
            board[1][0].setBackground(new java.awt.Color(204, 255, 204));
            board[2][0].setBackground(new java.awt.Color(204, 255, 204));
            
            int jawab = JOptionPane.showOptionDialog(null, "Player " + currentPlayer + " has won! \nPlay again?", "Are u sure?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            hasWinner = true;

            
            if (jawab == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Game restarted \n" + currentPlayer + "Turn!");
                resetBoard();
                board[0][0].setBackground(new java.awt.Color(255, 248, 220));
                board[1][0].setBackground(new java.awt.Color(255, 248, 220));
                board[2][0].setBackground(new java.awt.Color(255, 248, 220));
            } else {
                System.exit(0);
            }
        }

        else if(board[0][1].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer)) {
            board[0][1].setBackground(new java.awt.Color(204, 255, 204));
            board[1][1].setBackground(new java.awt.Color(204, 255, 204));
            board[2][1].setBackground(new java.awt.Color(204, 255, 204));

            int jawab = JOptionPane.showOptionDialog(null, "Player " + currentPlayer + " has won! \nPlay again?", "Are u sure?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            hasWinner = true;

            
            if (jawab == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Game restarted \n" + currentPlayer + "Turn!");
                resetBoard();

                board[0][1].setBackground(new java.awt.Color(255, 248, 220));
                board[1][1].setBackground(new java.awt.Color(255, 248, 220));
                board[2][1].setBackground(new java.awt.Color(255, 248, 220));
            } else {
                System.exit(0);
            }
        }

        else if(board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
            board[0][2].setBackground(new java.awt.Color(204, 255, 204));
            board[1][2].setBackground(new java.awt.Color(204, 255, 204));
            board[2][2].setBackground(new java.awt.Color(204, 255, 204));

            int jawab = JOptionPane.showOptionDialog(null, "Player " + currentPlayer + " has won! \nPlay again?", "Are u sure?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            hasWinner = true;
            

            if (jawab == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Game restarted \n" + currentPlayer + "Turn!");
                resetBoard();

                board[0][2].setBackground(new java.awt.Color(255, 248, 220));
                board[1][2].setBackground(new java.awt.Color(255, 248, 220));
                board[2][2].setBackground(new java.awt.Color(255, 248, 220));
            } else {
                System.exit(0);
            }
        }

        else if(board[0][0].getText().equals(currentPlayer) && board[0][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer)) {
            board[0][0].setBackground(new java.awt.Color(204, 255, 204));
            board[0][1].setBackground(new java.awt.Color(204, 255, 204));
            board[0][2].setBackground(new java.awt.Color(204, 255, 204));

            int jawab = JOptionPane.showOptionDialog(null, "Player " + currentPlayer + " has won! \nPlay again?", "Are u sure?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            hasWinner = true;
            

            if (jawab == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Game restarted \n" + currentPlayer + "Turn!");
                resetBoard();

                board[0][0].setBackground(new java.awt.Color(255, 248, 220));
                board[0][1].setBackground(new java.awt.Color(255, 248, 220));
                board[0][2].setBackground(new java.awt.Color(255, 248, 220));
            } else {
                System.exit(0);
            }
        }

        else if(board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer)) {
            board[1][0].setBackground(new java.awt.Color(204, 255, 204));
            board[1][1].setBackground(new java.awt.Color(204, 255, 204));
            board[1][2].setBackground(new java.awt.Color(204, 255, 204));

            int jawab = JOptionPane.showOptionDialog(null, "Player " + currentPlayer + " has won! \nPlay again?", "Are u sure?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            hasWinner = true;

            if (jawab == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Game restarted \n" + currentPlayer + "Turn!");
                resetBoard();

                board[1][0].setBackground(new java.awt.Color(255, 248, 220));
                board[1][1].setBackground(new java.awt.Color(255, 248, 220));
                board[1][2].setBackground(new java.awt.Color(255, 248, 220));
            } else {
                System.exit(0);
            }
        }

        else if(board[2][0].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
            board[2][0].setBackground(new java.awt.Color(204, 255, 204));
            board[2][1].setBackground(new java.awt.Color(204, 255, 204));
            board[2][2].setBackground(new java.awt.Color(204, 255, 204));

            int jawab = JOptionPane.showOptionDialog(null, "Player " + currentPlayer + " has won! \nPlay again?", "Are u sure?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            hasWinner = true;

            if (jawab == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Game restarted \n" + currentPlayer + "Turn!");
                resetBoard();

                board[2][0].setBackground(new java.awt.Color(255, 248, 220));
                board[2][1].setBackground(new java.awt.Color(255, 248, 220));
                board[2][2].setBackground(new java.awt.Color(255, 248, 220));
            } else {
                System.exit(0);
            }
        }

        else if(board[0][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
            board[0][0].setBackground(new java.awt.Color(204, 255, 204));
            board[1][1].setBackground(new java.awt.Color(204, 255, 204));
            board[2][2].setBackground(new java.awt.Color(204, 255, 204));

            int jawab = JOptionPane.showOptionDialog(null, "Player " + currentPlayer + " has won! \nPlay again?", "Are u sure?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            hasWinner = true;

            if (jawab == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Game restarted \n" + currentPlayer + "Turn!");
                resetBoard();

                board[0][0].setBackground(new java.awt.Color(255, 248, 220));
                board[1][1].setBackground(new java.awt.Color(255, 248, 220));
                board[2][2].setBackground(new java.awt.Color(255, 248, 220));
            } else {
                System.exit(0);
            }
        }

        else if(board[0][2].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)) {
            board[0][2].setBackground(new java.awt.Color(204, 255, 204));
            board[1][1].setBackground(new java.awt.Color(204, 255, 204));
            board[2][0].setBackground(new java.awt.Color(204, 255, 204));
            
            int jawab = JOptionPane.showOptionDialog(null, "Player " + currentPlayer + " has won! \nPlay again?", "Are u sure?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            hasWinner = true;

            
            if (jawab == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Game restarted \n" + currentPlayer + "Turn!");
                resetBoard();

                board[0][2].setBackground(new java.awt.Color(255, 248, 220));
                board[1][1].setBackground(new java.awt.Color(255, 248, 220));
                board[2][0].setBackground(new java.awt.Color(255, 248, 220));
            } else {
                System.exit(0);
            }
        }

        else if (!board[0][0].getText().isBlank() && !board[0][1].getText().isBlank() && !board[0][2].getText().isBlank() && !board[1][0].getText().isBlank() && !board[1][1].getText().isBlank() && !board[1][2].getText().isBlank() && !board[2][0].getText().isBlank() && !board[2][1].getText().isBlank() && !board[2][2].getText().isBlank() && hasWinner == false) {
            int jawab = JOptionPane.showOptionDialog(null, "Draw! \nPlay again?", "Are u sure?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            hasWinner = false;
            
            if (jawab == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Game restarted \n" + currentPlayer + "Turn!");
                resetBoard();
            } else {
                System.exit(0);
            }
        }

    }
}
