import java.awt.*;
import java.awt.event.*;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;



public class OOXX extends JFrame implements ActionListener, MouseListener {
	static OOXX frm = new OOXX();
	static JButton[][] btns = new JButton[3][3];
	static ImageIcon[] imgs = new ImageIcon[2];
	static int count = 0;
	static boolean win = false;
	static int[][] board = new int[3][3];
	
	public static void main(String[] args)throws InterruptedException {
		frm.setSize(600, 600);
		frm.setLayout(new GridLayout(3, 3));
		imgs[0] = new ImageIcon("src/img/O.jpg");
		imgs[1] = new ImageIcon("src/img/X.jpg");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				btns[row][col] = new JButton();
				btns[row][col].addActionListener(frm);
				frm.add(btns[row][col]);
				board[row][col] = -1;
			}
		}
		
		frm.setVisible(true);
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int x = 0, y = 0;
		JButton jbn = (JButton) (e.getSource());
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (jbn == btns[row][col]) {
					x = row;
					y = col;
				}
			}
		}
		
		if(board[x][y] == -1) {
			count++;
			if(count % 2 == 1) {
				btns[x][y].setIcon(imgs[0]);
				board[x][y] = 0;
			} else {
				btns[x][y].setIcon(imgs[1]);
				board[x][y] = 1;
			}
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if((i - 1 >= 0) && (i + 1 <= 2)) {
						if((board[i][j] != -1) && (board[i][j] == board[i-1][j]) && (board[i][j] == board[i+1][j])) {
							win = true;

						}
				}
					if((j - 1 >= 0) && (j + 1 <= 2)) {
						if((board[i][j] != -1) && (board[i][j] == board[i][j-1]) && (board[i][j] == board[i][j+1])) {
							win = true;

						}
				}
					if((i - 1 >= 0) && (i + 1 <= 2) && (j - 1 >= 0) && (j + 1 <= 2)) {
						if((board[i][j] != -1) && (board[i][j] == board[i-1][j-1]) && (board[i][j] == board[i+1][j+1])) {
							win = true;
		
						}
						if((board[i][j] != -1) && (board[i][j] == board[i-1][j+1]) && (board[i][j] == board[i+1][j-1])) {
							win = true;
		
						}
				}
			}
			
					
			}
			
			if(count % 2 == 1 && win == true) {
				 int opt=JOptionPane.showConfirmDialog(frm,"恭喜，OO贏了!!\n是否再來一局？","GameOver",
                         JOptionPane.YES_NO_CANCEL_OPTION,
                         JOptionPane.INFORMATION_MESSAGE);
				 if(opt == 1)System.exit(0);
				 if(opt == 0) {
					 for(int row = 0; row < 3; row++) {
						 for(int col = 0; col < 3; col++) {
							 board[row][col] = -1;
							 btns[row][col].setIcon(null);
						 }
					 }
					 count = 0;
					 win = false;
				 }
			}
			
			if(count % 2 == 0 && win == true) {
				 int opt=JOptionPane.showConfirmDialog(frm,"恭喜，XX贏了!!\n是否再來一局？","GameOver",
                         JOptionPane.YES_NO_CANCEL_OPTION,
                         JOptionPane.INFORMATION_MESSAGE);
				 if(opt == 1)System.exit(0);
				 if(opt == 0) {
					 for(int row = 0; row < 3; row++) {
						 for(int col = 0; col < 3; col++) {
							 board[row][col] = -1;
							 btns[row][col].setIcon(null);
						 }
					 }
					 count = 0;
					 win = false;
				 }
			}
			
			if(count == 9 && win == false) {
				 int opt=JOptionPane.showConfirmDialog(frm,"平手，下的精彩!!\n是否再來一局？","GameOver",
                         JOptionPane.YES_NO_CANCEL_OPTION,
                         JOptionPane.INFORMATION_MESSAGE);
				 if(opt == 1)System.exit(0);
				 if(opt == 0) {
					 for(int row = 0; row < 3; row++) {
						 for(int col = 0; col < 3; col++) {
							 board[row][col] = -1;
							 btns[row][col].setIcon(null);
						 }
					 }
					 count = 0;
					 win = false;
				 }
			}
		}
		
		
	}
}
