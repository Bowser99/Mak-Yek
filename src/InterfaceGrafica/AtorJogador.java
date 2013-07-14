package InterfaceGrafica;

import DominioDoProblema.ImagemTabuleiro;
import DominioDoProblema.Lance;
import DominioDoProblema.Tabuleiro;
import NetGames.AtorNetGames;

public class AtorJogador {
	protected Tabuleiro tab;
	protected String nome;
	protected AtorNetGames rede;
	protected InterfaceMakYek janela;
	public Tabuleiro _unnamed_Tabuleiro_;
	public AtorNetGames _unnamed_AtorNetGames_;
	
	public AtorJogador (InterfaceMakYek janela){
		super();
		rede = new AtorNetGames(this);
		tab = new Tabuleiro();
		tab.iniciar();
		this.janela = janela;
	}

	public int conectar() {
		int resultado = -1;
		boolean conectado = tab.isConectado();
		if(!conectado){
			String servidor = this.solicitaDadosConexao();
			/*resultado:
			0 - já conectado
			1 - falha conexão
			2 - êxito conexão
			*/
			resultado = rede.conectar(servidor, nome);
			if(resultado==2){
				conectado = true;
				tab.estabeleceConectado(conectado);
				//janela.desejaIniciarPartida();
				//nao sei como fazer iniciarPartida com frag combinado sequencial
			}
		}
		
		return resultado;
	}

	public String solicitaDadosConexao() {
		nome = janela.solicitaIdJogador();
		String servidor = janela.solicitaIdServidor();
		
		return servidor;
	}

	public int iniciarPartida() {
		boolean interromper = false;
		boolean conectado = false;
		int resultado=-1;
		
		boolean andamento = tab.isJogoEmAndamento();
		if(andamento)
			interromper = avaliaInterrupcao();
		else
			conectado = tab.isConectado();
		
		if(interromper || (!andamento && conectado)){
			resultado = 5;
			rede.iniciarPartida();
		}else
			resultado = 4;
		
		return resultado;
	}

	public boolean avaliaInterrupcao() {
		return true;
	}

	public int desconectar() {
		throw new UnsupportedOperationException();
	}

	public int selecionaPosicao(int linha, int coluna) {
		int resultado=8;
		if(rede.ehMinhaVez()){
			resultado = tab.selecionaPosicao(linha, coluna);
			if(resultado==9){//é 10, mas só para teste
				rede.enviaJogada(tab.informaJogada());
			}
		}	
		return resultado;
	}

	public void receberJogada(Lance jogada) {
		tab.receberJogada(jogada);
		//na modelagem o tabuleiro esta apontando diretamente a interface??
		janela.exibirEstado();
	}

	public void tratarIniciarPartida(int posicao) {
		tab.esvaziar();
		tab.criaJogador(nome);
		String nomeOutro = rede.informarNomeAdversario(nome);
		tab.criaJogador(nomeOutro);
		tab.habilitar(posicao);
		janela.exibirEstado();
	}

	public ImagemTabuleiro informarEstado() {
		return tab.informarEstado();
	}

	public int cancelaInicioPartida() {
		/*resultado:
		3 - cancelado iniciar partida*/
		return 3;
	}

	public InterfaceMakYek informarJanela() {
		return janela;
	}
}
