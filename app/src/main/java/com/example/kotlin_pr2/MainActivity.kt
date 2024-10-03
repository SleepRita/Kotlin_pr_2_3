package com.example.kotlin_pr2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.kotlin_pr2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    // Объявление переменной для привязки к разметке
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        // Получение корневого представления разметки
        val view = binding.root
        // Установка корневого представления разметки в качестве контента активности
        setContentView(view)
    }

    fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.nav_host_fragment, fragment)
        transaction.addToBackStack(fragment.toString()) // Добавление транзакции в стек возврата
        transaction.commit()
    }
}