package com.andradahugo.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.andradahugo.navigationcomponent.databinding.FragmentSearchBinding

class SearchFragment : Fragment(R.layout.fragment_search) {

    private lateinit var binding: FragmentSearchBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSearchBinding.bind(view)
    }
}