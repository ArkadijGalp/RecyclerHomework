package space.arkady.recyclerhomework.presentation.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.graphiccard_item_view.view.*
import space.arkady.recyclerhomework.R
import space.arkady.recyclerhomework.domain.domain.usecases.UsecaseGraphicCardItem

class GraphicCardViewHolder(
    itemView: View,
    private val getCardClickItem: GraphicCardClickListener
) :
    RecyclerView.ViewHolder(itemView) {

    companion object {
        fun newInstance(parent: ViewGroup, getCardClickItem: GraphicCardClickListener) =
            GraphicCardViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.graphiccard_item_view, parent, false
                ), getCardClickItem
            )
    }


    fun bindItem(grCardUsecase: UsecaseGraphicCardItem) {
        with(grCardUsecase) {
            itemView.nameProduct.text = grCardUsecase.item
            if (grCardUsecase.item.contains("NVIDIA")) {
                itemView.brandLogo.setImageResource(R.drawable.nvidia_logo)
            } else if (grCardUsecase.item.contains("AMD")) {
                itemView.brandLogo.setImageResource(R.drawable.amd_logo)
            }
        }
        itemView.root.setOnClickListener {
            getCardClickItem.graphicCardListener(grCardUsecase)
        }
    }
}