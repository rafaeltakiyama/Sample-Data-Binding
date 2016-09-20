package br.com.rafaeltakiyama.sampledatabinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import br.com.rafaeltakiyama.sampledatabinding.R;
import br.com.rafaeltakiyama.sampledatabinding.databinding.ActivityMainBinding;
import br.com.rafaeltakiyama.sampledatabinding.viewmodel.InterfaceClickListener;
import br.com.rafaeltakiyama.sampledatabinding.viewmodel.UserViewModel;


/**
 * Created by Rafael T Akiyama on 15/09/2016.
 */
public class MainActivity extends AppCompatActivity implements InterfaceClickListener {

    //O nome é gerado a partir do layout XML
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Substitui o setContentView
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //um getter e um setter foram gerados
        binding.setUserViewModel(new UserViewModel(this));

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

                UserViewModel viewModel = new UserViewModel(this);
                viewModel.setNome("Rafael");
                viewModel.setEndereco("Rua João Clapp, 44");
                viewModel.setComplemento("Casa");
                viewModel.setBairro("Vila Tamandaré");
                viewModel.setCidade("Ribeirão Preto");
                viewModel.setCep("14080-102");
                viewModel.setTelefone("3333-3333");
                viewModel.setCelular("9999-99999");
                viewModel.setEmail("rafaeltakiyama@gmail.com");

                binding.setUserViewModel(viewModel);

                break;

            case R.id.action_limpar:
                binding.setUserViewModel(new UserViewModel(this));
                break;

        }

        return super.onContextItemSelected(item);
    }

    @Override
    public void onClickBtnAddUser() {
        UserViewModel user = binding.getUserViewModel();
        Toast.makeText(MainActivity.this, "Olá " + user.getNome(), Toast.LENGTH_SHORT).show();
    }
}
