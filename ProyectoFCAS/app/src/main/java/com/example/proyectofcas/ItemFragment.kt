package com.example.proyectofcas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.proyectofcas.databinding.FragmentItemBinding

class ItemFragment : Fragment() {

    private var _bindingItem:FragmentItemBinding? = null
    private val bindingItem:FragmentItemBinding
        get() = _bindingItem!!

    override fun onDestroyView() {
        super.onDestroyView()
        _bindingItem = null
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _bindingItem = FragmentItemBinding.inflate(inflater, container, false)
        val view = bindingItem.root
        return view
    }

}