package com.example.navigationdrawerkotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationdrawerkotlin.R

/**
 * A simple [Fragment] subclass.
 * Use the [ASIRFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ASIRFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a_s_i_r, container, false)
    }
}