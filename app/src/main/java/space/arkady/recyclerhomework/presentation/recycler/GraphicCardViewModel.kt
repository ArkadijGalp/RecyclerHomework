package space.arkady.recyclerhomework.presentation.recycler

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import space.arkady.recyclerhomework.data.GraphicCardRepositoryImplement
import space.arkady.recyclerhomework.domain.domain.GraphicCardInteractor
import space.arkady.recyclerhomework.domain.domain.GraphicCardInteractorImplement
import space.arkady.recyclerhomework.domain.domain.GraphicCardRepository
import space.arkady.recyclerhomework.domain.domain.usecases.UsecaseGraphicCardItem

class GraphicCardViewModel : ViewModel() {

    val usecaseGraphicLiveData: LiveData<List<UsecaseGraphicCardItem>> get() = _graphicLiveData
    private val _graphicLiveData = MutableLiveData<List<UsecaseGraphicCardItem>>()
    private val repository: GraphicCardRepository = GraphicCardRepositoryImplement
    private val interactor: GraphicCardInteractor = GraphicCardInteractorImplement(repository)

    init {
        graphicCardLoad()
    }

    private fun graphicCardLoad() {
        _graphicLiveData.value = interactor.getGraphicCards()
    }
}