package br.com.zup.simcityacademy.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import br.com.zup.simcityacademy.R
import br.com.zup.simcityacademy.informacao.InformacaoActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var editTextNomeAlune: EditText
    private val editTextNotaUm: EditText by lazy { findViewById(R.id.etNotaUm) }
    private val editTextNotaDois: EditText by lazy { findViewById(R.id.etNotaDois) }
    private var btnCalcularMédia: Button? = null

    //TODO dicionar viewBinding no projeto para vincular os campos de nota três e quatro
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initViews()

        btnCalcularMédia?.setOnClickListener {
            //TODO alterar o código abaixo
            enviarDadosAlune()
        }

    }

    private fun initViews() {

        btnCalcularMédia = findViewById(R.id.btnCalcularMedia)
    }

    private fun enviarDadosAlune() {
        //TODO realizar a lógica para recuperar os dados
        //TODO realizar a lógica para enviar os dados
        val nomeAlune = binding.etNomeAlune?.text
        val primeiraNota = binding.etNotaUm?.text
        val segundaNota = binding.etNotaDois?.text
        val terceiraNota = binding.etNotaTres?.text
        val quartaNota = binding.etNotaQuatro?.text

        val intent = Intent(this, InformacaoActivity::class.java).apply {
            putExtra("NOME_ALUNE", nomeAlune)
            putExtra("NOTA_UM", primeiraNota)
            putExtra("NOTA_DOIS", segundaNota)
            putExtra("NOTA_TRES", terceiraNota)
            putExtra("NOTA_QUATRO", quartaNota)

        }
    }