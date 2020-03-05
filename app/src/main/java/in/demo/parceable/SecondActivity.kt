package `in`.demo.parceable

import `in`.demo.parceable.databinding.ActivitySecondBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nimesh : Nimesh? = intent.getParcelableExtra(Nimesh.EXTRA)

        binding.tvId.text = nimesh!!.id.toString()
        binding.tvName.text = nimesh.name.toString()
        binding.tvAddress.text = nimesh.address
        binding.textView4.text = nimesh.age.toString()

    }
}
