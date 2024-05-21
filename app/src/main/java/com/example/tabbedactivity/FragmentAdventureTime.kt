package com.example.tabbedactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class FragmentAdventureTime : Fragment() {

    private lateinit var cover: ImageView
    private lateinit var title: TextView
    private lateinit var type_and_years: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_film, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cover = view.findViewById(R.id.imageView)
        title = view.findViewById(R.id.title)
        type_and_years = view.findViewById(R.id.type_and_years)

        val type = getString(R.string.type_serial)
        val years = getString(R.string.year_2010_2018)

        val type_and_yearsString = "$type $years"

        cover.setImageResource(R.drawable.adventure_time_image)
        title.text = getString(R.string.title_adventure_time)
        type_and_years.text = type_and_yearsString
    }
}