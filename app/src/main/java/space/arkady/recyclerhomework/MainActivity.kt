package space.arkady.recyclerhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val bottomDialogFragmentCard = BottomFragment()

        ListShowingGraphicCards.setOnClickListener {
            bottomDialogFragmentCard.show(supportFragmentManager, "Show Fragment")
        }
    }
}