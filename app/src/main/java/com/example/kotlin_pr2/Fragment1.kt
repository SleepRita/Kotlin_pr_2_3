package com.example.kotlin_pr2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.kotlin_pr2.databinding.Fragment1Binding

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment1 : Fragment() {

    private lateinit var binding: Fragment1Binding
    private val viewModel: MyViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Создание экземпляра класса Fragment1Binding и связывание его с разметкой фрагмента
        binding = Fragment1Binding.inflate(inflater, container, false)

        // Возвращение корневого View разметки фрагмента
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            var smth = viewModel
            var lifecycleOwner = viewLifecycleOwner
        }
        viewModel.set_header_text("This is Fragment 1")

        binding.buttonFrom1To2.setOnClickListener {
            findNavController().navigate(R.id.action_fragment1_to_fragment2)
        }
    }
}