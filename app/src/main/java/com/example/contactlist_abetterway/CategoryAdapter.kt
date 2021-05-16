package com.example.contactlist_abetterway

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist_abetterway.databinding.ContactCategoryBinding

class CategoryAdapter: RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    private val categories: MutableList<Categories> = mutableListOf()

    fun  setUpCategories(categories: List<Categories>) {
        this.categories.addAll(categories)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(ContactCategoryBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]
        holder.bindItem(category)

        holder.itemView.setOnClickListener {
//            if (position == 0){
//                Toast.makeText(holder.itemView.context, "You just clicked Family", Toast.LENGTH_LONG).show()
//            }
//            if (position == 1){
//                Toast.makeText(holder.itemView.context, "You just clicked Friends", Toast.LENGTH_LONG).show()
//            }
//            if (position == 2){
//                Toast.makeText(holder.itemView.context, "You just clicked Work", Toast.LENGTH_LONG).show()
//            }
//            if (position == 3){
//                Toast.makeText(holder.itemView.context, "You just clicked School", Toast.LENGTH_LONG).show()
//            }

            val model = categories[position]

            val catName: String = model.viewName
            val catImage: Int = model.viewLogo

            val  intent = Intent(holder.itemView.context, ContactListActivity::class.java)

            intent.putExtra("iCatName", catName)
            intent.putExtra("icatLogo", catImage)

            holder.itemView.context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int {
        return categories.size
    }

    inner class CategoryViewHolder(private val binding: ContactCategoryBinding):RecyclerView.ViewHolder(binding.root){
        fun  bindItem(category: Categories){
            binding.catImage.setImageResource(category.viewLogo)
            binding.catName.text = category.viewName
        }
    }
}





//Attempted alternative Approach

//class CategoryAdapter(val myCategories: ArrayList<Categories>, val context: Context) :
//    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
//
//    inner class CategoryViewHolder(itemView: View) :
//        RecyclerView.ViewHolder(itemView){
//        fun bindCat(category: Categories){
//            val catLogo : ImageView = itemView.findViewById(R.id.catImage)
//            val catName : TextView = itemView.findViewById(R.id.catName)
//
//            catLogo.setImageResource(category.viewLogo)
//            catName.text = category.viewName
//        }
//
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
//        val layoutInflater = LayoutInflater.from(parent.context)
//        val  view = layoutInflater.inflate(R.layout.contact_category, parent, false)
//        return CategoryViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
//        val myCategory = myCategories[position]
//        holder.bindCat(myCategory)
//
//        holder.itemView.setOnClickListener {
//            if (position == 0){
//                Toast.makeText(context, "You clicked Family", Toast.LENGTH_LONG).show()
//            }
//            if (position == 1){
//                Toast.makeText(context, "You clicked Friends", Toast.LENGTH_SHORT).show()
//            }
//            if (position == 2){
//                Toast.makeText(context, "You clicked Work", Toast.LENGTH_SHORT).show()
//            }
//            if (position == 3){
//                Toast.makeText(context, "You clicked School", Toast.LENGTH_SHORT).show()
//            }
//
//            val model = myCategories.get(position)
//
//            var catName: String = model.viewName
//
//            var catImage: Int = model.viewLogo //check categories.kt to compare types
//
//            val intent = Intent(context, ContactListActivity::class.java)
//
//            intent.putExtra("iCatName", catName)
//            intent.putExtra("icatLogo", catImage)
//
//            context.startActivity(intent) //starts intent
//
//        }
//    }
//
//    override fun getItemCount(): Int {
//        return myCategories.size
//    }
//
//}