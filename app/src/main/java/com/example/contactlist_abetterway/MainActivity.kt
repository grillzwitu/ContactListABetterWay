package com.example.contactlist_abetterway


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.contactlist_abetterway.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter = CategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpData(binding)
    }

    private fun setUpData(binding: ActivityMainBinding){

        val categories = mutableListOf<Categories>()
        categories.add(
            Categories(
                R.drawable.ic_baseline_family_restroom_24,
                "Family"
            )
        )
        categories.add(
            Categories(
                R.drawable.ic_baseline_emoji_people_24,
                "Friends"
            )
        )
        categories.add(
            Categories(
                R.drawable.ic_baseline_work_24,
                "Work"
            )
        )
        categories.add(
            Categories(
                R.drawable.ic_baseline_school_24,
                "School"
            )
        )

        title = "Contacts: Categories"

        binding.categoriesRecyclerView.adapter = adapter
        binding.categoriesRecyclerView.layoutManager = GridLayoutManager(this, 2)

        adapter.setUpCategories(categories)
    }

}




//An attempted alternative, not fully functional!!


//    private lateinit var gridLayoutManager: GridLayoutManager
//    private lateinit var recyclerView: RecyclerView
//    private lateinit var adapter: CategoryAdapter
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        title = "Contacts: Categories"
//
//        val categories = ArrayList<Categories>()
//        categories.add(
//            Categories(
//                R.drawable.ic_baseline_family_restroom_24,
//                "Family"
//            )
//        )
//        categories.add(
//            Categories(
//                R.drawable.ic_baseline_emoji_people_24,
//                "Friends"
//            )
//        )
//        categories.add(
//            Categories(
//                R.drawable.ic_baseline_work_24,
//                "Work"
//            )
//        )
//        categories.add(
//            Categories(
//                R.drawable.ic_baseline_school_24,
//                "School"
//            )
//        )
//
//        gridLayoutManager = GridLayoutManager(this, 2)
//
//        recyclerView = findViewById(R.id.categoriesRecyclerView)
//        recyclerView.layoutManager = gridLayoutManager
//
//        adapter = CategoryAdapter(categories, this)
//        recyclerView.adapter = adapter
//
//
//    }