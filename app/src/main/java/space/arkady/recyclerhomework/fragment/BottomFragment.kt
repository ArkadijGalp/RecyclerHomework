package space.arkady.recyclerhomework.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_bottom.*
import space.arkady.recyclerhomework.ListItem
import space.arkady.recyclerhomework.R
import space.arkady.recyclerhomework.recycler.ListAdapter
import space.arkady.recyclerhomework.onlistItemClick.OnListItemClick

class BottomFragment(message: OnListItemClick) : BottomSheetDialogFragment() {

    private val adapter by lazy { ListAdapter(onClickElement)}
    private val onClickElement by lazy {
        object : OnListItemClick {
            override fun onItemClick(item: ListItem) {
                message.onItemClick(item)
                dismiss()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bottom, container, false)
    }

    override fun onStart() {
        super.onStart()

        val listItem = mutableListOf(
            ListItem("NVidia RTX 3050"),
            ListItem("NVidia RTX 3060"),
            ListItem("NVidia RTX 3070"),
            ListItem("NVidia RTX 3080"),
            ListItem("NVidia RTX 3050 Ti"),
            ListItem("NVidia RTX 3070 Ti"),
            ListItem("NVidia RTX 3080 Ti"),
            ListItem("NVidia GTX 1660"),
            ListItem("AMD RX 6500"),
            ListItem("AMD RX 6600"),
            ListItem("AMD RT 2060"),
            ListItem("AMD RT 2070"),
            ListItem("AMD RT 2080"),
            ListItem("AMD RT 2090"),
            ListItem("AMD RT 3000")

        )
        recycler.adapter = adapter
adapter.submitList(listItem)
    }
}