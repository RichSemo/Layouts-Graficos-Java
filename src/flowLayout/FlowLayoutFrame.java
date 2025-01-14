package flowLayout;

/*FlowLayout

Ocorre quando os componentes GUI são colocados em um contêiner da esquerda para a direita 
na ordem em que são adicionados no contêiner. Quando a borda do contêiner é alcançada, 
os componentes continuarão a ser exibidos na próxima linha. A classe FlowLayout 
permite aos componentes GUI ser alinhados à esquerda, centralizados (padrão) e alinhados à direita.

Na Listagem 1 a classe está criando e adicionando 3 objetos Jbutton ao aplicativo. 
Os componentes ficam centralizados por padrão. A ação desse aplicativo será relacionada aos botões. 
Quando o usuário clicar no botão “Direita” o alinhamento do gerenciador muda para um FlowLayout à direita 
e assim acontece com os outros botões quando clicado, cada um com seu alinhamento.

Cada botão tem seu próprio handler de evento que é declarado com um uma 
classe interna anônima que implementa ActionListener.
*/

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutFrame extends JFrame {

	private JButton botaoEsquerdo;	//BOTÃO PARA CONFIGURAR O ALINHAMENTO À ESQUERDA
	private JButton botaoDireito;	//BOTÃO PARA CONFIGURAR O ALINHAMENTO À DIREITA
	private JButton botaoCentral;	//BOTÃO PARA CONFIGURAR O ALINHAMENTO CENTRALIZADO
	private FlowLayout layout;		//OBJETO LAYOUT
	private Container container;	//CONTÊINER PARA CONFIGURAR LAYOUT
	
	//CONFIGURA GUI E REGISTRA LISTENERS DE BOTÃO
	public FlowLayoutFrame()
	{
		super("Demonstração de um FlowLayout");
		
		layout = new FlowLayout();		//CRIA FLOWLAYOUT
		container = getContentPane();	//OBTÊM CONTEINER PARA LAYOUT
		
		setLayout(layout);	//CONFIGURA O LAYOUT DE FRAME
		
		//CONFIGURA LEFTBUTTON E REGISTRA LISTENER
		botaoEsquerdo = new JButton("Esquerda");	//CRIA O BOTÃO LEFT
		add(botaoEsquerdo);		//ADICIONA O BOTÃO ESQUERDO AO FRAME
		
		botaoEsquerdo.addActionListener(new ActionListener() {
			
				@Override
				//PROCESSA O EVENTO BOTÃO ESQUERDO
				public void actionPerformed(ActionEvent e) {
					layout.setAlignment(FlowLayout.LEFT);
					
					//REALINHA OS COMPONENTES ANEXADOS
					layout.layoutContainer(container);
				}
			}
		);
		
		//CONFIGURA O BOTÃO CENTRAL E REGISTRA O LISTENER
		botaoCentral = new JButton("Centro");	//CRIA P BOTÃO CENTRAL
		add(botaoCentral);	//ADICIONO O BOTÃO AO FRAME
		
		botaoCentral.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					layout.setAlignment(FlowLayout.CENTER);
					
					//REALINHA OS COMPONENTES ANEXADOS
					layout.layoutContainer(container);					
				}
			}
		);
		
		//CONFIGURA O BOTÃO DIREITO E REGISTRA O LISTENER
		botaoDireito = new JButton("Direita");
		add(botaoDireito);	//ADICIONA BOTÃO
		
		botaoDireito.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					layout.setAlignment(FlowLayout.RIGHT);
					
					layout.layoutContainer(container);					
				}
			}
		);
	}
}

