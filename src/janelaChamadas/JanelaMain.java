package janelaChamadas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JanelaMain implements ActionListener{
	
	JanelaMainComponentes componente;
	private JFrame janela;
	
	public JanelaMain(){
		
		janela = new JFrame();
		componente = new JanelaMainComponentes();
		
		janela.setLayout(new BorderLayout());
		janela.setSize(300, 200);
		
		componente.setLabel(new JLabel("Eu sou louco"));
		componente.getLabel().setBounds(80,30, 80, 30);
		componente.getLabel().setSize(80, 30);
		
		componente.setBotao(new JButton("Proximo"));
		componente.getBotao().setBounds(80,30, 80, 30);
		componente.getBotao().setSize(80, 50);
		
		componente.setPainel(new JPanel());
		componente.getPainel().setLayout(new BorderLayout());
		componente.getPainel().add(componente.getBotao());
		componente.getPainel().add(componente.getLabel());
		
		janela.add(componente.getPainel());			
		
	}
	
	public void abreJanela() {
		janela.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == componente.getBotao()){
            
		}
		
	}
}
