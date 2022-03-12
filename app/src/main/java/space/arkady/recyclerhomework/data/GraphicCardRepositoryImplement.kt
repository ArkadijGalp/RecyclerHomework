package space.arkady.recyclerhomework.data

import space.arkady.recyclerhomework.domain.domain.GraphicCardRepository
import space.arkady.recyclerhomework.domain.domain.models.GraphicCard

object GraphicCardRepositoryImplement : GraphicCardRepository {

    private val graphicCardList = listOf<GraphicCard>(
        GraphicCard("AMD", "XT", 6900, ""),
        GraphicCard("NVIDIA", "RTX", 3090, ""),
        GraphicCard("NVIDIA", "RTX", 3080, ""),
        GraphicCard("NVIDIA", "LHR", 3080, ""),
        GraphicCard("NVIDIA", "RTX", 3070, "Ti"),
        GraphicCard("NVIDIA", "RTX", 2080, "Ti"),
        GraphicCard("NVIDIA", "RTX", 2070, ""),
        GraphicCard("NVIDIA", "GTX", 1080, ""),
        GraphicCard("NVIDIA", "RTX", 2060, ""),
        GraphicCard("NVIDIA", "GTX", 1660, "Ti")
    )

    override fun getGraphicCardList(): List<GraphicCard> {
        return graphicCardList
    }
}