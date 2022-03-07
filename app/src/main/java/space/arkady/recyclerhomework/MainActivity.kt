package space.arkady.recyclerhomework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import space.arkady.recyclerhomework.fragment.BottomFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val bottomDialogFragmentCard = BottomFragment()

        listShowingGraphicCards.setOnClickListener {
            bottomDialogFragmentCard.show(supportFragmentManager, "Show Fragment")
        }
    }
}
