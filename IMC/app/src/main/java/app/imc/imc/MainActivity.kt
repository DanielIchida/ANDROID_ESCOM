package app.imc.imc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var altura: EditText? = null
    var peso: EditText? = null
    val INDICE = "INDICE"
    val IMC = "IMC"
    val ICON = "ICONO"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        altura = findViewById(R.id.et_altura)
        peso = findViewById(R.id.et_peso)
    }

    fun resultado(v: View){

        val a = altura?.text.toString().toDouble()
        val p = peso?.text.toString().toInt()
        val total =  p/(a*a)

        val result = Intent(this,ResultadoActivity::class.java)
        val bundle = Bundle()
        bundle.putString(INDICE,total.toString())

        if(total < 16.0){
            bundle.putString(IMC,"Infrapeso: Delgadez Severa")
            bundle.putInt(ICON,R.drawable.ic_error)
        }else if(total > 16.1 && total < 16.9){
            bundle.putString(IMC,"Infrapeso: Delgadez moderada")
            bundle.putInt(ICON,R.drawable.ic_error)
        }else if(total > 17.0 && total < 18.49){
            bundle.putString(IMC,"Infrapeso: Delgadez aceptable")
            bundle.putInt(ICON,R.drawable.ic_neutral)
        }else if(total > 18.5 &&  total < 24.9){
            bundle.putString(IMC,"Peso Normal")
            bundle.putInt(ICON,R.drawable.ic_ok)
        }else if(total > 25.0 &&  total < 29.9){
            bundle.putString(IMC,"Sobrepeso")
            bundle.putInt(ICON,R.drawable.ic_neutral)
        }else if(total > 30.0 &&  total < 34.99){
            bundle.putString(IMC,"Obeso: Tipo I")
            bundle.putInt(ICON,R.drawable.ic_error)
        }else if(total > 35.0 &&  total < 40.0){
            bundle.putString(IMC,"Obeso: Tipo II")
            bundle.putInt(ICON,R.drawable.ic_error)
        }else{
            bundle.putString(IMC,"Obeso: Tipo III")
            bundle.putInt(ICON,R.drawable.ic_error)
        }
        result.putExtras(bundle)
        startActivity(result)
    }

    fun clasificacionImc(v: View){
        startActivity(Intent(this,ClasificacionActivity::class.java))
    }
}
