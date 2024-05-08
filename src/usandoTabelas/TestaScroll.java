package usandoTabelas;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TestaScroll {
	public static void main(String[] args) {
		JFrame janela = new JFrame();

		JPanel pnl = new JPanel();

		pnl.setLayout(new BoxLayout(pnl, BoxLayout.PAGE_AXIS));

		for (int i = 0; i < 40; i++) {
			pnl.add(new JButton("Conta" + i));
		}

		JScrollPane scrollPane = new JScrollPane(pnl);

		janela.add(scrollPane);

		janela.setVisible(true);
	}
}
