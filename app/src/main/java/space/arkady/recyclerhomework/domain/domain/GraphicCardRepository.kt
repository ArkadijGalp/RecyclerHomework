package space.arkady.recyclerhomework.domain.domain

import space.arkady.recyclerhomework.domain.domain.usecases.UsecaseGraphicCard

interface GraphicCardRepository {
    fun getGraphicCardList(): List<UsecaseGraphicCard>
}