package com.rosyidmuarif.datatemanrosyid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.my_friend_item.*

class MyFriendAdapter(private val items:ArrayList<MyFriend>):
    RecyclerView.Adapter<MyFriendAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= ViewHolder (
        LayoutInflater.from(parent.context).inflate(R.layout.my_friend_item,parent,false)
    )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyFriendAdapter.ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }

    class ViewHolder(override  val containerView: View):
            RecyclerView.ViewHolder(containerView), LayoutContainer{
                fun bindItem(item:MyFriend){
                    txtFriendName.text = item.nama
                    txtFriendEmail.text = item.email
                    txtFriendTelp.text = item.telp
                }
            }
}