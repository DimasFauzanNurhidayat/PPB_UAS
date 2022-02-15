package dimas.fauzan.tugasuaspbb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MoveActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DES = "extra_des"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)
        var imgPhoto: ImageView = findViewById(R.id.img_menu)
        val tvNama: TextView = findViewById(R.id.tv_name)
        val tvDes: TextView = findViewById(R.id.tv_des)

        val name = intent.getStringExtra(EXTRA_NAME)
        val des = intent.getStringExtra(EXTRA_DES)
        val icon = intent.getIntExtra(EXTRA_PHOTO, 0)

        imgPhoto.setImageResource(icon)
        tvNama.text = name
        tvDes.text = des
    }

}