package space.arkady.recyclerhomework.presentation.recycler

import android.annotation.SuppressLint
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import space.arkady.recyclerhomework.domain.domain.usecases.UsecaseGraphicCardItem

class GraphicCardAdapter(private val getCardClickItem: GraphicCardClickListener) :
    RecyclerView.Adapter<GraphicCardViewHolder>() {

    private var itemUsecases: List<UsecaseGraphicCardItem> = emptyList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GraphicCardViewHolder {
        return GraphicCardViewHolder.newInstance(parent, getCardClickItem)
    }

    override fun onBindViewHolder(holder: GraphicCardViewHolder, position: Int) {
        holder.bindItem(itemUsecases[position])
    }

    override fun getItemCount() = itemUsecases.size

    @SuppressLint("NotifyDataSetChanged")
    fun submitCardList(data: List<UsecaseGraphicCardItem>) {
        itemUsecases = data

        notifyDataSetChanged()
    }
}





