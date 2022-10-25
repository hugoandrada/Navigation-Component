package com.andradahugo.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.andradahugo.navigationcomponent.databinding.FragmentTermsAndConditionsBinding

class TermsAndConditionsFragment : Fragment(R.layout.fragment_terms_and_conditions) {

    private lateinit var binding: FragmentTermsAndConditionsBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTermsAndConditionsBinding.bind(view)
    }
}