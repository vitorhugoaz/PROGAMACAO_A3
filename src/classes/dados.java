package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public final class dados {

    private final int maxUsuarios = 10;
    private final int maxProdutos = 25;
    private usuario meusUsuarios[] = new usuario[maxUsuarios];
    private produtos meusProdutos[] = new produtos[maxProdutos];
    private int contadorUsuarios = 0;
    private int contadorProdutos = 0;

    public dados() {
	VoltarUsuarios();

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
    public void salvar(){
        SalvarUsuario();
        SalvarProduto();
    }
    public void SalvarUsuario(){
        FileWriter fw = null;  
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/usuarios.txt");
            pw = new PrintWriter(fw);
            
            for(int i = 0; i < contadorUsuarios; i++){
                
                pw.println(meusUsuarios[i].toString());
            }
        } catch (Exception e1) {
            e1.printStackTrace();
            
        }finally{
            try {
                if (fw != null){
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
        public void SalvarProduto(){
        FileWriter fw = null;  
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/produtos.txt");
            pw = new PrintWriter(fw);
            
            for(int i = 0; i < contadorProdutos; i++){
                
                pw.println(meusProdutos[i].toString());
            }
        } catch (Exception e1) {
            e1.printStackTrace();
            
        }finally{
            try {
                if (fw != null){
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
        public void VoltarUsuarios(){
            File arquivo = null;
            FileReader fr = null;
            BufferedReader br = null;
            
            try {
                arquivo = new File("Data/usuarios.txt");
                fr = new FileReader(arquivo);
                br = new BufferedReader(fr);
                
                int pos;
                String aux;
                String linha;
                String idUsuario;
                String nome;
                String sobrenome;
                String senha;
                int perfil;
                
                while ((linha=br.readLine())!=null){
                    pos = linha.indexOf('|');
                    aux = linha.substring(0,pos);
                    idUsuario = aux;
                    linha = linha.substring(pos +1);
                    
                    pos = linha.indexOf('|');
                    aux = linha.substring(0,pos);
                    nome = aux;
                    linha = linha.substring(pos +1);
                    
                    pos = linha.indexOf('|');
                    aux = linha.substring(0,pos);
                    sobrenome = aux;
                    linha = linha.substring(pos +1);
                    
                    pos = linha.indexOf('|');
                    aux = linha.substring(0,pos);
                    senha = aux;
                    linha = linha.substring(pos +1);
                    perfil = new Integer(linha);
                    
                    usuario meuUsuario = new usuario(idUsuario, nome, sobrenome, senha, perfil);
                    meusUsuarios[contadorUsuarios] = meuUsuario;
                    contadorUsuarios++;
                }  
            } catch (Exception e1) {
                e1.printStackTrace();
            }finally{
                try {
                    if(fr != null){
                        fr.close();
                    }
                } catch (Exception e2) {
                     e2.printStackTrace();
                }
            }
        }
}
