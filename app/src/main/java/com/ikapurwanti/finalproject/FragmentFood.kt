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

class FragmentFood : Fragment() {

    private lateinit var adapter : FragmentDashAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataFood()
        val layoutManager = LinearLayoutManager(activity)
        recyclerView = view.findViewById(R.id.recycler_view_food)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter
    }

    private fun dataFood(){

        val listFood = arrayListOf<datafragment>()

        listFood.add(datafragment(R.drawable.food1,"Croffle","Bread, Ice Cream"))
        listFood.add(datafragment(R.drawable.food2,"Pastry Dessert","Fruit, Pastry"))
        listFood.add(datafragment(R.drawable.food3,"Fried Potato","Potato, Salt"))
        listFood.add(datafragment(R.drawable.food4,"Toast","Bread, Fruit"))
        listFood.add(datafragment(R.drawable.food5,"Chocolate Slice Cake","Bread, Chocolate"))
        listFood.add(datafragment(R.drawable.food6,"Pasta","Noodle, Carbonara"))
        listFood.add(datafragment(R.drawable.food7,"Chicken Wings","Chicken, Black Sauce"))
        listFood.add(datafragment(R.drawable.food8,"Onion Ring","Onion, Sauce, Spice"))
        listFood.add(datafragment(R.drawable.food9,"Dimsum","Beef, Fish"))
        listFood.add(datafragment(R.drawable.food10,"Fried Banana","Banana, Cheese, Cokelat"))

        adapter = FragmentDashAdapter(listFood)
    }
}