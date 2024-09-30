package com.example.kotlin_pr2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.kotlin_pr2.databinding.Fragment2Binding

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment2 : Fragment() {

    private lateinit var binding: Fragment2Binding
    private val viewModel: MyViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Создание экземпляра класса Fragment1Binding и связывание его с разметкой фрагмента
        binding = Fragment2Binding.inflate(inflater, container, false)

        // Возвращение корневого View разметки фрагмента
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            var smth = viewModel
            var lifecycleOwner = viewLifecycleOwner
        }
        viewModel.set_header_text("This is Fragment 2")

        binding.buttonFrom2To1.setOnClickListener {
            activity?.let {
                (it as MainActivity).replaceFragment(Fragment3())
            }
        }
    }
}