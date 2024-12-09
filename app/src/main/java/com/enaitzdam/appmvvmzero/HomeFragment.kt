package com.enaitzdam.appmvvmzero

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.enaitzdam.appmvvmzero.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModels()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater)

        binding.searchButton.setOnClickListener {
            viewModel.countedStudents(binding.editTextNumberSigned.text.toString().toInt())
            binding.tvAuthor.text = viewModel.countedStudents(binding.editTextNumberSigned.text.toString().toInt()).toString()
        }


        return binding.root

    }


}