package space.arkady.recyclerhomework.data

import space.arkady.recyclerhomework.domain.domain.GraphicCardRepository
import space.arkady.recyclerhomework.domain.domain.usecases.UsecaseGraphicCard

object GraphicCardRepositoryImplement : GraphicCardRepository {

    private val graphicCardList = listOf<UsecaseGraphicCard>(
        UsecaseGraphicCard("AMD", "XT", 6900, ""),
        UsecaseGraphicCard("NVIDIA", "RTX", 3090, ""),
        UsecaseGraphicCard("NVIDIA", "RTX", 3080, ""),
        UsecaseGraphicCard("NVIDIA", "LHR", 3080, ""),
        UsecaseGraphicCard("NVIDIA", "RTX", 3070, "Ti"),
        UsecaseGraphicCard("NVIDIA", "RTX", 2080, "Ti"),
        UsecaseGraphicCard("NVIDIA", "RTX", 2070, ""),
        UsecaseGraphicCard("NVIDIA", "GTX", 1080, ""),
        UsecaseGraphicCard("NVIDIA", "RTX", 2060, ""),
        UsecaseGraphicCard("NVIDIA", "GTX", 1660, "Ti")
    )

    override fun getGraphicCardList(): List<UsecaseGraphicCard> {
        return graphicCardList
    }
}