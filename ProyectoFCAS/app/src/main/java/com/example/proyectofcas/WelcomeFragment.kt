package com.example.proyectofcas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.proyectofcas.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private var _bindingWelcome:FragmentWelcomeBinding? = null
    private val bindingWelcome:FragmentWelcomeBinding
        get() = _bindingWelcome!!

    override fun onDestroyView() {
        super.onDestroyView()
        _bindingWelcome = null
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _bindingWelcome = FragmentWelcomeBinding.inflate(inflater, container, false)
        val view = bindingWelcome.root

        val buttonStart = bindingWelcome.startButton

        buttonStart.setOnClickListener{
            view.findNavController().navigate(R.id.action_welcomeFragment_to_principalFragment)
        }

        return view
    }

}