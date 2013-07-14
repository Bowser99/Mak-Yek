package NetGames;

import javax.swing.JOptionPane;

import DominioDoProblema.Lance;
import InterfaceGrafica.AtorJogador;
import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.OuvidorProxy;
import br.ufsc.inf.leobr.cliente.Proxy;
import br.ufsc.inf.leobr.cliente.exception.ArquivoMultiplayerException;
import br.ufsc.inf.leobr.cliente.exception.JahConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoJogandoException;
import br.ufsc.inf.leobr.cliente.exception.NaoPossivelConectarException;

public class AtorNetGames implements OuvidorProxy {
	
	protected AtorJogador interfaceGrafica;
	public AtorJogador _unnamed_AtorJogador_;
	protected Proxy proxy;
	protected boolean ehMinhaVez;
	
	public AtorNetGames(AtorJogador interfaceGrafica){
		this.interfaceGrafica=interfaceGrafica;
		this.proxy = Proxy.getInstance();
		this.proxy.addOuvinte(this);
	}

	//de boolean mudei para int
	public int conectar(String servidor, String nome) {
		int resultado=-1;
		try {
			proxy.conectar(servidor, nome);
			resultado=2;
		} catch (JahConectadoException e) {
			resultado=0;
			e.printStackTrace();
		} catch (NaoPossivelConectarException e) {
			resultado=1;
			e.printStackTrace();
		} catch (ArquivoMultiplayerException e) {
			resultado=1;
			e.printStackTrace();
		}
		return resultado;
	}

	public boolean desconectar() {
		throw new UnsupportedOperationException();
	}
	
	public void iniciarPartida() {
		try {
			proxy.iniciarPartida(new Integer(2));
		} catch (NaoConectadoException e) {
			JOptionPane.showMessageDialog(interfaceGrafica.informarJanela(), e.getMessage());
			e.printStackTrace();
		}
	}

	public void receberJogada(Lance aJogada) {
		throw new UnsupportedOperationException();
	}

	public String informarNomeAdversario(String nome) {
		String jogNome1 = proxy.obterNomeAdversario(new Integer(1));
		String jogNome2 = proxy.obterNomeAdversario(new Integer(2));;
		if (jogNome1.equals(nome)){
			return jogNome2;
		} else {
			return jogNome1;
		}
	}

	public void enviaJogada(Lance lance) {
		try {
			//na modelagem esta "jogada" em vez de lance??
			proxy.enviaJogada(lance);
			ehMinhaVez = false;
		} catch (NaoJogandoException e) {
			JOptionPane.showMessageDialog(interfaceGrafica.informarJanela(), e.getMessage());
			e.printStackTrace();
		}
	}
	//Elanne: isso foi gerado pela implementação do ouvidorProxy
	@Override
	public void iniciarNovaPartida(Integer posicao) {
		if(posicao==1)
			ehMinhaVez=true;
		else
				ehMinhaVez=false;
		interfaceGrafica.tratarIniciarPartida(posicao);
		
	}

	@Override
	public void finalizarPartidaComErro(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receberMensagem(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receberJogada(Jogada jogada) {
		//na modelagem está jogada
		ehMinhaVez = true;
		Lance lance = (Lance) jogada;
		interfaceGrafica.receberJogada(lance);
	}

	@Override
	public void tratarConexaoPerdida() {
		JOptionPane.showMessageDialog(interfaceGrafica.informarJanela(),
				"A conexão com o servidor foi perdida, por favor tente novamente mais tarde.");
		
	}

	@Override
	public void tratarPartidaNaoIniciada(String message) {
		// TODO Auto-generated method stub
		
	}
	
	//nao esta na modelagem
	public boolean ehMinhaVez() {
		return ehMinhaVez;
	}

}
