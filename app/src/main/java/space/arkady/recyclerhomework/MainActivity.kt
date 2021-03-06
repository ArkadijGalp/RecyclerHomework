package space.arkady.recyclerhomework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import space.arkady.recyclerhomework.domain.domain.usecases.UsecaseGraphicCardItem
import space.arkady.recyclerhomework.presentation.recycler.GraphicCardClickListener
import space.arkady.recyclerhomework.presentation.recycler.GraphicCardViewModel
import space.arkady.recyclerhomework.presentation.recycler.fragment.GraphicCardFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val graphicCardDialogFragmentCard =
            GraphicCardFragment(GraphicCardViewModel(), getGraphicCard)

        selectGraphicCard.setOnClickListener {
            graphicCardDialogFragmentCard.show(supportFragmentManager, "Show Fragment")
        }
    }

    private val getGraphicCard = object : GraphicCardClickListener {
        override fun graphicCardListener(itemUsecase: UsecaseGraphicCardItem) {
            selectGraphicCard.setText(itemUsecase.item)
        }

    }
}
