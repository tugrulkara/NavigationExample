package com.example.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationodev.databinding.FragmentSayfaABinding
import com.example.navigationodev.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {

    private lateinit var binding : FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaBBinding.inflate(inflater,container,false)

        binding.yGitButton.setOnClickListener {
            val gecis = SayfaBFragmentDirections.actionSayfaBFragmentToSayfaYFragment()
            Navigation.findNavController(it).navigate(gecis)
        }
        return binding.root
    }

}