package InterfaceGrafica;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import DominioDoProblema.ImagemTabuleiro;

public class InterfaceMakYek extends JFrame {
	protected AtorJogador atorJog;
	protected JPanel jContentPane = null;
	protected JLabel mapaPosicao[][] = new JLabel[8][8];
	private JLabel vMensagem = null;
	private JMenu menu = null;
	private JMenuBar menuBar=null;
	private JMenuItem menuItemConectar = null;
	private JMenuItem menuItemIniciar = null;
	private JMenuItem menuItemDesconectar = null;
	
	public ImageIcon _unnamed_ImageIcon_;
	public Icon _unnamed_Icon_;
	public JOptionPane _unnamed_JOptionPane_;
	
	private JLabel vPosicao00 = null;
	private JLabel vPosicao01 = null;
	private JLabel vPosicao02 = null;	
	private JLabel vPosicao03 = null;
	private JLabel vPosicao04 = null;
	private JLabel vPosicao05 = null;
	private JLabel vPosicao06 = null;
	private JLabel vPosicao07 = null;

	private JLabel vPosicao10 = null;
	private JLabel vPosicao11 = null;
	private JLabel vPosicao12 = null;	
	private JLabel vPosicao13 = null;
	private JLabel vPosicao14 = null;
	private JLabel vPosicao15 = null;
	private JLabel vPosicao16 = null;
	private JLabel vPosicao17 = null;
	
	private JLabel vPosicao20 = null;
	private JLabel vPosicao21 = null;
	private JLabel vPosicao22 = null;	
	private JLabel vPosicao23 = null;
	private JLabel vPosicao24 = null;
	private JLabel vPosicao25 = null;
	private JLabel vPosicao26 = null;
	private JLabel vPosicao27 = null;
	
	private JLabel vPosicao30 = null;
	private JLabel vPosicao31 = null;
	private JLabel vPosicao32 = null;	
	private JLabel vPosicao33 = null;
	private JLabel vPosicao34 = null;
	private JLabel vPosicao35 = null;
	private JLabel vPosicao36 = null;
	private JLabel vPosicao37 = null;
	
	private JLabel vPosicao40 = null;
	private JLabel vPosicao41 = null;
	private JLabel vPosicao42 = null;	
	private JLabel vPosicao43 = null;
	private JLabel vPosicao44 = null;
	private JLabel vPosicao45 = null;
	private JLabel vPosicao46 = null;
	private JLabel vPosicao47 = null;
	
	private JLabel vPosicao50 = null;
	private JLabel vPosicao51 = null;
	private JLabel vPosicao52 = null;	
	private JLabel vPosicao53 = null;
	private JLabel vPosicao54 = null;
	private JLabel vPosicao55 = null;
	private JLabel vPosicao56 = null;
	private JLabel vPosicao57 = null;
	
	private JLabel vPosicao60 = null;
	private JLabel vPosicao61 = null;
	private JLabel vPosicao62 = null;	
	private JLabel vPosicao63 = null;
	private JLabel vPosicao64 = null;
	private JLabel vPosicao65 = null;
	private JLabel vPosicao66 = null;
	private JLabel vPosicao67 = null;
	
	private JLabel vPosicao70 = null;
	private JLabel vPosicao71 = null;
	private JLabel vPosicao72 = null;	
	private JLabel vPosicao73 = null;
	private JLabel vPosicao74 = null;
	private JLabel vPosicao75 = null;
	private JLabel vPosicao76 = null;
	private JLabel vPosicao77 = null;
	
	public InterfaceMakYek(){
		super();
		initialize();
	}
	
	private void initialize() {
		this.setSize(764, 680);
		this.setContentPane(getJContentPane());
		this.setTitle("Mak-Yek");
		atorJog = new AtorJogador(this);
//		tab = new Tabuleiro();
//		tab.iniciar();
	}
	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			Icon vazia = new ImageIcon(getClass().getResource("posicaoVazia.png"));
			
			
			vPosicao00 = new JLabel();
			vPosicao00.setBounds(new Rectangle(20, 40, 90, 70));
			vPosicao00.setIcon(vazia);				
			vPosicao00.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(0,0); 
				}
			});
			
			vPosicao01 = new JLabel();
			vPosicao01.setBounds(new Rectangle(108, 40, 90, 70));
			vPosicao01.setIcon(vazia);				
			vPosicao01.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(0,1); 
				}
			});
			
			vPosicao02 = new JLabel();
			vPosicao02.setBounds(new Rectangle(196, 40, 90, 70));
			vPosicao02.setIcon(vazia);				
			vPosicao02.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(0,2); 
				}
			});
			
			vPosicao03 = new JLabel();
			vPosicao03.setBounds(new Rectangle(284, 40, 90, 70));
			vPosicao03.setIcon(vazia);				
			vPosicao03.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(0,3); 
				}
			});
			
			vPosicao04 = new JLabel();
			vPosicao04.setBounds(new Rectangle(372, 40, 90, 70));
			vPosicao04.setIcon(vazia);				
			vPosicao04.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(0,4); 
				}
			});
			
			vPosicao05 = new JLabel();
			vPosicao05.setBounds(new Rectangle(460, 40, 90, 70));
			vPosicao05.setIcon(vazia);				
			vPosicao05.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(0,5); 
				}
			});
			
			vPosicao06 = new JLabel();
			vPosicao06.setBounds(new Rectangle(548, 40, 90, 70));
			vPosicao06.setIcon(vazia);				
			vPosicao06.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(0,6); 
				}
			});
			
			vPosicao07 = new JLabel();
			vPosicao07.setBounds(new Rectangle(636, 40, 90, 70));
			vPosicao07.setIcon(vazia);				
			vPosicao07.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(0,7); 
				}
			});
			
			vPosicao10 = new JLabel();
			vPosicao10.setBounds(new Rectangle(20, 110, 90, 70));
			vPosicao10.setIcon(vazia);				
			vPosicao10.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(1,0); 
				}
			});
			
			vPosicao11 = new JLabel();
			vPosicao11.setBounds(new Rectangle(108, 110, 90, 70));
			vPosicao11.setIcon(vazia);				
			vPosicao11.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(1,1); 
				}
			});
			vPosicao12 = new JLabel();
			vPosicao12.setBounds(new Rectangle(196, 110, 90, 70));
			vPosicao12.setIcon(vazia);				
			vPosicao12.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(1,2); 
				}
			});
			
			vPosicao13 = new JLabel();
			vPosicao13.setBounds(new Rectangle(284, 110, 90, 70));
			vPosicao13.setIcon(vazia);				
			vPosicao13.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(1,3); 
				}
			});
			
			vPosicao14 = new JLabel();
			vPosicao14.setBounds(new Rectangle(372, 110, 90, 70));
			vPosicao14.setIcon(vazia);				
			vPosicao14.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(1,4); 
				}
			});
			
			vPosicao15 = new JLabel();
			vPosicao15.setBounds(new Rectangle(460, 110, 90, 70));
			vPosicao15.setIcon(vazia);				
			vPosicao15.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(1,5); 
				}
			});
			
			vPosicao16 = new JLabel();
			vPosicao16.setBounds(new Rectangle(548, 110, 90, 70));
			vPosicao16.setIcon(vazia);				
			vPosicao16.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(1,6); 
				}
			});
			
			vPosicao17 = new JLabel();
			vPosicao17.setBounds(new Rectangle(636, 110, 90, 70));
			vPosicao17.setIcon(vazia);				
			vPosicao17.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(1,7); 
				}
			});
			
			vPosicao20 = new JLabel();
			vPosicao20.setBounds(new Rectangle(
					20, 180, 90, 70));
			vPosicao20.setIcon(vazia);				
			vPosicao20.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(2,0); 
				}
			});
			
			vPosicao21 = new JLabel();
			vPosicao21.setBounds(new Rectangle(
					108, 180, 90, 70));
			vPosicao21.setIcon(vazia);				
			vPosicao21.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(2,1); 
				}
			});
			
			vPosicao22 = new JLabel();
			vPosicao22.setBounds(new Rectangle(
					196, 180, 90, 70));
			vPosicao22.setIcon(vazia);				
			vPosicao22.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(2,2); 
				}
			});
			
			vPosicao23 = new JLabel();
			vPosicao23.setBounds(new Rectangle(
					284, 180, 90, 70));
			vPosicao23.setIcon(vazia);				
			vPosicao23.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(2,3); 
				}
			});
			
			vPosicao24 = new JLabel();
			vPosicao24.setBounds(new Rectangle(
					372, 180, 90, 70));
			vPosicao24.setIcon(vazia);				
			vPosicao24.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(2,4); 
				}
			});
			
			vPosicao25 = new JLabel();
			vPosicao25.setBounds(new Rectangle(
					460, 180, 90, 70));
			vPosicao25.setIcon(vazia);				
			vPosicao25.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(2,5); 
				}
			});
			
			vPosicao26 = new JLabel();
			vPosicao26.setBounds(new Rectangle(
					548, 180, 90, 70));
			vPosicao26.setIcon(vazia);				
			vPosicao26.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(2,6); 
				}
			});
			
			vPosicao27 = new JLabel();
			vPosicao27.setBounds(new Rectangle(
					636, 180, 90, 70));
			vPosicao27.setIcon(vazia);				
			vPosicao27.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(2,7); 
				}
			});
			
			vPosicao30 = new JLabel();
			vPosicao30.setBounds(new Rectangle(
					20, 250, 90, 70));
			vPosicao30.setIcon(vazia);				
			vPosicao30.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(3,0); 
				}
			});
			
			vPosicao31 = new JLabel();
			vPosicao31.setBounds(new Rectangle(
					108, 250, 90, 70));
			vPosicao31.setIcon(vazia);				
			vPosicao31.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(3,1); 
				}
			});
			
			vPosicao32 = new JLabel();
			vPosicao32.setBounds(new Rectangle(
					196, 250, 90, 70));
			vPosicao32.setIcon(vazia);				
			vPosicao32.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(3,2); 
				}
			});
			
			vPosicao33 = new JLabel();
			vPosicao33.setBounds(new Rectangle(
					284, 250, 90, 70));
			vPosicao33.setIcon(vazia);				
			vPosicao33.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(3,3); 
				}
			});
			
			vPosicao34 = new JLabel();
			vPosicao34.setBounds(new Rectangle(
					372, 250, 90, 70));
			vPosicao34.setIcon(vazia);				
			vPosicao34.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(3,4); 
				}
			});
			
			vPosicao35 = new JLabel();
			vPosicao35.setBounds(new Rectangle(
					460, 250, 90, 70));
			vPosicao35.setIcon(vazia);				
			vPosicao35.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(3,5); 
				}
			});
			
			vPosicao36 = new JLabel();
			vPosicao36.setBounds(new Rectangle(
					548, 250, 90, 70));
			vPosicao36.setIcon(vazia);				
			vPosicao36.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(3,6); 
				}
			});
			
			vPosicao37 = new JLabel();
			vPosicao37.setBounds(new Rectangle(
					636, 250, 90, 70));
			vPosicao37.setIcon(vazia);				
			vPosicao37.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(3,7); 
				}
			});
			
			vPosicao40 = new JLabel();
			vPosicao40.setBounds(new Rectangle(
					20, 320, 90, 70));
			vPosicao40.setIcon(vazia);				
			vPosicao40.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(4,0); 
				}
			});
			
			vPosicao41 = new JLabel();
			vPosicao41.setBounds(new Rectangle(
					108, 320, 90, 70));
			vPosicao41.setIcon(vazia);				
			vPosicao41.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(4,1); 
				}
			});
			
			vPosicao42 = new JLabel();
			vPosicao42.setBounds(new Rectangle(
					196, 320, 90, 70));
			vPosicao42.setIcon(vazia);				
			vPosicao42.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(4,2); 
				}
			});
			
			vPosicao43 = new JLabel();
			vPosicao43.setBounds(new Rectangle(
					284, 320, 90, 70));
			vPosicao43.setIcon(vazia);				
			vPosicao43.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(4,3); 
				}
			});
			
			vPosicao44 = new JLabel();
			vPosicao44.setBounds(new Rectangle(
					372, 320, 90, 70));
			vPosicao44.setIcon(vazia);				
			vPosicao44.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(4,4); 
				}
			});
			
			vPosicao45 = new JLabel();
			vPosicao45.setBounds(new Rectangle(
					460, 320, 90, 70));
			vPosicao45.setIcon(vazia);				
			vPosicao45.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(4,5); 
				}
			});
			
			vPosicao46 = new JLabel();
			vPosicao46.setBounds(new Rectangle(
					548, 320, 90, 70));
			vPosicao46.setIcon(vazia);				
			vPosicao46.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(4,6); 
				}
			});
			
			vPosicao47 = new JLabel();
			vPosicao47.setBounds(new Rectangle(
					636, 320, 90, 70));
			vPosicao47.setIcon(vazia);				
			vPosicao47.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(4,7); 
				}
			});
			
			vPosicao50 = new JLabel();
			vPosicao50.setBounds(new Rectangle(
					20, 390, 90, 70));
			vPosicao50.setIcon(vazia);				
			vPosicao50.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(5,0); 
				}
			});
			
			vPosicao51 = new JLabel();
			vPosicao51.setBounds(new Rectangle(
					108, 390, 90, 70));
			vPosicao51.setIcon(vazia);				
			vPosicao51.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(5,1); 
				}
			});
			
			vPosicao52 = new JLabel();
			vPosicao52.setBounds(new Rectangle(
					196, 390, 90, 70));
			vPosicao52.setIcon(vazia);				
			vPosicao52.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(5,2); 
				}
			});
			
			vPosicao53 = new JLabel();
			vPosicao53.setBounds(new Rectangle(
					284, 390, 90, 70));
			vPosicao53.setIcon(vazia);				
			vPosicao53.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(5,3); 
				}
			});
			
			vPosicao54 = new JLabel();
			vPosicao54.setBounds(new Rectangle(
					372, 390, 90, 70));
			vPosicao54.setIcon(vazia);				
			vPosicao54.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(5,4); 
				}
			});
			
			vPosicao55 = new JLabel();
			vPosicao55.setBounds(new Rectangle(
					460, 390, 90, 70));
			vPosicao55.setIcon(vazia);				
			vPosicao55.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(5,5); 
				}
			});
			
			vPosicao56 = new JLabel();
			vPosicao56.setBounds(new Rectangle(
					548, 390, 90, 70));
			vPosicao56.setIcon(vazia);				
			vPosicao56.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(5,6); 
				}
			});
			
			vPosicao57 = new JLabel();
			vPosicao57.setBounds(new Rectangle(
					636, 390, 90, 70));
			vPosicao57.setIcon(vazia);				
			vPosicao57.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(5,7); 
				}
			});
			
			vPosicao60 = new JLabel();
			vPosicao60.setBounds(new Rectangle(
					20, 460, 90, 70));
			vPosicao60.setIcon(vazia);				
			vPosicao60.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(6,0); 
				}
			});
			
			vPosicao61 = new JLabel();
			vPosicao61.setBounds(new Rectangle(
					108, 460, 90, 70));
			vPosicao61.setIcon(vazia);				
			vPosicao61.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(6,1); 
				}
			});
			
			vPosicao62 = new JLabel();
			vPosicao62.setBounds(new Rectangle(
					196, 460, 90, 70));
			vPosicao62.setIcon(vazia);				
			vPosicao62.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(6,2); 
				}
			});
			
			vPosicao63 = new JLabel();
			vPosicao63.setBounds(new Rectangle(
					284, 460, 90, 70));
			vPosicao63.setIcon(vazia);				
			vPosicao63.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(6,3); 
				}
			});
			
			vPosicao64 = new JLabel();
			vPosicao64.setBounds(new Rectangle(
					372, 460, 90, 70));
			vPosicao64.setIcon(vazia);				
			vPosicao64.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(6,4); 
				}
			});
			
			vPosicao65 = new JLabel();
			vPosicao65.setBounds(new Rectangle(
					460, 460, 90, 70));
			vPosicao65.setIcon(vazia);				
			vPosicao65.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(6,5); 
				}
			});
			
			vPosicao66 = new JLabel();
			vPosicao66.setBounds(new Rectangle(
					548, 460, 90, 70));
			vPosicao66.setIcon(vazia);				
			vPosicao66.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(6,6); 
				}
			});
			
			vPosicao67 = new JLabel();
			vPosicao67.setBounds(new Rectangle(
					636, 460, 90, 70));
			vPosicao67.setIcon(vazia);				
			vPosicao67.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(6,7); 
				}
			});
			
			vPosicao70 = new JLabel();
			vPosicao70.setBounds(new Rectangle(
					20, 530, 90, 70));
			vPosicao70.setIcon(vazia);				
			vPosicao70.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(7,0); 
				}
			});
			
			vPosicao71 = new JLabel();
			vPosicao71.setBounds(new Rectangle(
					108, 530, 90, 70));
			vPosicao71.setIcon(vazia);				
			vPosicao71.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(7,1); 
				}
			});
			
			vPosicao72 = new JLabel();
			vPosicao72.setBounds(new Rectangle(
					196, 530, 90, 70));
			vPosicao72.setIcon(vazia);				
			vPosicao72.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(7,2); 
				}
			});
			
			vPosicao73 = new JLabel();
			vPosicao73.setBounds(new Rectangle(
					284, 530, 90, 70));
			vPosicao73.setIcon(vazia);				
			vPosicao73.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(7,3); 
				}
			});
			
			vPosicao74 = new JLabel();
			vPosicao74.setBounds(new Rectangle(
					372, 530, 90, 70));
			vPosicao74.setIcon(vazia);				
			vPosicao74.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(7,4); 
				}
			});
			
			vPosicao75 = new JLabel();
			vPosicao75.setBounds(new Rectangle(
					460, 530, 90, 70));
			vPosicao75.setIcon(vazia);				
			vPosicao75.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(7,5); 
				}
			});
			
			vPosicao76 = new JLabel();
			vPosicao76.setBounds(new Rectangle(
					548, 530, 90, 70));
			vPosicao76.setIcon(vazia);				
			vPosicao76.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(7,6); 
				}
			});
			
			vPosicao77 = new JLabel();
			vPosicao77.setBounds(new Rectangle(
					636, 530, 90, 70));
			vPosicao77.setIcon(vazia);				
			vPosicao77.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					selecionaPosicao(7,7); 
				}
			});
			
			menuBar = new JMenuBar();
			menuBar.add(this.getMenu());
		    this.setJMenuBar(menuBar);

			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(vPosicao00, null);
			jContentPane.add(vPosicao01, null);
			jContentPane.add(vPosicao02, null);
			jContentPane.add(vPosicao03, null);
			jContentPane.add(vPosicao04, null);
			jContentPane.add(vPosicao05, null);
			jContentPane.add(vPosicao06, null);
			jContentPane.add(vPosicao07, null);
			
			jContentPane.add(vPosicao10, null);
			jContentPane.add(vPosicao11, null);
			jContentPane.add(vPosicao12, null);
			jContentPane.add(vPosicao13, null);
			jContentPane.add(vPosicao14, null);
			jContentPane.add(vPosicao15, null);
			jContentPane.add(vPosicao16, null);
			jContentPane.add(vPosicao17, null);
			
			jContentPane.add(vPosicao20, null);
			jContentPane.add(vPosicao21, null);
			jContentPane.add(vPosicao22, null);
			jContentPane.add(vPosicao23, null);
			jContentPane.add(vPosicao24, null);
			jContentPane.add(vPosicao25, null);
			jContentPane.add(vPosicao26, null);
			jContentPane.add(vPosicao27, null);
			
			jContentPane.add(vPosicao30, null);
			jContentPane.add(vPosicao31, null);
			jContentPane.add(vPosicao32, null);
			jContentPane.add(vPosicao33, null);
			jContentPane.add(vPosicao34, null);
			jContentPane.add(vPosicao35, null);
			jContentPane.add(vPosicao36, null);
			jContentPane.add(vPosicao37, null);
			
			jContentPane.add(vPosicao40, null);
			jContentPane.add(vPosicao41, null);
			jContentPane.add(vPosicao42, null);
			jContentPane.add(vPosicao43, null);
			jContentPane.add(vPosicao44, null);
			jContentPane.add(vPosicao45, null);
			jContentPane.add(vPosicao46, null);
			jContentPane.add(vPosicao47, null);
			
			jContentPane.add(vPosicao50, null);
			jContentPane.add(vPosicao51, null);
			jContentPane.add(vPosicao52, null);
			jContentPane.add(vPosicao53, null);
			jContentPane.add(vPosicao54, null);
			jContentPane.add(vPosicao55, null);
			jContentPane.add(vPosicao56, null);
			jContentPane.add(vPosicao57, null);
			
			jContentPane.add(vPosicao60, null);
			jContentPane.add(vPosicao61, null);
			jContentPane.add(vPosicao62, null);
			jContentPane.add(vPosicao63, null);
			jContentPane.add(vPosicao64, null);
			jContentPane.add(vPosicao65, null);
			jContentPane.add(vPosicao66, null);
			jContentPane.add(vPosicao67, null);
			
			jContentPane.add(vPosicao70, null);
			jContentPane.add(vPosicao71, null);
			jContentPane.add(vPosicao72, null);
			jContentPane.add(vPosicao73, null);
			jContentPane.add(vPosicao74, null);
			jContentPane.add(vPosicao75, null);
			jContentPane.add(vPosicao76, null);
			jContentPane.add(vPosicao77, null);
			
			
			
			mapaPosicao[0][0] = vPosicao00;
			mapaPosicao[0][1] = vPosicao01;
			mapaPosicao[0][2] = vPosicao02;
			mapaPosicao[0][3] = vPosicao03;
			mapaPosicao[0][4] = vPosicao04;
			mapaPosicao[0][5] = vPosicao05;
			mapaPosicao[0][6] = vPosicao06;
			mapaPosicao[0][7] = vPosicao07;
			
			mapaPosicao[1][0] = vPosicao10;
			mapaPosicao[1][1] = vPosicao11;
			mapaPosicao[1][2] = vPosicao12;
			mapaPosicao[1][3] = vPosicao13;
			mapaPosicao[1][4] = vPosicao14;
			mapaPosicao[1][5] = vPosicao15;
			mapaPosicao[1][6] = vPosicao16;
			mapaPosicao[1][7] = vPosicao17;
			
			mapaPosicao[2][0] = vPosicao20;
			mapaPosicao[2][1] = vPosicao21;
			mapaPosicao[2][2] = vPosicao22;
			mapaPosicao[2][3] = vPosicao23;
			mapaPosicao[2][4] = vPosicao24;
			mapaPosicao[2][5] = vPosicao25;
			mapaPosicao[2][6] = vPosicao26;
			mapaPosicao[2][7] = vPosicao27;
			
			mapaPosicao[3][0] = vPosicao30;
			mapaPosicao[3][1] = vPosicao31;
			mapaPosicao[3][2] = vPosicao32;
			mapaPosicao[3][3] = vPosicao33;
			mapaPosicao[3][4] = vPosicao34;
			mapaPosicao[3][5] = vPosicao35;
			mapaPosicao[3][6] = vPosicao36;
			mapaPosicao[3][7] = vPosicao37;
			
			mapaPosicao[4][0] = vPosicao40;
			mapaPosicao[4][1] = vPosicao41;
			mapaPosicao[4][2] = vPosicao42;
			mapaPosicao[4][3] = vPosicao43;
			mapaPosicao[4][4] = vPosicao44;
			mapaPosicao[4][5] = vPosicao45;
			mapaPosicao[4][6] = vPosicao46;
			mapaPosicao[4][7] = vPosicao47;
			
			mapaPosicao[5][0] = vPosicao50;
			mapaPosicao[5][1] = vPosicao51;
			mapaPosicao[5][2] = vPosicao52;
			mapaPosicao[5][3] = vPosicao53;
			mapaPosicao[5][4] = vPosicao54;
			mapaPosicao[5][5] = vPosicao55;
			mapaPosicao[5][6] = vPosicao56;
			mapaPosicao[5][7] = vPosicao57;
			
			mapaPosicao[6][0] = vPosicao60;
			mapaPosicao[6][1] = vPosicao61;
			mapaPosicao[6][2] = vPosicao62;
			mapaPosicao[6][3] = vPosicao63;
			mapaPosicao[6][4] = vPosicao64;
			mapaPosicao[6][5] = vPosicao65;
			mapaPosicao[6][6] = vPosicao66;
			mapaPosicao[6][7] = vPosicao67;

			mapaPosicao[7][0] = vPosicao70;
			mapaPosicao[7][1] = vPosicao71;
			mapaPosicao[7][2] = vPosicao72;
			mapaPosicao[7][3] = vPosicao73;
			mapaPosicao[7][4] = vPosicao74;
			mapaPosicao[7][5] = vPosicao75;
			mapaPosicao[7][6] = vPosicao76;
			mapaPosicao[7][7] = vPosicao77;
		}
		return jContentPane;
	}
	
	private JMenu getMenu() {
		if (menu == null) {
			menu = new JMenu();
			menu.setText("Jogo");
			menu.setBounds(new Rectangle(1, 0, 57, 21));
			menu.add(getMenuConectar());
			menu.add(getMenuIniciar());
			menu.add(getMenuDesconectar());

		}
		return menu;
	}
	
	private JMenuItem getMenuIniciar(){
		if (menuItemIniciar == null) {
			menuItemIniciar = new JMenuItem();
			menuItemIniciar.setText("Iniciar");
			menuItemIniciar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					iniciarPartida();
				}
			});
		}
		return menuItemIniciar;
	}
	
	private JMenuItem getMenuConectar(){
		if (menuItemConectar == null) {
			menuItemConectar = new JMenuItem();
			menuItemConectar.setText("Conectar");
			menuItemConectar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					conectar();
				}
			});
		}
		return menuItemConectar;
	}
	
	private JMenuItem getMenuDesconectar(){
		if (menuItemDesconectar == null) {
			menuItemDesconectar = new JMenuItem();
			menuItemDesconectar.setText("Desconectar");
			menuItemDesconectar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					desconectar();
				}
			});
		}
		return menuItemDesconectar;
	}

	public void exibirEstado() {
		ImagemTabuleiro estado = atorJog.informarEstado();
		atualizaTela(estado);
	}

	public void conectar() {
		int resultado = atorJog.conectar();
		this.notifica(resultado);
	}

	public String solicitaIdJogador() {
		String nome= "jogador";
		nome = JOptionPane.showInputDialog(this, ("Insira o nome do jogador"));
		return nome;
	}

	public String solicitaIdServidor() {
		String idServidor = ("venus.inf.ufsc.br");
		idServidor = JOptionPane.showInputDialog(this, ("Insira o endereço do servidor. Se servidor local escreva localhost"), idServidor);
		return idServidor;
	}

	public void notifica(int resultado) {
		switch (resultado) {
		case 0:  JOptionPane.showMessageDialog(this, "Conexão já estabelecida anteriormente"); break;
		case 1:  JOptionPane.showMessageDialog(this, "Falha ao tentar conectar."); break;
		case 2:  JOptionPane.showMessageDialog(this, "Êxito em efetuar conexão"); break;
		case 3:  JOptionPane.showMessageDialog(this, "Cancelado iniciar partida"); break;
		case 4:  JOptionPane.showMessageDialog(this, "Não há conexão para iniciar partida"); break;
		case 5:  JOptionPane.showMessageDialog(this, "Êxito em iniciar partida"); break;
		case 10: JOptionPane.showMessageDialog(this, "Movimento inválido");
		}
    
	}

	public void iniciarPartida() {
		int resultado = atorJog.iniciarPartida();
		this.notifica(resultado);
	}

	public void desconectar() {
		throw new UnsupportedOperationException();
	}

	public void selecionaPosicao(int linha, int coluna) {
		int resultado = atorJog.selecionaPosicao(linha, coluna);
		if(resultado!=10)
			this.exibirEstado();
		else
			this.notifica(resultado);
	}

	public void atualizaTela(ImagemTabuleiro estado) {
		int valor;
		Icon branca = new ImageIcon(getClass().getResource("peca-Branca.png"));
		Icon preta = new ImageIcon(getClass().getResource("peca-Preta.png"));
		Icon vazia = new ImageIcon(getClass().getResource("posicaoVazia.png"));
		Icon brancaSelect = new ImageIcon(getClass().getResource("peca-Branca-Selecionada.png"));
		Icon pretaSelect = new ImageIcon(getClass().getResource("peca-Preta-Selecionada.png"));
		//vMensagem.setText(estado.informarMensagem());
		for (int linha=0; linha<8; linha++){
			for (int coluna=0; coluna<8; coluna++){
				valor = estado.informarValor(linha, coluna);
				
				switch (valor){
				case 0: mapaPosicao[(linha)][(coluna)].setIcon(vazia);
				break;
				case 1: mapaPosicao[(linha)][(coluna)].setIcon(branca);
				break;
				case 2: mapaPosicao[(linha)][(coluna)].setIcon(preta);
				break;
				case 3: mapaPosicao[(linha)][(coluna)].setIcon(brancaSelect);
				break;
				case 4: mapaPosicao[(linha)][(coluna)].setIcon(pretaSelect);
				}
			}
		}
	}

	public void desejaIniciarPartida() {
		throw new UnsupportedOperationException();
	}

	public void confirmaInicioPartida() {
		throw new UnsupportedOperationException();
	}

	public void cancelaInicioPartida() {
		throw new UnsupportedOperationException();
	}
}
