class MainActivity {
}
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startWalkthroughButton: Button = findViewById(R.id.startWalkthroughButton)
        startWalkthroughButton.setOnClickListener {
            // Start Walkthrough Activity
            val intent = Intent(this, WalkthroughActivity::class.java)
            startActivity(intent)
        }
    }
}
