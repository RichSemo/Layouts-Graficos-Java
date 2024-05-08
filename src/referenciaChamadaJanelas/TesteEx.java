package referenciaChamadaJanelas;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteEx {
	private static Label lbl;

	public static void main(String[] args) {
		JFrame janela = new JFrame();

		janela.setLayout(new FlowLayout());

		JButton btnAB = new JButton();
		lbl = new Label("Sou o Richard");

		btnAB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame janela2 = new TesteJanela().getJanela();
				janela2.setVisible(true);
			}
		});

		janela.add(lbl);

		janela.add(btnAB);

		janela.pack();

		janela.setVisible(true);
	}

	public static void setlbl(String texto) {
	lbl.setText(texto);	
	}
}
