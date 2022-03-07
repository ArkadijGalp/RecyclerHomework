package space.arkady.recyclerhomework.recycler

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import space.arkady.recyclerhomework.GraphicCard
import space.arkady.recyclerhomework.ListItem

class ListAdapter() : RecyclerView.Adapter<ListViewHolder>() {

    private var items: List<ListItem> = emptyList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder.newInstance(parent)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemCount() = GraphicCard.graphicCardList.size

    fun submitCardList(data: List<String>) {
        var mutableList = items.toMutableList()
        for (element in data.sorted()){
            mutableList.add(ListItem(element))
        }

        items = mutableList.toList()

        notifyDataSetChanged()
    }
}





