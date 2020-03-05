package `in`.demo.parceable

import `in`.demo.parceable.databinding.ActivityMainBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nimesh = Nimesh(1,"Nimesh Shah","Vadodara",27)


        binding.button.setOnClickListener {

            Log.d("id",nimesh.id.toString())
            Log.d("name", nimesh.name.toString())
            val mainScreenIntent = Intent(this, SecondActivity::class.java)
            mainScreenIntent.putExtra(Nimesh.EXTRA,nimesh)
            startActivity(mainScreenIntent)
        }
       }
}
