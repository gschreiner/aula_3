import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

public class Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 437, 299);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 12, 411, 256);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Painel 1", null, panel, null);
		panel.setLayout(null);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Aqui vou criar a nova janela. Nesse caso temos a classe CarrosCRUD
				//   Então primeiro instanciamos a classe onde esta a outra janela.
				//   Perceba que estamos passando como paramentro o frame da janela principal, isso
				//     permite que a tela principal seja travada enquanto a nova janela esta sendo usada.
				CarrosCRUD novaJanela = new CarrosCRUD(frame);
				
				//desabilitando a janela principal
				frame.setEnabled(false);
				
				//mostra a nova janela.
				novaJanela.setVisible(true);
				
			}
		});
		btnNovo.setBounds(39, 91, 117, 25);
		panel.add(btnNovo);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Painel 2", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNovaJanela = new JButton("Nova Janela 2");
		btnNovaJanela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//chama a nova janela passando o pai como parametro
				NovaJanela2 nj = new NovaJanela2(frame);
				
				//desabilita a janela atual
				frame.setEnabled(false);
				//mostra a nova janela.
				nj.setVisible(true);
			}
		});
		btnNovaJanela.setBounds(69, 91, 144, 25);
		panel_1.add(btnNovaJanela);
	}
}
