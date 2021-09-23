package com.alpha.kasheets.view.bottomsheets.pizzasheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alpha.kasheets.databinding.BottomSheetBinding
import com.alpha.kasheets.model.Pizza
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: BottomSheetBinding

    override fun onStart() {
        super.onStart()
        BottomSheetBehavior.from(requireView().parent as View).apply {
            halfExpandedRatio = 0.50f
            state = BottomSheetBehavior.STATE_HALF_EXPANDED

            addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
                override fun onStateChanged(bottomSheet: View, newState: Int) {
                    if (state == BottomSheetBehavior.STATE_EXPANDED)
                        state = BottomSheetBehavior.STATE_HALF_EXPANDED
                }

                override fun onSlide(bottomSheet: View, slideOffset: Float) {
                    if (slideOffset > -0.60) {
                        if (slideOffset > -0.20)
                            halfExpandedRatio = 0.75f
                        else if (slideOffset > -0.60)
                            halfExpandedRatio = 0.50f
                        state = BottomSheetBehavior.STATE_HALF_EXPANDED
                    }
                }
            })
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = BottomSheetBinding.inflate(inflater, container, false)
        val pizzaList = arrayListOf(
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/sweetpotatokalepizza2c6db.jpg",
                "Two Peas and Their Pod",
                "Sweet Potato Kale Pizza with Rosemary & Red Onion"
            ),
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/nokneadpizzadoughlahey6461467.jpg",
                "Bon Appetit",
                "No-Knead Pizza Dough"
            ),
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/pizza3464.jpg",
                "The Pioneer Woman",
                "Pizza Potato Skins"
            ),

            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/japanese_pizza_recipec7e3.jpg",
                "101 Cookbooks",
                "Japanese Pizza"
            ),
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/best_pizza_dough_recipe1b20.jpg",
                "101 Cookbooks",
                "Best Pizza Dough Ever"
            ),
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/fruitpizza9a19.jpg",
                "The Pioneer Woman",
                "Deep Dish Fruit Pizza"
            ),

            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/Pizza2BDip2B12B500c4c0a26c.jpg",
                "Closet Cooking",
                "Pizza Dip"
            ),
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/BBQChickenPizzawithCauliflowerCrust5004699695624ce.jpg",
                "Closet Cooking",
                "Cauliflower Pizza Crust (with BBQ Chicken Pizza)"
            ),
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/EnglishMuffinBreakfastPizzas48303.jpg",
                "Two Peas and Their Pod",
                "English Muffin Breakfast Pizzas"
            ),

            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/5100898cc5.jpg",
                "All Recipes",
                "Pizza Casserole"
            ),
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/DSC_29068da5.jpg",
                "The Pioneer Woman",
                "Chicken Avocado Pizza"
            ),
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/30076_breakfast_pita_pizza_620eb14.jpg",
                "Chow",
                "Breakfast Pita-Pizza Recipe"
            ),


            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/sweetpotatokalepizza2c6db.jpg",
                "Two Peas and Their Pod",
                "Sweet Potato Kale Pizza with Rosemary & Red Onion"
            ),
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/nokneadpizzadoughlahey6461467.jpg",
                "Bon Appetit",
                "No-Knead Pizza Dough"
            ),
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/pizza3464.jpg",
                "The Pioneer Woman",
                "Pizza Potato Skins"
            ),

            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/japanese_pizza_recipec7e3.jpg",
                "101 Cookbooks",
                "Japanese Pizza"
            ),
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/best_pizza_dough_recipe1b20.jpg",
                "101 Cookbooks",
                "Best Pizza Dough Ever"
            ),
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/fruitpizza9a19.jpg",
                "The Pioneer Woman",
                "Deep Dish Fruit Pizza"
            ),

            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/Pizza2BDip2B12B500c4c0a26c.jpg",
                "Closet Cooking",
                "Pizza Dip"
            ),
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/BBQChickenPizzawithCauliflowerCrust5004699695624ce.jpg",
                "Closet Cooking",
                "Cauliflower Pizza Crust (with BBQ Chicken Pizza)"
            ),
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/EnglishMuffinBreakfastPizzas48303.jpg",
                "Two Peas and Their Pod",
                "English Muffin Breakfast Pizzas"
            ),

            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/5100898cc5.jpg",
                "All Recipes",
                "Pizza Casserole"
            ),
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/DSC_29068da5.jpg",
                "The Pioneer Woman",
                "Chicken Avocado Pizza"
            ),
            Pizza(
                "https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/30076_breakfast_pita_pizza_620eb14.jpg",
                "Chow",
                "Breakfast Pita-Pizza Recipe"
            )
        )
        binding.rvPizza.adapter = PizzaAdapter(pizzaList)
        return binding.root
    }

    companion object {
        const val TAG = "BottomSheetFragment"
    }
}