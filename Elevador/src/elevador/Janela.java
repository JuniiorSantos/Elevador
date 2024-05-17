package elevador;

import java.awt.Component;
import java.awt.Font;

import javax.swing.*;

public class Janela extends JFrame {
	private JButton btnAbrir, btnFechar;
	private JButton[] btnAndar;
	private JLabel IblInicio;

	public Janela() {
		inicio();
	}

	private void inicio() {
		setTitle("Bem-vindo ao Elevador KXPO");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		criarPainel();
		setVisible(true);

	}

	private void criarPainel() {
		add(criarLabel());
		criarBtnAbrirFechar();
		criarBtnAndares();

	}

	private void criarBtnAndares() {
		btnAndar = new JButton[5];
		int x = 45;
		for (int i = 0; i < btnAndar.length; i++) {
			btnAndar[i] = new JButton("" +(i+1));
			btnAndar[i].setBounds(x, 460, 120, 60);
			x+=145;
			add(btnAndar[i]);
		}

	}

	private void criarBtnAbrirFechar() {
		btnAbrir = new JButton("Abrir");
		btnFechar = new JButton("Fechar");
		btnAbrir.setBounds(160, 285, 180, 60);
		btnFechar.setBounds(400, 285, 180, 60);
		add(btnAbrir);
		add(btnFechar);
	}

	private Component criarLabel() {
		IblInicio = new JLabel("Elevador KXPO : escolha um andar");
		IblInicio.setFont(new Font("Arial", Font.PLAIN, 18));
		IblInicio.setHorizontalAlignment(JLabel.CENTER);
		IblInicio.setVerticalAlignment(JLabel.TOP);
		IblInicio.setBounds(0, 60, 800, 30);
		return IblInicio;
	}
}
