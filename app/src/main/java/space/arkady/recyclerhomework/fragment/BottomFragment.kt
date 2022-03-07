package space.arkady.recyclerhomework.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_bottom.*
import space.arkady.recyclerhomework.GraphicCard
import space.arkady.recyclerhomework.ListItem
import space.arkady.recyclerhomework.R
import space.arkady.recyclerhomework.recycler.ListAdapter
import space.arkady.recyclerhomework.onlistItemClick.OnListItemClick

class BottomFragment() : BottomSheetDialogFragment() {

    private val adapter by lazy { ListAdapter()}

    private val onClickElement by lazy {
        object : OnListItemClick {
            override fun onItemClick(item: ListItem) {

            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bottom, container, false)
    }

    override fun onStart() {
        super.onStart()

        recycler.adapter = adapter
adapter.submitCardList(GraphicCard.graphicCardList)
    }
}