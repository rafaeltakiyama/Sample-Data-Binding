package br.com.rafaeltakiyama.sampledatabinding.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import br.com.rafaeltakiyama.sampledatabinding.R;
import br.com.rafaeltakiyama.sampledatabinding.viewmodel.UserViewModel;

/**
 * Created by Rafael T Akiyama on 15/09/2016.
 */
public class MainActivity2 extends AppCompatActivity {

    private AppCompatEditText edttxtnome;
    private AppCompatEditText edttxtendereco;
    private AppCompatEditText edttxtcomplemento;
    private AppCompatEditText edttxtbairro;
    private AppCompatEditText edttxtcidade;
    private AppCompatEditText edttxtcep;
    private AppCompatEditText edttxttelefone;
    private AppCompatEditText edttxtcelular;
    private AppCompatEditText edttxtemail;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.edttxtemail = (AppCompatEditText) findViewById(R.id.edt_txt_email);
        this.edttxtcelular = (AppCompatEditText) findViewById(R.id.edt_txt_celular);
        this.edttxttelefone = (AppCompatEditText) findViewById(R.id.edt_txt_telefone);
        this.edttxtcep = (AppCompatEditText) findViewById(R.id.edt_txt_cep);
        this.edttxtcidade = (AppCompatEditText) findViewById(R.id.edt_txt_cidade);
        this.edttxtbairro = (AppCompatEditText) findViewById(R.id.edt_txt_bairro);
        this.edttxtcomplemento = (AppCompatEditText) findViewById(R.id.edt_txt_complemento);
        this.edttxtendereco = (AppCompatEditText) findViewById(R.id.edt_txt_endereco);
        this.edttxtnome = (AppCompatEditText) findViewById(R.id.edt_txt_nome);
        this.fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(onClickAddUser());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_cliente_gerenciar, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();

        switch (itemId) {
            case R.id.action_teste:

                UserViewModel viewModel = new UserViewModel();
                viewModel.setNome("Rafael");
                viewModel.setEndereco("Rua João Clapp, 44");
                viewModel.setComplemento("Casa");
                viewModel.setBairro("Vila Tamandaré");
                viewModel.setCidade("Ribeirão Preto");
                viewModel.setCep("14080-102");
                viewModel.setTelefone("3333-3333");
                viewModel.setCelular("9999-99999");
                viewModel.setEmail("rafaeltakiyama@gmail.com");

                edttxtnome.setText(viewModel.getNome());
                edttxtendereco.setText(viewModel.getEndereco());
                edttxtcomplemento.setText(viewModel.getComplemento());
                edttxtbairro.setText(viewModel.getBairro());
                edttxtcidade.setText(viewModel.getCidade());
                edttxtcep.setText(viewModel.getCep());
                edttxttelefone.setText(viewModel.getTelefone());
                edttxtcelular.setText(viewModel.getCelular());
                edttxtemail.setText(viewModel.getEmail());

                break;

            case R.id.action_limpar:
                edttxtnome.setText(null);
                edttxtendereco.setText(null);
                edttxtcomplemento.setText(null);
                edttxtbairro.setText(null);
                edttxtcidade.setText(null);
                edttxtcep.setText(null);
                edttxttelefone.setText(null);
                edttxtcelular.setText(null);
                edttxtemail.setText(null);
                break;

        }

        return super.onContextItemSelected(item);
    }

    public View.OnClickListener onClickAddUser() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserViewModel viewModel = new UserViewModel();
                viewModel.setNome(edttxtnome.getText().toString());
                viewModel.setEndereco(edttxtendereco.getText().toString());
                viewModel.setComplemento(edttxtcomplemento.getText().toString());
                viewModel.setBairro(edttxtbairro.getText().toString());
                viewModel.setCidade(edttxtcidade.getText().toString());
                viewModel.setCep(edttxtcep.getText().toString());
                viewModel.setTelefone(edttxttelefone.getText().toString());
                viewModel.setCelular(edttxtcelular.getText().toString());
                viewModel.setEmail(edttxtemail.getText().toString());
                Toast.makeText(MainActivity2.this, "Olá " + viewModel.getNome(), Toast.LENGTH_SHORT).show();
            }
        };
    }
}
