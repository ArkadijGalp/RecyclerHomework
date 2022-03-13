package space.arkady.recyclerhomework.presentation.recycler

import space.arkady.recyclerhomework.domain.domain.usecases.UsecaseGraphicCardItem

interface GraphicCardClickListener {
    fun graphicCardListener(itemUsecase: UsecaseGraphicCardItem)
}