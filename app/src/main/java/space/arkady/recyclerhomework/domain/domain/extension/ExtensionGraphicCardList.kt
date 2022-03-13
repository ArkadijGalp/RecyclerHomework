package space.arkady.recyclerhomework.domain

import space.arkady.recyclerhomework.domain.domain.usecases.UsecaseGraphicCard
import space.arkady.recyclerhomework.domain.domain.usecases.UsecaseGraphicCardItem

fun List<UsecaseGraphicCard>.toGraphicCardList(): List<UsecaseGraphicCardItem> {
    return this.map { item ->
        UsecaseGraphicCardItem(
            "${item.brand}${item.number}${item.postfix}${item.series}"
        )
    }
}