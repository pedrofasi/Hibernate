package com.jcg.hibernate.crud.operations;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import org.apache.log4j.Logger;

import com.jcg.hibernate.crud.operations.models.*;
import com.jcg.hibernate.crud.operations.controller.DbOperations;

import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain extends JFrame implements ActionListener {

    private JPanel contentPane;
    
    private JTextField txtNomeCriminoso;
    private JTextField txtDataNasciCriminoso;
    private JTextField txtCPFCriminoso;
    
    private JTextField txtNomeVitima;
    private JTextField txtDataNasciVitima;
    private JTextField txtCPFVitima;
    
    private JTextField txtNomeArma;

    
   
    private Integer txtID;
    private JComboBox cbPesquisar;
    private ButtonGroup bt = new ButtonGroup();


    private JButton btnSalvar;
    private JButton btnExcluir;
    private JButton btnEditar;
    private JButton btnPesquisar;
    private JButton btnLimpar;

    public AppMain() {
        setTitle("Cadastro Criminal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 556, 413);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblPesquisar = new JLabel("Pesquisar:");
        lblPesquisar.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
        lblPesquisar.setBounds(10, 31, 109, 14);
        contentPane.add(lblPesquisar);

        JLabel lblNomeC = new JLabel("Nome do Criminoso:");
        lblNomeC.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
        lblNomeC.setBounds(10, 79, 109, 14);
        contentPane.add(lblNomeC);
        
        JLabel lblDataC = new JLabel("Data de Nascimento do Criminoso:");
        lblDataC.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
        lblDataC.setBounds(10, 104, 109, 14);
        contentPane.add(lblDataC);
        
        JLabel lblCPFC = new JLabel("CPF do Criminoso:");
        lblCPFC.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
        lblCPFC.setBounds(10, 129, 109, 14);
        contentPane.add(lblCPFC);
        
        JLabel lblNomeV = new JLabel("Nome da Vítima:");
        lblNomeV.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
        lblNomeV.setBounds(10, 164, 109, 14);
        contentPane.add(lblNomeV);
        
        JLabel lblDataV = new JLabel("Data de Nascimento da Vítima:");
        lblDataV.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
        lblDataV.setBounds(10, 195, 109, 14);
        contentPane.add(lblDataV);
        
        JLabel lblCPFV = new JLabel("CPF da Vítima:");
        lblCPFV.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
        lblCPFV.setBounds(10, 224, 109, 14);
        contentPane.add(lblCPFV);

        JLabel lblArma = new JLabel("Arma Utilizada:");
        lblArma.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
        lblArma.setBounds(10, 254, 109, 14);
        contentPane.add(lblArma);

        cbPesquisar = new JComboBox();
        cbPesquisar.setEditable(true);
        cbPesquisar.setBounds(129, 28, 283, 20);

       contentPane.add(cbPesquisar);

       txtNomeCriminoso = new JTextField();
       txtNomeCriminoso.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
       txtNomeCriminoso.setBounds(129, 76, 365, 20);
        contentPane.add(txtNomeCriminoso);
        txtNomeCriminoso.setColumns(10);

        txtDataNasciCriminoso = new JTextField();
        txtDataNasciCriminoso.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
        txtDataNasciCriminoso.setBounds(129, 101, 100, 20);
        contentPane.add(txtDataNasciCriminoso);
        txtDataNasciCriminoso.setColumns(10);

        txtCPFCriminoso = new JTextField();
        txtCPFCriminoso.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
        txtCPFCriminoso.setBounds(129, 130, 100, 20);
        contentPane.add(txtCPFCriminoso);
        txtCPFCriminoso.setColumns(10);
        
        txtNomeVitima = new JTextField();
        txtNomeVitima.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
        txtNomeVitima.setBounds(129, 160, 365, 20);
        contentPane.add(txtNomeVitima);
        txtNomeVitima.setColumns(10);
        
        txtDataNasciVitima = new JTextField();
        txtDataNasciVitima.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
        txtDataNasciVitima.setBounds(129, 190, 100, 20);
        contentPane.add(txtDataNasciVitima);
        txtDataNasciVitima.setColumns(10);
        
        txtCPFVitima = new JTextField();
        txtCPFVitima.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
        txtCPFVitima.setBounds(129, 220, 365, 20);
        contentPane.add(txtCPFVitima);
        txtCPFVitima.setColumns(10);

        try {
        	txtNomeArma = new JTextField();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        txtNomeArma.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
        txtNomeArma.setBounds(129, 250, 365, 20);
        contentPane.add(txtNomeArma);



        btnSalvar = new JButton("Incluir");
        btnSalvar.setBounds(193, 327, 75, 23);
        btnSalvar.addActionListener(this);
        btnSalvar.setActionCommand("salvar");
        contentPane.add(btnSalvar);

        btnEditar = new JButton("Editar");
        btnEditar.setBounds(280, 327, 75, 23);
        btnEditar.setText("Editar");
        btnEditar.addActionListener(this);
        btnEditar.setActionCommand("editar");
        contentPane.add(btnEditar);

        btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(360, 327, 75, 23);
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(this);
        btnLimpar.setActionCommand("limpar");
        contentPane.add(btnLimpar);

        btnExcluir = new JButton("");
        btnExcluir.setBounds(440, 327, 75, 23);
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(this);
        btnExcluir.setActionCommand("excluir");
        contentPane.add(btnExcluir);

        btnPesquisar = new JButton("Buscar");
        btnPesquisar.setBounds(422, 22, 80, 23);
        btnPesquisar.addActionListener(this);
        btnPesquisar.setActionCommand("pesquisar");
        contentPane.add(btnPesquisar);
        txtID = 0;
        this.carregaLista();
    }
    
    public Criminoso montaCriminoso(){
            //Pega os dados digitados nos campos do formulário e atribui ao objeto da classe Criminoso;
    	List<Criminoso> CriminosoDb = DbOperations.displayRecordsCriminoso();
        for (Criminoso Criminoso : CriminosoDb) {
        	if(this.txtCPFCriminoso.getText().equals(Criminoso.getCPF())) {
        		return null; // ja tem o criminoso cadastrado
        	}
        }     
    	
    	Criminoso c = new Criminoso();
        c.setNome(this.txtNomeCriminoso.getText());
        c.setData(this.txtDataNasciCriminoso.getText());
        c.setCPF(this.txtCPFCriminoso.getText());
       
        return c;
   }
    
    public Criminoso editaCriminoso(int i){
        //Pega os dados digitados nos campos do formulário e atribui ao objeto da classe Evento;
        Criminoso c = new Criminoso();
        
        c.setId_criminoso(i);
        c.setNome(this.txtNomeCriminoso.getText());
        c.setData(this.txtDataNasciCriminoso.getText());
        c.setCPF(this.txtCPFCriminoso.getText());
        
        return c;
    }
    
    public Vitima montaVitima(){
        //Pega os dados digitados nos campos do formulário e atribui ao objeto da classe Criminoso;
         
    	List<Vitima> VitimaDb = DbOperations.displayRecordsVitima();
        for (Vitima Vitima : VitimaDb) {
        	if(this.txtCPFVitima.getText().equals(Vitima.getCPF())) {
        		return null; // ja tem a vitima cadastrada
        	}
        }
    	
    	
    	Vitima c = new Vitima();
        c.setNome(this.txtNomeVitima.getText());
        c.setData(this.txtDataNasciVitima.getText());
        c.setCPF(this.txtCPFVitima.getText());
        
         
         return c;
        }
    
	public Vitima editaVitima(int i){
	    //Pega os dados digitados nos campos do formulário e atribui ao objeto da classe Vitima;
		Vitima c = new Vitima();
		c.setId_vitima(i);
		c.setNome(this.txtNomeVitima.getText());
        c.setData(this.txtDataNasciVitima.getText());
        c.setCPF(this.txtCPFVitima.getText());
	    
	    return c;
	}
	
	public Crime montaCrime(){
	    //Pega os dados digitados nos campos do formulário e atribui ao objeto da classe Crime;
		 
	     
		String a = this.txtCPFCriminoso.getText();
    	
		Criminoso aux1 = null;
		Vitima aux2 = null;
		Arma aux3 = null;
		
    	List<Criminoso> CriminosoDb = DbOperations.displayRecordsCriminoso();
        for (Criminoso Criminoso : CriminosoDb) {
        	if(a.equals(Criminoso.getCPF())) {
        		aux1 = Criminoso;
        		break;
        	}
        }
        
        a = this.txtCPFVitima.getText();
    	
    	List<Vitima> VitimaDb = DbOperations.displayRecordsVitima();
        for (Vitima Vitima : VitimaDb) {
        	if(a.equals(Vitima.getCPF())) {
        		aux2 = Vitima;
        		break;
        	}
        }
        
        a = this.txtNomeArma.getText();
    	
    	List<Arma> ArmaDb = DbOperations.displayRecordsArma();
        for (Arma Arma : ArmaDb) {
        	if(a.equals(Arma.getNome())) {
        		aux3 = Arma;
        		break;
        	}
        }
		 
		 Crime d = new Crime();
		 
		 d.setCriminoso(aux1.getId_criminoso());
	     d.setVitima(aux2.getId_vitima());
	     d.setArma(aux3.getId());
	     
	     return d;
	 }
	

	public Arma montaArma(){
	    //Pega os dados digitados nos campos do formulário e atribui ao objeto da classe Arma;
		 
		 Arma c = new Arma();
	     c.setNome(this.txtNomeArma.getText());

	     return c;
	 }
	
	public Arma editaArma(int i){
		//Pega os dados digitados nos campos do formulário e atribui ao objeto da classe Arma;
		
		Arma c = new Arma();
		
		c.setId(i);
		c.setNome(this.txtNomeArma.getText());
	
		return c;
	}
	

    public Crime retornaID() {
    	
    	int c = (Integer) cbPesquisar.getSelectedItem();
    	
    	List<Crime> CrimeDb = DbOperations.displayRecordsCrime();
        for (Crime Crime : CrimeDb) {
        	if(c == Crime.getId()) {
        		return Crime;
        	}
        }
        return null;
    }

	
    public void carregaCrimeNaTela(Criminoso a, Vitima b, Arma c){
        //Pega os dados digitados nos campos do formulário e atribui ao objeto da classe Evento;
        this.txtNomeCriminoso.setText(a.getNome());
        this.txtDataNasciCriminoso.setText(a.getData());
        this.txtCPFCriminoso.setText(a.getCPF());
        this.txtNomeVitima.setText(b.getNome());
        this.txtDataNasciVitima.setText(b.getData());
        this.txtCPFVitima.setText(b.getCPF());
        this.txtNomeArma.setText(c.getNome());

    }

    public void limpaTela(){
              for(int i = 0; i < contentPane.getComponentCount(); i++){
                    //laço de repetição percorrendo o contentPane - JPanel, o painel principal do form
                    Component c = contentPane.getComponent(i);
                  //Cria um objeto Component c que recebe o componente na posição i do laço for
                    if(c instanceof JTextField){ //se o componente c for uma instância de JTextField
			                JTextField campo = (JTextField) c;
			                //cria uma variável JTextField recebendo o componente c com um cast
			                         campo.setText(null);
                          //apaga o conteúdo do campo JTextField;
                        }
                  }

            }
    public void carregaLista(){
            //Preenche Combobox com registros do banco de dados
        	List<Crime> CrimeBd = DbOperations.displayRecordsCrime();
        	cbPesquisar.removeAllItems();
            for (Crime Crime : CrimeBd) {
                cbPesquisar.addItem(Crime.getId());
            }
         }

 
    public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals(this.btnSalvar.getActionCommand())){
                //Condicional - se clicar no botão Salvar ...
                Arma a = this.montaArma();
                DbOperations.createRecordArma(a);
                
            	Vitima b = this.montaVitima();
            	if(b != null){
            		DbOperations.createRecordVitima(b);
            	}
            	
            	Criminoso c = this.montaCriminoso();
            	if(c != null){
            		DbOperations.createRecordCriminoso(c);
            	}

            	Crime d = this.montaCrime();
            	DbOperations.createRecordCrime(d);
            	
                this.limpaTela();
                this.carregaLista();
                JOptionPane.showMessageDialog(null, "Crime cadastrado...");
              } 
            
            else if(e.getActionCommand().equals(this.btnPesquisar.getActionCommand())){
                //Condicional - se clicar no botão buscar ...
                
            	Crime a = retornaID();
            	
            	if(a == null){
            		JOptionPane.showMessageDialog(null, "Crime nao cadastrado...");
            	}
            	else {
            		JOptionPane.showMessageDialog(null, "Crime encontrado!");
                    
            		Vitima b = DbOperations.findRecordByIdVitima(a.getArma());
                    Criminoso c = DbOperations.findRecordByIdCriminoso(a.getCriminoso());
                    Arma d = DbOperations.findRecordByIdArma(a.getArma());
            		
            		this.carregaCrimeNaTela(c,b,d);
            		
            	}
                
            } 
            
            else if(e.getActionCommand().equals(this.btnLimpar.getActionCommand())) {
            		this.limpaTela();
            } 
            
            
            else if(e.getActionCommand().equals(this.btnExcluir.getActionCommand())){
                //Condicional - se clicar no botão buscar ...
            	Crime a = retornaID();
                
            
                if  (a == null)
                    JOptionPane.showMessageDialog(null, "Crime nao cadastrado...");
                else

                { 
                	JOptionPane.showMessageDialog(null, "Crime Removido!");
                	
                	
                	DbOperations.deleteRecordVitima(a.getVitima());
                	DbOperations.deleteRecordCriminoso(a.getCriminoso());
                	DbOperations.deleteRecordArma(a.getArma());
                	DbOperations.deleteRecordCrime(a.getId());
                    this.limpaTela();
                    this.carregaLista();
                }
            }
            
        if(e.getActionCommand().equals(this.btnEditar.getActionCommand())){
            //Condicional - se clicar no botão buscar ...
            
        	Crime a = retornaID();
            
            if(a == null)
                JOptionPane.showMessageDialog(null, "Crime nao cadastrado...");
            else

            { 
            	JOptionPane.showMessageDialog(null, "Crime editado!");
            	
            	Vitima b = this.editaVitima(a.getId());
            	Arma c = this.editaArma(a.getArma());
            	Criminoso d = this.editaCriminoso(a.getCriminoso());
            	
            	DbOperations.updateRecordVitima(a.getVitima(),b);
            	DbOperations.updateRecordArma(a.getArma(),c);
            	DbOperations.updateRecordCriminoso(a.getCriminoso(),d);
                this.limpaTela();
                this.carregaLista();
            }
        }


    }
    

    
}