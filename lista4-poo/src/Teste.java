import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



public class Teste extends JPanel{
	
	private JButton btNovo;
	private JButton btSalvar;
	private JButton btBuscar;
	private JLabel lbCodigo;
	private JLabel lbNome;
	private JLabel lbPreco;
	private JLabel lbEstoque;
	private JButton btExcluir;
	private JTextField tfCodigo;
	private JTextField tfNome;
	private JTextField tfPreco;
	private JTextField tfEstoque;
	private ContatosDAO pdao; 
	private Contatos p;

	private JTextField tfLocalizar;
	private JTable table;
	private DefaultTableModel model;
	private BD bd;


	public Teste() {
		pdao  = new ContatosDAO(); 
		p  = new Contatos(); 
		bd = new BD();
		bd.getConnection();

		inicializarComponentes();
		definirEventos();
	}

	public void inicializarComponentes() {
		btNovo = new JButton ("Novo");
		btSalvar = new JButton ("Salvar");
		btBuscar = new JButton ("Buscar");
		lbCodigo = new JLabel ("Codigo");
		lbNome = new JLabel ("Nome");
		lbPreco = new JLabel ("Preco Unitario");
		lbEstoque = new JLabel ("Estoque");
		btExcluir = new JButton ("Excluir");
		tfCodigo = new JTextField (5);
		tfNome = new JTextField (5);
		tfPreco = new JTextField (5);
		tfEstoque = new JTextField (5);
		tfLocalizar = new JTextField(10);

		setPreferredSize (new Dimension (600, 430));
		setLayout (null);

		add (btNovo);
		add (btSalvar);
		add (btBuscar);
		add (lbCodigo);
		add (lbNome);
		add (lbPreco);
		add (lbEstoque);
		add (btExcluir);
		add (tfCodigo);
		add (tfNome);
		add (tfPreco);
		add (tfEstoque);
		add(tfLocalizar);

		btNovo.setBounds (5, 150, 75, 20);
		btSalvar.setBounds (85, 150, 80, 20);
		btBuscar.setBounds (105, 15, 75, 25);
		btExcluir.setBounds (170, 150, 90, 20);

		lbCodigo.setBounds (5, 15, 45, 25);
		lbNome.setBounds (5, 45, 45, 25);
		lbPreco.setBounds (5, 75, 90, 25);
		lbEstoque.setBounds (5, 105, 55, 25);
		tfCodigo.setBounds (55, 15, 45, 25);
		tfNome.setBounds (55, 45, 280, 25);
		tfPreco.setBounds (95, 75, 70, 25);
		tfEstoque.setBounds (60, 105, 35, 25);

		table = new JTable();
		atualizaGrade();


		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(0).setResizable(false);

		table.getColumnModel().getColumn(1).setPreferredWidth(250);
		table.getColumnModel().getColumn(1).setResizable(false);

		table.getColumnModel().getColumn(2).setPreferredWidth(30);
		table.getColumnModel().getColumn(2).setResizable(false);

		DefaultTableCellRenderer alinhaDireita = new DefaultTableCellRenderer();; 
		alinhaDireita.setHorizontalAlignment(SwingConstants.RIGHT);
		table.getColumnModel().getColumn(2).setCellRenderer(alinhaDireita);

		//table.getColumnModel().getColumn(3).setPreferredWidth(20);
		//table.getColumnModel().getColumn(3).setResizable(false);
		//table.getColumnModel().getColumn(3).setCellRenderer(alinhaDireita);

		table.getTableHeader().setReorderingAllowed(false);

		JScrollPane scroller = new JScrollPane(table); 
		scroller.setBounds(5,220,580,200);
		tfLocalizar.setBounds (5, 195, 200, 20);
		add(scroller);
	}

	public void definirEventos() {

		tfLocalizar.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent arg0) {
			}
			public void keyReleased(KeyEvent arg0) {
				try{
					model = TableModel.getModel(bd, "select * from contatos where nome like '"+tfLocalizar.getText()+"%'");
					table.setModel(model);	//pode gerar erro
				}
				catch(IllegalArgumentException e){} 
			}
			public void keyPressed(KeyEvent arg0) {
			}
		});

		table.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				tfCodigo.setText((String)table.getValueAt(table.getSelectedRow(), 0));
				tfNome.setText((String)table.getValueAt(table.getSelectedRow(), 1));
				tfPreco.setText((String)table.getValueAt(table.getSelectedRow(), 2));

			}
		});


		btNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});

		btBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p = pdao.localizar(Integer.parseInt(tfCodigo.getText()));
				if(p!=null){
					tfNome.setText(p.getNome());
					tfPreco.setText(""+p.getNumero());
				}
				else {
					JOptionPane.showMessageDialog(btBuscar, "Não encontrado");
					limparCampos();
				}
			}
		});

		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameToProduto();
				JOptionPane.showMessageDialog(btSalvar, pdao.salvar(p));
				limparCampos();
				atualizaGrade();
			}
		});
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					p.setNumero(Integer.parseInt(tfCodigo.getText()));
				}
				catch(NumberFormatException erro){
					JOptionPane.showMessageDialog(btExcluir,
							"O codigo deve conter um valor inteiro");
					return;
				}
				int r = JOptionPane.showConfirmDialog(btExcluir, "Tem certeza?");
				if(r==0) {
					JOptionPane.showMessageDialog(btExcluir,pdao.excluir(p.getNumero()));
					limparCampos();
					atualizaGrade();
				}

			}
		});        
	}//fim do construtor

	private void atualizaGrade() {
		model = TableModel.getModel(bd, "select * from contatos");
		table.setModel(model);
	}

	private void limparCampos() {
		tfCodigo.setText("");
		tfNome.setText("");
		tfPreco.setText("");
		tfEstoque.setText("");
		tfCodigo.requestFocus();
	}


	public void frameToProduto(){
		try{
			p.setNumero(Integer.parseInt(
					tfCodigo.getText()));
		}
		catch(NumberFormatException erro){
			JOptionPane.showMessageDialog(btSalvar,
					"O codigo deve conter um valor inteiro");
			return;
		}
		if(tfNome.getText().equals("")){
			JOptionPane.showMessageDialog(btSalvar, 
					"O nome nao pode ser branco!");
			return;
		}
		p.setNome(tfNome.getText());
		try{
			p.setDdd(Integer.parseInt(
					tfPreco.getText()));
		}
		catch(NumberFormatException erro){
			JOptionPane.showMessageDialog(btSalvar,
					"O Preco deve conter um valor numerico");
			return;
		}
		

	}

	public static void main (String[] args) {
		JFrame frame = new JFrame ("GuiProduto");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new Teste());
		frame.pack();
		frame.setVisible (true);
	}

}
