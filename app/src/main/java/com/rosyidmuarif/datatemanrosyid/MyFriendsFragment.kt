package com.rosyidmuarif.datatemanrosyid

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends,container,false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun simulasiDataTeman() {
        listTeman = ArrayList()
        listTeman.add(MyFriend("Rosyid Muarif","laki-laki",
            "rosyid_20510009@stimata.ac.id","081386952972","Jakarta")
        )
        listTeman.add(MyFriend("Isak Irawan","laki-laki",
            "isak_20310005@stimata.ac.id","085768354679","Blitar")
        )
        listTeman.add(MyFriend("Sistahana Sari Dewi","Perempuan",
            "sistahana_20520015@stimata.ac.id","085768327307","Malang")
        )
        listTeman.add(MyFriend("Egif Adea Lutfi","Perempuan",
            "egif_20510005@stimata.ac.id","085876321304","Blitar")
        )
        listTeman.add(MyFriend("Jefri Falah","laki-laki",
            "jefri_20310007@stimata.ac.id","081236312733","Nganjuk")
        )
        listTeman.add(MyFriend("Fajar Kurniawan","laki-laki",
            "fajar_20510007@stimata.ac.id","085356327141","Blitar")
        )
        listTeman.add(MyFriend("Dewangga Wahyu","laki-laki",
            "dewangga_20310020@stimata.ac.id","087973426882","Malang")
        )
        listTeman.add(MyFriend("Arif Rosyid","laki-laki",
            "arif_20510009@stimata.ac.id","081336330303","Madiun"))
    }

    private fun tampilTeman() {
        rv_listmyFriends.layoutManager=LinearLayoutManager(activity)
        rv_listmyFriends.adapter=MyFriendAdapter(listTeman)
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}