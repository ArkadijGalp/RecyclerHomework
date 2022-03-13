package space.arkady.recyclerhomework.presentation.recycler.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_dialog_graphiccard.*

import space.arkady.recyclerhomework.R
import space.arkady.recyclerhomework.domain.domain.usecases.UsecaseGraphicCardItem
import space.arkady.recyclerhomework.presentation.recycler.GraphicCardAdapter
import space.arkady.recyclerhomework.presentation.recycler.GraphicCardClickListener
import space.arkady.recyclerhomework.presentation.recycler.GraphicCardViewModel

class GraphicCardFragment(
    private val graphicCardViewModel: GraphicCardViewModel,
    getGraphicCard: GraphicCardClickListener
) : BottomSheetDialogFragment() {


    private val selectGraphicCard = object : GraphicCardClickListener {
        override fun graphicCardListener(itemUsecase: UsecaseGraphicCardItem) {
            getGraphicCard.graphicCardListener(itemUsecase)
            dismiss()
        }

    }

    private val adapter = GraphicCardAdapter(selectGraphicCard)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dialog_graphiccard, container, false)
    }

    override fun onStart() {
        super.onStart()

        graphicCardViewModel.usecaseGraphicLiveData.observe(viewLifecycleOwner) { listCard ->
            adapter.submitCardList(listCard)
        }
        recycler.adapter = adapter
    }
}