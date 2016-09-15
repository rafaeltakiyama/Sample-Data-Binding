package br.com.rafaeltakiyama.sampledatabinding.viewmodel;

import android.databinding.ObservableField;
import android.support.annotation.NonNull;
import android.view.View;

import java.io.Serializable;

/**
 * Created by Rafael T Akiyama on 14/09/2016.
 */
public class UserViewModel implements Serializable {
    public ObservableField<String> text = new ObservableField<>();
    private InterfaceClickListener interfaceClick;

    private String nome;
    private String endereco;
    private String complemento;
    private String bairro;
    private String cidade;
    private String cep;
    private String email;
    private String telefone;
    private String celular;

    public UserViewModel(InterfaceClickListener interfaceClick) {
        this.interfaceClick = interfaceClick;
    }
    public UserViewModel() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void onClickAddUser(@NonNull final View view){
        interfaceClick.onClickBtnAddUser();
    }

    @Override
    public String toString() {
        return "UserViewModel{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }
}
