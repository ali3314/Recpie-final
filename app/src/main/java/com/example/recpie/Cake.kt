package com.example.recpie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import java.nio.file.Files.find


class Cake : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cake, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        open2()
        open1()
    }
fun open1(){
    val buttonto  : Button = requireView().findViewById(R.id.button1)
    buttonto.setOnClickListener(){
        findNavController().navigate(
            R.id.action_cake_to_calltoorder)
    }

}


    fun open2(){
        val buttonto  : Button = requireView().findViewById(R.id.button2)
        buttonto.setOnClickListener(){
            findNavController().navigate(
                R.id.action_cake_to_orderc)
        }

    }


}