package space.arkady.recyclerhomework.recycler

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import space.arkady.recyclerhomework.GraphicCard
import space.arkady.recyclerhomework.ListItem
import space.arkady.recyclerhomework.onlistItemClick.OnListItemClick

class ListAdapter(val onListItemClick: OnListItemClick) : RecyclerView.Adapter<ListViewHolder>() {

    private var items: List<ListItem> = emptyList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder.newInstance(parent, onListItemClick)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemCount() = GraphicCard.graphicCardList.size
    fun submitList(data: List<ListItem>) {

        items = data

        notifyDataSetChanged()
    }
}



