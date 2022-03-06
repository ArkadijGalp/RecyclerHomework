package space.arkady.recyclerhomework.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view.view.*
import space.arkady.recyclerhomework.ListItem
import space.arkady.recyclerhomework.R
import space.arkady.recyclerhomework.onlistItemClick.OnListItemClick

class ListViewHolder(itemView: View, val onListItemClick: OnListItemClick) : RecyclerView.ViewHolder(itemView) {

    companion object {
        fun newInstance(parent: ViewGroup, onListItemClick: OnListItemClick) = ListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_view, parent, false
            ), onListItemClick
        )
    }

    private val root by lazy { itemView.findViewById<ConstraintLayout>(R.id.root) }

    fun bindItem(item: ListItem) {
        with(item) {
            itemView.graphicCardsModel.text = model
            root.setOnClickListener {
                onListItemClick.onItemClick(item)
            }
        }
    }
}