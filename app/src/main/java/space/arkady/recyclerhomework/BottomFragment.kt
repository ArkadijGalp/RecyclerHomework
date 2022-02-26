package space.arkady.recyclerhomework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_bottom.*
import space.arkady.recyclerhomework.recycler.ListItem
import space.arkady.recyclerhomework.recycler.onListItemClick

class BottomFragment : BottomSheetDialogFragment() {

    private val adapter by lazy { space.arkady.recyclerhomework.recycler.ListAdapter() }
    private val onClickElement by lazy {
        object : onListItemClick {
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

        adapter.submitList(GraphicCard.graphicCardList)

    }
}