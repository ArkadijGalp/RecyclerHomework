package space.arkady.recyclerhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import space.arkady.recyclerhomework.fragment.BottomFragment
import space.arkady.recyclerhomework.onlistItemClick.OnListItemClick

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val bottomDialogFragmentCard = BottomFragment(clicker)

        listShowingGraphicCards.setOnClickListener {
            bottomDialogFragmentCard.show(supportFragmentManager, "Show Fragment")
        }


    }


    private val clicker = object: OnListItemClick {
        override fun onItemClick(item: ListItem) {
            listShowingGraphicCards.setText(item.model)

        }

    }
}