package janelaChamadas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaSecond implements ActionListener{
	
	JanelaMainComponentes componente2;
	private JFrame janela;
	
	public JanelaSecond(JanelaMainComponentes componente){
		
	    componente2 = new JanelaMainComponentes();
	    componente2.setBotao(new JButton("Altera JLabel Anterior"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
