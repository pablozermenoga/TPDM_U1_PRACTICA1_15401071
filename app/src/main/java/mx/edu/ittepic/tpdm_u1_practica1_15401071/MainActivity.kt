package mx.edu.ittepic.tpdm_u1_practica1_15401071

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var imagen1: ImageView ?=null
    var imagen2: ImageView ?=null
    var imagen3: ImageView ?=null
    var imagen4: ImageView ?=null
    var imagen5: ImageView ?=null
    var imagen6: ImageView ?=null
    var imagen7: ImageView ?=null
    var imagen8: ImageView ?=null
    var imagen10: ImageView ?=null
    var imagen11: ImageView ?=null
    var imagen12: ImageView ?=null
    var imagen13: ImageView ?=null
    var imagen14: ImageView ?=null
    var imagen15: ImageView ?=null
    var imagen9: ImageView ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imagen1 = findViewById(R.id.img1)
        imagen2 = findViewById(R.id.img2)
        imagen3 = findViewById(R.id.img3)
        imagen4 = findViewById(R.id.img4)
        imagen5 = findViewById(R.id.img5)
        imagen6 = findViewById(R.id.img6)
        imagen7 = findViewById(R.id.img7)
        imagen8 = findViewById(R.id.img8)
        imagen9 = findViewById(R.id.img9)
        imagen10 = findViewById(R.id.img10)
        imagen11 =  findViewById(R.id.img11)
        imagen12 = findViewById(R.id.img12)
        imagen13 = findViewById(R.id.img13)
        imagen14 = findViewById(R.id.img14)
        imagen15 = findViewById(R.id.img15)

        imagen1?.setOnClickListener { var activityImg1=Intent(this,Activity_img1::class.java)
        startActivity(activityImg1)
        }
        imagen2?.setOnClickListener { var activityImg2=Intent(this,Activity_img2::class.java)
            startActivity(activityImg2)
        }
        imagen3?.setOnClickListener { var activityImg3=Intent(this,Activity_img3::class.java)
            startActivity(activityImg3)
        }
        imagen4?.setOnClickListener { var activityImg4=Intent(this,Activity_img4::class.java)
            startActivity(activityImg4)
        }
        imagen5?.setOnClickListener { var activityImg5=Intent(this,Activity_img5::class.java)
            startActivity(activityImg5)
        }
        imagen6?.setOnClickListener { var activityImg6=Intent(this,Activity_img6::class.java)
            startActivity(activityImg6)
        }
        imagen7?.setOnClickListener { var activityImg7=Intent(this,Activity_img7::class.java)
            startActivity(activityImg7)
        }
        imagen8?.setOnClickListener { var activityImg8=Intent(this,Activity_img8::class.java)
            startActivity(activityImg8)
        }
        imagen9?.setOnClickListener { var activityImg9=Intent(this,Activity_img9::class.java)
            startActivity(activityImg9)
        }
        imagen10?.setOnClickListener { var activityImg10=Intent(this,Activity_img10::class.java)
            startActivity(activityImg10)
        }
        imagen11?.setOnClickListener { var activityImg11=Intent(this,Activity_img11::class.java)
            startActivity(activityImg11)
        }
        imagen12?.setOnClickListener { var activityImg12=Intent(this,Activity_img12::class.java)
            startActivity(activityImg12)
        }
        imagen13?.setOnClickListener { var activityImg13=Intent(this,Activity_13::class.java)
            startActivity(activityImg13)
        }
        imagen14?.setOnClickListener { var activityImg14=Intent(this,Activity_img14::class.java)
            startActivity(activityImg14)
        }
        imagen15?.setOnClickListener { var activityImg15=Intent(this,Activity_img15::class.java)
            startActivity(activityImg15)
        }


    }
}
