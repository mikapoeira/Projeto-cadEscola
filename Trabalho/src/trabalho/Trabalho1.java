package trabalho;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Trabalho1 {

	private JFrame frame;
	private JTextField rmg_txt;
	private JTextField nome_txt;
	private JTextField datanasc_txt;
	private JTextField cpf_txt;
	private JTextField email_txt;
	private JTextField endereço_txt;
	private JTextField municipio_txt;
	private JTextField cel_txt;
	private JTextField rmg_txt2;
	private JTextField faltas_txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trabalho1 window = new Trabalho1();
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
	public Trabalho1() throws Exception {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 543, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Aluno");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salvar");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Alterar");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Consultar");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Excluir");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Sair");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmNewMenuItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.SHIFT_DOWN_MASK));
		mntmNewMenuItem_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), null));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1 = new JMenu("Notas e Faltas");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Salvar");
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Alterar");
		mntmNewMenuItem_5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Excluir");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Consultar");
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		JMenu mnNewMenu_2 = new JMenu("Ajuda");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Sobre");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//===================  JoptionPane.showMessageDialog(null, "Informações do Menu");
				//==================
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_9);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 11, 510, 288);
		frame.getContentPane().add(tabbedPane_1);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.BOLD, 16));
		tabbedPane_1.addTab("Dados Pessoais", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RGM");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 22, 46, 14);
		panel.add(lblNewLabel);
		
		rmg_txt = new JTextField();
		rmg_txt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rmg_txt.setBounds(66, 14, 135, 31);
		panel.add(rmg_txt);
		rmg_txt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(211, 22, 46, 14);
		panel.add(lblNewLabel_1);
		
		nome_txt = new JTextField();
		nome_txt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nome_txt.setColumns(10);
		nome_txt.setBounds(279, 14, 210, 31);
		panel.add(nome_txt);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDataDeNascimento.setBounds(10, 61, 158, 22);
		panel.add(lblDataDeNascimento);
		
		datanasc_txt = new JTextField();
		datanasc_txt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		datanasc_txt.setColumns(10);
		datanasc_txt.setBounds(176, 56, 113, 31);
		panel.add(datanasc_txt);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCpf.setBounds(299, 65, 46, 14);
		panel.add(lblCpf);
		
		cpf_txt = new JTextField();
		cpf_txt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cpf_txt.setColumns(10);
		cpf_txt.setBounds(340, 56, 149, 31);
		panel.add(cpf_txt);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(10, 114, 46, 14);
		panel.add(lblEmail);
		
		email_txt = new JTextField();
		email_txt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		email_txt.setColumns(10);
		email_txt.setBounds(63, 107, 426, 31);
		panel.add(email_txt);
		
		JLabel lblEnd = new JLabel("End.");
		lblEnd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnd.setBounds(10, 157, 46, 14);
		panel.add(lblEnd);
		
		endereço_txt = new JTextField();
		endereço_txt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		endereço_txt.setColumns(10);
		endereço_txt.setBounds(63, 149, 426, 31);
		panel.add(endereço_txt);
		
		JLabel lblEmuni = new JLabel("Município");
		lblEmuni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmuni.setBounds(10, 205, 74, 22);
		panel.add(lblEmuni);
		
		municipio_txt = new JTextField();
		municipio_txt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		municipio_txt.setColumns(10);
		municipio_txt.setBounds(94, 198, 120, 31);
		panel.add(municipio_txt);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUf.setBounds(224, 209, 30, 14);
		panel.add(lblUf);
		
		JComboBox uf_box = new JComboBox();
		uf_box.setFont(new Font("Tahoma", Font.BOLD, 13));
		uf_box.setModel(new DefaultComboBoxModel(new String[] {"SP"}));
		uf_box.setToolTipText("");
		uf_box.setBounds(250, 207, 44, 22);
		panel.add(uf_box);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCelular.setBounds(299, 205, 53, 22);
		panel.add(lblCelular);
		
		cel_txt = new JTextField();
		cel_txt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cel_txt.setColumns(10);
		cel_txt.setBounds(362, 196, 127, 31);
		panel.add(cel_txt);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_1.addTab("Curso", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Curso");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 11, 46, 16);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Campus");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(10, 53, 63, 22);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Período");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(10, 98, 59, 22);
		panel_1.add(lblNewLabel_2_2);
		
		JComboBox curso_box = new JComboBox();
		curso_box.setFont(new Font("Tahoma", Font.PLAIN, 18));
		curso_box.setModel(new DefaultComboBoxModel(new String[] {"Analise e Desenvolvimentos de Sistemas"}));
		curso_box.setBounds(92, 11, 383, 22);
		panel_1.add(curso_box);
		
		JComboBox Campus_box = new JComboBox();
		Campus_box.setModel(new DefaultComboBoxModel(new String[] {"Tatuapé"}));
		Campus_box.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Campus_box.setBounds(92, 56, 383, 22);
		panel_1.add(Campus_box);
		
		JRadioButton matutino_button = new JRadioButton("Matutino");
		matutino_button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		matutino_button.setBounds(92, 101, 109, 23);
		panel_1.add(matutino_button);
		
		JRadioButton vespertino_button = new JRadioButton("Vespertino");
		vespertino_button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		vespertino_button.setBounds(222, 101, 109, 23);
		panel_1.add(vespertino_button);
		
		JRadioButton noturno_button = new JRadioButton("Noturno");
		noturno_button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		noturno_button.setBounds(348, 101, 109, 23);
		panel_1.add(noturno_button);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\E470\\Downloads\\java.png"));
		btnNewButton.setBounds(393, 160, 82, 73);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("Notas e Faltas", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("RGM");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 19, 46, 14);
		panel_2.add(lblNewLabel_3);
		
		rmg_txt2 = new JTextField();
		rmg_txt2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rmg_txt2.setColumns(10);
		rmg_txt2.setBounds(66, 11, 135, 31);
		panel_2.add(rmg_txt2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Disciplina");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(10, 84, 73, 22);
		panel_2.add(lblNewLabel_3_1);
		
		JComboBox disciplina_txt = new JComboBox();
		disciplina_txt.setModel(new DefaultComboBoxModel(new String[] {"Programação Orientada a Objetos"}));
		disciplina_txt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		disciplina_txt.setBounds(93, 84, 383, 22);
		panel_2.add(disciplina_txt);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Semestre");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1_1.setBounds(10, 130, 72, 22);
		panel_2.add(lblNewLabel_3_1_1);
		
		JComboBox semestre_txt = new JComboBox();
		semestre_txt.setModel(new DefaultComboBoxModel(new String[] {"2023-01"}));
		semestre_txt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		semestre_txt.setBounds(95, 130, 94, 22);
		panel_2.add(semestre_txt);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Nota\r\n");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1.setBounds(206, 130, 46, 22);
		panel_2.add(lblNewLabel_3_1_1_1);
		
		JComboBox nota_txt = new JComboBox();
		nota_txt.setModel(new DefaultComboBoxModel(new String[] {"0,5", "1,0", "1,5", "2,0"}));
		nota_txt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nota_txt.setBounds(263, 130, 62, 22);
		panel_2.add(nota_txt);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Faltas");
		lblNewLabel_3_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1.setBounds(340, 130, 46, 22);
		panel_2.add(lblNewLabel_3_1_1_1_1);
		
		faltas_txt = new JTextField();
		faltas_txt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		faltas_txt.setColumns(10);
		faltas_txt.setBounds(396, 126, 88, 31);
		panel_2.add(faltas_txt);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Boletim", null, panel_3, null);
	}
}
