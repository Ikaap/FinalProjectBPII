package com.ikapurwanti.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ikapurwanti.finalproject.adapters.FragmentDashAdapter
import com.ikapurwanti.finalproject.data.datafragment


class FragmentDrink : Fragment() {

    private lateinit var adapter : FragmentDashAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drink, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataDrink()
        val layoutManager = LinearLayoutManager(activity)
        recyclerView = view.findViewById(R.id.recycler_view_drink)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter

    }

    private fun dataDrink(){

        val listDrink = arrayListOf<datafragment>()

        listDrink.add(datafragment(R.drawable.coffe1,"Cappucino","Espresso, Steamed milk"))
        listDrink.add(datafragment(R.drawable.coffe2,"Es Latte","Espresso, Steamed milk"))
        listDrink.add(datafragment(R.drawable.coffe3,"Flat Whiite","Espresso, Foam"))
        listDrink.add(datafragment(R.drawable.coffe4,"Ice Americano","Espresso, Cold Water"))
        listDrink.add(datafragment(R.drawable.coffe5,"Doppio","2 Oz Espresso"))
        listDrink.add(datafragment(R.drawable.coffe6,"Lungo","Long Pulled Espresso"))
        listDrink.add(datafragment(R.drawable.coffe7,"Machiato","Espresso Shot, Foam"))
        listDrink.add(datafragment(R.drawable.coffe8,"Milk Coffee","Hot and Ice Water"))
        listDrink.add(datafragment(R.drawable.coffe9,"Black","Just Coffee"))
        listDrink.add(datafragment(R.drawable.coffe10,"Dalgona Coffee","Milo, Coffee"))
        listDrink.add(datafragment(R.drawable.coffe11,"Mocha","Espresso, Cocholate, Steamed Milk "))
        listDrink.add(datafragment(R.drawable.coffe12,"Ice Coffee Caramel","1 Oz Espresso, 1 Oz Steamed Milk"))
        listDrink.add(datafragment(R.drawable.coffe13,"Chocolate","Coffee, Vanilla"))

        adapter = FragmentDashAdapter(listDrink)
    }
}