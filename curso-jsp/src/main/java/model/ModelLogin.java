package model;

import java.io.Serializable;

public class ModelLogin implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String email;
	private String login;
	private String senha;
	private boolean useradmin;

	public void setUseradmin(boolean useradmin) {
		this.useradmin = useradmin;
	}

	public boolean getUseradmin() {
		return useradmin;
	}

	/* verifica se é um novo cadastro */
	public boolean isNovo() {
		if (this.id == null) {
			return true; /* insere um novo registro */
		} else if (this.id != null) {
			return false; /* atualiza o registro existente */
		}
		return id == null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
