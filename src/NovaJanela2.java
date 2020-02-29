import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * Essa é a classe da NovaJanela. Vejam que criei ela como na aula, coloquei novo > other > Window Application
 * Ai coloquei o extends JFrame (classe que cria a janela) e comentei a parte do main que não precisamos utilizar
 * Mesma coisa que foi feito para o CarrosCRUD
 */ 

public class NovaJanela2 extends JFrame{

	//Variavel para armazenar a javela pai que chamou. Dessa forma controlamos para liberar a janela novamente.
	private JFrame framePai;

// Comentado pois não vamos utilizar. Poderiamos usar, mas não precisamos.	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CarrosCRUD window = new CarrosCRUD();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Vejam que este é apenas um construtor, e eu o alterei para receber como parametro a janela pai.
	 */
	public NovaJanela2(JFrame pai) {
		//atribui a janela pai para a variavel
		this.framePai = pai;
		
		//Como podem ver esse método apenas é executado quando saimos da janela nova, e basicamente
		// ele habilita a janela pai que estava bloqueada.
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				//habilita a janela pai.
				framePai.setEnabled(true);
			}
		});
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(100, 100, 450, 300);
		//Altera a ação executada ao fechar a janela
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//Esse foi o comando que não lembrei na aula, se eu tivesse setado este valor teria funcionado. 
		  //O valor padão é EXIT_ON_CLOSE o que faz com que todo o programa se feche quando tentamos fechar a janela nova.
		  //O DISPOSE_ON_CLOSE apenas ira destruir a janela nova.
		
		getContentPane().setLayout(null);
		
		JLabel lblNovaJanela = new JLabel("Nova Janela 2");
		lblNovaJanela.setBounds(42, 88, 112, 15);
		getContentPane().add(lblNovaJanela);
		
		JLabel lblPossoColocarQualquer = new JLabel("Posso colocar qualquer ação aqui");
		lblPossoColocarQualquer.setBounds(84, 115, 257, 15);
		getContentPane().add(lblPossoColocarQualquer);

	}
}
