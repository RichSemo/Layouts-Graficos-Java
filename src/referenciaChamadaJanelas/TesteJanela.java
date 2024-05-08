package referenciaChamadaJanelas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import referenciaChamadaJanelas.TesteEx;

public class TesteJanela {
	JFrame janela = new JFrame();

	public JFrame getJanela() {
		JButton btnAlerar = new JButton();

		btnAlerar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TesteEx.setlbl("Felipe");
			}
		});

		janela.setLayout(new FlowLayout());

		janela.add(btnAlerar);

		janela.pack();

		return janela;
	}

}
