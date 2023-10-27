package com.edu.ifam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.edu.ifam.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val calculo = binding.calculo

        binding.um.setOnClickListener{
            calculo.text = "${calculo.text}1"
        }

        binding.dois.setOnClickListener{
            calculo.text = "${calculo.text}2"
        }

        binding.tres.setOnClickListener{
            calculo.text = "${calculo.text}3"
        }

        binding.quatro.setOnClickListener{
            calculo.text = "${calculo.text}4"
        }

        binding.cinco.setOnClickListener{
            calculo.text = "${calculo.text}5"
        }

        binding.seis.setOnClickListener{
            calculo.text = "${calculo.text}6"
        }

        binding.sete.setOnClickListener{
            calculo.text = "${calculo.text}7"
        }

        binding.oito.setOnClickListener{
            calculo.text = "${calculo.text}8"
        }

        binding.nove.setOnClickListener{
            calculo.text = "${calculo.text}9"
        }

        binding.zero.setOnClickListener{
            calculo.text = "${calculo.text}0"
        }

        binding.soma.setOnClickListener{
            calculo.text = "${calculo.text}+"
        }

        binding.subtracao.setOnClickListener{
            calculo.text = "${calculo.text}-"
        }

        binding.multiplicacao.setOnClickListener{
            calculo.text = "${calculo.text}*"
        }

        binding.divisao.setOnClickListener{
            calculo.text = "${calculo.text}/"
        }

        binding.sin.setOnClickListener{
            calculo.text = "${calculo.text}sin("
        }

        binding.cos.setOnClickListener{
            calculo.text = "${calculo.text}cos("
        }

        binding.tan.setOnClickListener{
            calculo.text = "${calculo.text}tan("
        }

        binding.e.setOnClickListener{
            calculo.text = "${calculo.text}e"
        }

        binding.`in`.setOnClickListener{
            calculo.text = "${calculo.text}ln("
        }

        binding.log.setOnClickListener{
            calculo.text = "${calculo.text}Log("
        }

        binding.fat.setOnClickListener{
            calculo.text = "${calculo.text}!"
        }

        binding.pi.setOnClickListener{
            calculo.text = "${calculo.text}π"
        }

        binding.parenteseAbrindo.setOnClickListener{
            calculo.text = "${calculo.text}("
        }

        binding.parenteseFechando.setOnClickListener{
            calculo.text = "${calculo.text})"
        }

        binding.raizQuadrada.setOnClickListener{
            calculo.text = "${calculo.text}√("
        }

        binding.potencia.setOnClickListener{
            calculo.text = "${calculo.text}^("
        }

        binding.x.setOnClickListener{
            calculo.text = "${calculo.text}X("
        }

        binding.i.setOnClickListener{
            calculo.text = "${calculo.text}I("
        }

        binding.ponto.setOnClickListener{
            calculo.text = "${calculo.text}."
        }

        binding.deletar.setOnClickListener{
            calculo.text = calculo.text.dropLast(1)
        }

        binding.adicionar.setOnClickListener{
            calculo.text = ""
            binding.resultado.text = ""
        }

        binding.igual.setOnClickListener {
            val resultadoCalculado = Expression(calculo.text.toString()).calculate()

            if (resultadoCalculado.isNaN()) {

                binding.resultado.text = "Erro! Syntax Error!"

            } else {

                binding.resultado.text = resultadoCalculado.toString()
                calculo.text = resultadoCalculado.toString()
            }

        }

    }
}