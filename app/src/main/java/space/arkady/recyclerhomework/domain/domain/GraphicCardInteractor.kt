package space.arkady.recyclerhomework.domain.domain

import space.arkady.recyclerhomework.domain.domain.usecases.UsecaseGraphicCardItem

interface GraphicCardInteractor {
    fun getGraphicCards(): List<UsecaseGraphicCardItem>
}