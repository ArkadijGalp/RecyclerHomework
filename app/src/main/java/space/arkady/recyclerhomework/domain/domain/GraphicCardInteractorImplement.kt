package space.arkady.recyclerhomework.domain.domain

import space.arkady.recyclerhomework.domain.domain.usecases.UsecaseGraphicCardItem
import space.arkady.recyclerhomework.domain.toGraphicCardList

class GraphicCardInteractorImplement(private val repository: GraphicCardRepository) :
    GraphicCardInteractor {
    override fun getGraphicCards(): List<UsecaseGraphicCardItem> {
        return repository.getGraphicCardList().toGraphicCardList()
    }
}