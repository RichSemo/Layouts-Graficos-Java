package janelaChamadas;

public class Executa {
	
    private static JanelaMain janelaPrincipal;
	
	public static void main(String[] args) {
		janelaPrincipal = new JanelaMain();
		janelaPrincipal.abreJanela();
	}

	public static JanelaMain getJanelaPrincipal() {
		return janelaPrincipal;
	}

}
