package mx.edu.ittepic.tpdm_u1_practica1_15401071

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity_img9 : AppCompatActivity() {
    var btn: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_img9)
        btn=findViewById(R.id.regresar1)
        btn?.setOnClickListener {
            var ActPrincipal = Intent(this,MainActivity::class.java)
            startActivity(ActPrincipal)
        }
    }
}
