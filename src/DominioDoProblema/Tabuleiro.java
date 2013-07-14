package DominioDoProblema;

import java.util.Vector;

import InterfaceGrafica.AtorJogador;

public class Tabuleiro {
	protected Posicao posicoes[][] = new Posicao[8][8];
	protected boolean jogoEmAndamento = false;
	protected boolean conectado;
	protected Jogador jogador1;
	protected Jogador jogador2;
	protected boolean _vencedor;
	protected Lance lance;
	protected boolean primeiroClick = true; // não ha na modelagem

	public Vector<Jogador> _unnamed_Jogador_ = new Vector<Jogador>();
	public ImagemTabuleiro _unnamed_ImagemTabuleiro_;
	public Vector<Posicao> _unnamed_Posicao_ = new Vector<Posicao>();
	public AtorJogador _unnamed_AtorJogador_;
	public Lance _unnamed_Lance_;

	public boolean isConectado() {
		return this.conectado;
	}

	public void estabeleceConectado(boolean conectado) {
		this.conectado = conectado;
	}

	public boolean isJogoEmAndamento() {
		return this.jogoEmAndamento;
	}

	public void encerrarPartidaAndamento() {
		throw new UnsupportedOperationException();
	}

	public int tratarLance(int aLinhaDestino, int aColunaDestino,
			Jogador aJogadorDaVez) {
		throw new UnsupportedOperationException();
	}

	public int selecionaPosicao(int linha, int coluna) {
		int resultado = -1;
	
		boolean vez = jogador1.informaDaVez();
		
		if (vez || jogador2.informaDaVez()) {
			// boolean primeiro = primeiroClick() acho q não será necessário;
			if (primeiroClick){
				resultado = this.trataPrimeiroClick(linha, coluna);
			}
			else {
				resultado = this.verficaPossibilidadeMovimento(linha, coluna);
				if (resultado == 9) {
					
					// tratarLance
					//verificaTerminoPartida()
					//if(resultado==12)
					this.passaVez();
				}
			}
		}

		return resultado;
	}

	public ImagemTabuleiro informarEstado() {
		ImagemTabuleiro imagemTabuleiro;
		boolean vez;
		String nome;
		boolean vencedor;
		boolean ocupada;
		Posicao posicao;
		String corPeca;

		imagemTabuleiro = new ImagemTabuleiro();
		jogoEmAndamento = isJogoEmAndamento();

		if (jogoEmAndamento) {
			vez = jogador1.informaDaVez();
			if (vez)
				nome = jogador1.informarNome();
			else
				nome = jogador2.informarNome();

			imagemTabuleiro.receberMensagem(nome);
		}

		for (int linha = 0; linha < 8; linha++) {
			for (int coluna = 0; coluna < 8; coluna++) {
				posicao = encontraPosicao(linha, coluna);
				ocupada = posicao.temPeca();

				if (ocupada) {
					corPeca = posicao.informarCorPeca();

					if (posicao.getPeca().getSelecionda()) {
						corPeca = corPeca + "Select";
					}
				}
				// não está na modelagem
				else
					corPeca = "semCor"; // não há peça na posição

				imagemTabuleiro.defineValor(linha, coluna, corPeca);
			}
		}

		return imagemTabuleiro;
	}

	private Posicao encontraPosicao(int linha, int coluna) {
		return posicoes[linha][coluna];
	}

	private boolean possibilidadeCaptura(Posicao aPosicaoOrigem,
			Posicao aPosicaoDestino) {
		throw new UnsupportedOperationException();
	}

	private void realizaCaptura(Posicao aPosicaoDestino, Posicao aPosicaoOrigem) {
		throw new UnsupportedOperationException();
	}

	public boolean verificaVencedor() {
		throw new UnsupportedOperationException();
	}

	/*
	 * public boolean primeiroClick() { return true; }acho q não será necessário
	 * esse método se tiver o atributo primeiroClick
	 */

	public int trataPrimeiroClick(int linha, int coluna) {
		int resultado = 6; // posicao sem peça
		String corJog;
		Posicao posicao = this.encontraPosicao(linha, coluna);
		Peca temPeca = posicao.getPeca();
		if (temPeca != null) {
			String corPeca = posicao.informarCorPeca();
			boolean vez = jogador1.informaDaVez();
			
			if (vez)
				corJog = jogador1.informaCorJogador();
			else
				corJog = jogador2.informaCorJogador();

			boolean corValida = this.confereIgualdadeCorPeca(corPeca, corJog);

			if (corValida) {
				temPeca.setSelecionda(true);
				lance = new Lance();
				lance.informaPosicaoOrigem(linha, coluna);
				this.modificaPrimeiroClick(false);
				resultado = 8; // peça valida
			} else
				resultado = 7; // peça não é do jogador

		}
		return resultado;
	}

	public void passaVez() {
		boolean vez = jogador1.informaDaVez();
		if(vez){
			jogador1.desabilitar();
			jogador2.habilitar();
		}else{
			jogador2.desabilitar();
			jogador1.habilitar();
		}	
	}

	public void iniciar() {
		for (int linha = 0; linha < 8; linha++) {
			for (int coluna = 0; coluna < 8; coluna++) {
				posicoes[(linha)][(coluna)] = new Posicao();
			}
		}
	}

	public void criaJogador(String nome) {
		if (jogador1 == null) {
			jogador1 = new Jogador();
			jogador1.iniciar();
			jogador1.setNome(nome);
		} else {
			jogador2 = new Jogador();
			jogador2.iniciar();
			jogador2.setNome(nome);
		}
	}

	public boolean partidaEmAndamento() {
		throw new UnsupportedOperationException();
	}

	public void modificaPrimeiroClick(boolean primeiroClick) {
		this.primeiroClick = primeiroClick;
	}

	public void defineVencedor() {
		throw new UnsupportedOperationException();
	}

	public boolean confereIgualdadeCorPeca(String corPeca, String corJog) {
		if (corPeca.equals(corJog))
			return true;
		else
			return false;
	}

	public void definePosicaoCaptura() {
		throw new UnsupportedOperationException();
	}

	public int verficaPossibilidadeMovimento(int linhaDestino, int colunaDestino) {
		int linhaOrigem;
		int colunaOrigem;
		boolean temPeca = false;
		Peca peca = null;
		int resultado = -1;

		linhaOrigem = lance.getLinhaOrigem();
		colunaOrigem = lance.getColunaOrigem();

		if (linhaOrigem == linhaDestino) {
			while (colunaOrigem < colunaDestino && !temPeca) {
				temPeca = encontraPosicao(linhaOrigem, colunaOrigem+1)
				.temPeca();
				colunaOrigem++;
				/*ERA ASSIM NA MODELAGEM
				 * peca = encontraPosicao(linhaOrigem, colunaOrigem).getPeca();
				if (peca != null)
					temPeca = true;
				else
					colunaOrigem++;*/
			}
		} else if(colunaOrigem==colunaDestino){
			if(linhaOrigem>linhaDestino){
				while (linhaOrigem > linhaDestino && temPeca == false) {
					temPeca = encontraPosicao(linhaOrigem + 1, colunaOrigem)
					.temPeca();
					linhaOrigem--;
				}
			}
				else{
					while (linhaOrigem < linhaDestino && temPeca == false) {
						temPeca = encontraPosicao(linhaOrigem + 1, colunaOrigem).temPeca();
						linhaOrigem++;
					}	
				/*ERA ASSIM NA MODELAGEM
				 * peca = encontraPosicao(linhaOrigem+1,
				 * colunaOrigem).getPeca(); if(encontraPosicao(linhaOrigem+1,
				 * colunaOrigem).temPeca()) temPeca = true; else linhaOrigem++;
				 */
			}
		}else
			temPeca=true; //evita movimento em diagonal!
		
		if (temPeca == false) {
			resultado = 9;
			lance.informarPosicaoDestino(linhaDestino, colunaDestino);
			this.movimentaPecas(lance.getLinhaOrigem(),lance.getColunaOrigem(),linhaDestino,colunaDestino);
			this.modificaPrimeiroClick(true);
		} else
			resultado = 10;

		return resultado;
	}

	public void movimentaPecas(int linhaOrigem, int colunaOrigem,
			int linhaDestino, int colunaDestino) {
		boolean vez = jogador1.informaDaVez();
		
		if(vez){
			posicoes[linhaOrigem][colunaOrigem].retirePeca();
			posicoes[linhaDestino][colunaDestino].criePeca(true);
		}else{
			System.out.println("AAA");
			posicoes[linhaOrigem][colunaOrigem].retirePeca();
			posicoes[linhaDestino][colunaDestino].criePeca(false);
		}
		
		
	}

	public void receberJogada(Lance jogada) {
		int colunaDestino = jogada.getColunaDestino();
		int linhaDestino = jogada.getLinhaDestino();
		int linhaOrigem = jogada.getLinhaOrigem();
		int colunaOrigem = jogada.getColunaOrigem();
		
		//recebeu a jogada, é necessário desativar o jog antigo e ativar o novo
		this.movimentaPecas(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino);
		this.passaVez();
		
		//fazendo...
		
		/*int resultado = this.tratarLance(linha, coluna);
		
		if (resultado == 9){
			this.finalizarPartida();
		}*/
	}

	public int verificaEmpate(String aCorJog) {
		throw new UnsupportedOperationException();
	}

	public void esvaziar() {
		for (int linha = 0; linha < 8; linha++) {
			for (int coluna = 0; coluna < 8; coluna++) {
				// não sei se esta certo; mas esta diferente do q esta na
				// modelagem
				// posicoes[linha][coluna].setPeca(null);
			}
		}
		jogador1 = null;
		jogador2 = null;
		jogoEmAndamento = false;
	}

	public void habilitar(int posicao) {
		jogoEmAndamento = true;
		//if (posicao == 1) {//era assim no reversi, porém nao funfa aqui ahahahha
			jogador1.habilitar();
			jogador1.assumeCor(true);
			jogador2.assumeCor(false);
			posicionaPecas();
		/*} else {
			jogador2.habilitar();
			jogador2.assumeCor(true);
			jogador1.assumeCor(false);
			posicionaPecas();
		}*/
	}

	public void posicionaPecas() {
		for (int coluna = 0; coluna < 8; coluna++) {
			posicoes[0][coluna].criePeca(true);
		}
		for (int coluna = 0; coluna < 8; coluna++) {
			posicoes[2][coluna].criePeca(true);
		}
		for (int coluna = 0; coluna < 8; coluna++) {
			posicoes[5][coluna].criePeca(false);
		}
		for (int coluna = 0; coluna < 8; coluna++) {
			posicoes[7][coluna].criePeca(false);
		}
	}

	public int verificaTerminoPartida() {
		throw new UnsupportedOperationException();
	}

	//não tem na modelagem
	public Lance informaJogada() {
		return lance;
	}
}
