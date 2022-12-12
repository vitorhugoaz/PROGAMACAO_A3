package classes;

public class dados {

    private final int maxUsuarios = 10;
    private final int maxProdutos = 25;
    private usuario meusUsuarios[] = new usuario[maxUsuarios];
    private produtos meusProdutos[] = new produtos[maxProdutos];
    private int contadorUsuarios = 0;
    private int contadorProdutos = 0;

    public dados() {
	usuario meuUsuario;

	meuUsuario = new usuario("hugo", "Vitor Hugo", "Nogueira de Azevedo", "1", 1);
	meusUsuarios[contadorUsuarios] = meuUsuario;
	contadorUsuarios++;

	meuUsuario = new usuario("joao", "João", "Barbosa Santos ", "1", 2);
	meusUsuarios[contadorUsuarios] = meuUsuario;
	contadorUsuarios++;

	meuUsuario = new usuario("higor", "Higor", "C", "1", 1);
	meusUsuarios[contadorUsuarios] = meuUsuario;
	contadorUsuarios++;

	produtos meuProduto;
	meuProduto = new produtos("001", "Arroz", "Porção 5Kg ", 21);
	meusProdutos[contadorProdutos] = meuProduto;
	contadorProdutos++;

	meuProduto = new produtos("002", "Feijão", "Verde 1Kg", 5);
	meusProdutos[contadorProdutos] = meuProduto;
	contadorProdutos++;

	meuProduto = new produtos("004", "Refrigerante", "Coca-Cola", 10);
	meusProdutos[contadorProdutos] = meuProduto;
	contadorProdutos++;

	meuProduto = new produtos("005", "Cerveja", "Skol", 3);
	meusProdutos[contadorProdutos] = meuProduto;
	contadorProdutos++;

    }

    public int numeroUsuarios() {
	return contadorUsuarios;
    }

    public int numeroProdutos() {
	return contadorProdutos;
    }

    public usuario[] getUsuarios() {
	return meusUsuarios;
    }

    public produtos[] getProdutos() {
	return meusProdutos;
    }

    public boolean validarUsuario(String usuario, String senha) {

	boolean aux = false;
	for (int i = 0; i < contadorUsuarios; i++) {
	    if (meusUsuarios[i].getIdUsuario().equals(usuario)
		    && meusUsuarios[i].getSenha().equals(senha)) {
		return true;

	    }

	}
	return false;

    }

    public int posicaoUsuario(String usuario) {

	for (int i = 0; i < contadorUsuarios; i++) {
	    if (meusUsuarios[i].getIdUsuario().equals(usuario)) {
		return i;

	    }

	}
	return -1;

    }

    public int posicaoProduto(String produtos) {

	for (int i = 0; i < contadorUsuarios; i++) {
	    if (meusProdutos[i].getIdProduto().equals(produtos)) {
		return i;

	    }

	}
	return -1;

    }

    public String adicionarUsuario(usuario meuUsuario) {

	if (contadorUsuarios == maxUsuarios) {
	    return "Limite maximo de usuários atingido.";

	}
	meusUsuarios[contadorUsuarios] = meuUsuario;
	contadorUsuarios++;
	return "Usuario cadastrado com sucesso.";
    }

    public String adicionarProduto(produtos meuProduto) {

	if (contadorProdutos == maxProdutos) {
	    return "Não é mais possivel cadastrar produto.";

	}
	meusProdutos[contadorProdutos] = meuProduto;
	contadorProdutos++;
	return "Produto cadastrado com sucesso.";
    }

    public String editarUsuario(usuario meuUsuario, int pos) {

	meusUsuarios[pos].setNome(meuUsuario.getNome());
	meusUsuarios[pos].setSobrenome(meuUsuario.getSobrenome());
	meusUsuarios[pos].setSenha(meuUsuario.getSenha());
	meusUsuarios[pos].setPerfil(meuUsuario.getPerfil());
	return "Usuário editado com sucesso!";
    }

    public String editarProduto(produtos meuProduto, int pos) {

        meusProdutos[pos].setProduto(meuProduto.getProduto());
	meusProdutos[pos].setDescricao(meuProduto.getDescricao());
        meusProdutos[pos].setPreco(meuProduto.getPreco());
	return "Produto editado com sucesso!";
    }

    public String deletarUsuario(int pos) {

	for (int i = pos; i < contadorUsuarios - 1; i++) {

	    meusUsuarios[i] = meusUsuarios[i + 1];

	}
	contadorUsuarios--;
	return "Usuario deletado com sucesso!";

    }

    public String deletarProduto(int pos) {

	for (int i = pos; i < contadorProdutos - 1; i++) {

	    meusProdutos[i] = meusProdutos[i + 1];

	}
	contadorProdutos--;
	return "Produto deletado com sucesso!";

    }

}
