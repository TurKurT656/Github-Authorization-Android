package com.mydigipay.challenge.ui.profile


import androidx.recyclerview.widget.DiffUtil
import com.mydigipay.challenge.R
import com.mydigipay.challenge.base.BaseAdapter

class ProfileItemAdapter : BaseAdapter<ProfileItem>(DIFF_CALLBACK) {

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<ProfileItem>() {
            override fun areItemsTheSame(oldItem: ProfileItem, newItem: ProfileItem): Boolean {
                return oldItem.id == newItem.id
            }

            @Suppress("USELESS_CAST")
            override fun areContentsTheSame(oldItem: ProfileItem, newItem: ProfileItem): Boolean {
                return if (oldItem is StringItem && newItem is StringItem)
                    (oldItem as StringItem) == (newItem as StringItem)
                else if (oldItem is BadgeItem && newItem is BadgeItem)
                    (oldItem as BadgeItem) == (newItem as BadgeItem)
                else
                    false
            }
        }
    }

    override fun getItemViewType(position: Int) =
        when (getItem(position)) {
            is StringItem -> R.layout.item_profile_string
            is BadgeItem -> R.layout.item_profile_badge
            else -> throw Exception("New ${ProfileItem::class.java.simpleName} type not implemented")
        }

}