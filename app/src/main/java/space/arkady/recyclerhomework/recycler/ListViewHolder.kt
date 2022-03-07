package space.arkady.recyclerhomework.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view.view.*
import space.arkady.recyclerhomework.ListItem
import space.arkady.recyclerhomework.R

class ListViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) {

    companion object {
        fun newInstance(parent: ViewGroup) = ListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_view, parent, false
            )
        )
    }


    fun bindItem(item: ListItem) {
        with(item) {
            itemView.graphicCardsModel.text = model
        }
    }
}